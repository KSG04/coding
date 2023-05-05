package week_9.과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface Calculator {

    String returnAnswer();
    int returnOperator();
    double returnResult();


    class transper implements Calculator{

        private String answer;
        public transper() throws IOException {
            System.out.println("사칙연산 입력 : ");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            answer = bf.readLine().trim();
            answer = answer.replace(" ","");
        }

        @Override
        public String returnAnswer() {
            return this.answer;
        }

        @Override
        public int returnOperator() {
            int location = -1;
            for ( int i = 0; i < answer.length(); i++){
                Character a = answer.charAt(i);
                if (a == '+' || a == '-' || a == '*' || a == '/'){
                    location = i;
                }
            }
            return location;
        }


        @Override
        public double returnResult() {
            int location = returnOperator();
            if (location == -1){
                throw new IllegalArgumentException("잘못된 연산자 입니다.");
            }
            if (answer.length() -1 <= location ){
                throw new IllegalArgumentException("연산자 위치가 잘못되었습니다.");
            }

            double left = Double.parseDouble(answer.substring(0,location));
            double right = Double.parseDouble(answer.substring(location+1));

            switch (answer.charAt(location)){
                case '+' :  return left + right;
                case '-' : return  left - right;
                case '*' : return left * right;
                case '/' : return  left / right;
                default:
                    throw new IllegalArgumentException("잘못된 연산자 입니다.");
            }
        }
    }
}

public class Main{
    public static void main(String[] args) throws IOException {
        while (true){
            Calculator calculator = new Calculator.transper();
            System.out.println("수식 반환 :" + calculator.returnAnswer());
            System.out.println("연산자 위치 : " + calculator.returnOperator());
            System.out.println("결과 반환 : " + calculator.returnResult() + "\n");
        }
    }
}
