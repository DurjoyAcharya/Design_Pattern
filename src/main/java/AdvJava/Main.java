package AdvJava;

public class Main {
    public String disp(String name)
    {
        return "Name: "+name;
    }
    public String disp(String name,int id)
    {
        return "Name: "+name+" Id "+id;
    }

    public static void main(String...arifa) {
        Main obj=new Main();
        System.out.println(obj.disp("Faiza"));
        System.out.println(obj.disp("Rongon",10));
        try{

        }finally {

        }
    }
}
