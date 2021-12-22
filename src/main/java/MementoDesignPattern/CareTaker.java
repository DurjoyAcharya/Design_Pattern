package MementoDesignPattern;

import java.util.Stack;

public class CareTaker {
    Stack<Palette.GUIMemento> history=new Stack<>();
    public void save(Palette palette)
    {
        history.push(palette.save());
    }
    public void revert(Palette palette)
    {
        if (!history.isEmpty())
            palette.revert(history.pop());
        else
            System.out.println("Can't revert");
    }
}
