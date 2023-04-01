package week_4;


class Animal{

    public Animal() {
        super();
        System.out.println("부모 클래스의 기본 생성자");
    }
    //생성자가 정의되어 있다면 기본 생성자는 자동으로 생성되지 않음
    public Animal(String s){
        System.out.println("동뮬 : " + s);
    }
}

class Mammal extends Animal {
    //생성자가 정의되지 않았을 경우 컴파일러에 의해 자동으로 기본 생성자가 생성


    public Mammal() {
        //부모 클래스의 생성자를 명시적으로 호출
        //super() 는 반드시 첫번째 실행문으로 나타나야함
        super();
        System.out.println("포유류 : 원숭이");

    }

}

public class AnimalDemo {

    public static void main(String[] args) {
        Mammal ape = new Mammal();

    }

}
