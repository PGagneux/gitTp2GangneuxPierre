import java.util.Map;
import java.util.HashMap;

public class Auteur{
    private String nom;
    private Map <String, Performance> perfs;
    

    public Auteur(String nom){
        this.nom = nom;
        this.perfs = new HashMap<>();
        this.perfs.put("Tragedie", new Performance("citatoin", 100));
        this.perfs.put("Drame", new Performance("citatoin", 100));
        this.perfs.put("Comedie", new Performance("citatoin", 100));

      

    }

    public Integer getQualiteTragedie(){
        return this.perfs.get("Tragedie").getQualite();
    }

    @Override
    public String toString(){
        String honorable = "L'honorable ";
        return honorable.concat(this.nom);
    }
    
}