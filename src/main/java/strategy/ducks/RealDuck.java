package strategy.ducks;

import strategy.fly.FlyWithWings;
import strategy.quack.FakeQuack;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class RealDuck extends Duck{
    public RealDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new FakeQuack());
    }

    @Override
    void display() {
        System.out.println("I am a Real duck");
    }
}
