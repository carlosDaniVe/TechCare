package componentesVisuales;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/* Esta clase crea textField redondeados 
*  estos pueden mostrar iconos en el lado izquierdo
*/

public class TextFieldRedondeado extends JTextField {

    private Font fuente;
    private Icon prefixIcon;
    private Icon suffixIcon;
    private ImageIcon pre, suf;
    private Color borderColor = new Color(128, 128, 128);

    public Icon getPrefixIcon() {
        return prefixIcon;
    }

    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        pre = (ImageIcon) prefixIcon;
        initBorder();
    }

    public Icon getSuffixIcon() {
        return suffixIcon;
    }

    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        suf = (ImageIcon) suffixIcon;
        initBorder();
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public TextFieldRedondeado() {

        setOpaque(false);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                borderColor = new Color(0, 74, 200); // Cambia el color del borde a rojo cuando el campo de texto recibe el foco
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                borderColor = new Color(128, 128, 128); // Cambia el color del borde a negro cuando el campo de texto pierde el foco
                repaint();
            }
        });
    }

    @Override
    protected void paintBorder(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setColor(borderColor);
        g2d.setStroke(new BasicStroke(1.9f));
        g2d.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 100, 100);
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        initBorder();
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 100, 100);
        super.paintComponent(g2d);
        paintIcon(g2d);
        g2d.dispose();
    }

    private void paintIcon(Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        if (pre != null) {
            Image prefix = ((ImageIcon) pre).getImage();
            int y = (getHeight() - pre.getIconHeight()) / 2;
            g2.drawImage(prefix, 15, y, this);
            g2.dispose();
        }
        if (suf != null) {
            Image suffix = ((ImageIcon) suf).getImage();
            int y = (getHeight() - suf.getIconHeight()) / 2;
            g2.drawImage(suffix, getWidth() - suf.getIconWidth() - 15, y, this);
            g2.dispose();
        }
        
    }

    private void initBorder() {
        int left = 18;
        int right = 18;
        if (pre != null) {
            left = pre.getIconWidth() + 25;
        }
        if (suf != null) {
            right = suf.getIconWidth() + 25;
        }
        if (fuente != null) {
            setFont(fuente);
        }
        setBorder(javax.swing.BorderFactory.createEmptyBorder(9, left, 9, right));
    }
    private Shape shape;

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 2, getHeight() - 2, 15, 15);
        }
        return shape.contains(x, y);
    }
}
