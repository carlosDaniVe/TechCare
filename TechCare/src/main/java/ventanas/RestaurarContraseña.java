package ventanas;

import clases.Conectar;
import clases.PlaceHonder;
import clases.Validar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ventanas.paneles.InformacionUsuarios;

/**
 *
 * @author Carlos Hernandez
 */
public class RestaurarContraseña extends javax.swing.JFrame {

    int xmouse, ymouse;
    String cedula;

    public RestaurarContraseña() {
        initComponents();
        this.setLocationRelativeTo(null);
        cedula = InformacionUsuarios.cedula;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confirmePassL = new componentesVisuales.LabelAltaDefinicion();
        confirmePassTXT = new componentesVisuales.PasswordField();
        usuarioL = new componentesVisuales.LabelAltaDefinicion();
        nuevaPassTXT = new componentesVisuales.PasswordField();
        titulo = new componentesVisuales.LabelAltaDefinicion();
        nuevaPassL = new componentesVisuales.LabelAltaDefinicion();
        restaurarP = new componentesVisuales.PanelRedondeado();
        restaurarL = new componentesVisuales.LabelRedondeada();
        panelSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        labelSalir1 = new componentesVisuales.LabelAltaDefinicion();
        panelOcultar = new javax.swing.JPanel();
        labelOcultar = new componentesVisuales.LabelAltaDefinicion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmePassL.setForeground(new java.awt.Color(51, 51, 51));
        confirmePassL.setText("Confirme la Contraseña");
        confirmePassL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(confirmePassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, -1));

