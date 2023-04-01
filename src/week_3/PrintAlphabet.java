package week_3;

import java.util.Scanner;

public class PrintAlphabet {

    public static void main(String[] args) {

        int count = 0;

        String[] eng = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        System.out.print("입력 : ");

        Scanner in = new Scanner(System.in);

        String ans = in.next();

        for(int i = 0; i < eng.length; i++){
            if (!ans.equals(eng[i])){
                System.out.print(eng[i]);
                count += 1;
            }else {
                System.out.println();
                for (int j = 0 ; j < i; j++){
                    System.out.print(eng[j]);

                }
                System.out.println();
            }
        }


    }

}
