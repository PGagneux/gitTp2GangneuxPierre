import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    private Map <String, Performance> perfs;
    

    public Auteur(String nom, Integer qualiteTragedie, String citationTragedie, Integer qualiteComedie, String citationComedie, Integer qualiteDrame, String citationDrame){
        this.nom = nom;
        this.perfs = new HashMap<>();
        this.perfs.put("Tragedie", new Performance(citationTragedie, qualiteTragedie ));
        this.perfs.put("Drame", new Performance(citationDrame, qualiteTragedie));
        this.perfs.put("Comedie", new Performance(citationComedie, qualiteComedie));
    }

    public Integer getQualiteTragedie(){
        return this.perfs.get("Tragedie").getQualite();
    }


    public String getCitationTragedie(){
        return this.perfs.get("Tragedie").getCitation();
    }


    @Override
    public String toString(){
        String honorable = "L'honorable ";
        return honorable.concat(this.nom);
    }
    
}