public class colis {
    private int poidsEnG;
    private String nomDestinataire;
    private PointDL pointDL;
    private adresse adresseClient;

    public colis(int poidsEnG, String nomDestinataire, PointDL pointDL, adresse adresseClient) {
        this.poidsEnG = poidsEnG;
        this.nomDestinataire = nomDestinataire;
        this.pointDL = pointDL;
        this.adresseClient = adresseClient;
    }


    public double calculPrix() {
        double prix = 0;

        if (this.poidsEnG <= 500) {
            prix = 1.99;
        } else if (this.poidsEnG <= 2000) {
            prix = 3.99;
        } else if (this.poidsEnG <= 5000) {
            prix = 5.99;
        } else {
            prix = 8.99;
        }

        if (!this.adresseClient.estEnFrance()) {
            prix = prix + 6.00;
        }

        System.out.println(prix);
        return prix;
    }


}