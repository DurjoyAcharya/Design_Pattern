package ProtoType.ShallowVsDeep;

import java.util.Arrays;

public class Person {
    private String Name;
    private String Address;
    public Person(Person OriginalPerson)
    {
        this.Name= OriginalPerson.Name;
        this.Address= OriginalPerson.Address;
    }
}
class ShallowExample {
    private int[] data;
    // makes a shallow copy of values
    public ShallowExample(int[] values) {
        data = values;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void showData() {
        System.out.println( Arrays.toString(data) );
    }
}
class Mother
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] arr2={10,9,8,7,6,5,4,3,2,1};
        var obj=new ShallowExample(arr);
        obj.showData();
        var obj2=obj;
        obj2.setData(arr2);
        obj2.showData();
        obj.showData();
    }
}
