package ventanas.paneles;

import clases.Conectar;
import clases.Graficas;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Carlos Hernandez
 */
public class GraficaEstatus extends javax.swing.JPanel {

    
    public GraficaEstatus() {
        initComponents();
        int nuevoIngreso = 0, enRevision = 0, reparado = 0, noReparado = 0, entregado = 0;
        try {
            Connection cn = Conectar.conectar();
            PreparedStatement ps = cn.prepareStatement(
                    "select estatus, count(*) as cantidad from equipos group by estatus");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String estatus = rs.getString("estatus");
                int cantidad = rs.getInt("cantidad");

                switch (estatus) {
                    case "Nuevo Ingreso":
                        nuevoIngreso = cantidad;

                        break;
                    case "En Revision":
                        enRevision = cantidad;
                        break;
                    case "Reparado":
                        reparado = cantidad;
                        break;
                    case "No Reparado":
                        noReparado = cantidad;
                        break;
                    case "Entregado":
                        entregado = cantidad;
                        break;
                    default:
                        break;

                }

            }

            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en recuperar Cantidades de equipos segun su estatus");
            System.out.println(e);
        }

        List<Integer> datos = new ArrayList<>(Arrays.asList(nuevoIngreso, enRevision, reparado, noReparado, entregado));
        List<String> nombres = new ArrayList<>(Arrays.asList("Nuevo Ingreso", "En Revision", "Reparado", "No Reparado", "Entregado"));

        JFreeChart graficoBarras = Graficas.graficarBarras(datos, nombres,"Grafica de Estatus");

        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setPreferredSize(new Dimension(880, 510));

        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        repaint();

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new componentesVisuales.LabelAltaDefinicion();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Grafica de Estatus");
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 33));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion titulo;
    // End of variables declaration//GEN-END:variables
}
