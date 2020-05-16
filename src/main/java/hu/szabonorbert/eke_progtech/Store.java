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
        int index = -1;
        for (int i = 0; i < cars.size() && index == -1; i++){
            if (cars.get(i).equals(c)) index = i;
        }
        if (index!=-1){
            cars.remove(index);
        }
    }
}
