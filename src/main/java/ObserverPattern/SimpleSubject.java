package ObserverPattern;

import java.util.Observable;

@Deprecated
public class SimpleSubject extends Observable {
    private int value;

    public SimpleSubject() {
    }
    public SimpleSubject(int value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }
    public int getValue() {
        return value;
    }


}

