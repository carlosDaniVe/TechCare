
package componentesVisuales;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/* Esta clase crea ScrollBars modernos en si depende de la clase
*  ScrollBarModerno. Esta es la clase que se usa para agregar los
*  ScrollBar,es decir, hacer las Instancias para su uso en los ScrollPanes
*/

public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ScrollBarModerno());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(20);
    }
}

