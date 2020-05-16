package hu.szabonorbert.eke_progtech;

public class App {
    public static void main(String args[]) {
        Person jozsi = new Manager("Józsi");
        Person csabi = new Customer("Csabi");
        jozsi.Speak("Üdv nálunk!");
        csabi.Speak("Jó napot!");
    }
}
