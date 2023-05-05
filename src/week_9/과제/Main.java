package week_9.과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Calculator {

    String returnAnswer();
    String returnOperator();
    double returnResult();


    class transper implements Calculator{

        private String answer;

        private int count = 1;

        public transper() throws IOException {
            System.out.println("사칙연산 입력 : ");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            this.answer =bf.readLine();
        }

        @Override
        public String returnAnswer() {
            return this.answer;
        }

        @Override
        public String returnOperator() {
            String location = null;
            int count2 = 0;
            for ( int i = 0; i < answer.length(); i++){
                Character a = answer.charAt(i);
                if (a == '+' || a == '-' || a == '*' || a == '/'){
                    count2 += 1;
                    if (count2 >= 2){
                        location = location +"," + String.valueOf(i);
                        count2 = 1;
                        count +=1;
                    }
                    location = String.valueOf(i);

                }
            }
            return location;
        }


        @Override
        public double returnResult() {
            for (int j = 0; j < count; j++){
                if(count < 2){
                    int location = Integer.parseInt(returnOperator());
                    if (location == -1){
                        throw new IllegalArgumentException("잘못된 연산자 입니다.");
                    }
                    double left = Double.parseDouble(answer.substring(0,location).trim());
                    double right = Double.parseDouble(answer.substring(location+1).trim());

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
         return 0;
        }
    }
}

public class Main{
    public static void main(String[] args) throws IOException {
        while (true){
            Calculator calculator = new Calculator.transper();
            System.out.println("수식 반환 : " + calculator.returnAnswer());
            System.out.println("연산자 위치 : " + calculator.returnOperator());
            System.out.println("결과 반환 : " + calculator.returnResult() + "\n");
        }
    }
}
