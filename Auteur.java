import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    private Map <Style, Performance> perfs;
    

    public Auteur(String nom, Integer qualiteTragedie, String citationTragedie, Integer qualiteComedie, String citationComedie, Integer qualiteDrame, String citationDrame){
        this.nom = nom;
        this.perfs = new HashMap<>();
        this.perfs.put(Style.TRAGÉDIE, new Performance(citationTragedie, qualiteTragedie ));
        this.perfs.put(Style.DRAME, new Performance(citationDrame, qualiteTragedie));
        this.perfs.put(Style.COMÉDIE, new Performance(citationComedie, qualiteComedie));
    }

    public Integer getQualiteTragedie(){
        return this.perfs.get(Style.TRAGÉDIE).getQualite();
    }


    public String getCitationTragedie(){
        return this.perfs.get(Style.TRAGÉDIE).getCitation();
    }

    public Integer getQualiteComedie(){
        return this.perfs.get(Style.COMÉDIE).getQualite();
    }


    public String getCitationComedie(){
        return this.perfs.get(Style.COMÉDIE).getCitation();
    }

    public Integer getQualiteDrame(){
        return this.perfs.get(Style.DRAME).getQualite();
    }


    public String getCitationDrame(){
        return this.perfs.get(Style.DRAME).getCitation();
    }

    /* comparer les qualitées de chaque style
        garder la meilleur qulitée
        renvoier cette qualitée
    */
    public Style pointFort(){
        if (perfs.get(Style.COMÉDIE).getQualite() > perfs.get(Style.TRAGÉDIE).getQualite()){
            if (perfs.get(Style.COMÉDIE).getQualite() > perfs.get(Style.DRAME).getQualite())
                return Style.COMÉDIE;
        
            else
                return Style.DRAME;
        }
        else if (perfs.get(Style.TRAGÉDIE).getQualite() > perfs.get(Style.DRAME).getQualite())
            return Style.TRAGÉDIE; 
        else    
            return Style.DRAME;
        
    }
    
    @Override
    public String toString(){
        String honorable = "L'honorable ";
        return honorable.concat(this.nom);
    }
    
}