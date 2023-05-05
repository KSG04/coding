package week_6;

public class CalculatorImpl implements week_6.ICalculator {


    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int minus(int i, int j) {
        return i - j;
    }

    //인터페이스를 구현한 클래스에서는 필요할 경우 일반 메서드를 추가할 수 있음.

    @Override
    public int multiple(int i, int j) {
    return (i * j) + 5;
    }

    public static void main(String[] args) {
        
        int ret = ICalculator.exec(ICalculator.Multiple,3,4);

        System.out.println("실행결과 : " + ret);

    }
}
