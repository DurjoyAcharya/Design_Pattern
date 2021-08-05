package ObserverPattern;

public class Example {
    public static void main(String...args) {
            SimpleSubject simpleSubject=new SimpleSubject(50);
            SimpleObserver simpleObserver=new SimpleObserver(simpleSubject);
            simpleObserver.update(simpleSubject,5);
            simpleObserver.display();
    }
}
