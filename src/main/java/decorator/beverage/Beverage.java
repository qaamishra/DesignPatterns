package decorator.beverage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public abstract class Beverage {

    String description="Raw Beverage ";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
