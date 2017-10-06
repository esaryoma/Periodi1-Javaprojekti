package matkakortti;

public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private String hetu;
    private int asiakasluokka;
    
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
        return sukunimi;
    }
    public String getHetu() {
        return hetu;
    }
    public int getAsiakasluokka() {
        return asiakasluokka;
    }
}