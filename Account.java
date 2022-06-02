package OOP;
 abstract class Account implements BaseInterestRate{
    protected String fullName;
    protected String ssn;
    protected double balance;
    protected String accountNumber;
    protected String routingNumber;
    protected double InterestRate;

    public Account(String fullName, String ssn, double balance) {
        this.fullName = fullName;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.routingNumber = generateRoutingNumber();
        getBaseInterestRate();
    }

    public String generateAccountNumber() {
        StringBuilder addSeven= new StringBuilder();
        for (int i = 0; i<7; i++)
            addSeven.append((int) (Math.random() * 10));

        return ssn.substring(6)+addSeven;
    }
    public String generateRoutingNumber() {
        StringBuilder addSeven= new StringBuilder();
        for (int i = 0; i<7; i++)
            addSeven.append((int) (Math.random() * 10));
        return "00" + addSeven;
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Current amount of your account is: $" + this.balance);
    }

    public void withdraw(double withdrawAmount) {

        if (withdrawAmount > balance) {
            System.out.println("You have $" + balance + " in your account...");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Current amount of your account is: $" + this.balance);
        }
    }


    public String showInfo() {
        return  "NAME: " + fullName + '\n' +
                "SSN: " + ssn + '\n' +
                "ACCOUNT NUMBER: " + accountNumber + '\n' +
                "ROUTING NUMBER: " + routingNumber + '\n' +
                "BALANCE: " + balance;
    }

    @Override
    public void getBaseInterestRate() {
        this.InterestRate = BASE_INTEREST_RATE;

    }

}