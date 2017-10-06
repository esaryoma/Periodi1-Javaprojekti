/*
Kayttoliittyma 
*/

package hsl_simulaatio;

import javax.swing.*;

/**
 *
 * @author esa_r
 */
public class Kayttoliittyma {
    
    String[] paamenu = new String[] {"Latauspiste", "Lipun osto", "Luo uusi kortti", "Lopeta ohjelman käyttö"};
    String[] latauspiste_menu = new String[] {"Lataa kortille arvoa", "Lataa kortille kautta", "Peruuta"};
    String[] alue_menu = new String[] {"Helsingin sisäinen", "Espoon sisäinen", "Vantaan sisäinen", "Seutu", "Peruuta"};
    String[] lippu_menu = new String[] {"Helsingin sisäinen", "Espoon sisäinen", "Vantaan sisäinen", "Seutu", "Peruuta"};
    
    int valinta;
    Henkilo henkilo;
    
    
    // Päämenussa vaihtoehtoja: 0) Latauspiste, 1) Lipun osto, 2) Luo uusi kortti, 3) Lopeta ohjelman käyttö
    // Palauttaa arvon 0, jos valittu Latauspiste
    // Palauttaa arvon 1, jos valittu Lipun osto
    // Palauttaa arvon 2, jos valittu Luo uusi kortti
    // Palauttaa arvon 3, jos valittu Lopeta ohjelman käyttö
    public int paaMenu(){
        valinta = JOptionPane.showOptionDialog(null, "Valinta: ", "HSL", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, paamenu, paamenu[0]);
        return valinta;
    }
  
    // valinta = JOptionPan.showOptionDialog(null, "Teksti joka näkyy", "Title boksin yläkulmaan", null (mikä icon boksissa on), JOptionPane.DEFAULT.OPTION, JOptionPane.PLAIN_MESSAGE, null, vaihtoehdot(mitä napeissa lukee luettuna string-taulukosta, vaihtoehdot[i] (mikä String-taulukon vaihtoehdoista on high-lightattu oletuksena, 
    
    
    // Latauspistemenussa 2 vaihtoehtoa: 0) Lataa kortille arvoa, 1) Lataa kortille kautta, 2) Peruuta
    // Palauttaa arvon 0, jos valittu Lataa kortille arvoa
    // Palauttaa arvon 1, jos valittu Lataa kortile kautta
    // Palauttaa arvon 2, jos valittu Peruuta
    public int latauspisteMenu(){
        valinta = JOptionPane.showOptionDialog(null, "Valinta: ", "Latauspiste", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, latauspiste_menu, latauspiste_menu[0]);
        return valinta;
    }
            // Latauspisteen Lataa kortille arvoa
            public double latausMenu(){
            double ladattava_arvo;
            ladattava_arvo = Double.parseDouble(JOptionPane.showInputDialog(null, "Kuinka paljon haluat ladata kortille arvoa?"));
            return ladattava_arvo;
            }
            
            // Aluemenussa 3 vaihtoehtoa: 0) Helsingin sisäinen, 1) Espoon sisäinen, 2) Vantaan sisäinen
            // 3) Seutu
            // Palauttaa arvon 0, jos valittu Helsingin sisäinen
            // Palauttaa arvon 1, jos valittu Espoon sisäinen
            // Palauttaa arvon 2, jos valittu Vantaan sisäinen
            // Palauttaa arvon 3, jos valittu Seutu
            // Palauttaa arvon 4, jos valittu Peruuta
            public int alueMenu(){
                valinta = JOptionPane.showOptionDialog(null, "Valinta: ", "Latauspiste", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alue_menu, alue_menu[0]);
                return valinta;
            }
    
    // Henkilön luontimenu
    public Henkilo luoHenkiloMenu(){
        String etunimi;
        String sukunimi;
        String sotu;
        etunimi = JOptionPane.showInputDialog("Luodaan sinulle käyttäjätili \n"
                + "Anna etunimesi:");
        sukunimi = JOptionPane.showInputDialog("Anna sukunimesi:");
        sotu = JOptionPane.showInputDialog("Anna sosiaaliturvatunnuksesi muodossa PPKKVV-###");
        return henkilo = new Henkilo(etunimi, sukunimi, sotu); 
    }
    
    // Lipunostomenu
    // Palauttaa arvona integerin
    /* 
    0 = Helsingin sisäinen
    1 = Espoon sisäinen
    2 = Vantaan sisäinen
    3 = Seutu
    4 = Peruuta    
    */
    public int ostaLippuMenu(){
        valinta = JOptionPane.showOptionDialog(null, "Valinta", "Osta lippu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, lippu_menu, lippu_menu[0]);
        return valinta;
    }
    
    
    
}
