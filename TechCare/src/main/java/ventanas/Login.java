package ventanas;

import clases.Conectar;
import clases.Fechas;
import clases.PlaceHonder;
import clases.Validar;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Hernandez
 */
public class Login extends javax.swing.JFrame {

    public static String user, ultimoIngreso1;
    int xMouse, yMouse;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);

        labelFoot.setText("TechCare® " + Fechas.fechaDiaMesAñoHora(3));
        labelAcceder.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labelRegistrarse.setCursor(new Cursor(Cursor.HAND_CURSOR));

        try {
            Connection cn = Conectar.conectar();
            PreparedStatement psr = cn.prepareStatement(
                    "SELECT COUNT(*) FROM usuarios WHERE "
                    + "nivel = 'Administrador' AND estatus = 'Activo'");

            ResultSet rsr = psr.executeQuery();

            if (rsr.next()) {
                int c = rsr.getInt(1);

                if (c > 0) {
                    labelRegistrarse.setEnabled(false);
                    labelRegistrarse.setText("");
                    cn.close();
                    psr.close();
                    rsr.close();

                } else {
                    labelRegistrarse.setEnabled(true);
                    labelRegistrarse.setText("Registrarse");
                    cn.close();
                    psr.close();
                    rsr.close();
                }

            } else {
                labelRegistrarse.setEnabled(true);
                labelRegistrarse.setText("Registrarse");
                cn.close();
                psr.close();
                rsr.close();
            }

            cn.close();
            psr.close();
            rsr.close();

        } catch (SQLException e) {
            System.out.println("Error en determinar si existe Administador en la"
                    + " base de datos: ");
            System.out.println(e);
            System.out.println("Clase: Login");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lfondoLoginSuperior = new componentesVisuales.LabelAltaDefinicion();
        panelBarraSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        labelSalir = new componentesVisuales.LabelAltaDefinicion();
        panelMinimizar = new javax.swing.JPanel();
        labelMinimizar = new componentesVisuales.LabelAltaDefinicion();
        panelFondoLogin = new javax.swing.JPanel();
        txtUserLogin = new componentesVisuales.TextFieldRedondeado();
        txtPassLogin = new componentesVisuales.PasswordField();
        panelAcceder = new componentesVisuales.PanelRedondeado();
        labelAcceder = new componentesVisuales.LabelRedondeada();
        labelRegistrarse = new componentesVisuales.LabelRedondeada();
        labelTitulo = new componentesVisuales.LabelRedondeada();
        labelFoot = new componentesVisuales.LabelRedondeada();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lfondoLoginSuperior.setIcono(new javax.swing.ImageIcon(getClass().getResource("/fondoLabelLogin.png"))); // NOI18N
        getContentPane().add(lfondoLoginSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 510, 240));

        panelBarraSuperior.setBackground(new java.awt.Color(0, 74, 173));
        panelBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMouseDragged(evt);
            }
        });
        panelBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraSuperiorMousePressed(evt);
            }
        });
        panelBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSalir.setBackground(new java.awt.Color(0, 74, 173));
        panelSalir.setPreferredSize(new java.awt.Dimension(24, 24));

        labelSalir.setForeground(new java.awt.Color(255, 255, 255));
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("X");
        labelSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelBarraSuperior.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 0, 30, -1));

        panelMinimizar.setBackground(new java.awt.Color(0, 74, 173));
        panelMinimizar.setPreferredSize(new java.awt.Dimension(27, 24));

        labelMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        labelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinimizar.setText("-");
        labelMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        labelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMinimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMinimizarLayout = new javax.swing.GroupLayout(panelMinimizar);
        panelMinimizar.setLayout(panelMinimizarLayout);
        panelMinimizarLayout.setHorizontalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMinimizarLayout.setVerticalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinimizarLayout.createSequentialGroup()
                .addComponent(labelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBarraSuperior.add(panelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 29, -1));

        getContentPane().add(panelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 30));

        panelFondoLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelFondoLogin.setForeground(new java.awt.Color(255, 255, 255));
        panelFondoLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserLogin.setForeground(new java.awt.Color(153, 153, 153));
        txtUserLogin.setText("Ingrese su nombre de usuario");
        txtUserLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtUserLogin.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/2user24.png"))); // NOI18N
        txtUserLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserLoginMousePressed(evt);
            }
        });
        panelFondoLogin.add(txtUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 380, 90));

        txtPassLogin.setForeground(new java.awt.Color(153, 153, 153));
        txtPassLogin.setText("**********");
        txtPassLogin.setA(new javax.swing.ImageIcon(getClass().getResource("/Oculto24.png"))); // NOI18N
        txtPassLogin.setB(new javax.swing.ImageIcon(getClass().getResource("/Visible24.png"))); // NOI18N
        txtPassLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtPassLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassLoginMousePressed(evt);
            }
        });
        panelFondoLogin.add(txtPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 380, 90));

        panelAcceder.setBackground(new java.awt.Color(0, 74, 173));
        panelAcceder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAcceder.setForeground(new java.awt.Color(255, 255, 255));
        labelAcceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAcceder.setText("ACCEDER");
        labelAcceder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelAcceder.setPreferredSize(new java.awt.Dimension(88, 25));
        labelAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAccederMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAccederMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAccederMouseExited(evt);
            }
        });
        panelAcceder.add(labelAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 2, 370, 89));

        panelFondoLogin.add(panelAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 380, 90));

        labelRegistrarse.setForeground(new java.awt.Color(0, 74, 173));
        labelRegistrarse.setText("Registrarse");
        labelRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelRegistrarseMousePressed(evt);
            }
        });
        panelFondoLogin.add(labelRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 275, 110, 30));

        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setText("INICIO DE SESION");
        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        panelFondoLogin.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 190, -1));

        labelFoot.setForeground(new java.awt.Color(0, 74, 173));
        labelFoot.setText("TechCare®");
        labelFoot.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        panelFondoLogin.add(labelFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 140, -1));

        getContentPane().add(panelFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraSuperiorMousePressed

    private void panelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraSuperiorMouseDragged
        int xOnScreem = evt.getXOnScreen();
        int yOnScreem = evt.getYOnScreen();

        this.setLocation(xOnScreem - xMouse, yOnScreem - yMouse);
    }//GEN-LAST:event_panelBarraSuperiorMouseDragged

    private void labelAccederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAccederMouseEntered
        panelAcceder.setBackground(new Color(3, 88, 202));

    }//GEN-LAST:event_labelAccederMouseEntered

    private void labelAccederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAccederMouseExited
        panelAcceder.setBackground(new Color(0, 74, 173));
    }//GEN-LAST:event_labelAccederMouseExited

    private void labelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseEntered
        panelMinimizar.setBackground(new Color(37, 155, 220));
    }//GEN-LAST:event_labelMinimizarMouseEntered

    private void labelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseExited
        panelMinimizar.setBackground(new Color(0, 74, 173));
    }//GEN-LAST:event_labelMinimizarMouseExited

    private void labelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelMinimizarMouseClicked

    private void labelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseEntered
        panelSalir.setBackground(new Color(220, 0, 0));
    }//GEN-LAST:event_labelSalirMouseEntered

    private void labelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseExited
        panelSalir.setBackground(new Color(0, 74, 173));
    }//GEN-LAST:event_labelSalirMouseExited

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelSalirMouseClicked

    private void txtUserLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserLoginMousePressed
        PlaceHonder.placeHolderLogin(txtUserLogin, txtPassLogin, 1);

    }//GEN-LAST:event_txtUserLoginMousePressed

    private void txtPassLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassLoginMousePressed

        PlaceHonder.placeHolderLogin(txtUserLogin, txtPassLogin, 2);

    }//GEN-LAST:event_txtPassLoginMousePressed

    private void labelAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAccederMouseClicked

        if (Validar.validarLogin(txtUserLogin, txtPassLogin)) {
            user = txtUserLogin.getText();
            String password = String.valueOf(txtPassLogin.getPassword());
            
             try {
                Connection cn = Conectar.conectar();
                PreparedStatement ps = cn.prepareStatement(
                        "select ultimoIngreso from usuarios where username = ?");

                ps.setString(1, user);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    ultimoIngreso1 = rs.getString("ultimoIngreso");
                    cn.close();
                    ps.close();
                    rs.close();
                }

            } catch (SQLException e) {
                System.out.println("Error en consultar Ultima sesion " + e);
                System.out.println("Clase Administador");
            }
             
            try {
                Connection conexion = Conectar.conectar();
                PreparedStatement ps = conexion.prepareStatement("select nivel,"
                        + " estatus from usuarios where username = ? and pass = ?");

                ps.setString(1, user);
                ps.setString(2, password);

                ResultSet resultados = ps.executeQuery();

                if (resultados.next()) {
                    String permiso = resultados.getString("nivel");
                    String estatus = resultados.getString("estatus");

                    conexion.close();
                    ps.close();
                    resultados.close();

                    if (permiso.equals("Administrador")) {

                        if (estatus.equals("Activo")) {
                            
                            new Administrador().setVisible(true);
                            this.dispose();

                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario inactivo");
                        }

                    } else if (permiso.equals("Capturista")) {

                        if (estatus.equals("Activo")) {
                             new Capturista().setVisible(true);
                             this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario inactivo");
                        }

                    } else if (permiso.equals("Tecnico")) {

                        if (estatus.equals("Activo")) {
                            //Hacer new Tecnico().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario inactivo");
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrecto");
                }

            } catch (HeadlessException | SQLException e) {
                System.out.println("Errro en el Boton Acceder de  la clase Login: " + e);
            }
        }

    }//GEN-LAST:event_labelAccederMouseClicked

    private void labelRegistrarseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarseMousePressed
        new RegistrarAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelRegistrarseMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelRedondeada labelAcceder;
    private componentesVisuales.LabelRedondeada labelFoot;
    private componentesVisuales.LabelAltaDefinicion labelMinimizar;
    private componentesVisuales.LabelRedondeada labelRegistrarse;
    private componentesVisuales.LabelAltaDefinicion labelSalir;
    private componentesVisuales.LabelRedondeada labelTitulo;
    private componentesVisuales.LabelAltaDefinicion lfondoLoginSuperior;
    private componentesVisuales.PanelRedondeado panelAcceder;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JPanel panelFondoLogin;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelSalir;
    private componentesVisuales.PasswordField txtPassLogin;
    private componentesVisuales.TextFieldRedondeado txtUserLogin;
    // End of variables declaration//GEN-END:variables

}
