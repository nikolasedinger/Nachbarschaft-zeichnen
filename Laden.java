import java.awt.*; // Farben: Klasse Color

public class Laden
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    FrmZeichnen kZf;
    Rechteck hTuer, hFenster1, hFenster2, hWand, hSchild;
    
    public Laden(FrmZeichnen pZf)
    {
        kZf = pZf; 
        hWand = new Rechteck (kZf, 200, 225, 120, 60, Color.orange);
        hFenster1 = new Rechteck (kZf, 205, 218, 40, 30, Color.cyan);
        hFenster2 = new Rechteck (kZf, 275, 218, 40, 30, Color.cyan);
        hTuer = new Rechteck (kZf, 250, 225, 20 ,30 ,Color.gray);
        hSchild = new Rechteck (kZf, 210, 175, 100, 20, Color.red);
    }
    
    public void zeichnen()
    {
        hWand.zeichnen();
        hFenster1.zeichnen();
        hFenster2.zeichnen();
        hTuer.zeichnen();
        hSchild.zeichnen();
    }
    
    public void lichterAnschalten()
    {
        hFenster1.setzeFarbe(Color.yellow);
        hFenster2.setzeFarbe(Color.yellow);
    }
    
    public void lichterAusschalten()
    {
        hFenster1.setzeFarbe(Color.cyan);
        hFenster2.setzeFarbe(Color.cyan);
    }
}
