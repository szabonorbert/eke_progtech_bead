package hu.szabonorbert.eke_progtech;

public class App {
    public static void main(String args[]) {

        Store store = new Store();
        store.addDummyCars();

        Person kata = new Customer("Kata");

        kata.doSomething("belép a boltba");
        kata.saySomething("Jó napot!");
        Person jozsi = Manager.getInstance();
        jozsi.saySomething("Üdv nálunk!");

        Car kataDreamCar = new Car ("Audi", "TT", 2020, 100, new SportWrooming());
        kata.saySomething("Szeretnék venni a cégem menedzsereinek ilyen autókat: " + kataDreamCar + ".");
    }
}
