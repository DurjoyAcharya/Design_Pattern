package SingletonPattern;


public enum ESingleton {
    Unique_Instance;
    String name;
    ESingleton() {
    name="da-durjoy@outlook.com (Thread Safe)";
    }
    public String getName() {
        return name;
    }
}
class ESingletonClient{
    public static void main(String[] args) {
        var obj=ESingleton.Unique_Instance;
        System.out.println(obj.getName());
        System.out.println(obj.hashCode());
    }
}
