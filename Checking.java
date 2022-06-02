package OOP;
public class Checking extends Account{
    long debitCardNo;
    int debitCardPin;


    public Checking(String fullName, String ssn, double balance) {
        super(fullName, ssn, balance);
        accountNumber = 1+generateAccountNumber();
        this.debitCardNo = generateDebitCardNo();
        this.debitCardPin = generateDebitCardPin();
        interestRate = setInterestRate();
    }


    public long generateDebitCardNo() {
        long cardNo = 9;
        for (int i = 0; i<15; i++){
            cardNo = (cardNo *10)+ (int)(Math.random()*10);
        }
        return cardNo;
    }

    public int generateDebitCardPin() {
        String cardPin = " ";
        for (int i = 0; i<4; i++){
            cardPin = cardPin + (int)(Math.random()*10);
        }
        return Integer.parseInt(cardPin);
    }

    @Override
    public String showInfo() {
        return  "NAME: " + fullName + '\n' +
                "SSN: " + ssn + '\n' +
                "ACCOUNT NUMBER: " + accountNumber + '\n' +
                "ROUTING NUMBER" + routingNumber + '\n' +
                "BALANCE: " + balance + '\n' +
                "ACCOUNT TYPE: " + getClass() + '\n' +
                "DEBIT CARD NUMBER: " + debitCardNo + '\n' +
                "DEBIT CARD PIN: " + debitCardPin + '\n' +
                "INTEREST RATE: " ;
    }

    @Override
    public double setInterestRate() {

        return interestRate * 0.15 ;
    }
}