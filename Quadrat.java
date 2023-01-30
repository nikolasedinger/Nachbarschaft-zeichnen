
/**
 *  Baukasten: Klasse Quadrat
 *  
 *  @Author Peter Damann
 *  @Version 08.07.2012
 */

import java.awt.*;  // Color

public class Quadrat
{
    // Attribute
	
   private FrmZeichnen kZf;
   private Graphics kLw;
   private int zX, zY, zB;
   private Color zpFarbe;
   private boolean zSichtbar;


    // Konstrutor(en)

	/** Konstruktor: erzeugt ein Objekt der Klasse Quadrat */
	public Quadrat (FrmZeichnen zf, int pX, int pY, int pBreite, Color pFarbe)
    {    
        // Instanzvariable initialisieren
        kZf = zf;
        kLw = kZf.getGraphics();  // Leinwand = Zeichenflaeche
        zX = pX + kZf.getInsets().left;
        zY = pY + kZf.getInsets().top;
        zB = pBreite;
        zpFarbe = pFarbe;
     }
     
     // Methoden	

    /** zeichnet die Figur */
    public void zeichnen() {
        Color pFarbeAlt;
        pFarbeAlt = kLw.getColor();
        kLw.setColor (zpFarbe);
        kLw.fillRect (zX, zY-zB, zB, zB);
        kLw.setColor (Color.black);
        kLw.drawRect (zX, zY-zB, zB, zB);
        kLw.setColor (pFarbeAlt);
        zSichtbar = true;
    }
     
    /** übermalt die Figur mit weißer pFarbe */
    public void loeschen() {
        Color pFarbeAlt;
        pFarbeAlt = kLw.getColor();
        kLw.setColor (Color.white);
        kLw.fillRect (zX, zY-zB, zB, zB);
        kLw.drawRect (zX, zY-zB, zB, zB);
        kLw.setColor (pFarbeAlt);
        zSichtbar = false;
    }
    
    /** zeichnet die Figur in der neuen pFarbe */
    public void setzepFarbe (Color pFarbe) {
        zpFarbe = pFarbe;
        if (zSichtbar)
           zeichnen();
    }
     
    /** Bezugspunkt: Ecke unten links */
    public void setzePosition (int pX, int pY) {
        if (zSichtbar) {
           loeschen(); 
           zX = pX; zY = pY;
           zeichnen();
        }
        else {
           zX = pX; zY = pY;  
        }
    }
    
    /** liefert die x-Koordinate der Figur */
    public int liespXition() {
        return zX;
    }
    
    /** liefert die y-Koordinate der Figur */
    public int liespYition() {
        return zY;
    }
     
     
}  // Klasse Quadrat
