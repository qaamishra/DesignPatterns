package decorator.condiments;

import decorator.beverage.Beverage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class Vanilla extends CondimentDecorator {

    Beverage beverage;//Vanilla is a Condiment and cant go without beverage

    public Vanilla(Beverage beverage) {
        this.beverage = beverage;
    }

    //Decorate with all the things i.e Beverage +Vanilla
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Vanilla ";
    }

    //Decorate with all the things i.e Beverage +Vanilla
    @Override
    public double cost() {
        return beverage.cost() + 50;
    }
}
