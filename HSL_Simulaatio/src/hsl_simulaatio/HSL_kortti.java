
package hsl_simulaatio;


public class HSL_kortti {
    // Kommunikoi asiakkaan HSL_tilin ja Kortinlukijan/Latauspisteen kanssa
    
    // Muuttujat
    HSL_tili tili = new HSL_tili();
    
    
    // Parametriton konstruktori
    // Tarvitseeko tämä jotain muuta?
    HSL_kortti(){
    }
    
    // Parametrillinen konstruktori, joka luo kortin ja iskee sen suoraan kiinni tili-olioon
    HSL_kortti(HSL_tili tili){
        this.tili = tili;
    }
    
    // Setteri
    public void setTili(HSL_tili tili){
        this.tili = tili;
    
    }
    
    // Getterit, jotka oikeastaan vaan kutsuvat kiinni olevan tilin Gettereitä
    public double getArvo(){
        return tili.getArvo();
        // palauttaa tilin arvon
    }
    
    public int getAlue(){
        return tili.getAlue();
        // palauttaa aluekoodin
    }
   
    public int getKausi(){
        return tili.getKausi();
        // palauttaa kauden keston päivinä
    }
    
    public int getAsiakaskunta(){
        return tili.getAsiakaskunta();
        // palauttaa asiakaskunnan
    }
    
    // Muut metodit
    // Lisätään tilille arvoa setArvo-metodin kautta
    public void lataa(double lisays){
        tili.setArvo(tili.getArvo() + lisays);
    }
    
    // Ostoksen yhteydessä tarkistetaan onko tilillä tarpeeksi arvoa
    public boolean maksa(double vahennys){
        if(tili.getArvo() < vahennys){ // jos tilillä ei tarpeksi arvoa, vähennystä ei tapahdu
            return false;                
        }
        else{
            tili.setArvo(tili.getArvo() - vahennys); // jos arvoa löytyy, vähennys tehdään
            return true;
        }    
        }
    }
    

