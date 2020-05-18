package hu.szabonorbert.eke_progtech;

public class CoffeeDecoratorSweet extends Coffee {

    Coffee coffee;

    public CoffeeDecoratorSweet(Coffee coffee){this.coffee = coffee;}

    @Override
    public String getColor() {
        return coffee.getColor();
    }

    @Override
    public int getTemperature() {
        return coffee.getTemperature();
    }

    @Override
    public String toString() {
        return coffee.toString() + " cukorral";
    }
}
