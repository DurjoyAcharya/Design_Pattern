package ChainOfResponsibility;

public class PoliceVechileHandler extends AbstractHandler{
    @Override
    public void handle(String IncomingRequest) {
        if ("PoliceVechile".equals(IncomingRequest))
        {
            System.out.println("Validate id for: "+IncomingRequest);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor interrogation");
            return;
        }
        this.nextHandler.handle(IncomingRequest);
    }
}
