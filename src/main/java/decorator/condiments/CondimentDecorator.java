package decorator.condiments;

import decorator.beverage.Beverage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
