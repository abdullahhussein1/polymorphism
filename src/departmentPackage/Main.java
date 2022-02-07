package departmentPackage;

public class Main {

    public static void main(String[] args) {

        Car vehicle1 = new Car(100);
        Bicycle vehicle2 = new Bicycle(30);

        vehicle1.speed();
        vehicle2.speed();
        System.out.println();
        vehicle1.pedal(80);
        vehicle2.brake(10);
        System.out.println();
        vehicle1.drift();
        vehicle2.oneWheelDrive();
        System.out.println();
        vehicle1.boost(1.2);
        vehicle1.speed();


    }
}