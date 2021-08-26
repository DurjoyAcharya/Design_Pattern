package TemplatePattern.list;

import java.util.AbstractList;
public class MyString extends AbstractList<String> {
    private String[] myList;

    public MyString(String[] myList) {
        this.myList = myList;

    }
    @Override
    public String get(int index) {
        return myList[index];
    }
    @Override
    public String set(int index, String element) {
        String oldString=myList[index];
        myList[index]=element;
        return oldString;
    }
    @Override
    public int size() {
        return myList.length;
    }
}
