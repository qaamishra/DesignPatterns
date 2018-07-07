package factory;

import factory.pizzas.Pizza;
import factory.pizzaStore.PizzaStore;
import factory.pizzaFactory.SimplePizzaFactory;

public class RunTheFactoryHere {

    public static void main(String[] args) {

        SimplePizzaFactory factory=new SimplePizzaFactory();
        PizzaStore pizzaStore=new PizzaStore(factory);

        Pizza pizza1 =pizzaStore.orderPizza("cheese");
        System.out.println(pizza1);

        Pizza pizza2 =pizzaStore.orderPizza("veggie");
        System.out.println(pizza2);


    }
}
