package AbstractPattern;

//Uncomplete Version
interface AbstractProductA{
    String UsefulMethodA();
}
interface AbstractProductB{
    String UsefulMethodB();
    String AnotherUsefulMethod(AbstractProductA productA);
}
class AbstractProductA1 implements AbstractProductA
{
    @Override
    public String UsefulMethodA() {
        return "Useful Method A From AbstractProductA1";
    }
}
class AbstractProductA2 implements AbstractProductA
{
    @Override
    public String UsefulMethodA() {
        return "Useful Method A From AbstractProductA2";
    }
}
class AbstractProductB1 implements AbstractProductB
{

    @Override
    public String UsefulMethodB() {
        return "Useful Method B From AbstractProductB1";
    }

    @Override
    public String AnotherUsefulMethod(AbstractProductA productA) {
        return "AbstractProductB1 Collaboratng with the pattern ("+productA.UsefulMethodA()+")";
    }
}
class AbstractProductB2 implements AbstractProductB
{

    @Override
    public String UsefulMethodB() {
        return "Useful Method B From AbstractProductB2";
    }

    @Override
    public String AnotherUsefulMethod(AbstractProductA productA) {
        return "AbstractProductB1 Collaboratng with the pattern ("+productA.UsefulMethodA()+")";
    }
}
interface AbstractFactory
{
    AbstractProductA ABSTRACT_PRODUCT_A();
    AbstractProductB ABSTRACT_PRODUCT_B();
}
class ConcreteFactory1 implements AbstractFactory
{

    @Override
    public AbstractProductA ABSTRACT_PRODUCT_A() {
        return new AbstractProductA1();
    }

    @Override
    public AbstractProductB ABSTRACT_PRODUCT_B() {
        return new AbstractProductB1();
    }
}
class ConcreteFactory2 implements AbstractFactory
{

    @Override
    public AbstractProductA ABSTRACT_PRODUCT_A() {
        return new AbstractProductA2();
    }

    @Override
    public AbstractProductB ABSTRACT_PRODUCT_B() {
        return new AbstractProductB2();
    }
}
class Client
{
    public void Main()
    {
        ClientMethod(new AbstractProductA1());
    }
    public void ClientMethod(AbstractProductA productA)
    {
        var ProA=productA.UsefulMethodA();
        var ProB=productA.UsefulMethodA();
        System.out.println(ProB);
        System.out.println(ProA);
    }
}
public class Program {
    public static void main(String[] args) {
     new Client().Main();
    }
}
