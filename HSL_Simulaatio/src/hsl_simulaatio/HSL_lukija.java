/*
Lukee kortilta tiedot ja kertoo voidaanko lippua hankkia.
 */
package hsl_simulaatio;

public class HSL_lukija {
    private HSL_kortti kortti;
    private int kaupunki; // missä ollaan lipun ostamisen aikana
    private double hinta;
    
    final private double lapsi_sis = 1.50;
    final private double aikuinen_sis = 2.50;
    final private double opiskelija_sis = 2.00;
    final private double elakelainen_sis = 2.00;
    
    final private double lapsi_seut = 2.50;
    final private double aikuinen_seut = 3.50;
    final private double opiskelija_seut = 3.00;
    final private double elakelainen_seut = 3.00;
    
    HSL_lukija(){
        
    }
    
    HSL_lukija(int kaupunki){
        this.kaupunki = kaupunki;
    }
    
    public void setMatkakortti(HSL_kortti matkakortti){
        this.kortti = matkakortti;
    }    

// setteri kaupungille
    public void setKaupunki(int kaupunki){
        this.kaupunki = kaupunki;
    }
    
    // getteri kaupungille
    public int getKaupunki(){
        return this.kaupunki;
    }
    
    // kysyy kortilta tilin aluetta ja vertaa sitä lukijan kaupunkiin
    public boolean tarkistaKaupunki(){
        if (this.kaupunki == kortti.tarkistaKaupunki()){
            return true;
        } else if (kortti.tarkistaKaupunki() == 3){
            return true;
        } else {
            return false;
        }
    }
    
    // palauttaa lipun hinnan
    public double getHinta(){
        if (this.kaupunki < 3){
            switch (kortti.getAsiakaskunta()){
                case 0: 
                    return lapsi_sis;  
                case 1:
                    return aikuinen_sis;
                case 2:
                    return opiskelija_sis;
                case 3:
                    return elakelainen_sis;
            }
            
        } else {
            switch (kortti.getAsiakaskunta()){
                case 0: 
                    return lapsi_seut;  
                case 1:
                    return aikuinen_seut;
                case 2:
                    return opiskelija_seut;
                case 3:
                    return elakelainen_seut;
            }
        }
        // palautetaan 0 jos metodi ei toimi oikein, virheviesti
        return 0;    
    }
    
    public void maksu(double raha){
        kortti.maksa(raha);
    }
}
