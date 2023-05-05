package week_5.abstract2;

// 추상 클래스를 상속받은 클래스는 기본적으로 추상 클래스
// 상속해준 추상클래스의 모든 추상메서드를 구현하지 않은 경우에도 추상클래스
class Rectangle extends Shape{
    int width = 0 ;
    int height = 0;

    public Rectangle(int width, int height){
        super();
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("사각형을 그리다");
    }

    public double findArea(){
        return width * height;
    }
}
