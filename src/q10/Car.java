package q10;

public class Car {
    int speed , noOfGeer;
    void drive(){
        noOfGeer=1;
        speed=10;
    }
    Car(){
        drive();
    }
    void display(){
        System.out.println(speed+noOfGeer);
    }
}
