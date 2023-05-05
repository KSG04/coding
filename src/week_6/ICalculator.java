package week_6;

public interface ICalculator {
    String Plus = "plus", Minus = "minus", Multiple = "multiple";
    public int plus(int i, int j);
    public int minus(int i, int j);

    default int multiple(int i, int j){
        return i * j;
    }

    public static int exec(String opt, int i, int j){
        initMessage(opt);
        CalculatorImpl calculator = new CalculatorImpl();
        int retVal = 0;

        switch (opt){
            case "plus" :
                retVal = calculator.plus(i,j);
                break;
            case "minus" :
                retVal = calculator.minus(i,j);
                break;
            case "multiple" :
                retVal = calculator.multiple(i,j);
                break;
        }
        return retVal;
    }






    private static void initMessage(String opt){
        System.out.println(opt + "입니다");
    }


 }

