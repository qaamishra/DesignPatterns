package strategy.ducks;

import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class WoodenDuck extends Duck {

    public WoodenDuck() {

        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I am a Decoy Duck");
    }
}
