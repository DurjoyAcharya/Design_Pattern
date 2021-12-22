package MementoDesignPattern;

import java.util.ArrayList;

public class Palette {
    ArrayList<Element>elements=new ArrayList<>();
    public void addElement(Element element)
    {
        elements.add(element);
    }
    public ArrayList<Element> getElements()
    {
        return (ArrayList<Element>) elements.clone();
    }
    public GUIMemento save()
    {
        return new GUIMemento(getElements());
    }
    public void revert(GUIMemento guiMemento)
    {
        elements=guiMemento.getElements();
    }
    @Override
    public String toString() {
        return "GUIPalette{" + "elements" + elements + '}';
    }
    static class GUIMemento
    {
        ArrayList<Element> elements;

        public GUIMemento(ArrayList<Element> elements) {
            this.elements = elements;
        }
        private ArrayList<Element> getElements()
        {
            return elements;
        }
    }
}
