package clases;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Mostrar {

    public static void mostrarPanel(JPanel padre, JPanel hijo) {

        hijo.setSize(1020, 660);
        hijo.setLocation(0, 0);
        padre.removeAll();
        padre.add(hijo, BorderLayout.CENTER);
        padre.revalidate();
        padre.repaint();
    }
}
