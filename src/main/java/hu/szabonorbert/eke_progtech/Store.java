package hu.szabonorbert.eke_progtech;

import java.util.ArrayList;

public class Store {
    private ArrayList<Car> cars;

    public Store(){
        cars = new ArrayList<Car>();
    }

    public int getSize(){
        return cars.size();
    }

    public void addCar(Car c){
        cars.add(c);
    }

    public void removeCar(Car c){

    }
}
