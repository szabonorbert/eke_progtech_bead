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

        Car c = new Car("Opel", "Astra H", 2005, 78, new SportWrooming());
        target.addCar(c);

        assertEquals(1, target.getSize());
    }

    @Test
    public void AddCarStoreSize2() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new SportWrooming());
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65, new SmallWrooming());
        target.addCar(car2);

        assertEquals(2, target.getSize());
    }

    @Test
    public void RemoveCarStoreSize1() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new SportWrooming());
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65, new SmallWrooming());
        target.addCar(car2);

        target.removeCar(car2);

        assertEquals(1, target.getSize());
    }

    @Test
    public void RemoveCarStoreSize2() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new SportWrooming());
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65, new SmallWrooming());
        target.addCar(car2);

        Car car3 = new Car("Audi", "A3", 2008, 84, new SportWrooming());
        target.removeCar(car3);

        assertEquals(2, target.getSize());
    }

    @Test
    public void RemoveCarStoreSize3() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new SportWrooming());
        target.addCar(car1);

        Car car2 = new Car("Opel", "Astra H", 2005, 78, new OldWrooming());

        target.removeCar(car2);

        assertEquals(1, target.getSize());
    }

    @Test
    public void getListTest1() {
        Store target = new Store();
        Car car1 = new Car("Opel", "Astra H", 2005, 78, new SportWrooming());
        Car car2 = new Car("Opel", "Astra H", 2005, 78, new OldWrooming());
        Car car3 = new Car("Audi", "A3", 2008, 84, new SportWrooming());
        target.addCar(car1);
        target.addCar(car2);
        target.addCar(car3);
        assertEquals(1, target.getList().size());
    }

}