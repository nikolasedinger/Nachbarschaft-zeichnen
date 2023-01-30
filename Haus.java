import java.awt.*; // Farben: Klasse Color

public class Haus
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    FrmZeichnen kZf;
    Rechteck hTuer, hFenster1, hFenster2, hFenster3;
    Quadrat hWand;
    Dreieck hDach;

    public Haus(FrmZeichnen pZf)
    {
        kZf = pZf; 
        hWand = new Quadrat (kZf, 30, 230, 100, Color.gray);
        hFenster1 = new Rechteck (kZf, 100, 175, 13, 19, Color.cyan);
        hFenster2 = new Rechteck (kZf, 80, 175, 13, 19, Color.cyan);
        hFenster3 = new Rechteck (kZf, 42, 177, 18, 23, Color.blue);
        hTuer = new Rechteck (kZf, 72, 230, 17,31,Color.black);
        hDach = new Dreieck (kZf, 20, 130, 120, Color.red);
        
    }
    
    public void zeichnen()
    {
        hWand.zeichnen();
        hFenster1.zeichnen();
        hFenster2.zeichnen();
        hFenster3.zeichnen();
        hTuer.zeichnen();
        hDach.zeichnen();
    }
    
    public void lichterAnschalten()
    {
        hFenster1.setzeFarbe(Color.yellow);
        hFenster2.setzeFarbe(Color.yellow);
        hFenster3.setzeFarbe(Color.yellow);
    }
    
    public void lichterAusschalten()
    {
        hFenster1.setzeFarbe(Color.cyan);
        hFenster2.setzeFarbe(Color.cyan);
        hFenster3.setzeFarbe(Color.blue);
    }
}