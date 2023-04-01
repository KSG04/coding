package week_2;

import java.util.Scanner;

public class PrimeTest {

    int inputData(){

        System.out.print("숫자 입력 : ");
        Scanner in = new Scanner(System.in);
        int search = in.nextInt();
        if (search == 0){
            System.exit(0);
        }
        return search;
    }

    boolean isPrime(int search) {
        for (int i = 2; i <= 9; i++) {
            if (i != search) {
                int check = search % i;
                if (check == 0) {
                    return false;
                }else
                    return true;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int count = 1  ;
        while (true){


            System.out.println(count + " 번쨰 시도");
            count += 1;
            PrimeTest primeTest = new PrimeTest();
            if (primeTest.isPrime(primeTest.inputData())){
                System.out.println("소수 입니다.");
            }else {
                System.out.println("정수입니다.");
            }
            System.out.println();

        }
    }
}
