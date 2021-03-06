package hu.szabonorbert.eke_progtech;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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

        Car c = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 112"));
        target.addCar(c);

        assertEquals(1, target.getSize());
    }

    @Test
    public void AddCarStoreSize2() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 112"));
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65, new WroomingSmall("Renault 54"));
        target.addCar(car2);

        assertEquals(2, target.getSize());
    }

    @Test
    public void RemoveCarStoreSize1() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 112"));
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65, new WroomingSmall("Renault 5544"));
        target.addCar(car2);

        target.removeCar(car2);

        assertEquals(1, target.getSize());
    }

    @Test
    public void RemoveCarStoreSize2() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 145"));
        target.addCar(car1);
        Car car2 = new Car("Renault", "Megane CC", 2004, 65, new WroomingSmall("Renault 1545"));
        target.addCar(car2);

        Car car3 = new Car("Audi", "A3", 2008, 84, new WroomingSport("Ferrari 453"));
        target.removeCar(car3);

        assertEquals(2, target.getSize());
    }

    @Test
    public void RemoveCarStoreSize3() {
        Store target = new Store();

        Car car1 = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 145"));
        target.addCar(car1);

        Car car2 = new Car("Opel", "Astra H", 2005, 78, new WroomingOld("Opel 1454"));
        target.removeCar(car2);

        assertEquals(1, target.getSize());
    }

    @Test
    public void getListTest1() {
        Store target = new Store();
        assertEquals(0, target.getList().size());
    }

    @Test
    public void getListTest2() {
        Store target = new Store();
        Car car1 = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 14"));
        Car car2 = new Car("Opel", "Astra H", 2005, 78, new WroomingOld("Opel 14"));
        Car car3 = new Car("Audi", "A3", 2008, 84, new WroomingSport("Opel 14"));
        target.addCar(car1);
        target.addCar(car2);
        target.addCar(car3);
        assertEquals(3, target.getList().size());
    }

    @Test
    public void getListTest3() {
        Store target = new Store();
        Car car1 = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 147"));
        target.addCar(car1);

        assertEquals(target.getList().get(0), car1);
    }

    @Test
    public void getListTest4() {
        Store target = new Store();
        Car car1 = new Car("Opel", "Astra H", 2005, 78, new WroomingSport("Opel 147"));
        target.addCar(car1);

        assertEquals(target.getList().get(0), car1);
        assertFalse(target.getList().get(0) == car1);
    }
}