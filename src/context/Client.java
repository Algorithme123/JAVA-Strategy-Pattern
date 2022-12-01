package context;
import java.util.Scanner;

import strategy.PayByCreditCard;
import strategy.PayByPaypal;
import strategy.PaymentStrategy;
import java.util.HashMap;
import java.util.Map;

public class Client {
    private static PaymentStrategy strategy;
    private static Map<Integer, Integer> prixDuProduit = new HashMap<>();
    private static  Produit produit;


    static {
        prixDuProduit.put(1, 123);
        prixDuProduit.put(2, 900);

    }

    public void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (!produit.isFermeture()){
            int prix;

            String YesOrNo;
                System.out.print("Choisir le produit:" + "\n" +
                        "1 - banane" + "\n" +
                        "4 - orange" + "\n");
            System.out.println("Methode de paiement :" + "\n" +
                    "1 - PayPay" + "\n" +
                    "2 - Credit Card");

            String paymentMethod = sc.nextLine();


            if (paymentMethod.equals("1")) {
                strategy = new PayByPaypal();
            } else {
                strategy = new PayByCreditCard();
            }



        }
    }
}
