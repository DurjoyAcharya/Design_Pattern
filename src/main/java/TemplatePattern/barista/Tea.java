package TemplatePattern.barista;

public class Tea extends CaffeineBeverage{
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon juice");
    }
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
}
