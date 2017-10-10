package hsl_simulaatio;

public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private String hetu;
    private int asiakasluokka;
    
    public Henkilo(){
        
    }
    
    public Henkilo(String etunimi, String sukunimi, String hetu){
        
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.hetu = hetu;
    }
    
    public Henkilo(String etunimi, String sukunimi, String hetu, int asiakasluokka){
        
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.hetu = hetu;
        this.asiakasluokka = asiakasluokka;
    }
    
    public String getEtunimi() {
        return etunimi;
    }
    public String getSukunimi() {
        return this.sukunimi;
    }
    public String getHetu() {
        return this.hetu;
    }
    public int getAsiakasluokka() {
        return this.asiakasluokka;
    }
    
    @Override
    public String toString(){
       return this.etunimi+" "+this.sukunimi;
    }
}
