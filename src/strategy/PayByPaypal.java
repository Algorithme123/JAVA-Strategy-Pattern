package strategy;
import java.util.HashMap;
import java.util.Map;


public class PayByPaypal implements PaymentStrategy{


    private  String email;
    private  String password;

    private static final Map<String, String> CONNEXION = new HashMap<>();

    static {
        CONNEXION.put("1234", "GOGO@gogo.com");
        CONNEXION.put("1234", "daniel@gogo.com");
    }


    @Override
    public boolean pay(int amount) {
        return false;
    }
}
