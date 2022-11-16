package DependencyInjection;

public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Durjoy";
        String email = "da-durjoy@outlook.com";
        String phone = "01876068550";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }

}
