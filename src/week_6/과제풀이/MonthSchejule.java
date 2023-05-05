package week_6.과제풀이;

import java.util.Scanner;

class Day{
    private String work;

    public Day(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        //기존에 스케쥴이 있는경우 뒤에 추가
        this.work = this.work + "\\" + work;
    }

    public void show(){
        int index;
        String str = this.work;
        for(int i = 1;;i++){
            index = str.indexOf("\\");
            if(index == -1){
                System.out.println("[" + i +"]" + str);
                return;
            }
            System.out.println("[" + i +"]" + str.substring(0,index));
            str = str.substring(index+1);
        }
    }


}


public class MonthSchejule {
    private int nDays;
    private  Day[] days;
    private Scanner scanner;

    public MonthSchejule(int nDays) {
        this.nDays = nDays;
        this.days = new Day[nDays];
        scanner = new Scanner(System.in);

    }


    private int inputDay() {
        System.out.println("날짜 (1~30) : ");
        int day = scanner.nextInt();
        scanner.nextLine(); // 개행문자 \n을 제거
        day--;

        if (day < 0 || day > nDays) { // 0 ~ 29만 유효
            System.out.println("날짜 잘못 입력하였습니다.");
            return -1;
        }
        return day;
    }




    public static void main(String[] args) {

    }

}
