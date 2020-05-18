package hu.szabonorbert.eke_progtech;

import java.util.ArrayList;

public class Store {
    private ArrayList<Car> cars;

    public Store(){
        cars = new ArrayList<>();
    }

    public int getSize(){
        return cars.size();
    }

    public void addCar(Car c){
        cars.add(c);
    }

    public boolean removeCar(Car c){
        int index = -1;
        for (int i = 0; i < cars.size() && index == -1; i++){
            if (cars.get(i).equals(c)) index = i;
        }
        if (index!=-1){
            cars.remove(index);
            return true;
        }
        return false;
    }

    public ArrayList<Car> getList(){
        ArrayList<Car> ret = new ArrayList<>();
        for (Car c: cars){
            ret.add(c.clone());
        }
        return ret;
    }

    public void addDummyCars(){
        cars.add(new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 112")));
        cars.add(new Car("Renault", "Megane CC", 2004, 65, new WroomingSmall("Reanult 5414")));
        cars.add(new Car("Audi", "A3", 2008, 84, new WroomingSport("Renault 4545")));
        cars.add(new Car("Mercedes", "E 300 D", 1992, 22, new WroomingOld("Babetta ???")));
    }
}
