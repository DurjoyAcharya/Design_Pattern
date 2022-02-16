package StatePattern;

public class Client {
    public static void main(String[] args) {
        var AM=new AtmMachine();
        System.out.println("ATM Machine Current State "+ AM.getAMSInstance().getClass().getName());
        System.out.println("----------------------------------------------------------");
        System.out.println();
        AM.enterPinAndWithDraw();
        AM.ejectDebitCard();
        AM.insertDebitCard();
        System.out.println("ATM Machine Current State "+ AM.getAMSInstance().getClass().getName());
        System.out.println();
        AM.enterPinAndWithDraw();
        AM.ejectDebitCard();

    }
}
