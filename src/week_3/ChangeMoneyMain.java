package week_3;

//입력받은 금액을 화폐 단위별로 환전하여 출력하는 프로그램을 작성
// 50000 ->


import java.util.Scanner;

class ChangeMoney{

    Scanner in = new Scanner(System.in);

    private int [] unit ;
    private int [] change ;

    public ChangeMoney(int[] unit) { // 기본 생성자 생성
        this.unit = unit;
        this.change = new int[unit.length];
    }

    int inputMonney(){
        System.out.println("금액을 입력하시오 >> ");
        return  in.nextInt();
    }

    void calMoney(int money){
        for (int i = 0; i < unit.length; i++){
            int res = money/unit[i];
        if (res > 0) {
            change[i] = res;
            money = money%unit[i];
            }
        }
    }
    public int[] getChange(){
        return change;
    }


}



public class ChangeMoneyMain {
    public static void main(String[] args) {

        int[] unit = {50000, 10000, 5000, 1000,500, 100, 10, 1};
        int[] change;


        ChangeMoney cm = new ChangeMoney(unit);
        int money =cm.inputMonney();
        cm.calMoney(money);
        change = cm.getChange();
        for(int i = 0; i < unit.length; i++){
            System.out.println(unit[i] + "원 짜리 : " + change[i] + " 개 ");
        }



    }



}


