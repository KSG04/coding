package week_5.abstract2;

public class AbstractClassDemo {
    public static void main(String[] args) {
        //Shape s = new Shape(); => 추상 클래스는 객체로 생성할 수 없음

        Rectangle r = new Rectangle(3,4);
        r.draw();
        System.out.printf("사각형의 넓이는 : %.1f\n",r.findArea());

        Shape s = new Circle(3);

        s.draw();
        System.out.printf("원의 넓이는 %.1f\n", s.findArea());


    }
}
