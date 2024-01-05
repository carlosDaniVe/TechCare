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
public class AgregarTipo extends javax.swing.JPanel {

   
    public AgregarTipo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAltaDefinicion2 = new componentesVisuales.LabelAltaDefinicion();
        AgregarL = new componentesVisuales.PanelRedondeado();
        agregarL = new componentesVisuales.LabelRedondeada();
        agregarTipoTXT = new componentesVisuales.TextFieldRedondeado();
        labelAltaDefinicion1 = new componentesVisuales.LabelAltaDefinicion();
        labelAltaDefinicion4 = new componentesVisuales.LabelAltaDefinicion();
        labelAltaDefinicion5 = new componentesVisuales.LabelAltaDefinicion();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAltaDefinicion2.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion2.setText("son portátiles y las impresoras convierten documentos digitales en papel físico.");
        labelAltaDefinicion2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(labelAltaDefinicion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 179, 940, -1));

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

        add(AgregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 380, 90));

        agregarTipoTXT.setForeground(new java.awt.Color(153, 153, 153));
        agregarTipoTXT.setText("Ingrese el Tipo de Equipo");
        agregarTipoTXT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        agregarTipoTXT.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-más-24.png"))); // NOI18N
        agregarTipoTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarTipoTXTMousePressed(evt);
            }
        });
        add(agregarTipoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 630, 90));

        labelAltaDefinicion1.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion1.setText("Agregar Nuevo Tipo de Equipo");
        labelAltaDefinicion1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(labelAltaDefinicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        labelAltaDefinicion4.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion4.setText("“El tipo de equipo” se refiere a la categoría de un dispositivo electrónico, como laptops, desktops o impresoras,  ");
        labelAltaDefinicion4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(labelAltaDefinicion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 940, -1));

        labelAltaDefinicion5.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion5.setText("basándose en su diseño y funcionalidad. Cada tipo tiene usos y aplicaciones específicas. Por ejemplo, las laptops ");
        labelAltaDefinicion5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(labelAltaDefinicion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 940, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void agregarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLMouseClicked

        if(Validar.validacionSimple(agregarTipoTXT, 2)){
            
            String tipo = agregarTipoTXT.getText().trim();
            try{
               Connection cn = Conectar.conectar();
                PreparedStatement ps = cn.prepareStatement(
                "insert into tipos values (?)");
                ps.setString(1, tipo);
                int resultado = ps.executeUpdate();
                if(resultado > 0 ){
                    JOptionPane.showMessageDialog(null, "Agregado");
                    agregarTipoTXT.setForeground(new Color(153,153,153));
                    agregarTipoTXT.setText("Ingrese el Tipo de Equipo");
                }
                cn.close();
            }catch(HeadlessException | SQLException e){
                System.out.println("Error en agregar tipo en la bd: "+e);
            }
            
        }
        

    }//GEN-LAST:event_agregarLMouseClicked

    private void agregarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLMouseEntered
        AgregarL.setBackground(new Color(3,88,202));

    }//GEN-LAST:event_agregarLMouseEntered

    private void agregarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLMouseExited
        AgregarL.setBackground(new Color(0, 74, 173));
    }//GEN-LAST:event_agregarLMouseExited

    private void agregarTipoTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTipoTXTMousePressed
       PlaceHonder.placeHolderSimple(agregarTipoTXT, 2);
    }//GEN-LAST:event_agregarTipoTXTMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.PanelRedondeado AgregarL;
    private componentesVisuales.LabelRedondeada agregarL;
    private componentesVisuales.TextFieldRedondeado agregarTipoTXT;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion1;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion2;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion4;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion5;
    // End of variables declaration//GEN-END:variables
}
