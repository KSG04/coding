package week_3.MyChangeMoney;


import java.io.IOException;

public class ChangeMoneyManin {

    public static void main(String[] args) throws IOException {

        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};



        MyChangeMoney my = new MyChangeMoney(unit);

        my.trans(my.inputMoney());
        my.talk();
    }

}
