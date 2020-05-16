package hu.szabonorbert.eke_progtech;

public class App {
    public static void main(String args[]) {

        Store store = new Store();
        store.addDummyCars();

        Person kata = new Customer("Kata");

        kata.Do("belép a boltba");
        kata.Speak("Jó napot!");
        Person jozsi = Manager.getInstance();
        jozsi.Speak("Üdv nálunk!");

        Car kataDreamCar = new Car ("Audi", "TT", 2020, 100, new SportWrooming());
        kata.Speak("Szeretnék venni egy ilyen autót: " + kataDreamCar + ".");
    }
}
