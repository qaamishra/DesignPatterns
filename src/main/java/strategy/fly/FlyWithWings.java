package strategy.fly;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I have wings ,I can fly");
    }
}
