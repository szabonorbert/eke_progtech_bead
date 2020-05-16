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

}