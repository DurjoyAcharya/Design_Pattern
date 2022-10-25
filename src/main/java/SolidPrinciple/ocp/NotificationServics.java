package SolidPrinciple.ocp;

public interface NotificationServics {
    void sentOTP(String medium);
    void sendTransactionReport(String medium);
}
