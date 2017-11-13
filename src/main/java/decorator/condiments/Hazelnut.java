package decorator.condiments;

import decorator.beverage.Beverage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class Hazelnut extends CondimentDecorator{

    Beverage beverage;


    public Hazelnut(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Hazelnut ";
    }

    @Override
    public double cost() {
        return beverage.cost()+60;
    }
}
