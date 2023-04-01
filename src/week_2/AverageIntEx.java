package week_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageIntEx {


    public static void main(String[] args) {

        AverageInt averageInt = new AverageInt();

        averageInt.inputData();
        System.out.println(averageInt.getAverage());

    }

}

    class AverageInt {
        private int cnt = 0;
        private int sum = 0;
        private double average = 0.0;

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public void inputData() {
            int num = 0;
            Scanner in = new Scanner(System.in);
            for (int i = 1; ; i++) {
                System.out.println(i + "번째 정수 입력 : ");
                num = in.nextInt();
                if (num <= 0) {
                    break;
                }
                cnt++;
                sum += num;

            }
            this.average = ((double) sum / cnt);
        }
}

