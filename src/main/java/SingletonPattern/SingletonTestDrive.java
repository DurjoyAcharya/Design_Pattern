package SingletonPattern;



class Singletoon
{
    protected static Singletoon uniqueInstance;
    double acc;
    protected Singletoon() {
        acc=55.6;
    }
    protected static Singletoon getUniqueInstance() {
            if (uniqueInstance==null) {
                uniqueInstance = new Singletoon();
            }
        return uniqueInstance;
    }
    protected void account() {
        System.out.println("Balance: $" + getAcc());
    }
    protected double getAcc() {
        return acc;
    }
}
class CoolerSingleton extends Singletoon
{
    protected static Singletoon uniqueInstance;
    protected CoolerSingleton() {
        super();
        acc=76.5;
    }
    @Override
    protected void account() {
        System.out.println("Balance: $"+getAcc());
    }
}
class HotterSingleton extends Singletoon
{
    protected static HotterSingleton uniqueInstance;
    private HotterSingleton() {
        super();
        acc=85.73;
    }
    @Override
    protected void account() {
        System.out.println("Balance: $"+getAcc());
    }

    public static HotterSingleton getUniqueInstance() {
        if (uniqueInstance==null)
        {
            uniqueInstance=new HotterSingleton();
        }
        return uniqueInstance;
    }
}
public class SingletonTestDrive {
    public static void main(String[] args) {
        var cool=CoolerSingleton.getUniqueInstance();
        var cool2=CoolerSingleton.getUniqueInstance();
        System.out.println(cool.getClass().getName());
        System.out.println(cool2.getClass().getName());
        cool.account();
        cool2.account();
        System.out.println(cool.hashCode());
        System.out.println(cool2.hashCode());
        System.out.println("________________________");
        //var hot=new HotterSingleton();// can't invoke private constructor
        var hot=HotterSingleton.getUniqueInstance();
        var hot2=HotterSingleton.getUniqueInstance();
        System.out.println(hot.getClass().getName());
        System.out.println(hot2.getClass().getName());
        hot.account();
        hot2.account();
        System.out.println(hot.hashCode());
        System.out.println(hot2.hashCode());
    }
}
