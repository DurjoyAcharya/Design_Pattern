package TemplatePattern.barista;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
     }
     public void pourInCup() {
        System.out.println("Pouring into Cup");
     }
     abstract void addCondiments();
     abstract void brew();
     public void boilWater() {
         System.out.println("Boiling Water");
     }
}
