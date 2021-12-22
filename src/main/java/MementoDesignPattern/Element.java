package MementoDesignPattern;

public class Element {
   protected String element;
   public Element(String element) {
        this.element = element;
    }
   @Override
   public String toString() {
        return "Element{" +
                "element='" + element + '\'' +
                '}';
    }
}
