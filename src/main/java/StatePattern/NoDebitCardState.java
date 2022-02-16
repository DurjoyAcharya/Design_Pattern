package StatePattern;

public class NoDebitCardState implements AtmMachineState {

    @Override
    public void insertDebitCard() {
        System.out.println("Debit card inserted......");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("No debit card inserted slot in the ATM. so you can not eject debit card");
    }

    @Override
    public void enterPinAndWithDraw() {
        System.out.println("Operation failed No debit inserted in ATM machine slot");
    }
}
