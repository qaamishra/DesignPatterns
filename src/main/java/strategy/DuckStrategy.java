package strategy;

import strategy.ducks.Duck;
import strategy.ducks.RealDuck;
import strategy.ducks.WoodenDuck;
import strategy.fly.RocketPower;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class DuckStrategy {

    public static void main(String[] args) {
        Duck realDuck=new RealDuck();
        realDuck.performFly();
        realDuck.performQuack();

        Duck woodenDuck=new WoodenDuck();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.setFlyBehaviour(new RocketPower());
        woodenDuck.performFly();
    }
}
