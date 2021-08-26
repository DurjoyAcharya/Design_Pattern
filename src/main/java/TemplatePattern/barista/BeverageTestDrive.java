package TemplatePattern.barista;

public class BeverageTestDrive {
    public static void main(String[] args) {
        var tea=new Tea();
        var coffee=new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
        var teaHook = new TeaWithHook();
        var coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
