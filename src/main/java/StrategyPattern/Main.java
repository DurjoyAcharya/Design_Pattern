package StrategyPattern;
//Ref Book Head First Design Pattern

interface QuackBehaviour {
    void Quack();
}
interface FlyBehaviour
{
    void fly();
}
class Quack implements QuackBehaviour{
    @Override
    public void Quack() {
        System.out.println("Quack...");
    }
}
class FlyNoWay implements FlyBehaviour
{
    @Override
    public void fly() {
        System.out.println("Flying Without having something");
    }
}
class FlyRocketPower implements FlyBehaviour
{
    @Override
    public void fly() {
        System.out.println("I'm flying with Rocket");
    }
}
class FlyWithWings implements FlyBehaviour
{
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
class FakeQuack implements QuackBehaviour
{
    @Override
    public void Quack() {
        System.out.println("FakeQuack Rubber Duck....");
    }
}
class Squeak implements QuackBehaviour
{
    @Override
    public void Quack() {
        System.out.println("S_Quack Behaviour");
    }
}
class MuteQuack implements QuackBehaviour {
     @Override
    public void Quack() {
        System.out.println("<< Silence >>");
    }
}
class RedHeadDuck extends Duck
{
    public RedHeadDuck() {

        flyBehaviour=new FlyWithWings();
        quackBehaviour=new Quack();
    }
    public void display()
    {
        System.out.println("I'm a real red head Duck.....");
    }
}
class RubberDuck extends Duck
{
    public RubberDuck() {
        flyBehaviour=new FlyNoWay();
        quackBehaviour=()-> System.out.println("Electric Sound...............");
    }
    public RubberDuck(QuackBehaviour quackBehaviour,FlyBehaviour flyBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
        this.quackBehaviour=quackBehaviour;
    }
    public void display()
    {
        System.out.println("I'm RubberDuck made by human............");
    }
}
class ModelDuck extends Duck
{
    public ModelDuck() {
        quackBehaviour=new Quack();
        flyBehaviour=new FlyNoWay();
    }
    public void display()
    {
        System.out.println("I'm a Model Duck......");
    }
}
class MullerDuck extends Duck{
    public MullerDuck() {
        quackBehaviour=new Quack();
        flyBehaviour=new FlyWithWings();
    }
    public void display()
    {
        System.out.println("I'm Muller Duck.......");
    }
}
class DecoyDuck extends Duck
{
    public DecoyDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }
    public void display()
    {
        System.out.println("I'm DecoyDuck..............");
    }
}

abstract class Duck {
        FlyBehaviour flyBehaviour;
        QuackBehaviour quackBehaviour;
        public Duck(){}
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    public void PerformFly()
    {
        flyBehaviour.fly();
    }
    public void PerformQuack()
    {
        quackBehaviour.Quack();
    }
    public void Swim()
    {
        System.out.println("All Duck Have Swiming Behaviour");
    }
}
class MiniDuckSimulator
{

    public static void main(String[] args) {
        MullerDuck mullerDuck=new MullerDuck();
        DecoyDuck decoyDuck=new DecoyDuck();
        FlyBehaviour flyBehaviour=()-> System.out.println("Can't Fly");
        QuackBehaviour quackBehaviour=()-> System.out.println("Squack");
        RubberDuck rubberDuck=new RubberDuck(quackBehaviour,flyBehaviour);
        Duck model=new ModelDuck();

        //mullerDuck.PerformFly();
        //decoyDuck.PerformFly();
        rubberDuck.PerformFly();
        rubberDuck.PerformQuack();

        //model.setFlyBehaviour(new FlyNoWay());
        //model.PerformFly();

    }
}



public class Main {
//    public static void main(String[] args) {
//
//    }
}
