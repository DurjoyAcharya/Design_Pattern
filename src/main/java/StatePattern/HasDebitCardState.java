package StatePattern;

public class HasDebitCardState implements AtmMachineState {
    @Override
    public void insertDebitCard() {
        System.out.println("One Debit card already there so you can't insert now......");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("Debit card has ejected.......");
    }

    @Override
    public void enterPinAndWithDraw() {
        System.out.println("Pin number has entered correctly money has withdrawn....");
    }
}
