package componentesVisuales;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/* Esta clase crea labels en alta definicion, pero con ezquinas 
*  redondeadas.
*/

public class LabelRedondeada extends JLabel {

    private Icon icono;
    private Shape shape;
    private JComponent parent;

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }

    public void setParent(JComponent parent) {
        this.parent = parent;
    }

    public LabelRedondeada() {
        this.setOpaque(false);
    }

    @Override
    public Color getBackground() {
        return parent != null ? parent.getBackground() : super.getBackground();
    }

    @Override
    protected void paintComponent(Graphics g) {
        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setClip(shape);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        
        super.paintComponent(g);
        if (icono != null) {
            g2d.drawImage(((ImageIcon) icono).getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        }
        g2d.dispose();
    }

}
