import java.util.ArrayList;
import java.util.List;

class Produit_01 {
    private String nom;
    private double prix;

    public Produit_01(String nom, double prix) {
        this.nom = nom;
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif.");
        }
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }
}