package week_5;

public class InstanceofDemo {

    public static void main(String[] args) {


        InstanceofDemo d = new InstanceofDemo();

        Student s = new Student();
        Person p = new Person();


        System.out.println(s instanceof Person);
        System.out.println(s instanceof  Student);
        System.out.println(p instanceof Student);

        d.downcast(s);
    }
    // Person P 에 Person 타입 P도 전달할 수 있고 Student s 도 전달할 수 있다.
    void downcast (Person p){
        if (p instanceof Student){
            Student s = (Student) p;
            System.out.println("OK , 하향 타입 변환");
        }
    }





}
