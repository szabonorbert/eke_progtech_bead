package hu.szabonorbert.eke_progtech;

import java.util.ArrayList;

public class App {
    public static void main(String args[]) {

        Store store = new Store();
        store.addDummyCars();

        Person kata = new Customer("Kata", new HardCarChecking());

        kata.doSomething("belép a boltba");
        kata.saySomething("Jó napot!");
        Person sanyi = Manager.getInstance();
        sanyi.saySomething("Üdv nálunk!");

        Car kataDreamCar = new Car ("Audi", "TT", 2020, 100, new SportWrooming());
        kata.saySomething("Szeretnék venni a cégem menedzsereinek ilyen autókat: " + kataDreamCar + ".");

        sanyi.doSomething("illedelmesen elmagyarázza, hogy ezek irreális elvárások egy használtautó kereskedésben");
        kata.saySomething("Hát jó. Mit javasol?");

        sanyi.doSomething("végiggondolja mi van raktáron");
        String sanyiThoughts = "";
        ArrayList<Car> list = store.getList();
        for (int i=0; i<list.size(); i++){
            sanyiThoughts += "\n\t\t" + list.get(i);
        }
        sanyi.saySomething("A következőkből lehet választani:" + sanyiThoughts);

    }
}
