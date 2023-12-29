package componentesVisuales;

import javax.swing.*;
import java.awt.*;

/*Esta clase crea una label en alta definicion,
* solo puede mostrar texto o imagenes, no al mismo tiempo,
* si es texto mostrara texto, si es imagen mostrara imagen
*/

public class LabelAltaDefinicion extends JLabel {

    private Icon icono;

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }

    public LabelAltaDefinicion() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        super.paintComponent(g2d);
        if (icono != null) {
            g2d.drawImage(((ImageIcon) icono).getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
            g2d.dispose();
        }
    }
}
