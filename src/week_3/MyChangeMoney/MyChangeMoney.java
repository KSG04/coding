package week_3.MyChangeMoney;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyChangeMoney {

    private int[] unit;

    private int[] total;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public MyChangeMoney(int[] unit) {
        this.unit = unit;
        this.total = new int[unit.length];
    }
    

    int inputMoney() throws IOException {

        System.out.print("금액을 입력하세요 !! : ");

        return Integer.parseInt(br.readLine());

    }

    void trans(int money){

        for (int i = 0; i < unit.length; i++){
          int result  = money/unit[i];
          if (result > 0){
              total[i] = result;
              money = money%unit[i];
          }
        }
    }

    void talk(){

        for (int i = 0; i < unit.length; i++){
            if (total[i] > 0)
                System.out.println(unit[i] + "원 짜리 : " + total[i]);
            else continue;
        }

    }



}
