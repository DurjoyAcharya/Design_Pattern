package MementoDesignPattern;

public class Main {
    public static void main(String...args) {

        var careTaker=new CareTaker();
        var palette=new Palette();

        palette.addElement(new Element("Chiken_Fry"));
        palette.addElement(new Element("Black_Coffe"));
        careTaker.save(palette);
        System.out.println(palette);

        palette.addElement(new Element("Cute"));
        careTaker.save(palette);
        System.out.println(palette);

        palette.addElement(new Element("HP"));
        careTaker.save(palette);
        System.out.println(palette);

        careTaker.revert(palette);
        System.out.println(palette);

        careTaker.revert(palette);
        System.out.println(palette);

        palette.addElement(new Element("Vaseline"));
        careTaker.save(palette);
        System.out.println(palette);

        careTaker.revert(palette);
        System.out.println(palette);
        careTaker.revert(palette);
        System.out.println(palette);
    }
}
