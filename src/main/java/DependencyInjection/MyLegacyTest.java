package DependencyInjection;

public class MyLegacyTest {

    public static void main(String[] args) {
        var app = new MyApplication(new EmailService());
        app.processMessages("Hi Durjoy", "da-durjoy@outlook.com");
    }
}
