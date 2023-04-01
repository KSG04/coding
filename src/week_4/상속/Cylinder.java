package week_4.상속;

public class Cylinder extends Circle {

    private String color;

    public Cylinder(String color){
        this.color = color;
    }
    public void findColor(){
        System.out.println(color + "공이다");
        //super.findArea();
    }

    @Override
    public void findArea(){
        System.out.println("넓이는 2*(3.14*반지름*반지름) + 2*(3.14*반지름*높이)이다.");
        super.findArea();
        //super.secret();
    }




}
