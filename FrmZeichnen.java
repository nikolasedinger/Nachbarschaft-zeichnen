 

/**
 *  Zeichnfenster für den Baukasten: Klasse FrmZeichnen
 *  
 *  @Author Peter Damann
 *  @Version 08.07.2012
 */

import java.awt.*;

public class FrmZeichnen extends Frame {
	
    // Attribute
    
    Graphics zLw;
       
   	// Konstruktor
    
	FrmZeichnen () {
      setSize (400, 300);
      setLocation (20, 20); 
      setTitle ("Zeichenfenster"); 
      setResizable (false);
      // zLw = getGraphics(); Leinwand existiert zu diesem Zeitpunkt noch nicht
    }
    
    // Methoden: noch keine...
    
    
} // class FrmZeichnen
