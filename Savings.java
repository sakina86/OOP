package OOP;
public class Savings extends Account{
    int safetyDepositBoxID;
    int safetyDepositBoxPin;

    public Savings(String fullName, String ssn, double balance) {
        super(fullName, ssn, balance);
        accountNumber = 2+generateAccountNumber();
        this.safetyDepositBoxID = generateSafetyDepositBoxID();
        this.safetyDepositBoxPin = generateSafetyDepositBoxPin();
        interestRate = setInterestRate();
    }

    private int generateSafetyDepositBoxID() {
        return this.safetyDepositBoxID = (int) (Math.random()*1000);
    }

    private int generateSafetyDepositBoxPin() {
        String cardPin = " ";
        for (int i = 0; i<4; i++){
            cardPin = cardPin + (int)(Math.random()*10);
        }
        return Integer.parseInt(cardPin);
    }

    @Override
    public double setInterestRate() {
        return interestRate ;
    }

    @Override
    public String showInfo() {
        return  "NAME: " + fullName + '\n' +
                "SSN: " + ssn + '\n' +
                "ACCOUNT NUMBER: " + accountNumber + '\n' +
                "ROUTING NUMBER" + routingNumber + '\n' +
                "BALANCE: " + balance + '\n' +
                "ACCOUNT TYPE: " + getClass() + '\n' +
                "SAFETY DEPOSIT BOX ID: " + safetyDepositBoxID + '\n' +
                "SAFETY DEPOSIT BOX PIN: " + safetyDepositBoxPin + '\n' +
                "INTEREST RATE: " ;
    }
}