package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PayByPaypal implements PaymentStrategy{


    private  String email;
    private  String password;
    private  boolean authentication;
    Scanner sc = new Scanner(System.in);
    private static final Map<String, String> CONNEXION = new HashMap<>();

    static {
        CONNEXION.put("1234", "GOGO@gogo.com");
        CONNEXION.put("1234", "daniel@gogo.com");
    }

    public void setAuthentication(boolean authentication) {
        this.authentication = authentication;
    }

    @Override
    public boolean pay(int amount) {
        return false;
    }

    private boolean verification(){
        setAuthentication(email.equals(CONNEXION.get(password)));
        return authentication;
    }
    @Override
    public void collectPaymentInformation() {
        try {
            while (!authentication) {
                System.out.println("Entrer votre Mail : ");
                email =sc.nextLine();
                System.out.println("Entrer votre password : ");
                password =sc.nextLine();

            }
            if (verification()){
                System.out.println("Authentication Reussi");

            }else {
                System.out.println("Authentication Echoue ");

            }
        } finally {

            
        }

    }
}
