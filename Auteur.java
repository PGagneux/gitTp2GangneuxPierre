import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    private Map <String, Performance> perfs;
    

    public Auteur(String nom, Integer qualiteTragedie, String citationTragedie, Integer qualiteComedie, String citationComedie, Integer qualiteDrame, String citationDrame){
        this.nom = nom;
        this.perfs = new HashMap<>();
        this.perfs.put("TRAGEDIE", new Performance(citationTragedie, qualiteTragedie ));
        this.perfs.put("DRAME", new Performance(citationDrame, qualiteTragedie));
        this.perfs.put("COMEDIE", new Performance(citationComedie, qualiteComedie));
    }

    public Integer getQualiteTragedie(){
        return this.perfs.get("TRAGEDIE").getQualite();
    }


    public String getCitationTragedie(){
        return this.perfs.get("TRAGEDIE").getCitation();
    }

    public Integer getQualiteComedie(){
        return this.perfs.get("COMEDIE").getQualite();
    }


    public String getCitationComedie(){
        return this.perfs.get("COMEDIE").getCitation();
    }

    public Integer getQualiteDrame(){
        return this.perfs.get("DRAME").getQualite();
    }


    public String getCitationDrame(){
        return this.perfs.get("DRAME").getCitation();
    }

    /* comparer les qualitées de chaque style
        garder la meilleur qulitée
        renvoier cette qualitée
    */
    public String pointFort(){
        if (perfs.get("COMEDIE").getQualite() > perfs.get("TRAGEDIE").getQualite()){
            if (perfs.get("COMEDIE").getQualite() > perfs.get("DRAME").getQualite())
                return "COMEDIE";
        
            else
                return "DRAME";
        }
        else if (perfs.get("TRAGEDIE").getQualite() > perfs.get("DRAME").getQualite())
            return "TRAGEDIE"; 
        else    
            return "DRAME";
        
    }


    public Integer qualiteStyle(Style s){
        return perfs.get(s).getQualite();
    }
    
    @Override
    public String toString(){
        String honorable = "L'honorable ";
        return honorable.concat(this.nom);
    }
    
}