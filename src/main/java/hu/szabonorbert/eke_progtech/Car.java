package hu.szabonorbert.eke_progtech;

import java.util.Objects;

public class Car {
    private String manufacturer;
    private String type;
    private int year;
    private double condition;
    private WroomingStrategy wroomingStrategy;

    public Car(String manufacturer, String type, int year, double condition, WroomingStrategy wroomingStrategy) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
        this.condition = condition;
        this.wroomingStrategy = wroomingStrategy;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getType() { return type; }
    public int getYear() {
        return year;
    }
    public double getCondition() {
        return condition;
    }

    public void setCondition(double condition) {
        this.condition = condition;
    }

    public void Wroom(){
        wroomingStrategy.Wroom();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.condition, condition) == 0 &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(type, car.type) &&
                Objects.equals(year, car.year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", year='" + year + '\'' +
                ", condition=" + condition +
                '}';
    }
}
