
package componentesVisuales;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/* Esta clase crea tablas con un estilo Moderno
*  se puede cambiar colores y alineamiento de los
*  texto abajo en el codigo
*/

public class Tabla extends JTable{

    public Tabla(){
        
        
        getTableHeader().setReorderingAllowed(false);
        
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                label.setOpaque(true);
                label.setForeground(Color.white);
                label.setFont(new Font("Segoe UI", 1, 16));
                label.setBackground(new Color(0, 73, 172));
                // Para centrar el texto
                label.setHorizontalAlignment(JLabel.CENTER); 
                
                label.setPreferredSize(new Dimension(label.getWidth(), 45)); // Para cambiar la altura
                return label;
            }
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setFont(new Font("Segoe UI", 1, 16));
                
                
                if (isSelected) {
                    c.setForeground(new Color(220,220,220)); // Cambia esto al color que prefieras para el texto cuando se selecciona una fila
                } else {
                    c.setForeground(new Color(53,53,53)); // Cambia esto al color que prefieras para el texto cuando no se selecciona una fila
                    c.setBackground(row % 2 == 0 ? new Color(220, 235, 255) : Color.WHITE);
                     table.setRowHeight(45);
                }
                return c;
            }
        });

        
    }
} 
    

