package week_4.과제2_전화번호저장.Service;

import week_4.과제2_전화번호저장.User.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 이름이 겹치는 사람이 있으니 유의해서 코딩
public class Phone extends User {
    User user;
    private final List<User> users = new ArrayList<>();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public void choose() throws IOException {

        int select = 0;


        while (true){
            System.out.println("\n1 : 유저등록 저장\n2 : 검색\n3 : 전체검색\n4 : 종료");

            try {
                select = Integer.parseInt(bf.readLine());
            }catch (Exception e){
                System.err.println(e + "\n" + "잘못 입력하셨습니다.");
                choose();
            }

            switch (select){
                case 1 : addUser();
                case 2 : searchUser();
                case 3 : allSearch();
                case 4 : end();
                default:
                    System.err.println("잘못 입력하셨습니다!!");
            }
        }

    }
    public void addUser() throws IOException {
        System.out.println("\t\t유저 등록");
        System.out.print("1. 이름 입력 : ");
        String name = bf.readLine();
        System.out.print("\n2. 전화번호 입력 : ( - 뺴고 입력 )");
        String phoneNumber = bf.readLine();

        users.add(new User(name,phoneNumber));
        System.out.println("\t\t 등록 완료 ");
        choose();

    }

    public void searchUser() throws IOException {
        System.out.print("검색하려는 이름을 입력하세요!");
        String searchName = bf.readLine();
        int count = 0;

        for (int i = 0; i < users.size(); i++){
            if (searchName.equals(users.get(i).getName())){
                count ++;
                System.out.println("\n"+count + " 이름 : " + users.get(i).getName() + " 전화번호 : " + users.get(i).getPhone() );
            }
        }
        if (count == 0){
            System.out.println("\t\t 일치하는 고객이 없습니다!!");
        }
        choose();
    }

    public void allSearch() throws IOException {
        System.out.println("\t\t 모든 고객의 정보를 출력합니다.\n");
        int count = 0;

        if (users.isEmpty()){
            System.out.println("현재 등록되어 있는 유저가 없습니다!!\n");
            choose();
        }

        for (int i = 0; i < users.size(); i++){
            count ++;
            System.out.println(count + " 이름 : " + users.get(i).getName() + " 전화번호 : " + users.get(i).getPhone() );
        }
        choose();
    }
    public void end(){
        System.err.println("프로그램을 종료합니다 ㅠㅠ");
        System.exit(0);
    }

}
