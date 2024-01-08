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
import java.util.List;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Carlos Hernandez
 */
public class GraficaTipos extends javax.swing.JPanel {

    List<Integer> datos = new ArrayList<>();
    List<String> nombres = new ArrayList<>();

    
    public GraficaTipos() {
        initComponents();

        try {
            Connection cn = Conectar.conectar();
            PreparedStatement ps = cn.prepareStatement(
                    "SELECT tipos FROM tipos");

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                String tipo = rs.getString("tipos");
                System.out.println("Tipos: "+ tipo);
                
                if(!tipo.isEmpty()){
                    nombres.add(tipo);
                String query2 = "SELECT COUNT(*) AS cantidad FROM equipos WHERE tipo = ?";

                PreparedStatement ps2= cn.prepareStatement(query2);
                ps2.setString(1, tipo);
                ResultSet rs2 = ps2.executeQuery();
                int cantidad = rs2.getInt("cantidad");

                datos.add(cantidad);
                }
                
            }
            cn.close();
            ps.close();
            rs.close();
            
            

        } catch (SQLException e) {
            System.out.println("Error en obtener tipos y sus cantidades: "+e);
        }

        JFreeChart graficaCircular = Graficas.graficaCircular(datos, nombres);
        ChartPanel panel = new ChartPanel(graficaCircular);
        panel.setPreferredSize(new Dimension(880, 510));

        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        repaint();
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
