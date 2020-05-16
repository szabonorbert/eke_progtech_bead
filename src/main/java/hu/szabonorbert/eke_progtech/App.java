package hu.szabonorbert.eke_progtech;

public class App {
    public static void main(String args[]) {

        Person csabi = new Customer("Csabi");
        csabi.Speak("Jó napot!");
        Person jozsi = Manager.getInstance();
        jozsi.Speak("Üdv nálunk!");

    }
}
