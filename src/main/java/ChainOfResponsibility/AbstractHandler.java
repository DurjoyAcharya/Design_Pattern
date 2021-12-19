package ChainOfResponsibility;

public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;
    @Override
    public void SetNextHandler(Handler handler) {
        this.nextHandler=handler;
    }
}
