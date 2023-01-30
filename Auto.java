import java.awt.*;

public class Auto
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    FrmZeichnen kZf;
    Rechteck hFahrkabine, hDach;
    Kreis hReifen1, hReifen2;
    Rechteck hAbdecker;
    
    public Auto(FrmZeichnen pZf)
    {
        kZf = pZf;
        hFahrkabine = new Rechteck(kZf, 260, 252, 45, 13, Color.pink);
        hDach = new Rechteck(kZf , 277, 239 ,25, 5, Color.pink);
        hReifen1 = new Kreis(kZf, 264, 252, 5, Color.darkGray); 
        hReifen2 = new Kreis(kZf, 300, 252, 5, Color.darkGray); 
        hAbdecker = new Rechteck(kZf, 0, 260, 400, 30, Color.lightGray); 
    }

    public void zeichnen()
    {
        hFahrkabine.zeichnen();
        hDach.zeichnen();
        hReifen1.zeichnen();
        hReifen2.zeichnen();
    
    }
    
    public void autoFahren()
    {
        hFahrkabine.loeschen();
        hDach.loeschen();
        hReifen1.loeschen();
        hReifen2.loeschen();
        hFahrkabine.setzePosition (hFahrkabine.liesXPosition() -30, hFahrkabine.liesYPosition());
        hDach.setzePosition (hDach.liesXPosition() -30, hDach.liesYPosition());
        hReifen1.setzePosition (hReifen1.liesXPosition() -30, hReifen1.liesYPosition());
        hReifen2.setzePosition (hReifen2.liesXPosition() -30, hReifen2.liesYPosition());
        hAbdecker.zeichnen();
        hFahrkabine.zeichnen();
        hDach.zeichnen();
        hReifen1.zeichnen();
        hReifen2.zeichnen();
    }
}
