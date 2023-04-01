package week_4.과제1_스케쥴관리프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Day {
    //진짜 모르겠네
    // 키와 값으로 구성된 Entry객체를 저장하는 자료타입, month 생성
    // 값은 중복될 수 있지만 키값은 중복될 수 없다!!
    // 많은 양의 데이터를 검색하는데 있어서 뛰어난 성능을 가지는 HashMap 자료구조
    Map<Integer ,String> month = new HashMap<Integer,String>();

    //스캐너보다 더욱 빠른 처리가 가능한 버퍼리더로 사용자의 입력값을 읽음
    // 스캐너와 차이점 : 스캐너는 사용자가 입력하는 즉시 읽지만 버퍼리더는 사용자가 엔터를 누를때까지 기다렸다가 한번에 읽음
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    // 사용자가 검색하려는 일정 저장공간
    int daySearch = 0;

    public void choose() throws IOException {

        while (true) {

            System.out.println("1번 : 저장\n2번 : 일정 검색\n3번 : 전체 출력\n4번 : 종료");

            // bf.readLine()으로 읽을 시 string 타입으로 읽어지기 떄문에 정수로 저장할 시 반드시 변환 해야 함.
            // bf.read()로 int 타입으로 저장할 수 있지만 read()는 10진법으로 저장하는게 아니라 아스키 코드로 저장하기 때문에 스트링으로 읽고 변환하는게 좋음
            int select = 0;

            // 읽은 입력값을 int 값으로 변환해 select로 넣어주지만 변환이 불가능한 값이 들어올 경우 에러 처리
            try {
                select = Integer.parseInt(bf.readLine());

            }catch (Exception e){
                System.err.println(e + " \n" + "잘못 입력하셨습니다. ");
                choose();
            }

            // 사용자 입력 값이 4번일시 프로그램 종료 메서드로 이동
            if (select == 4){
                end();
            }

            switch (select) {
                case 1:
                    //저장 메서드로 이동
                    addSchedule(saveInfo());
                case 2:
                    //일정 검색 메서드로 이동
                    checkDay();
                case 3:
                    //전체출력 메서드로 이동
                    allCheckDay();
                default:
                    //잘못된 번호 입력시 출력
                    System.err.println("번호를 잘못 선택하셨습니다.");
            }
        }
    }

    //저장 메서드
    public int saveInfo() throws IOException {

        System.out.print("스케줄을 저장할 날짜를 입력해 주세요 : ");

        daySearch = Integer.parseInt(bf.readLine());
        // HashMap month에 키값이 있다면 순서대로 keys에 저장
        Iterator<Integer> keys = month.keySet().iterator();
        // keys에 그다음 값이 있다면 while문으로 끝까지 하나씩 입력
        while (keys.hasNext()){
            // keys의 다음값을 key에 하나씩 저장
            int key = keys.next();
            // 저장하려는 날짜인 daySearch와 month에 저장되어 있는 key값들을 하나씩 비교해서 같은 값이 있다면
            if (key == daySearch){
                System.out.println(daySearch + "일 등록되어 있는 스케쥴이 있습니다.\n");
                System.out.println("정보 : " + month.get(daySearch) + "\n");
                // while 문을 사용해서 사용자가 번호를 잘못 입력 시 되묻는 기능 추가
                while (true) {
                    System.out.print("1번 : 변경\n2번 : 삭제\n");
                    int select = Integer.parseInt(bf.readLine());
                    //등록되어 있는 스케줄에 내용을 변경할 시 addSchedule(daySearch) 함으로써 등록 메서드에 해당 날짜 전달하고 변경
                    if (select == 1)
                        return daySearch;
                    //삭제 하고 choose()메서드로 이동함으로 써 연속 기능 수행 가능
                    else if (select == 2) {
                        month.remove(daySearch);
                        System.out.println("\t<<<<<<<<삭제 완료!>>>>>>>>\t");
                        choose();
                    } else
                        System.out.println("번호를 잘못 선택하셨습니다.");
                }
            }
        }
        //keys에 해당하는 값이 없다면 while문을 건너뛰고 addSchedule(saveInfo()) 수행
        return daySearch;
    }

    //정보 저장 메서드
    public void addSchedule(int daySearch) throws IOException {
        // while문 사용하여 추후 사용자가 번호를 잘못 입력시 되묻는 기능 추가
        while (true) {
            System.out.println("저장할 정보를 입력해 주세요.");

            String info = bf.readLine();

            System.out.println(daySearch + "일에 " + info + "를\n\n1.저장하기\n2.다시입력\n3.되돌아가기");

            int ans = Integer.parseInt(bf.readLine());
            // 정보 저장하고 처음으로 되돌아 가기
            if (ans == 1) {
                month.put(daySearch, info);
                System.out.println("저장이 완료되었습니다.");
                choose();
                // 해당 메서드를 되돌아 감으로써 다시입력 기능 수행
            } else if (ans == 2) {
                addSchedule(daySearch);
                //처음으로 되돌아가기 기능
            } else if (ans == 3) {
                choose();
                // 사용자가 다른 숫자 입력시 출력
            } else System.out.println("잘못 입력하셨습니다.");
        }
    }

    // 일정 검색 메서드
    public void checkDay() throws IOException {
        System.out.println("검색하려는 일정을 입력하세요!!");
        int daySearch = Integer.parseInt(bf.readLine());
        //month 객체 배열을 하나씩 keys에 저장
        Iterator<Integer> keys = month.keySet().iterator();
        //keys에 값을 저장하고 month에 그다음 값이 있을 시
        while(keys.hasNext()){
            //key에 keys값을 하나씩 저장
            int key = keys.next();
            // 검색하려는 일정과 key의 키값이 일치할 시 기능 수행하고 처음으로 되돌아가기
            if (daySearch == key){
                System.out.println("Day : " + daySearch);
                System.out.println("일정 : " + month.get(daySearch) + "\n");
                choose();
            }
        }
        System.out.println(daySearch + "일 등록된 일정이 없습니다.");
        // 검색하려는 일정이 없을 시 사용자 편의기능 추가
        while (true){
            System.out.println("1 : 등록하기\n2 : 처음으로 가기");
            int select = Integer.parseInt(bf.readLine());
            //switch문으로 사용자가 원하는 메서드로 바로이동하기 떄문에 break 생략
            switch (select) {
                case 1:
                    addSchedule(daySearch);
                case 2:
                    choose();
                default:
                    System.out.println("잘못 입력 하셨습니다.!!!");
            }
        }
    }

    //모든 일정 출력 메서드
    public void allCheckDay() throws IOException {
        System.out.println("\t\t등록되어 있는 모든 일정을 출력합니다.!\t\t\n");
        Iterator<Integer> keys = month.keySet().iterator();
        // month에 값이 없다면 출력
        if (month.isEmpty())
            System.out.println("\t\t등록되어 있는 일정이 없습니다!!\t\t");
        //month에 값이 있다면 하나씩 출력
        while (keys.hasNext()){
            int key = keys.next();
            System.out.println("날짜 : " + key +"일" + "\t 일정 : " + month.get(key));

        }
        System.out.println("\n");
        // 모든 정보를 출력하고 사용자의 편의기능 추가, while문을 사용하여 잘못된 값 입력 시 되묻기 기능 구현
        while (true){
            System.out.println("1 : 처음으로 돌아가기\n2 : 종료하기");
            int select = Integer.parseInt(bf.readLine());
            switch (select){
                case 1:choose();
                case 2: end();
                default:
                    System.out.println("잘못 입력하셨습니다.!!");
            }
        }
    }

    //프로그램 종료 메서드
    public void end(){
        System.err.println("\t\t프로그램을 종료합니다 ㅠㅠ");
        System.exit(0);
    }

}
