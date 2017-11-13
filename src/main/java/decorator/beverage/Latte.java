package decorator.beverage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class Latte extends Beverage {
    public Latte() {
        description="Latte Coffee ";
    }

    @Override
    public double cost() {
        return 90;
    }
}
