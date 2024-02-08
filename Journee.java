public class Journee{
    private Style matin;
    private Style apreMidi;
    private Style soir;

    public Journee(Style epreuveM, Style epreuveAM, Style epreuveS){
        this.matin = epreuveM;
        this.apreMidi = epreuveAM;
        this.soir = epreuveS;
    }

    public int scoreEpreuve(Auteur auteur, Style epreuve, int nbSpec){
        int score;
        if (epreuve == Style.COMÉDIE)
            score = auteur.getQualiteComedie() * nbSpec;
        else if (epreuve == Style.TRAGÉDIE)
            score = auteur.getQualiteTragedie() * nbSpec;
        else
            score = auteur.getQualiteDrame() * nbSpec;
        
        return score;
    }

    public int scoreTotal(Auteur auteur, int nbSpecM, int nbSpecAM, int nbSpecS ) {
        int somme = 0;
        somme += this.scoreEpreuve(auteur, this.matin, nbSpecM);
        somme += this.scoreEpreuve(auteur, this.apreMidi, nbSpecAM);
        somme += this.scoreEpreuve(auteur, this.soir, nbSpecS);
        return somme;
    }
}