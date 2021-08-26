package TemplatePattern.barista;

public class Coffee extends CaffeineBeverage{
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
