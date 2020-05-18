package hu.szabonorbert.eke_progtech;

public class CoffeeDecoratorMilky extends Coffee {

    Coffee coffee;

    public CoffeeDecoratorMilky(Coffee coffee){this.coffee = coffee;}

    @Override
    public String getColor() {
        return "világosabb " + coffee.getColor();
    }

    @Override
    public int getTemperature() {
        int newTemp = coffee.getTemperature() - 20;
        if (newTemp < 10) newTemp = 10;
        return newTemp;
    }

    @Override
    public String toString() {
        return getColor() + " kávé";
    }
}
