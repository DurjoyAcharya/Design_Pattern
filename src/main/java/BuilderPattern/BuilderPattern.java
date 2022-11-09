package BuilderPattern;

//Builder Pattern

/**
 * Name: Durjoy Acharjya
 * Email:da-durjoy@outlook.com
 */

class BankAccount {
    private final String name;
    private final String accountNumber;
    private final String email;
    private final boolean newsletter;

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    private BankAccount(String name, String accountNumber, String email, boolean newsletter) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.newsletter = newsletter;
    }

    public static class BankAccountBuilder {
        private final String name;
        private final String accountNumber;
        private String email;
        private boolean newsletter;
        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }
        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }
        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }
        public BankAccount build() {
            return new BankAccount(name,accountNumber,email,newsletter);
        }
    }
}
public class BuilderPattern {
    public static void main(String[] args) {
        var bankAccount=new BankAccount
                .BankAccountBuilder("Durjoy Acharjya","1925102002")
                .withEmail("da-durjoy@outlook.com")
                .wantNewsletter(true)
                .build();
        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.isNewsletter());
        //-------------------------------------------------
        var BracBank=new BankAccount
                .BankAccountBuilder("Badhon Biswas","1925102059")
                .wantNewsletter(true)
                .withEmail("biswasbadhonxyz@gmail.com")
                .build();
        System.out.println(BracBank.getName());
        System.out.println(BracBank.getEmail());
    }
}
