package TemplatePattern.list;

public class MyStringTestDrive {
    public static void main(String[] args) {
        String[] strings={"Mallard Duck","Redhead Duck","Rubber Duck","Decoy Duck"};
        var duckList=new MyString(strings);
        System.out.println(duckList);
        var oldDuck = duckList.set(3, "Donald Duck");
        System.out.println("Replacing " + oldDuck);
        System.out.println("New List:");
        for (int i = 0; i < duckList.size(); i++) {
            System.out.println(duckList.get(i));
        }
        var ducksSubList = duckList.subList(2, 3);
        System.out.println("Created a sub list of ducks, with size: " + ducksSubList.size());
        for (int i = 0; i < ducksSubList.size(); i++) {
            System.out.println(ducksSubList.get(i));
        }

    }
}
