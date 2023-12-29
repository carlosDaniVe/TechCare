package componentesVisuales;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

/* Esta clase crea JPasswordField con esquinas redondeadas 
*  en alta definicon, tambien puede mostrar un icono a la izquierda
*  que al clickearlo muestra u oculta la contraseña.
*/

public class PasswordField extends JPasswordField {

    private Font font;
    private Icon a;
    private Icon b;
    private ImageIcon prefixIconVisible;
    private ImageIcon prefixIconHidden;
    private ImageIcon preIcon, sufIcon;
    private Color borderColor = new Color(128, 128, 128); // Color inicial del borde

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Icon getA() {
        return a;
    }

    public void setA(Icon a) {
        this.a = a;
        prefixIconVisible = (ImageIcon) a;
        preIcon = prefixIconVisible;
        initBorder();
    }

    public Icon getB() {
        return b;
    }

    public void setB(Icon b) {
        this.b = b;
        prefixIconHidden = (ImageIcon) b;
        if (b == null && prefixIconHidden == null) {

        }
        initBorder();
    }

    public PasswordField() {
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int borderLeft = ((EmptyBorder) getBorder()).getBorderInsets().left;
                if (preIcon != null && e.getX() - borderLeft < preIcon.getIconWidth()-35) {
                    togglePasswordVisibility();
                    updatePrefixIcon();
                }
            }
        });
      

        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                borderColor = new Color(0, 74, 200);; // Cambia el color del borde a rojo cuando el campo de texto recibe el foco
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                borderColor = new Color(128, 128, 128); // Cambia el color del borde a negro cuando el campo de texto pierde el foco
                repaint();
            }
        });
    }

    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setColor(borderColor);
        g2d.setStroke(new BasicStroke(1.9f));
        g2d.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 100, 100);
        g2d.dispose();
    }

    private void togglePasswordVisibility() {
        setEchoChar(getEchoChar() == '\u0000' ? '*' : '\u0000');
    }

    private void updatePrefixIcon() {
        if (getEchoChar() == '\u0000') {
            preIcon = prefixIconHidden;
        } else {
            preIcon = prefixIconVisible;
        }
        repaint();
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
        if (preIcon != null) {
            int y = (getHeight() - preIcon.getIconHeight()) / 2;
            g2d.drawImage(((ImageIcon) preIcon).getImage(), 15, y, this);

        }
        
        g2d.dispose();
    }

    private void initBorder() {
        int left = 18;
        int right = 18;
        //  5 is default
        if (preIcon != null) {
            //  prefix is left
            left += preIcon.getIconWidth() + 9;

        }

        if (font != null) {
            setFont(font);
        }

        setBorder(javax.swing.BorderFactory.createEmptyBorder(9,
                left, 9, right));
    }
    private Shape shape;

    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 2, getHeight() - 2, 15, 15);
        }
        return shape.contains(x, y);
    }
}
