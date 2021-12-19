package ChainOfResponsibility;

public class SchoolBusHandler extends AbstractHandler{
    @Override
    public void handle(String IncomingRequest) {
        if ("SchoolBus".equals(IncomingRequest))
        {
            System.out.println("Validate id for: "+IncomingRequest);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor interrogation");
            return;
        }
        this.nextHandler.handle(IncomingRequest);
    }
}
