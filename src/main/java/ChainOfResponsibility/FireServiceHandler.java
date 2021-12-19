package ChainOfResponsibility;

public class FireServiceHandler extends AbstractHandler{
    @Override
    public void handle(String IncomingRequest) {
        if ("FireTruck".equals(IncomingRequest))
        {
            System.out.println("Validate id for: "+IncomingRequest);
            System.out.println("Do exhaustive search");
            System.out.println("Do Minor interrogation");
            System.out.println("Check Water Or Not....");
            return;
        }
        this.nextHandler.handle(IncomingRequest);
    }
}
