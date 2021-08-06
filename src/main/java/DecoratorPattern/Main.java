package DecoratorPattern;

//ref book head first design pattern

abstract class Beverage{
    String Description="Unknown Beverage";

    public String getDescription() {
        return Description;
    }
    public abstract double cost();
}
abstract class CondimentBeverage extends Beverage
{
    public abstract String getDescription();
}
class Espresso extends Beverage
{
    public Espresso() {
        Description="Espresso";
    }
    @Override
    public double cost() {
        return 12.75;
    }
}
class JackDaniels extends Beverage
{
    public JackDaniels() {
        Description ="JackDaniels";
    }
    @Override
    public double cost() {
        return 2540.50;
    }
}
class Passport extends CondimentBeverage
{
    Beverage beverage;
    private double vat;

    public Passport(Beverage beverage, double vat) {
        this.beverage = beverage;
        this.vat = vat;
    }

    public Passport(double vat) {
        this.vat = vat;
    }

    @Override
    public double cost() {
        return vat+beverage.cost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Passport";
    }
}
class CashMemo extends CondimentBeverage
{
    private double cost;
    Beverage beverage;

    public CashMemo(Beverage beverage,double cost) {
        this.cost = cost;
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.cost+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",JackDaniels";
    }
}
public class Main {
    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println("$"+beverage.cost());
        Beverage beverage1=new JackDaniels();
        System.out.println(beverage1.getDescription());
        System.out.println("$"+beverage1.cost());
        Beverage beverage2=new Passport(beverage,55.50);
        System.out.println("____________________________");
        System.out.println(beverage2.getDescription());
        System.out.println("$"+beverage2.cost());
        System.out.println("____________________________");
        Beverage beverage3=new CashMemo(new JackDaniels(),new JackDaniels().cost());
        System.out.println(beverage3.getDescription());
        System.out.println("$"+beverage3.cost());
    }
}
