public class Performance{
    private String citation;
    private Integer qualite;
    

    public Performance(String citation, Integer qualite){
        this.citation = citation;
        this.qualite = qualite;
    }

    public String getCitation(){
        return this.citation;
    }

    public Integer getQualite(){
        return this.qualite;
    }
}