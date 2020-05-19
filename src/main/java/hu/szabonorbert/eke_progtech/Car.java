package hu.szabonorbert.eke_progtech;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements Cloneable{
    private String manufacturer;
    private String type;
    private int year;
    private double condition;
    private WroomingStrategy wroomingStrategy;
    private ArrayList<String> comments;

    public Car(String manufacturer, String type, int year, double condition, WroomingStrategy wroomingStrategy) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
        this.condition = condition;
        this.wroomingStrategy = wroomingStrategy;
        this.comments = new ArrayList<String>();
    }
    public Car(String manufacturer, String type, int year, double condition, WroomingStrategy wroomingStrategy, ArrayList<String> comments) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.year = year;
        this.condition = condition;
        this.wroomingStrategy = wroomingStrategy;
        this.comments = comments;
    }
    public String getManufacturer() { return manufacturer; }
    public String getType() { return type; }
    public int getYear() { return year; }
    public double getCondition() { return condition; }
    public WroomingStrategy getWroomingStrategy() { return wroomingStrategy; }
    public void addComment(String comment){
        comments.add(comment);
    }
    public void removeComment(String comment){
        comments.remove(comment);
    }
    public ArrayList<String> getComments(){
        return (ArrayList)comments.clone();
    }

    public void Wroom(){ wroomingStrategy.Wroom(); }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return o.toString().equals(car.toString());
        /*year == car.year &&
                Double.compare(car.condition, condition) == 0 &&
                manufacturer.equals(car.manufacturer) &&
                type.equals(car.type) &&
                wroomingStrategy.toString().equals(car.wroomingStrategy.toString());*/
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", year='" + year + '\'' +
                ", condition='" + condition + "%'" +
                ", wroomingStrategy='" + wroomingStrategy + '\'' +
                ", comments: {");


        for(String c:comments) {
            sb.append("'").append(c).append("'");
            if (c != comments.get(comments.size()-1)) sb.append(", ");
        }

        sb.append("}}");
        return sb.toString();
    }

    @Override
    public Car clone(){
        return new Car(this.manufacturer, this.type, this.year, this.condition, this.wroomingStrategy, (ArrayList)comments.clone());
    }
}
