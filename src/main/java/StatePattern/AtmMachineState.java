package StatePattern;

public interface AtmMachineState {
     void insertDebitCard();
     void ejectDebitCard();
     void enterPinAndWithDraw();
}
