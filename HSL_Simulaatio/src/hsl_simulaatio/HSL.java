
package hsl_simulaatio;

import javax.swing.JOptionPane;
import java.util.ArrayList;


public class HSL {

    
    public static void main(String[] args) {
        
        /* Main-ohjelmassa luodaan käyttöliittymä olio, jota käytetään 
        tekstiboksien pyörittämiseen ja valintojen tallentamiseen käyttäjältä.
        Lisäksi luodaan kontrolleri-olio, jonka kautta tapahtuu itse summien pyöritys.
        */

        Kayttoliittyma kayttis = new Kayttoliittyma();
        HSL_kontrolleri kontrolleri = new HSL_kontrolleri();
        int paa_menun_valinta; // tähän tallennetaan päämenun valinta 0/1
        HSL_tili omaTili;
        
        // Pääohjelman käyttämä henkilö-ArrayList kaikista ohjelmaan tallennetuista henkilöistä
        ArrayList<Henkilo> kayttajat = new ArrayList();
        
        // Ensin luodaan ensimmäinen henkilö
        Henkilo henkilo;
        henkilo = kayttis.luoHenkiloMenu();
        
        // Liitetään ensimmäinen luotu henkilö ArrayListiin
        kayttajat.add(henkilo); 
        
        // Käytetään setterit tarpeellisiin classeihin, jotta liitetään henkilö näihin
        kayttis.setHenkilo(henkilo);
        omaTili = new HSL_tili();
        
        
        
        // Kutsutaan päämenu.
        // Päämenu antaa tulokseksi:
        // 0 = Latauspiste
        // 1 = Lipun osto
        // 2 = Luo uusi kortti
        // 3 = Luo uusi henkilö
        // 4 = Lopeta ohjelman käyttö
        
        do{
        paa_menun_valinta = kayttis.paaMenu();
        
            switch (paa_menun_valinta){
                case 0: kayttis.latauspisteMenu();
                    // Palauttaa arvon 0, jos valittu Lataa kortille arvoa
                    // Palauttaa arvon 1, jos valittu Lataa kortile kautta
                     // Palauttaa arvon 2, jos valittu Peruuta
                
                     
                        
                        
                    break;
                case 1: kayttis.ostaLippuMenu();
                
                        
                    break;
                case 2: kayttis.luoUusiKorttiMenu();
                
                    break;
                case 3: kayttis.luoHenkiloMenu();
                
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "Ohjelma lopetetaan.");
                    break;
                    
                default: JOptionPane.showMessageDialog(null, "Vituiks män");
                    break;
            }
        } while (paa_menun_valinta != 4);
        
        
        
        
        
        
    }
    
}
