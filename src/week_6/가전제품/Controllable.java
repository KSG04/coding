package week_6.가전제품;

public interface Controllable {
    void turnOn();
    void turnOff();

    default void repair(){
        show("장비를 수리");
    }
    static void reset(){
        System.out.println("장비 초기화");
    }

    private void show(String s){
        System.out.println(s);
    }

}
