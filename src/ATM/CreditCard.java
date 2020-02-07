package ATM;

public class CreditCard {
    private int pin;
    private int creditCardNumber;

    public CreditCard(int pin, int creditCardNumber) {
        this.pin = pin;
        this.creditCardNumber = creditCardNumber;
    }

    public int getPin() {
        return pin;
    }
}
