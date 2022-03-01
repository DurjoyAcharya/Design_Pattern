package TempleteMathodPatternJava.network;


//source: https://refactoring.guru/design-patterns/template-method/java/example
public abstract class Network {
    String UserName;
    String Password;

    public Network() {}
    public boolean Post(String message)
    {
        if (LogIn(this.UserName,this.Password))
        {
            boolean result=sendData(message.getBytes());
            LogOut();
            return result;
        }
        return false;
    }

    public abstract boolean LogIn(String UserName,String Password);
    public abstract boolean sendData(byte[] data);
    abstract void LogOut();
}
