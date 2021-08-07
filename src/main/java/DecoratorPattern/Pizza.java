package DecoratorPattern;

abstract class Pizza {
    String description="Basic Pizza";

    public String getDescription() {
        return description;
    }
    public abstract double price();
}
abstract class ToppingDecorator extends Pizza
{
    Pizza pizza;
    public abstract String getDescription();
}
class ThincrustPizza extends Pizza
{
    public ThincrustPizza() {
        this.description="Thin crust Pizza with hot tomato Sos";
    }
    @Override
    public double price() {
        return 7.6;
    }
}
class Olives extends ToppingDecorator
{
    public Olives(Pizza pizza) {
        this.pizza=pizza;
    }
    @Override
    public double price() {
        return pizza.price()+3.2;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+", Olives";
    }
}
class Cheese extends ToppingDecorator
{
    public Cheese(Pizza pizza) {
        this.pizza=pizza;
    }
    @Override
    public double price() {
        return pizza.price()+3.1;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+", Cheese";
    }
}
class ThickcrustPizza extends Pizza {

    public ThickcrustPizza() {
        description = "Thick crust pizza, with tomato sauce";
    }

    public double price() {
        return 7.99;
    }
}
class PizzaStore
{
    public static void main(String...args) {
        Pizza pizza=new ThickcrustPizza();
        System.out.println(pizza.price());
        System.out.println(pizza.getDescription());
        Pizza pizza1=new Cheese(pizza);
        System.out.println(pizza1.price());
        System.out.println(pizza1.getDescription());

    }
}


