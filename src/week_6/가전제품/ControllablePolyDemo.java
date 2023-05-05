package week_6.가전제품;

public class ControllablePolyDemo {
    public static void main(String[] args) {

        Controllable[] controllables = {new TV(), new Computer()};

        for (Controllable c : controllables){
            printObj(c);
        }
        Controllable.reset();
    }

    static void printObj(Controllable c){
        c.turnOn();
        c.turnOff();
        c.repair();
    }
}
