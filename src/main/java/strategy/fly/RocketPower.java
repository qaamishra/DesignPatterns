package strategy.fly;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class RocketPower implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with Rocket booster now");
    }
}
