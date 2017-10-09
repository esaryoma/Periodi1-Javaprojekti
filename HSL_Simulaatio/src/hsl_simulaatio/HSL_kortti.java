package hsl_simulaatio;


public class HSL_kortti {
    // Kommunikoi asiakkaan HSL_tilin ja Kortinlukijan/Latauspisteen kanssa
    
    // Muuttujat
    HSL_tili tili;
    
    
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
    
    public String getKokonimi (){
        return tili.getKokonimi();
    }
    
    public String getAlueStr(){
        switch (tili.getAlue()){
            case 0:
                return "Helsinki";
            case 1:
                return "Espoo";
            case 2:
                return "Vantaa";
            case 3:
                return "Seutu";            
        }
        return null;
    }
    
    public String getAsiakaskuntaStr(){
        switch (tili.getAsiakaskunta()){
            case 0:
                return "Lapsi";
            case 1:
                return "Aikuinen";
            case 2:
                return "Opiskelija";
            case 3:
                return "Eläkeläinen";            
        }
        return null;
    }
    
    public int getAsiakaskunta(){
        return tili.getAsiakaskunta();
        // palauttaa asiakaskunnan
    }
    
    // Setterit, jotka oikeastaan vaan kutsuvat kiini olevat tilin Settereitä
    public void setArvo(double arvo){
        tili.setArvo(arvo);
    }
    
    
    public void setAlue(int alue){
        tili.setAlue(alue);
    /* 
    0 = Helsinki, 1 = Espoo, 2 = Vantaa, 3 = Seutu
    */
    }
    
    public void setKausi(int kausi){
        tili.setKausi(kausi);
    // Kauden pituus vuorokausina
    }
    
    // Muut metodit
    // Lisätään tilille arvoa setArvo-metodin kautta
    public void lataa(double lisays){
        tili.setArvo(tili.getArvo() + lisays);
    }
    
    // kysyy tililtä aluekoodin
    public int tarkistaKaupunki(){ 
        switch (tili.getAlue()){
                case 0: 
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
        }
        return 4;
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