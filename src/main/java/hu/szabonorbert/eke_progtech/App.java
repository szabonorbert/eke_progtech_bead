package hu.szabonorbert.eke_progtech;

import java.util.ArrayList;

public class App {
    public static void main(String args[]) {


        WroomingStrategy wr = new WroomingSport("Renault");
        wr.Wroom();



        Store store = new Store();
        store.addDummyCars();

        Person kata = new Customer("Kata", new CarCheckingHard());

        kata.doSomething("belép a boltba");
        kata.saySomething("Jó napot!");
        Person sanyi = Manager.getInstance();
        sanyi.saySomething("Üdv nálunk!");

        /////

        Car kataDreamCar = new Car ("Audi", "TT", 2020, 100, new WroomingSport("Audi 007"));
        kataDreamCar.addComment("nagyszerű");
        kataDreamCar.addComment("csodálatos");
        kataDreamCar.addComment("elképesztő");
        kata.saySomething("Szeretnék venni a cégem menedzsereinek ilyen autókat: " + kataDreamCar + ".");
        sanyi.doSomething("próbája felfogni, amit Kata mondott");
        Car sanyiCarClone = kataDreamCar.clone();
        sanyi.saySomething("Tehát ha jól értettem: " + sanyiCarClone + ".");
        kata.saySomething("Igen, igen!");
        sanyi.doSomething("illedelmesen elmagyarázza, hogy ezek irreális elvárások egy használtautó kereskedésben");
        kata.saySomething("Hát jó. Mit javasol?");
        sanyi.saySomething("Először is: ne aggassunk az autókra jelzőket.");
        /////

        sanyi.doSomething("végiggondolja mi van raktáron");
        sanyi.saySomething("A következőkből lehet választani:");
        ArrayList<Car> list = store.getList();
        for (Car c : list){
            sanyi.saySomething("\t\t" + c);
        }

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
        sanyi.saySomething("Nos, ez tényleg nem működik.");

        /////

        Car compromiseCar = new Car("Renault", "Megane CC", 2005, 65, new WroomingSport("Renault 4585"));
        kata.saySomething("Lehetséges-e a következő autóból beszerezni 5-öt?");
        kata.saySomething(compromiseCar.toString());

        sanyi.saySomething("Hölgyem, mi bármennyit be tudunk szerezni bármilyen típusból...");
        sanyi.saySomething("...ha van a környező országokban...");
        sanyi.saySomething("...és ami reális...");
        sanyi.saySomething("...és épp van szabad kapacitásunk...");
        sanyi.saySomething("...és beszél az eladó angolul, magyarul vagy eszperantóul...");
        sanyi.saySomething("...szóval szerintem IGEN!");
        kata.doSomething("ráncolja homlokát, de azért véglegesíti rendelést, majd távozik");

        /////

        sanyi.doSomething("dolgozni kezd a megvalósításon");

        System.out.println("");
        System.out.println("* később *");
        System.out.println("");

        sanyi.doSomething("rájön honnan szerezzen olyan autót, amit a vevő rendelt, fel is tölti a készletet");
        for (int i=0; i<5; i++) store.addCar(compromiseCar.clone());

        /////

        kata.doSomething("belép a boltba");
        kata.saySomething("Jó napot! Úgy tudom megjött a rendelésem...");
        sanyi.saySomething("De meg ám! Nézze csak, hogy mik vannak raktáron:");
        ArrayList<Car> newList = store.getList();
        for (Car c : newList){
            sanyi.saySomething("\t\t" + c);
        }

        /////

        kata.saySomething("Nagyszerű, viszem a rendelt autókat.");
        ArrayList<Car> kataCars = new ArrayList<>();
        for (int i=0; i<6; i++){
            if (store.removeCar(compromiseCar)){
                kata.saySomething("Ez meg is van...");
                kataCars.add(compromiseCar.clone());
            } else {
                kata.saySomething("Ez nincs! Hoppá, véletlen olyan autót akartam elvinni, ami itt nem létezik...");
            }
        }
        kata.saySomething("Kész. Van nálam összesen " + kataCars.size() + " darab autó, mégpedig:");
        for (Car c : kataCars){
            kata.saySomething("\t\t" + c);
        }

        /////

        sanyi.saySomething("Ilyet szeretett volna?");
        kata.doSomething("odamegy az egyik autóhoz, és kipróbálja");
        kata.checkTheCar(kataCars.get(0));
        sanyi.doSomething("elmorzsol egy könnycseppet, de nem szól egy szót sem");
        kata.doSomething("megnézi mindegyik autó ugyanolyan-e, mint amilyet rendelt");
        boolean test = true;
        for (Car c : kataCars){
            if (!c.equals(compromiseCar)) test = false;
        }
        if (test){
            kata.saySomething("Igen, pontosan ilyet.");
        } else {
            kata.saySomething("Nem igazán... Kinél lehet panaszt benyújtani?");
            sanyi.saySomething("Őőőőő... Ezen most túllépünk.");
            sanyi.doSomething("jedi elmetrükköt alkalmaz");
        }

        sanyi.saySomething("Kávét parancsol, amíg szerződést aláírjuk?");
        kata.saySomething("Hogyne!");
        sanyi.doSomething("reménykedett, hogy ezt megússza, de sajnos nem. Hátra megy, majd kisvártatva visszajön egy bögrével");
        Coffee coffee = new CoffeeBlack();
        sanyi.doSomething("átnyújtja: " + coffee);
        kata.saySomething("Őőő... Tej van?");
        coffee = new CoffeeDecoratorMilky(coffee);
        sanyi.doSomething("hátra megy, kisváratatva visszajön, majd átnyújtja: " + coffee);
        kata.saySomething("Nagyon jó, már csak egy kis cukor kellene...");
        coffee = new CoffeeDecoratorSweet(coffee);
        sanyi.doSomething("harmadjára is hátramegy, s visszatérte után remegő kezekkel átnyújtja: " + coffee);
        kata.saySomething("Köszönöm, közben alá is írtam mindent. Viszlát!");
        sanyi.doSomething("órákkal később vette csak észre, hogy Kata semmit nem írt alá, és a fizetést is elmulasztotta.");
        System.out.println("");
        System.out.println("Az ügyfél az első.");




    }
}
