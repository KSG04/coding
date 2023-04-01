package week_4.상속;


public class InheritanceDemo2 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Cylinder c2 = new Cylinder("파란색");

        System.out.print("원 : ");
        c1.findRadius();
        c1.findArea();
        //c1.secret(); > private 접근 제한자로 제한된 메서드는 외부에서 접근 불가

        System.out.print("\n 실린더 : ");
        c2.findRadius();
        c2.findColor();
        c2.findArea();
        //c2.secret();



    }
}
