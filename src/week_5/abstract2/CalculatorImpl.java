package week_5.abstract2;

import week_5.ICalculator;

public class CalculatorImpl implements ICalculator {


    @Override
    public int plus(int i, int j) {
        return 0;
    }

    @Override
    public int minus(int i, int j) {
        return 0;
    }
    //인터페이스를 구현한 클래스에서는 필요할 경우 일반 메서드를 추가할 수 있음.
    void f(){

    }

    public static void main(String[] args) {

        //ICalculator ic = new ICalculator() 인터페이스는 객체로 생성할 수 없음
        System.out.println(ICalculator.Minus);

    }


}


// 추상메서드 사용 용도와 인터페이스 사용 용도