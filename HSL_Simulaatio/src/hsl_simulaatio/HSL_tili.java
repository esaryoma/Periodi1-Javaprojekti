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
    
    HSL_tili(){
        
    }
    
    HSL_tili(double arvo, int alue){
        this.arvo = arvo;
        this.alueKoodi = alue;
    }
    
    public void setArvo(double arvo){
        this.arvo = arvo;
    }
    
    public void setAlue(int alueKoodi){
        // myöhemmin katsotaan täsmääkö aluekoodi alueiden kanssa
        this.alueKoodi = alueKoodi;
    }
    
}
