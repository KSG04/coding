package week_5;

public class Upcaste {

    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.number);

        //Student d = new Person();
        //부모 클래스 타입의 참조 변수가 자식클래스 타입의 객체를 참조할 경우 자동 형변환이 이루어 짐.
        //자동 형 변환이 이루어 질 경우 부모 클래스 타입의 참조 변수로 참조 할 수 있는 참조 범위는 부모 클래스 범위로 제한
        // Student는 person에 의존하고 있으므로 person이 존재해야지 student가 존재할 수 있다. 그러므로 student는 person으로 형변환 할 수 있지만 person이 student로 형변환 불가능

        Person p;

        p = s;

        //s = p;
        // Person 타입의 p를 student에 형변환으로 넣을 수 없지만 p를 student 타입으로 강제로 형 변환해서 Student 타입의 s에 강제로 넣음
        s = (Student)p;

        //p.number = 1;
        //p.work();
        p.whoami();
        System.out.println(s.name);
        System.out.println(s.number);
    }


}
class Person{
    String name = "사람";

    void whoami(){
        System.out.println("나는 사람이다.");
    }

}

class  Student extends  Person{

    int number = 8;

    void work(){
        System.out.println("나는 공부한다.");
    }


}

