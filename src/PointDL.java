import java.util.ArrayList;
import java.util.List;

public class PointDL {
    private String nom;
    private adresse adresse;
    private List<colis> listeColis = new ArrayList<colis>();

    public PointDL(String nom, adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;

        }


    public void associerColis(colis c) {
        listeColis.add(c);

    }

    public double calculRentabilite(PointDL p){
        double benef = 0;


        return benef;

    }
}