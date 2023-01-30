
import java.awt.*;  // Color

public class Kreis {
    
  // Attribute
  
   FrmZeichnen kZf;
   Graphics kLw;
   int zX, zY, zR;
   Color zFarbe;
   boolean zSichtbar;

  // Konstruktoren
  
    /** Konstruktor */
    public Kreis (FrmZeichnen zf, int pX, int pY, int pRadius, Color pFarbe) {
    
        // Instanzvariable initialisieren
        kZf = zf;
        kLw= kZf.getGraphics();  // Leinwand = Zeichenflaeche
        zX = pX + kZf.getInsets().left;
        zY = pY + kZf.getInsets().top;
        zR = pRadius;
        zFarbe = pFarbe;
        zSichtbar = false;
    }

   // Methoden
   
    /** zeichnet die Figur */
    public void zeichnen() {
      Color farbeAlt;
      farbeAlt = kLw.getColor();
      kLw.setColor (zFarbe);
      kLw.fillOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.setColor (Color.black);
      kLw.drawOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.setColor (farbeAlt);
      zSichtbar = true;
    }
 
    /** übermalt die Figur mit weißer Farbe */
    public void loeschen() {
      Color farbeAlt;
      farbeAlt = kLw.getColor();
      kLw.setColor (Color.white);
      kLw.fillOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.drawOval (zX-zR, zY-zR, 2*zR, 2*zR);
      kLw.setColor (farbeAlt);
      zSichtbar = false;
    }
    
    /** Farbe ... */
    public void setzeFarbe (Color pFarbe) {
        zFarbe = pFarbe;
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
    public int liesXPosition() {
      return zX;
    }
    
    /** liefert die y-Koordinate der Figur */
    public int liesYPosition() {
      return zY;
    }
    
} // class