package week_5;


class Vehicle{
    void whoami(){
        System.out.println("나는 탈 것!");
    }

}
class  Car extends Vehicle{
    void whoami(){
        System.out.println("나는 자동차");
    }
}
class SportCar extends Car{
    void whoami(){
        System.out.println("나는 스포츠 자동차");
    }
}



public class PolymorDemo {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle();
        vehicles[1] = new Car();
        vehicles[2] = new SportCar();



        PolymorDemo p = new PolymorDemo();

        for (Vehicle v : vehicles)
            p.printWhoami(v);



    }
    void printWhoami(Vehicle v){
        v.whoami();
    }

}
