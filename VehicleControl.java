package week4;
abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car start");
    }

    @Override
    void stop() {
        System.out.println("Car stop");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike start");
    }

    @Override
    void stop() {
        System.out.println("Bike stop");
    }
}
public class VehicleControl {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
    }
}
