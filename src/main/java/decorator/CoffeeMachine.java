package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.condiments.Hazelnut;
import decorator.condiments.Vanilla;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class CoffeeMachine {

    public static void main(String[] args) {

        //I need only Espresso
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription() + "Rs " + beverage.cost());

        //I need Espresso with Hazelnut
        Beverage beverage1=new Espresso();
        beverage1=new Hazelnut(beverage1);
        //Oh yes please add Vanilla too
        beverage1=new Vanilla(beverage1);
        //How much ?

        System.out.println(beverage1.getDescription() + "Rs " + beverage1.cost());
    }
}
