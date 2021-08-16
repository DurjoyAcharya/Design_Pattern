package CommandPattern.diner;

@FunctionalInterface
interface Order{
    void orderUp();
}
public class Cook {
    public Cook() {
    }
    public void makeBurger()
    {
        System.out.println("Making Burger..............");
    }
    public void makeFries()
    {
        System.out.println("Making Fries...............");
    }
}
class Waitrees{
    Order order;
    public Waitrees() {
    }
    public void takeOrder(Order order) {
        this.order = order;
        order.orderUp();
    }

}
class Customer{
    Waitrees waitrees;
    Cook cook;
    Order order;

    public Customer(Waitrees waitrees, Cook cook) {
        this.waitrees = waitrees;
        this.cook = cook;
    }

    public void CreateOrder()
    {
        order=()->{cook.makeFries(); cook.makeBurger();};
    }

    public void Hungry()
    {
        waitrees.takeOrder(order);
    }
}

class Diner{
    public static void main(String...args) {
        var cook=new Cook();
        var wait=new Waitrees();
        var customer=new Customer(wait,cook);
        customer.CreateOrder();
        customer.Hungry();
    }
}