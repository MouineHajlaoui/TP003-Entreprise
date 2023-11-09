public class TestGestionMagasin {
    public static void main(String[] args) {
        magasin magasin1 = new magasin(1, "mg1", 50);
        magasin magasin2 = new magasin(2, "mg2", 20);

        Produit_01 produit1 = new Produit_01("P1", 12.0);
        Produit_01 produit2 = new Produit_01("P2", 15.0);

        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);

        magasin1.afficherCaracteristiques();
        magasin2.afficherCaracteristiques();
    }
}