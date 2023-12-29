package componentesVisuales;

import javax.swing.*;
import java.awt.*;

// Esta clase crea JPaneles con ezquinas redondeadas en alta alta definicion.


public class PanelRedondeado extends JPanel {
    //

    public PanelRedondeado() {
        setOpaque(false); // Así se puede ver el fondo redondeado
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 100, 100); // Los dos últimos parámetros son el arco del borde redondeado
        super.paintComponent(g);
        g2d.dispose();
    }
    
    public void setBackground(Color bg) {
    super.setBackground(bg); // Esto cambiará el color de fondo del JPanel
        Color colorDeFondo = bg; // Esto cambiará el color de fondo del rectángulo redondeado
}
}

