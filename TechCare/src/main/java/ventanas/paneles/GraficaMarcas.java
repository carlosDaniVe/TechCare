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
public class GraficaMarcas extends javax.swing.JPanel {

    List<Integer> datos = new ArrayList<>();
    List<String> nombres = new ArrayList<>();
    public GraficaMarcas() {
        initComponents();
        
        try {
            Connection cn = new Conectar().conectar();
            PreparedStatement ps = cn.prepareStatement(
                    "SELECT marcas FROM marcas");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String marca = rs.getString("marcas");
                System.out.println("marca: "+ marca);
                
                if(!marca.isEmpty()){
                    nombres.add(marca);
                String query2 = "SELECT COUNT(*) AS cantidadMarca FROM equipos WHERE marca = ?";

                PreparedStatement ps2= cn.prepareStatement(query2);
                ps2.setString(1, marca);
                ResultSet rs2 = ps2.executeQuery();
                int cantidad = rs2.getInt("cantidadMarca");
                    System.out.println("Cantidad de "+marca+ " es: "+ cantidad);
                
                datos.add(cantidad);
                }
                
            }
            cn.close();
            ps.close();
            rs.close();
            
            

        } catch (SQLException e) {
            System.out.println("Error en obtener tipos y sus cantidades: "+e);
        }
        JFreeChart graficoBarras = Graficas.graficarBarras(datos, nombres,"Grafica de Marcas");

        ChartPanel panel = new ChartPanel(graficoBarras);
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
