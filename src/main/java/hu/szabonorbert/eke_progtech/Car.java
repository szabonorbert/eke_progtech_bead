package hu.szabonorbert.eke_progtech;

import java.util.Objects;

public class Car {
    private String manufacturer;
    private String type;
    private String color;
    private double condition;

    public Car(String manufacturer, String type, String color, double condition) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.condition = condition;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getCondition() {
        return condition;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCondition(double condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.condition, condition) == 0 &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(type, car.type) &&
                Objects.equals(color, car.color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", condition=" + condition +
                '}';
    }
}
