package StatePattern;

public class AtmMachine implements AtmMachineState{
    private AtmMachineState AMS;

    public AtmMachine() {
        AMS=new NoDebitCardState();
    }
    public AtmMachineState getAMSInstance()
    {
        return AMS;
    }

    public void setAMS(AtmMachineState AMS) {
        this.AMS = AMS;
    }
    @Override
    public void insertDebitCard() {
        AMS.insertDebitCard();
        if (AMS instanceof NoDebitCardState)
        {
            var hasDebitCardState=new HasDebitCardState();
            setAMS(hasDebitCardState);
            System.out.println("ATM Machine Internal State has been moved to: "+AMS.getClass().getName());
        }
    }
    @Override
    public void ejectDebitCard() {
        AMS.ejectDebitCard();
        if (AMS instanceof NoDebitCardState)
        {
            var noDebitCardState=new NoDebitCardState();
            setAMS(noDebitCardState);
            System.out.println("ATM Machine Internal State has been moved to: "+AMS.getClass().getName());
        }
    }
    @Override
    public void enterPinAndWithDraw() {
        AMS.enterPinAndWithDraw();
    }
}
