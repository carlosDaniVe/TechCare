
package componentesVisuales;
import javax.swing.*;
import java.awt.*;

/// Esta clase crea un ComboBox en alta Definicion
public class ComboBoxHD extends JComboBox {

    public ComboBoxHD() {
        setOpaque(false); 
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        super.paintComponent(g2d);
        g2d.dispose();
    }
  
}

