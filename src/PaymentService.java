import strategy.CreditCard;

public class PaymentService {

    private  int cost;
    private  boolean includeDelivery;
    public  void processOrder (String paymentMethod){
        if("strategy.CreditCard".equals(paymentMethod)) {
            CreditCard card = new CreditCard("cardNumber", "expiryDate");
            System.out.println("Paying " + getTotal() + "Using credit card ");
            card.setAmount(card.getAmount() - getTotal());
        } else if ("Paypal".equals(paymentMethod)) {

            String email = "";
            String password = "";
            System.out.println("Paying " + getTotal() + "using Paypal ");

        }

    }
    public  int getTotal() {
        return includeDelivery ? cost+10: cost;
    }
}
