package ChainOfResponsibility;

public class MainWithChainOfResponsibility {
    private static final String VechileType="FireTruck";//Simple leakings here this showing nullpointer exception
    public static void main(String...args) {
        var demo=new MainWithChainOfResponsibility();
        var vechileHandler=demo.ValidateHandlers();
        vechileHandler.handle(VechileType);
    }
    public Handler ValidateHandlers()
    {
        var police=new PoliceVechileHandler();
        var school=new SchoolBusHandler();
        var fire=new FireServiceHandler();
        var ambulance=new AmbulanceHandler();
        police.SetNextHandler(school);
        school.SetNextHandler(fire);
        fire.SetNextHandler(ambulance);
        return police;
    }
}
