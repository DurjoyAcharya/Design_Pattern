package TemplatePattern.Sort;

import java.util.Arrays;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer[] computers={
            new Computer("HP",120000),
                new Computer("Dell",100000),
            new Computer("Sony",150000),
            new Computer("Mac",240000),
                new Computer("Acer",150000),
        };
        System.out.println("Before Sorting......");
        display(computers);
        System.out.println("After Sorting......");
        Arrays.sort(computers);
        display(computers);
    }
    static void display(Computer[] computers)
    {
        System.out.println(Arrays.toString(computers));
    }
}
