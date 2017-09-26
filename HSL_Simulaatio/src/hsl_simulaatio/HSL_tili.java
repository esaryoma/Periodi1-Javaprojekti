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
    
    HSL_tili(){
        
    }
    
    HSL_tili(double arvo, int alue, int kausi){
        this.arvo = arvo;
        this.alueKoodi = alue;
        this.kausi = kausi;
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
    
}
