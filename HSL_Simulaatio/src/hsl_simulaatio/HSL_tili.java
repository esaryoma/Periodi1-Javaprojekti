/*
Tänne laitetaan tietoja, kuten:
- Arvo kortilla
- Kauden vyöhyke
- Kauden kesto
 */
package hsl_simulaatio;


public class HSL_tili {
    private double arvo;
    private int alueKoodi; // vastaa kaupunkeja ja vyöhykkeitä
    private int kausi;
    private int asiakaskunta; // esim 0 = lapsi, 1 = opiskelija jne..
    private Henkilo henkilo;
    private int matkakortti_hommattu = 0; // 0 = ei, 1 = kyllä
    
    HSL_tili(){
        
    }
    
    HSL_tili(double arvo, int alue, int kausi, int asiakas, Henkilo henkilo){
        this.arvo = arvo;
        this.alueKoodi = alue;
        this.kausi = kausi;
        this.asiakaskunta = asiakas;
        this.henkilo = henkilo;
    }
    
    // Setataan aktiivinen henkilö 
    public void setHenkilo(Henkilo henkilo){
        this.henkilo = henkilo;
    }
    
    public void setArvo(double arvo){
        this.arvo = arvo;
        // arvo doublena, esim 4,25 tai 0,50 (euroina)
    }
    
    public void setAlue(int alueKoodi){
        // myöhemmin katsotaan täsmääkö aluekoodi alueiden kanssa
        this.alueKoodi = alueKoodi;
        // aluekoodi kertoo vyöhykkeen, esim helsinki = 1, espoo = 2 jne..
    }
    
    public void setKausi(int kausi){
        this.kausi = kausi;
        // setteri, joka kertoo kuinka monta päivää (int) kautta 
    }
    
    public void setMatkakorttiHommattu(){
        matkakortti_hommattu = 1;
    }
    
    public int getMatkakorttiHommattu(){
        return matkakortti_hommattu;
        // 0 = ei ole hommattu
        // 1 = on hommattu
    }
    
    public String getKokonimi(){
        return henkilo.toString();
    }
    
    public void setAsiakaskunta(int asiakas){
        this.asiakaskunta = asiakas;
        // asettaa asiakaskuntaa vastaavan kokonaisluvun
    }
    
    public double getArvo(){
        return this.arvo;
        // palauttaa arvon
    }
    
    public int getAlue(){
        return this.alueKoodi;
        // palauttaa aluekoodin
    }
    
    public int getKausi(){
        return this.kausi;
        // palauttaa kauden keston päivinä
    }
    
    public int getAsiakaskunta(){
        return this.asiakaskunta;
        // palauttaa asiakaskunnan
    }
    
    public void vahenna(double raha){
        this.arvo -= raha;
    }
    
}
