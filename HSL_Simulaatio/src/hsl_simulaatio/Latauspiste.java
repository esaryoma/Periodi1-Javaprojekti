
package hsl_simulaatio;

import javax.swing.JOptionPane;

/*
Tämä classi pyörittää Latauspisteen funktioita
Kun käyttäjä valitsee Latauspisteen päämenussa, pääohjelma kutsuu 
*/
public class Latauspiste {
    Kayttoliittyma kayttis = new Kayttoliittyma();
    HSL_kortti omaMatkakortti = new HSL_kortti();
    int valinta = 0;
    
    
    public HSL_kortti teeValinta(HSL_kortti omaMatkakortti){
        
        // Liitetän käyttäjän Matkakortti-olio Latauspisteen Matkakortti-olioon
        this.omaMatkakortti = omaMatkakortti;
        
        valinta = kayttis.latauspisteMenu();
                    // Palauttaa arvon 0, jos valittu Lataa kortille arvoa
                    // Palauttaa arvon 1, jos valittu Lataa kortile kautta
                    // Palauttaa arvon 2, jos valittu Peruuta
        
        switch(valinta){
    
                        // Ladataan kortille arvoa HSL_kortti luokan lataa()-metodin kautta
                        // Käyttöliittymän latausMenu() palauttaa rahamäärän
                        case 0: omaMatkakortti.lataa(kayttis.latausMenu());
                        break;
                        
                        // Ladatan kortille kautta tietyllä alueella
                        // Kortilla voi olla kautta kerrallaan vain yhdellä alueella
                        case 1: valinta = kayttis.alueMenu();
                                // 0 = Helsinki
                                // 1 = Espoo
                                // 2 = Vantaa
                                // 3 = Seutu
                                // 4 = Peruuta
                                if (valinta < 4){
                                    omaMatkakortti.setAlue(valinta);
                                    valinta = kayttis.kausiMenu();
                                    omaMatkakortti.setKausi(valinta);
                                }    
                        break;
                        
                        case 2:
                        break;
                        
                        default: JOptionPane.showMessageDialog(null, "Vituiks män");
                    }
        return omaMatkakortti;
    
    }
    
}
