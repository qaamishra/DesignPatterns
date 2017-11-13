package strategy.quack;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class FakeQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack ");
    }
}
