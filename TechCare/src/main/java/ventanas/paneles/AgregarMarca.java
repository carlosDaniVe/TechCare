package ventanas.paneles;

import clases.Conectar;
import clases.PlaceHonder;
import clases.Validar;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Hernandez
 */
public class AgregarMarca extends javax.swing.JPanel {

    
    public AgregarMarca() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAltaDefinicion1 = new componentesVisuales.LabelAltaDefinicion();
        labelAltaDefinicion4 = new componentesVisuales.LabelAltaDefinicion();
        agregarMarcaTXT = new componentesVisuales.TextFieldRedondeado();
        AgregarL = new componentesVisuales.PanelRedondeado();
        agregarL = new componentesVisuales.LabelRedondeada();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAltaDefinicion1.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion1.setText("Agregar Nueva Marca ");
        labelAltaDefinicion1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(labelAltaDefinicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        labelAltaDefinicion4.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion4.setText("Agrega una nueva marca de equipo aqui:");
        labelAltaDefinicion4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        add(labelAltaDefinicion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 570, 30));

        agregarMarcaTXT.setForeground(new java.awt.Color(153, 153, 153));
        agregarMarcaTXT.setText("Ingrese la Marca");
        agregarMarcaTXT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        agregarMarcaTXT.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-más-24.png"))); // NOI18N
        agregarMarcaTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarMarcaTXTMousePressed(evt);
            }
        });
        add(agregarMarcaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 640, 90));

        AgregarL.setBackground(new java.awt.Color(0, 74, 173));
        AgregarL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarL.setForeground(new java.awt.Color(255, 255, 255));
        agregarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarL.setText("AGREGAR");
        agregarL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agregarL.setPreferredSize(new java.awt.Dimension(88, 25));
        agregarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarLMouseExited(evt);
            }
        });
        AgregarL.add(agregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 89));

        add(AgregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 380, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void agregarMarcaTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaTXTMousePressed
        PlaceHonder.placeHolderSimple(agregarMarcaTXT, 1);
    }//GEN-LAST:event_agregarMarcaTXTMousePressed

    private void agregarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLMouseClicked

        if(Validar.validacionSimple(agregarMarcaTXT, 1)){
            
            String marca = agregarMarcaTXT.getText().trim();
            try {
                Connection con = Conectar.conectar();
                PreparedStatement ps = con.prepareStatement(
                "insert into marcas values (?)");
                ps.setString(1, marca);
                int resultado = ps.executeUpdate();
                if(resultado >0){
                    JOptionPane.showMessageDialog(null, "agregado");
                    agregarMarcaTXT.setForeground(new Color(153,153,153));
                    agregarMarcaTXT.setText("Ingrese la Marca");
                }
                con.close();
            } catch (HeadlessException | SQLException e) {
            }
           
        }

    }//GEN-LAST:event_agregarLMouseClicked

    private void agregarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLMouseEntered
        AgregarL.setBackground(new Color(3,88,202));
    }//GEN-LAST:event_agregarLMouseEntered

    private void agregarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLMouseExited
        AgregarL.setBackground(new Color(0, 74, 173));
    }//GEN-LAST:event_agregarLMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.PanelRedondeado AgregarL;
    private componentesVisuales.LabelRedondeada agregarL;
    private componentesVisuales.TextFieldRedondeado agregarMarcaTXT;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion1;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion4;
    // End of variables declaration//GEN-END:variables
}
