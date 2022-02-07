package departmentPackage;

public class Car extends Vehicle {

    Car(int speed) {
        super(speed);
    }

    void boost(double boosting) {
        boostSpeed(boosting);
        System.out.println("you boosted the vehicle ^_-");
    }

    void drift() {
        System.out.println("dusty drift bro, you nail it o_-");
    }


}
