public class adresse {
    private String pays;

    public adresse(String pays) {
        this.pays = pays;
    }
    public boolean estEnFrance() {
        return this.pays.equalsIgnoreCase("France");
    }
}


