package hu.szabonorbert.eke_progtech;

public class BlackCoffee extends Coffee {

    @Override
    public String getColor() {
        return "barna";
    }

    @Override
    public int getTemperature() {
        return 80;
    }

    @Override
    public String toString() {
        return "kávé";
    }
}
