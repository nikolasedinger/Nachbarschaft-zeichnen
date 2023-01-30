
/**
 * Klasse Dreieck
 * 
 * @author Peter Damann 
 * @version 29.06.2012
 */

import java.awt.*;  // Color

public class Dreieck {
    
  // Attribute
  
   private FrmZeichnen kZf;
   private Graphics kLw;
   private int zX, zY, zB, zH;
   private Color zFarbe;
   private boolean zSichtbar;

  // Konstruktoren
  
    /** Konstruktor */
    public Dreieck (FrmZeichnen Zf, int pX, int pY, int pBreite, Color pFarbe)
    {    
        // Instanzvariable initialisieren
        kZf = Zf;
        kLw= kZf.getGraphics();  // Leinwand = Zeichenflaeche
        zX = pX + kZf.getInsets().left;
        zY = pY + kZf.getInsets().top;
        zB = pBreite;
        zH = pBreite / 2;
        zFarbe = pFarbe;
     }

   // Methoden
   
    /** zeichnet die Figur */
    public void zeichnen() {
        // kLw= kZf.getGraphics();
        Polygon eckpunkte;
        
        eckpunkte = new Polygon();
        eckpunkte.addPoint (zX, zY);
        eckpunkte.addPoint (zX + zB, zY);
        eckpunkte.addPoint (zX + zB/2, zY - zH);
        
        kLw.setColor (zFarbe);
        kLw.fillPolygon (eckpunkte);
        kLw.setColor (Color.black);
        kLw.drawPolygon (eckpunkte);
        zSichtbar = true;
    }
 
    /** übermalt die Figur mit weißer Farbe */
    public void loeschen() {
        // ...
        zSichtbar = false;
    }
    
    /** Farbe ... */
    public void setzeFarbe (Color pFarbe) {
        zFarbe = pFarbe;
        zeichnen();
    }
    
    /** Bezugspunkt: Ecke unten links */
    public void setzePosition (int pX, int pY) {
        zX = pX;
        zY = pY;
        if (zSichtbar)
            zeichnen();
    }
    
    /** liefert die x-Koordinate der Figur */
    public int liesXPosition() {
        return zX;
    }
    
    /** liefert die y-Koordinate der Figur */
    public int liesYPosition() {
        return zY;
    }
    
} // class