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
    
    private String[] paamenu = new String[] {"Latauspiste", "Lipun osto", "Hommaa matkakortti", "Luo uusi henkilö", "Lopeta ohjelman käyttö"};
    private String[] latauspiste_menu = new String[] {"Lataa kortille arvoa", "Lataa kortille kautta", "Peruuta"};
    private String[] alue_menu = new String[] {"Helsingin sisäinen", "Espoon sisäinen", "Vantaan sisäinen", "Seutu", "Peruuta"};
    private String[] lippu_menu = new String[] {"Helsingin sisäinen", "Espoon sisäinen", "Vantaan sisäinen", "Seutu", "Peruuta"};
    private String[] luo_matkakortti_menu = new String[] {"Luo", "Peruuta"};
    private String[] asiakaskunta_menu = new String[] {"Lapsi", "Aikuinen", "Opiskelija", "Eläkeläinen"};
    private int valinta;
    private Henkilo henkilo;
    
    
    public void setHenkilo(Henkilo henkilo){
        this.henkilo = henkilo;
    }
    
    // Päämenussa vaihtoehtoja: 0) Latauspiste, 1) Lipun osto, 2) Luo uusi kortti, 3) Lopeta ohjelman käyttö
    // Palauttaa arvon 0, jos valittu Latauspiste
    // Palauttaa arvon 1, jos valittu Lipun osto
    // Palauttaa arvon 2, jos valittu Hommaa matkakortti
    // Palauttaa arvon 3, jos valittu Luo uusi henkilö
    // Palauttaa arvon 4, jos valittu Lopeta ohjelman käyttö
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
            
                       
            // Aluemenu:
            // Palauttaa arvon 0, jos valittu Helsingin sisäinen
            // Palauttaa arvon 1, jos valittu Espoon sisäinen
            // Palauttaa arvon 2, jos valittu Vantaan sisäinen
            // Palauttaa arvon 3, jos valittu Seutu
            // Palauttaa arvon 4, jos valittu Peruuta
            public int alueMenu(){
                valinta = JOptionPane.showOptionDialog(null, "Valinta: ", "Latauspiste", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alue_menu, alue_menu[0]);
                return valinta;
            }
            
            public int kausiMenu(){
                valinta = Integer.parseInt(JOptionPane.showInputDialog(null, "Kuinka monta vuorokautta haluat ladata kortille kautta?"));
                return valinta;
            }
    
    // Henkilön luontimenu
    // Palauttaa henkilö-olion, joka sisältää käyttäjän syöttämät tiedot
    public Henkilo luoHenkiloMenu(){
        String etunimi;
        String sukunimi;
        String sotu;
            // asiakaskunta
            /* 
            0 = lapsi
            1 = aikuinen
            2 = opiskelija
            3 = eläkeläinen
            */
        int asiakaskunta;
        etunimi = JOptionPane.showInputDialog("Luodaan sinulle käyttäjätili \n"
                + "Anna etunimesi:");
        sukunimi = JOptionPane.showInputDialog("Anna sukunimesi:");
        sotu = JOptionPane.showInputDialog("Anna sosiaaliturvatunnuksesi muodossa PPKKVV-###");
        asiakaskunta = JOptionPane.showOptionDialog(null, "Mihin asiakasryhmään kuulut?", "Asiakasryhmä", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, asiakaskunta_menu, asiakaskunta_menu[1]);
        return henkilo = new Henkilo(etunimi, sukunimi, sotu, asiakaskunta); 
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
    
    // Luo uusi matkakortti menu
    // Palauttaa
    /*
    0 = Liittää aktiivisen henkilön
    1 = Peruuta
    */
    public int hommaaMatkakorttiMenu(){
        valinta = JOptionPane.showOptionDialog(null, "Hanki matkakortti henkilölle" +henkilo.getEtunimi() +" " +henkilo.getSukunimi(), "Valinta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, luo_matkakortti_menu , luo_matkakortti_menu[0]);
        return valinta;
    }
    
    // Matkakorttimenussa, jos henkilöllä on jo kortti olemassa
    public void korttiOnJoOlemassa(){
        JOptionPane.showMessageDialog(null, "Sinulla on jo matkakortti!");
    }
    
    public void virheViesti(){
        JOptionPane.showMessageDialog(null, "Tapahtuma ei onnistunut.", null, JOptionPane.ERROR_MESSAGE);
    }
    
    public int hyvaksyHinta(HSL_kortti omaMatkakortti, HSL_lukija lukija){
        this.omaMatkakortti = omaMatkakortti;
        this.lukija = lukija;
        valinta = JOptionPane.showConfirmDialog(null, "Olet " +omaMatkakortti.getAsiakaskunta() +" , joten hintasi on" +lukija.getHinta() +" OK?");
        return valinta;
        
        
    }
    
    // Teksti joka näkyy kun käyttäjä on ostanut bussissa lipun.
    // Ilmoittaa lipun hinnan, ja kortilla olevan arvon.
    public void maksunJalkeen(double hinta){
        JOptionPane.showMessageDialog(null, "Kiitos. Lippusi maksoi " +hinta +"€.\n"
                                            + "Arvoa jäljellä " +omaMatkakortti.getArvo() +"€.\n"
                                            +"Hyvää matkaa! ");
    }
    
    public void kortinTiedot(HSL_kortti kortti){
        JOptionPane.showMessageDialog(null, "Nimi: " + kortti.getKokonimi() 
                                        + "\nArvoa: " + kortti.getArvo()+" €\nKautta jäljellä: "
                                        +kortti.getKausi()+ " päivää\nKauden alue: "+kortti.getAlueStr()
                                        +"\nAsiakaskunta: "+kortti.getAsiakaskuntaStr());
    }
    
}
