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

        /////

        Car kataDreamCar = new Car ("Audi", "TT", 2020, 100, new SportWrooming());
        kata.saySomething("Szeretnék venni a cégem menedzsereinek ilyen autókat: " + kataDreamCar + ".");
        sanyi.doSomething("illedelmesen elmagyarázza, hogy ezek irreális elvárások egy használtautó kereskedésben");
        kata.saySomething("Hát jó. Mit javasol?");

        /////

        sanyi.doSomething("végiggondolja mi van raktáron");
        String sanyiThoughts = "";
        ArrayList<Car> list = store.getList();
        for (Car c:list){
            sanyiThoughts += "\n\t\t" + c;
        }
        sanyi.saySomething("A következőkből lehet választani:" + sanyiThoughts);

        /////

        kata.saySomething("Kipróbálom a legelső és a legutolsó kocsit!");

        Car first = list.get(0);
        kata.doSomething("a következőket teszi az első autóval (" + first  + "):");
        kata.checkTheCar(first);

        Car last = list.get(list.size()-1);
        kata.doSomething("a következőket teszi az második autóval (" + last  + "):");
        kata.checkTheCar(last);
        kata.saySomething("Milyen kereskedés ez?! Ez az utolsó nem is működik, túl régi a motor.");

        /////

        sanyi.saySomething("Hölgyem, finomabban bánjon ezekkel az autókkal! Nézze csak:");
        sanyi.checkTheCar(last);
        sanyi.saySomething("Nos, ez tényleg nem indul.");

        /////

        Car compromiseCar = new Car("Reanult", "Megane CC", 2005, 65, new SportWrooming());
        kata.saySomething("Lehetséges-e a következő autóból beszerezni 5-öt?");
        kata.saySomething(compromiseCar.toString());

        sanyi.saySomething("Hölgyem, mi bármennyit be tudunk szerezni bármilyen típusból...");
        sanyi.saySomething("...ha van a környező országokban...");
        sanyi.saySomething("...és ami reális...");
        sanyi.saySomething("...és épp van szabad kapacitásunk...");
        sanyi.saySomething("...és beszél az eladó angolul, magyarul vagy eszperantóul...");
        sanyi.saySomething("...szóval szerintem IGEN!");
        kata.doSomething("ráncolja homlokát, de azért leadja a rendelést papíron, s végül távozik.");

        System.out.println("");
        System.out.println("* 2 héttel később *");
    }
}
