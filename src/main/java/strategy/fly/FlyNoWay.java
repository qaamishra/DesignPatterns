package strategy.fly;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot Fly");
    }
}
