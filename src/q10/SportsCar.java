package q10;

public class SportsCar extends  Car {
    int airBaloonType=9;
    void display(){
        super.display();
        System.out.println(airBaloonType);
    }

    public static void main(String[] args) {
        Car car= new Car();
        car.display();
        car= new SportsCar();
        car.display();
    }
}
