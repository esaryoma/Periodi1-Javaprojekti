/*
Lukee kortilta tiedot ja kertoo voidaanko lippua hankkia.
 */
package hsl_simulaatio;

public class HSL_lukija {
    private HSL_kortti kortti;
    private int kaupunki; // missä ollaan lipun ostamisen aikana
    
    HSL_lukija(){
        
    }
    
    HSL_lukija(int kaupunki){
        this.kaupunki = kaupunki;
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
        } else if (kortti.tarkistaKaupunki()==3){
            return true;
        } else {
            return false;
        }
    }
    
    public void maksu(double raha){
        kortti.maksa(raha);
    }
    
}
