package decorator.beverage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class Espresso extends Beverage {

    public Espresso() {

        description="Espresso Coffee ";
    }



    @Override
    public double cost() {

        return 100;

    }
}
