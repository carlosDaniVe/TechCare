
package componentesVisuales;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

/* Esta Clase crea ScrollBar(barras de deslisamientos en los scrollpanes)
*  con un estilo mas moderno. 
*/

public class ScrollBarModerno extends BasicScrollBarUI {

    private static final int SCROLL_BAR_ALPHA_ROLLOVER = 100;
    private static final int SCROLL_BAR_ALPHA = 50;
    private static final int THUMB_SIZE = 5;
    private static final Color THUMB_COLOR = Color.BLUE;

    public ScrollBarModerno() {

    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        int alpha = isThumbRollover() ? SCROLL_BAR_ALPHA_ROLLOVER : SCROLL_BAR_ALPHA;
        int orientation = scrollbar.getOrientation();
        int x = thumbBounds.x;
        int y = thumbBounds.y;

        int width = orientation == JScrollBar.VERTICAL ? THUMB_SIZE : thumbBounds.width;
        width = Math.max(width, THUMB_SIZE);

        int height = orientation == JScrollBar.VERTICAL ? thumbBounds.height : THUMB_SIZE;
        height = Math.max(height, THUMB_SIZE);
        

        Graphics2D graphics2D = (Graphics2D) g.create();
        graphics2D.setColor(new Color(0/*THUMB_COLOR.getRed()*/, 73/*THUMB_COLOR.getGreen()*/, 173/*THUMB_COLOR.getBlue()*/, alpha));
        graphics2D.fillRect(x, y, width, height);
        graphics2D.dispose();
    }

    private static class InvisibleScrollBarButton extends JButton {

        private InvisibleScrollBarButton() {
            setOpaque(false);
            setFocusable(false);
            setFocusPainted(false);
            setBorderPainted(false);
            setBorder(BorderFactory.createEmptyBorder());
        }
    }
}
