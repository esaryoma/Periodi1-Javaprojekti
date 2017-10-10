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
        int paa_menun_valinta; // tähän tallennetaan päämenun valinta 0/1
        HSL_tili omaTili;
        int valinta = 0; // muuttuja menuvalinnoille pää-DO-while-loopissa
        double lataus = 0; // muuttuja kortin latauksen väliaikaista tallentamista varten
        HSL_kortti omaMatkakortti;
        Latauspiste latauspiste = new Latauspiste();
        HSL_lukija lukija = new HSL_lukija();
        Bussi bussi = new Bussi();
        
        
        // Pääohjelman käyttämä henkilö-ArrayList kaikista ohjelmaan tallennetuista henkilöistä
        ArrayList<HSL_tili> kaikki_tilit = new ArrayList();
        
        // Ensin luodaan ensimmäinen henkilö
        Henkilo henkilo;
        henkilo = kayttis.luoHenkiloMenu();
         
        
        // Käytetään setterit tarpeellisiin classeihin, jotta liitetään henkilö näihin
        kayttis.setHenkilo(henkilo);
        
        // Uuden tilin luominen vaatii arvot:
        // HSL_tili(double rahaa tilillä euroina, int aluekoodi, int kauden pituus päivinä, int asiakasluokka, henkilö-olio)
        omaTili = new HSL_tili(0, 0, 0, henkilo.getAsiakasluokka(), henkilo);
            // Luodaan uusi tili, jolla on 0 euroa, oletus-aluekoodi, ei kautta, ja käyttäjän syöttämä Asiakasluokka, sekä henkilötiedot
        
        // Isketään tili valmiiksi kiinni omaMatkakortti-olioon, mutta tilin matkakortti_hommattu muuttuja on edelleen 0 (korttia ei ole hommattu)
        omaMatkakortti = new HSL_kortti(omaTili);
        
        // Luodaan ArrayList, joka sisältää kaikki ohjelmalla tehdyt tilit tietoineen    
        kaikki_tilit.add(omaTili);
        
        
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
                // PÄÄMENU --> LATAUSPISTEMENU
                case 0: 
                    // Jos tilillä ei vielä ole matkakortti, latauspisteelle ei pääse
                    if(omaTili.getMatkakorttiHommattu() != 1){
                        JOptionPane.showMessageDialog(null, "Sinulla ei vielä ole matkakorttia, jota ladata! Hanki matkakortti!");
                    }
                    else{
                        // Syötetään latauspisteelle käyttäjän matkakortti.
                        // teeValinta() palauttaa nyt muokatun Matkakortti-olion, joka syötetään käyttäjän matkakorttiin
                        omaMatkakortti = latauspiste.teeValinta(omaMatkakortti);
                    }
                    
                break;
                
                // PÄÄMENU --> OSTA LIPPU
                case 1: 
                    // Bussi classista haetaan lukijalta maksutietoja riippuen
                    // käyttäjän asiakaskunnasta etc.
                    
                    if (omaTili.getMatkakorttiHommattu()==1){
                    bussi.nouseKyytiin(omaMatkakortti);
                    } else                        
                        kayttis.eiKorttia();                        
                    break;
                
                //PÄÄMENU --> LUO UUSI KORTTI    
                case 2: 
                    if (omaTili.getMatkakorttiHommattu()== 1){
                        kayttis.korttiOnJoOlemassa();
                    }
                    else 
                        valinta = kayttis.hommaaMatkakorttiMenu();
                        if (valinta == 0){
                            omaTili.setMatkakorttiHommattu();
                        }
                      
                
                    break;
                
                // PÄÄMENU --> LUO UUSI HENKILÖ
                case 3: kayttis.luoHenkiloMenu();
                
                    break;
                    
                // PÄÄMENU --> LOPETA    
                case 4: 
                    JOptionPane.showMessageDialog(null, "Ohjelma lopetetaan.");
                    break;
                    
                default: JOptionPane.showMessageDialog(null, "Vituiks män");
                    break;
            }
        } while (paa_menun_valinta != 4);        
    }    
}
