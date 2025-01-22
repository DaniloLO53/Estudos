package study.viradonojiraya._legacy.days.day12;

public class Car {
    private String chassi;
    private String brand;

    public Car(String chassi, String brand) {
        this.chassi = chassi;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        Car car = (Car) obj;
        return this.chassi.equals(car.chassi);
    }

    public String getSerial() {
        return chassi;
    }

    public void setSerial(String chassi) {
        this.chassi = chassi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
