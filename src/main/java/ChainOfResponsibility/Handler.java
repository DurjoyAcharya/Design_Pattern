package ChainOfResponsibility;

public interface Handler {
    void SetNextHandler(Handler handler);
    void handle(String IncomingRequest);
}
