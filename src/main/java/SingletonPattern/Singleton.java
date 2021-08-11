package SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance=new Singleton();
    private Singleton(){}

    public static Singleton getUniqueInstance() {
        return uniqueInstance;
    }
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
class SingletonClient{
    public static void main(String...args) {
        var singleton=Singleton.getUniqueInstance();
        var singleton2=Singleton.getUniqueInstance();
        System.out.println(singleton.getDescription());
        System.out.println(singleton2.getDescription());
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
        var si=StudentInfo.getStudentInfo();
        var si2=StudentInfo.getStudentInfo();
        var si3=StudentInfo.getStudentInfo();
        System.out.println(si.hashCode());//analysis hashcode
        System.out.println(si2.hashCode());//analysis hashcode
        System.out.println(si3.hashCode());
        System.out.println("Default: "+si.getName());
        System.out.println("Default: "+si.getId());
    }
}
class StudentInfo
{
    private String name;
    private long id;
    private static StudentInfo studentInfo=new StudentInfo();
    public StudentInfo(String name, long id) {
        this.name = name;
        this.id = id;
    }

    private StudentInfo() {
        name="JDK";
        id=2020;
    }

    public static StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
