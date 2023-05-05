package week_6.가전제품;

public class ControllableDemo {

    public static void main(String[] args) {
        TV tv = new TV();
        Computer computer = new Computer();

        tv.remoteOn();
        tv.remoteOff();
        tv.repair();

        computer.turnOn();
        computer.turnOff();
        computer.repair();

        Controllable.reset(); // 인터페이스 이름을 이용하여 static 메서드 호출
        //tv.reset(); //객체 참조 변수를 이용해서 static 메서드 호출 불가
        //computer.reset();


    }


}
