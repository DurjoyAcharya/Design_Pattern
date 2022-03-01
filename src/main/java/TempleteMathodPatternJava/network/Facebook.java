package TempleteMathodPatternJava.network;

public class Facebook extends Network {
    public Facebook(String UserName,String Password) {
        this.UserName=UserName;
        this.Password=Password;
    }
    @Override
    public boolean Post(String message) {
        return super.Post(message);
    }
    @Override
    public boolean LogIn(String UserName, String Password) {
        System.out.println("\n Checking Users Parameter Type ");
        System.out.println("Name: "+UserName);
        System.out.print("Password: ");
        for (int i = 0; i < Password.length(); i++)
            System.out.print('*');
        SimulateNetWorkLatency();
        System.out.println("\n\n LogIn Successfully In Facebook");
        return true;
    }
    private void SimulateNetWorkLatency() {
        int i=0;
        try{
            System.out.println();
            while (i<10)
            {
                System.out.print('.');
                Thread.sleep(1000);
                i++;
            }
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted=true;
        if (messagePosted)
        {
            System.out.println("Message "+new String(data)+" was post on facebook");
            return true;
        }
        return false;
    }
    @Override
    void LogOut() {
        System.out.println("User: "+UserName+" was logOut from facebook");
    }
}
