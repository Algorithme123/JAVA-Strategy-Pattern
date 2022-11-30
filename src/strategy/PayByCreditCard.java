package strategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayByCreditCard implements PaymentStrategy{
    Scanner sc = new Scanner(System.in);
    private  boolean cartePresent;
    private  String cardNumber;
    private  String expiratedDate;
    private  int paymentAmount=440;
    private CreditCard creditCard;
    public boolean isCartePresent() {

        return cartePresent;
    }

    public void setCartePresent(boolean cartePresent) {
        this.cartePresent = cartePresent;
    }

    private static final Map<String, String> CONNEXION = new HashMap<>();

    static {
        CONNEXION.put("0001", "12-12-22");
        CONNEXION.put("0002", "12-12-23");
    }
    @Override
    public boolean pay(int amount) {

        if (isCartePresent()){
            System.out.println("Paying Using credit card ");
//            System.out.println("Paying " + getTotal() + "Using credit card ");
            creditCard.setAmount(creditCard.getAmount() - paymentAmount);
        }


        return false;
    }

    private boolean verification(){
        setCartePresent(cardNumber.equals(CONNEXION.get(expiratedDate)));
        return cartePresent;
    }
    @Override
    public void collectPaymentInformation() {
        try {

            System.out.println("Entrer le numero de card : ");
             cardNumber = sc.nextLine();
            System.out.println("Entrer la date d'expiration : ");
             expiratedDate = sc.nextLine();

            if (verification()){
                System.out.println("Carte Present");

            }else {
                System.out.println("carte Non present  ");

            }

        }catch (Exception e) {}


    }
}
