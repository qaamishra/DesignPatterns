package strategy.quack;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cant Quack; Mute Mute");
    }
}
