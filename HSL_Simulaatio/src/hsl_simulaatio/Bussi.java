package hsl_simulaatio;

import javax.swing.JOptionPane;

public class Bussi {
    
    private HSL_kortti omaMatkakortti;
    private HSL_lukija lukija = new HSL_lukija();
    private Kayttoliittyma kayttis = new Kayttoliittyma();
    int valinta; // muttuja menuvalintojen tallettamista varten
    
    public HSL_kortti nouseKyytiin(HSL_kortti omaMatkakortti){
        
        
        
        // Syötetään matkakortti lukijaan
        this.omaMatkakortti = omaMatkakortti;
        lukija.setMatkakortti(this.omaMatkakortti);
                    
        // Menussa kysytään, millä alueella käyttäjä haluaa matkustaa.
        
        valinta = kayttis.ostaLippuMenu();
        
        /* Palauttaa 0 = Helsingin sisäinen
        1 = Espoo
        2 = Vantaa
        3 = Seutu
        4 = Peruuta
                    */
        switch(valinta){
            case 0: // Helsingin sisäinen
                lukija.setKaupunki(valinta);
                
                // Näytetään käyttäjälle hinta ja kysytään onko ok
                // Palauttaa 0 = OK, 1 = Peruuta
                // Valinta tallennetaan muuttujaan valinta
                valinta = kayttis.hyvaksyHinta(omaMatkakortti, lukija);
                switch(valinta){
                    case 0: 
                        lukija.maksu(lukija.getHinta());
                        kayttis.maksunJalkeen(lukija.getHinta());
                        break;
                        
                    case 1:
                        break;
                    
                }
                break;
                        
            case 1: // Espoon sisäinen 
                lukija.setKaupunki(valinta);
                // Näytetään käyttäjälle hinta ja kysytään onko ok
                // Palauttaa 0 = OK, 1 = Peruuta
                // Valinta tallennetaan muuttujaan valinta
                valinta = kayttis.hyvaksyHinta(omaMatkakortti, lukija);
                switch(valinta){
                    case 0: 
                        lukija.maksu(lukija.getHinta());
                        kayttis.maksunJalkeen(lukija.getHinta());
                        break;
                        
                    case 1:
                        break;
                    
                }
                break;
                        
            case 2: // Vantaan sisäinen
                lukija.setKaupunki(valinta);
                // Näytetään käyttäjälle hinta ja kysytään onko ok
                // Palauttaa 0 = OK, 1 = Peruuta
                // Valinta tallennetaan muuttujaan valinta
                valinta = kayttis.hyvaksyHinta(omaMatkakortti, lukija);
                switch(valinta){
                    case 0: 
                        lukija.maksu(lukija.getHinta());
                        kayttis.maksunJalkeen(lukija.getHinta());
                        break;
                        
                    case 1:
                        break;
                    
                }
                break;
            case 3: // Seutu
                lukija.setKaupunki(valinta);
                // Näytetään käyttäjälle hinta ja kysytään onko ok
                // Palauttaa 0 = OK, 1 = Peruuta
                // Valinta tallennetaan muuttujaan valinta
                valinta = kayttis.hyvaksyHinta(omaMatkakortti, lukija);
                switch(valinta){
                    case 0: 
                        lukija.maksu(lukija.getHinta());
                        kayttis.maksunJalkeen(lukija.getHinta());
                        break;
                        
                    case 1:
                        break;
                    
                }
                break;       
            case 4: // Peruuta
                break;
                                   
        }
        
        return omaMatkakortti;
    }
}
