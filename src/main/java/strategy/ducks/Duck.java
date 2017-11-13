package strategy.ducks;

import strategy.fly.FlyBehaviour;
import strategy.quack.QuackBehaviour;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour=fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour=qb;
    }

    abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
}
