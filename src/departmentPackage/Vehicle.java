package departmentPackage;

public class Vehicle {

    private int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void boostSpeed(double speed) {
        this.speed *= speed;
    }

    void speed() {
        System.out.println("your current speed is " + speed + " mph.");
    }

    void pedal(int speedUp) {
        if (speedUp <= 0) {
            System.out.println("are you kidding me bro? -_-");
        } else {
            speed += speedUp;
            System.out.println("you speeded up your vehicle for " + speed + " mph.");
        }

    }

    void brake(int speedDown) {
        if (speedDown <= 0) {
            System.out.println("are you kidding me bro? -_-");
        } else {
            speed -= speedDown;
            System.out.println("you speed down your vehicle for " + speed + " mph.");
        }

    }

}
