package week_4.과제2_전화번호저장;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// 이름이 겹치는 사람이 있으니 유의해서 코딩
public class Phone {

    Map<String,String> info = new HashMap<String,String>();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String name;
    int count = 0;
    public void choose() throws IOException {

        while (true){
            System.out.println("1 : 개인정보 저장\n2 : 검색\n3 : 전체검색\n4 : 종료");

            int select = Integer.parseInt(bf.readLine());

            switch (select){
                case 1 : addUser();
                case 2 : searchUser();
                case 3 : allSearch();
                case 4 : end();
                default:
                    System.out.println("잘못 입력 하셨습니다!!");
            }
        }

    }
    // 검색할 떄 split 하면 완료 될 것 같음
    public void addUser() throws IOException {
        System.out.println("\t\t개인정보 저장");
        System.out.print("1. 이름 입력 : ");
        String name = bf.readLine();
        System.out.print("\n2. 전화번호 입력 : ");
        String phoneNumber = bf.readLine();

        Iterator<String> keys = info.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            if (key.equals(name)){
                count++;
                info.put(name + " " + count,phoneNumber);
                choose();
            }
        }
        info.put(name + " ",phoneNumber);
        choose();
    }

    public void searchUser() throws IOException {
        System.out.println("\t\t이름을 이용해서 사용자 검색");
        System.out.print("이름을 입력하세요 : ");
        name = bf.readLine();
        Iterator<String> keys = info.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            String[] name2 = key.split(" ");
            if (key.equals(name2[0])) {
                System.out.println("이름 : " + key + "\n전화번호 : " + info.get(key));
            }
        }

        choose();
    }

    public void allSearch() throws IOException {
        System.out.println("\t\t모든 사용자 정보 출력\n");
        int num = 1;
        Iterator<String> keys = info.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(num + ": 이름 : " + key + "\t: 전화번호 : " + info.get(key));
            num++;
        }
        if (info.isEmpty()){
            System.out.println("\t\t저장되어 있는 사용자 정보가 없습니다!!\n");
            choose();
        }
        System.out.println();
        choose();
    }
    public void end(){
        System.err.println("프로그램을 종료합니다 ㅠㅠ");
        System.exit(0);
    }

}
