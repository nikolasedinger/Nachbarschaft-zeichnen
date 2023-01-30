

    
    /**
     *  Programm Haus1: Die Klasse Haus.
     * 
     *  @author Peter Damann 
     *  @version (eine Versionsnummer oder ein Datum)
     */
    
    import java.awt.*;  // Farben: Klasse Color
    
    public class BauAnwendung
    {
        // Objektvariable
        
        FrmZeichnen hZf;
        Kreis hSonne;
        Rechteck hTür;
        Kreis hMond;
        Rechteck hStrasse;
        Rechteck hGarten;
        Haus hHaus;
        Auto hAuto;
        Laden hLaden;
        // Konstruktor
        
    public BauAnwendung(){    
    }
    
        // Methoden
        
    public void ladenZeichnen() {
        hLaden = new Laden (hZf);
        hLaden.zeichnen();
    }
        
    public void lichterAusschalten() {
        hHaus.lichterAusschalten();
        hLaden.lichterAusschalten();
    }
        
    public void lichterAnschalten() {
        hHaus.lichterAnschalten();
        hLaden.lichterAnschalten();
    }
    
    public void autoZeichnen() {
        hAuto = new Auto (hZf);
        hAuto.zeichnen();
    }
    
    public void neuesZeichenfenster() {
       hZf = new FrmZeichnen();
       hZf.setVisible (true); 
    }
    
    public void tageszeitZeichnen() {
      hSonne = new Kreis (hZf, 10, 40, 20, Color.yellow);
      hSonne.zeichnen();
      hMond = new Kreis (hZf, -1000, 0, 20, Color.lightGray);
      hMond.zeichnen();
    }
    
    public void hausZeichnen() {
        hHaus = new Haus (hZf);
        hHaus.zeichnen();
    }
    
    public void strasseZeichnen()
    {
        hStrasse = new Rechteck (hZf, 0, 260, 400, 30, Color.lightGray);
        hStrasse.zeichnen();
    }
    
    public void vorgartenZeichnen()
    {
        hGarten= new Rechteck (hZf, 0, 230, 400, 20, Color.green);
        hGarten.zeichnen();
    }
    
    public void zeitBewegen()
    {
        if (hSonne.liesXPosition() < 200) {
            hSonne.setzePosition (hSonne.liesXPosition() + 20, hSonne.liesYPosition() - 5);
            hAuto.autoFahren();
        } else { 
            hSonne.setzePosition (hSonne.liesXPosition() +20, hSonne.liesYPosition() + 5);
            hAuto.autoFahren();
        } 
        
        if (hSonne.liesXPosition() > 400) {
            hSonne.setzePosition(-1000, 0);
            hMond.setzePosition(0,80);
            hHaus.lichterAnschalten();
            hLaden.lichterAnschalten();
        } if (hMond.liesXPosition() < 200) {
            hMond.setzePosition (hMond.liesXPosition() + 20, hMond.liesYPosition() - 5);
          } else { 
            hMond.setzePosition (hMond.liesXPosition() + 20, hMond.liesYPosition() + 5);
          } 
        
        if (hMond.liesXPosition() > 400) {
            hMond.setzePosition(-1000, 0);
            hSonne.setzePosition(5,80);
            hHaus.lichterAusschalten();
            hLaden.lichterAusschalten();
        }    
        
    }
    
    public void zeichenfensterLoeschen() {
       hZf.setVisible (false);
       hZf.dispose();
    }
    
    public void allesZeichnen() {
        strasseZeichnen();
        vorgartenZeichnen();
        hausZeichnen();
        ladenZeichnen();
        autoZeichnen();
        tageszeitZeichnen();
    }
} // class Baukasten1
