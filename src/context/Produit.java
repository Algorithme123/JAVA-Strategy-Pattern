package context;

import strategy.PaymentStrategy;

public class Produit {
    private  int prixTotal = 0;
    private  boolean fermeture = false;


    public  void payer(PaymentStrategy strategy){
        strategy.collectPaymentInformation();
    }



    public int getPrixTota() {
        return prixTotal;
    }

    public void setPrixTota(int prixTotal) {
        this.prixTotal += prixTotal;
    }

    public boolean isFermeture() {
        return fermeture;
    }

    public void setFermeture(boolean fermeture) {
        this.fermeture = fermeture;
    }
}
