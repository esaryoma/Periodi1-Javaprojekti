/*
Tänne laitetaan tietoja, kuten:
- Arvo kortilla
- Kauden vyöhyke
- Kauden kesto
 */
package hsl_simulaatio;


public class HSL_tili {
    private double arvo;
    private int alueKoodi;
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
    }
    
    public void setAlue(int alueKoodi){
        // myöhemmin katsotaan täsmääkö aluekoodi alueiden kanssa
        this.alueKoodi = alueKoodi;
    }
    
    public void setKausi(int kausi){
        this.kausi = kausi;
    }
    
    public double getArvo(){
        return this.arvo;
    }
    
    public int getAlue(){
        return this.alueKoodi;
    }
    
    public int getKausi(){
        return this.kausi;
    }
    
}
