package TemplatePattern.Sort;

public class Computer implements Comparable<Computer> {
    String name;
    double price;

    public Computer(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(Computer o) {
        if (this.price<o.price)
            return -1;
        else if (this.price==o.price)
            return 0;
        else
            return 1;
    }
}
