package strategy;

public class PayByCreditCard implements PaymentStrategy{


    @Override
    public boolean pay(int amount) {
        return false;
    }

    @Override
    public void collectPaymentInformation() {

    }
}
