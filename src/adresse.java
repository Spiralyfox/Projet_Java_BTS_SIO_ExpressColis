public class adresse {
    private String adresseRue;
    private String codePostal;
    private String ville;
    private String pays;

    public adresse(String adresseRue, String codePostal, String ville, String pays) {
        this.adresseRue = adresseRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public boolean estEnFrance() {
        System.out.println(this.pays.equalsIgnoreCase("France"));
        return this.pays.equalsIgnoreCase("France");
    }
}