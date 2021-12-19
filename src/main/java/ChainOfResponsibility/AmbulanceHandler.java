package ChainOfResponsibility;

public class AmbulanceHandler extends AbstractHandler{
    @Override
    public void handle(String IncomingRequest) {
        if ("Ambulance".equals(IncomingRequest))
        {
            System.out.println("Validate for id: "+IncomingRequest);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor interrogation");
            System.out.println("Check Patient.....");
            return;
        }
        this.nextHandler.handle(IncomingRequest);
    }
}