        confirmePassTXT.setForeground(new java.awt.Color(153, 153, 153));
        confirmePassTXT.setText("**********");
        confirmePassTXT.setA(new javax.swing.ImageIcon(getClass().getResource("/Oculto24.png"))); // NOI18N
        confirmePassTXT.setB(new javax.swing.ImageIcon(getClass().getResource("/Visible24.png"))); // NOI18N
        confirmePassTXT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        confirmePassTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmePassTXTMousePressed(evt);
            }
        });
        jPanel1.add(confirmePassTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 380, 80));

        usuarioL.setForeground(new java.awt.Color(51, 51, 51));
        usuarioL.setText("Usuario: ");
        usuarioL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(usuarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, -1));

        nuevaPassTXT.setForeground(new java.awt.Color(153, 153, 153));
        nuevaPassTXT.setText("**********");
        nuevaPassTXT.setA(new javax.swing.ImageIcon(getClass().getResource("/Oculto24.png"))); // NOI18N
        nuevaPassTXT.setB(new javax.swing.ImageIcon(getClass().getResource("/Visible24.png"))); // NOI18N
        nuevaPassTXT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nuevaPassTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevaPassTXTMousePressed(evt);
            }
        });
        jPanel1.add(nuevaPassTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 380, 80));

        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Cambio de Contraseña");
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 320, 60));

        nuevaPassL.setForeground(new java.awt.Color(51, 51, 51));
        nuevaPassL.setText("Nueva Contraseña");
        nuevaPassL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(nuevaPassL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 150, -1));

        restaurarP.setBackground(new java.awt.Color(0, 74, 173));

        restaurarL.setForeground(new java.awt.Color(255, 255, 255));
        restaurarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restaurarL.setText("RESTAURAR");
        restaurarL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restaurarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restaurarLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restaurarLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restaurarLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout restaurarPLayout = new javax.swing.GroupLayout(restaurarP);
        restaurarP.setLayout(restaurarPLayout);
        restaurarPLayout.setHorizontalGroup(
            restaurarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restaurarPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restaurarL, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        restaurarPLayout.setVerticalGroup(
            restaurarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(restaurarL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(restaurarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 270, 80));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        panelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseDragged(evt);
            }
        });
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperiorMousePressed(evt);
            }
        });
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));
        panelSalir.setPreferredSize(new java.awt.Dimension(31, 30));

        labelSalir1.setForeground(new java.awt.Color(0, 0, 0));
        labelSalir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir1.setText("X");
        labelSalir1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSalir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSalir1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addComponent(labelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSuperior.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        panelOcultar.setBackground(new java.awt.Color(255, 255, 255));
        panelOcultar.setPreferredSize(new java.awt.Dimension(32, 30));

        labelOcultar.setForeground(new java.awt.Color(0, 0, 0));
        labelOcultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOcultar.setText("-");
        labelOcultar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelOcultar.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        labelOcultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelOcultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        labelOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOcultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOcultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOcultarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOcultarLayout = new javax.swing.GroupLayout(panelOcultar);
        panelOcultar.setLayout(panelOcultarLayout);
        panelOcultarLayout.setHorizontalGroup(
            panelOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOcultarLayout.createSequentialGroup()
                .addComponent(labelOcultar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOcultarLayout.setVerticalGroup(
            panelOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOcultarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSuperior.add(panelOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 0, -1, -1));

        jPanel1.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restaurarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurarLMouseEntered
        restaurarP.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_restaurarLMouseEntered

    private void restaurarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurarLMouseExited
        restaurarP.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_restaurarLMouseExited

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int xOnSreen = evt.getXOnScreen();
        int yOnScreen = evt.getYOnScreen();

        this.setLocation(xOnSreen - xmouse, yOnScreen - ymouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void labelSalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseExited
        panelSalir.setBackground(new Color(255, 255, 255));
        labelSalir1.setForeground(Color.black);
    }//GEN-LAST:event_labelSalir1MouseExited

    private void labelSalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseEntered
        panelSalir.setBackground(new Color(220, 0, 0));
        labelSalir1.setForeground(Color.white);
    }//GEN-LAST:event_labelSalir1MouseEntered

    private void labelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseClicked
        this.dispose();
    }//GEN-LAST:event_labelSalir1MouseClicked

    private void labelOcultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseExited
        panelOcultar.setBackground(new Color(255, 255, 255));
        labelOcultar.setForeground(Color.black);
    }//GEN-LAST:event_labelOcultarMouseExited

    private void labelOcultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseEntered
        panelOcultar.setBackground(new Color(0, 153, 204));
        labelOcultar.setForeground(Color.white);
    }//GEN-LAST:event_labelOcultarMouseEntered

    private void labelOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelOcultarMouseClicked

    private void restaurarLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurarLMousePressed

        if (Validar.validarRestaurarContraseña(nuevaPassTXT, confirmePassTXT)) {

            String nuevaContraseña = String.valueOf(nuevaPassTXT.getPassword()).trim();
            String confirmaContraseña = String.valueOf(confirmePassTXT.getPassword()).trim();

            if (nuevaContraseña.equals(confirmaContraseña)) {

                try {
                    Connection cn = Conectar.conectar();
                    PreparedStatement ps = cn.prepareStatement(
                            "update usuarios set pass = ? where cedula = '"+ cedula+"'");
                    
                    ps.setString(1,nuevaContraseña);
                    int resultado = ps.executeUpdate();
                    
                    if(resultado > 0){
                        JOptionPane.showMessageDialog(null, "Restaurada Exitosamente");
                    
                    }
                    this.dispose();
                } catch (SQLException e) {
                    System.out.println("Error en restaurar contraseña: " +e);
                }

            } else {
              JOptionPane.showMessageDialog(null, "No coinciden");
            }
        }
    }//GEN-LAST:event_restaurarLMousePressed

    private void nuevaPassTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaPassTXTMousePressed
        PlaceHonder.placeHolderRestaurarContraseña(nuevaPassTXT,
                confirmePassTXT, 1);
    }//GEN-LAST:event_nuevaPassTXTMousePressed

    private void confirmePassTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmePassTXTMousePressed
        PlaceHonder.placeHolderRestaurarContraseña(nuevaPassTXT,
                confirmePassTXT, 2);
    }//GEN-LAST:event_confirmePassTXTMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion confirmePassL;
    private componentesVisuales.PasswordField confirmePassTXT;
    private javax.swing.JPanel jPanel1;
    private componentesVisuales.LabelAltaDefinicion labelOcultar;
    private componentesVisuales.LabelAltaDefinicion labelSalir1;
    private componentesVisuales.LabelAltaDefinicion nuevaPassL;
    private componentesVisuales.PasswordField nuevaPassTXT;
    private javax.swing.JPanel panelOcultar;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelSuperior;
    private componentesVisuales.LabelRedondeada restaurarL;
    private componentesVisuales.PanelRedondeado restaurarP;
    private componentesVisuales.LabelAltaDefinicion titulo;
    private componentesVisuales.LabelAltaDefinicion usuarioL;
    // End of variables declaration//GEN-END:variables
}
