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

    public String getManufacturer() { return manufacturer; }
    public String getType() { return type; }
    public int getYear() { return year; }
    public double getCondition() { return condition; }
    public WroomingStrategy getWroomingStrategy() { return wroomingStrategy; }

    public void Wroom(){ wroomingStrategy.Wroom(); }

    public Car deepCopy(){
        return new Car(this.manufacturer, this.type, this.year, this.condition, this.wroomingStrategy.clone());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Double.compare(car.condition, condition) == 0 &&
                manufacturer.equals(car.manufacturer) &&
                type.equals(car.type) &&
                wroomingStrategy.toString().equals(car.wroomingStrategy.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", year='" + year + '\'' +
                ", condition='" + condition + "%'" +
                ", wroomingStrategy='" + wroomingStrategy + '\'' +
                '}';
    }
}
