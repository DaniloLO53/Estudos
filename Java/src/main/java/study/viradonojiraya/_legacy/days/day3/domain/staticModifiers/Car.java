package study.viradonojiraya._legacy.days.day3.domain.staticModifiers;

public class Car {
    private String brand;
    private double maxSpeed;
    private static double speedLimit = 250;

    public Car(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed= Car.this.maxSpeed;
    }

    public void presentation() {
        // here you can use this.speedLimit because we can assure that a Car's instance exists
        // presentation can only be executed within an object
        System.out.printf("""
                Brand: %s
                Max speed: %f
                Speed limit: %f
                """, this.brand, this.maxSpeed, Car.speedLimit);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static double getSpeedLimit() {
        return speedLimit; // here we don't need Car.speedLimit, since the method don't receive any argument with the same name
    }

    public static void setSpeedLimit(double speedLimit) {
        // you can't use "this" because "this" may don't even exist, since it refers to the object, not the class
        // for example, we cannot access "brand" because it's a not-static attribute, meaning that it doesn't belong
        // to any specific instance (or object)
        Car.speedLimit = speedLimit;
    }
}
