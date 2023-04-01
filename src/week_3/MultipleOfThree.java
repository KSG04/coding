package week_3;
//배열에 저장된 정수 중에서 3의 배수를 탐색하는 프로그램
//저장될 정수의 개수 및 저장될 정수는 입력을 받음

import java.util.Scanner;

public class MultipleOfThree {

    public static void main(String[] args) {

    MultipleOfThree multipleOfThree = new MultipleOfThree();
    multipleOfThree.result(multipleOfThree.method());

    }

    public int[] method(){
        Scanner in = new Scanner(System.in);

        System.out.print("저장될 정수 입력 : ");

        int ans = in.nextInt();

        int[] arr = new int[ans];

        for (int i = 0; i < arr.length; i++){
            System.out.print((i+1) + "번째 입력 : ");
            arr[i] = in.nextInt();
        }

        return arr;


    }

    public void result(int[] arr){

        for (int j = 0; j < arr.length; j++){

            if (arr[j] % 3 == 0){
                System.out.println(arr[j] + "는 3의 배수 입니다.");
            }else
                System.out.println(arr[j]);
        }
    }


}
