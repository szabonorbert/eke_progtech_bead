package hu.szabonorbert.eke_progtech;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StoreTest {

    @Test
    public void ZeroCarsZeroSize() {
        Store target = new Store();
        assertEquals(0, target.getSize());
    }

    @Test
    public void AddCarStoreSize1() {
        Store target = new Store();
        Car c = new Car("Opel", "Astra H", 2005, 78);
        target.addCar(c);
        assertEquals(1, target.getSize());
    }

    @Test
    public void AddCarStoreSize2() {
        Store target = new Store();
        Car car1 = new Car("Opel", "Astra H", 2005, 78);
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65);
        target.addCar(car2);
        assertEquals(2, target.getSize());
    }

    @Test
    public void RemoveCarStoreSize1() {
        Store target = new Store();
        Car car1 = new Car("Opel", "Astra H", 2005, 78);
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65);
        target.addCar(car2);

        target.removeCar(car2);
        assertEquals(1, target.getSize());
    }

}