package TemplatePattern.SimpleBarista;

public class Barista {
    public static void main(String[] args) {
        var tea=new Tea();
        var coffee=new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
