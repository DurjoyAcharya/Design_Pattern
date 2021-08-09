package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

abstract class Pizza{
    String name;
    String dough;
    String sauce;
    List<String> topping =new ArrayList<>();

    public String getName() {
        return name;
    }
    public void Prepare()
    {
        System.out.println("Preparing "+name);
    }
    public void bake()
    {
        System.out.println("Baking "+name);
    }
    public void Cut()
    {
        System.out.println("Cutting "+name);
    }
    public void box()
    {
        System.out.println("Boxing "+name);
    }

    @Override
    public String toString() {
        var display=new StringBuffer();
        display.append("-------").append(name).append("--------\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String toppings:topping)
        {
            display.append(toppings).append("\n");
        }
        return display.toString();
    }
}
class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        topping.add("Shredded mozzarella");
        topping.add("Grated parmesan");
        topping.add("Diced onion");
        topping.add("Sliced mushrooms");
        topping.add("Sliced red pepper");
        topping.add("Sliced black olives");
    }
}
class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        topping.add("Clams");
        topping.add("Grated parmesan cheese");
    }
}
class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        topping.add("Fresh Mozzarella");
        topping.add("Parmesan");
    }
}
class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        topping.add("Sliced Pepperoni");
        topping.add("Sliced Onion");
        topping.add("Grated parmesan cheese");
    }
}
class SimplePizzaFactory
{
    public Pizza CreatePizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie"))
        {
            pizza=new VeggiePizza();
        }
        return pizza;
    }
}
class PizzaStore{
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza OderPizza(String type)
    {
        Pizza pizza;
        pizza=factory.CreatePizza(type);
        pizza.Prepare();
        pizza.bake();
        pizza.Cut();
        pizza.box();
    return pizza;
    }
}
public class PizzaTestStore {
    public static void main(String[] args) {
        var factory=new SimplePizzaFactory();
        var store=new PizzaStore(factory);
        var pizza=store.OderPizza("cheese");
        System.out.println("WE OFTEN ORDERED A PIZZA: "+pizza.getName());
        System.out.println(pizza);
        System.out.println("_______________X______________");
        System.out.println("_______________X______________");
        pizza= store.OderPizza("pepperoni");
        System.out.println(pizza);
    }
}
