package ventanas;

import clases.Conectar;
import clases.PlaceHonder;
import clases.Validar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import componentesVisuales.TextFieldRedondeado;

/**
 *
 * @author Carlos Hernandez
 */
public class RegistrarAdministrador extends javax.swing.JFrame {

    List<TextFieldRedondeado> elementos = new ArrayList<>();
    int xmouse, ymouse;

    public RegistrarAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarElementos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new componentesVisuales.TextFieldRedondeado();
        txtCedula = new componentesVisuales.TextFieldRedondeado();
        txtCorreo = new componentesVisuales.TextFieldRedondeado();
        txtTelefono = new componentesVisuales.TextFieldRedondeado();
        passtxt = new componentesVisuales.PasswordField();
        txtUsuario = new componentesVisuales.TextFieldRedondeado();
        panelRegistar = new componentesVisuales.PanelRedondeado();
        labelRegistrar = new componentesVisuales.LabelRedondeada();
        tituloNuevoUsuario = new componentesVisuales.LabelAltaDefinicion();
        panelSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        labelSalir1 = new componentesVisuales.LabelAltaDefinicion();
        panelOcultar = new javax.swing.JPanel();
        labelOcultar = new componentesVisuales.LabelAltaDefinicion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese el Nombre");
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtNombre.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/2user24.png"))); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 380, 80));

        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setText("Ingrese la Cedula");
        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCedula.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/id24.png"))); // NOI18N
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 380, 80));

        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setText("Ingrese el Correo");
        txtCorreo.setToolTipText("");
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCorreo.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/email24.png"))); // NOI18N
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 380, 80));

        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ingrese el Telefono");
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTelefono.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/phone24.png"))); // NOI18N
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 380, 80));

        passtxt.setForeground(new java.awt.Color(153, 153, 153));
        passtxt.setText("**********");
        passtxt.setA(new javax.swing.ImageIcon(getClass().getResource("/Oculto24.png"))); // NOI18N
        passtxt.setB(new javax.swing.ImageIcon(getClass().getResource("/Visible24.png"))); // NOI18N
        passtxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        jPanel1.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 380, 80));

        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Nombre de Usuario");
        txtUsuario.setToolTipText("");
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtUsuario.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/at.png"))); // NOI18N
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 380, 80));

        panelRegistar.setBackground(new java.awt.Color(0, 74, 173));

        labelRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegistrar.setText("REGISTRAR");
        labelRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRegistrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelRegistrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistarLayout = new javax.swing.GroupLayout(panelRegistar);
        panelRegistar.setLayout(panelRegistarLayout);
        panelRegistarLayout.setHorizontalGroup(
            panelRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegistarLayout.setVerticalGroup(
            panelRegistarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel1.add(panelRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 380, 90));

        tituloNuevoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        tituloNuevoUsuario.setText("Registro de Nuevo Administrador");
        tituloNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jPanel1.add(tituloNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 460, 60));

        panelSuperior.setBackground(new java.awt.Color(0, 74, 173));
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

        panelSalir.setBackground(new java.awt.Color(0, 73, 173));
        panelSalir.setPreferredSize(new java.awt.Dimension(31, 30));

        labelSalir1.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(labelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSuperior.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, -1));

        panelOcultar.setBackground(new java.awt.Color(0, 73, 173));
        panelOcultar.setPreferredSize(new java.awt.Dimension(32, 30));

        labelOcultar.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(labelOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelOcultarLayout.setVerticalGroup(
            panelOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOcultarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSuperior.add(panelOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        jPanel1.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 1);

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 2);

    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 3);

    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 4);

    }//GEN-LAST:event_txtTelefonoMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 6);

    }//GEN-LAST:event_passtxtMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 5);

    }//GEN-LAST:event_txtUsuarioMousePressed

    private void labelRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarMouseEntered
        panelRegistar.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_labelRegistrarMouseEntered

    private void labelRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarMouseExited
        panelRegistar.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_labelRegistrarMouseExited

    private void labelRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarMousePressed

        if (Validar.validarUsuarios(elementos, passtxt, null, null)) {
            String nombre = txtNombre.getText().trim();
            String cedula = txtCedula.getText().trim();
            String correo = txtCorreo.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String usuario = txtUsuario.getText().trim();
            String contraseña = String.valueOf(passtxt.getPassword());
            String permiso = "Administrador";
            String estatus = "Activo";
            String registrado = txtUsuario.getText().trim();

            try {
                Connection conexion = Conectar.conectar();
                PreparedStatement ps = conexion.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1, nombre);
                ps.setString(2, cedula);
                ps.setString(3, correo);
                ps.setString(4, telefono);
                ps.setString(5, usuario);
                ps.setString(6, contraseña);
                ps.setString(7, permiso);
                ps.setString(8, estatus);
                ps.setString(9, registrado);
                ps.setString(10, "Sin Historial");

                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                }

                conexion.close();
                ps.close();

            } catch (SQLException e) {
                System.out.println("Error en Boton registrar de la clase RegistrarAdministrador: " + e);
            }

            this.dispose();
            new Login().setVisible(true);

        }

    }//GEN-LAST:event_labelRegistrarMousePressed


    private void labelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_labelSalir1MouseClicked

    private void labelSalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseEntered
        panelSalir.setBackground(new Color(215, 0, 0));
        labelSalir1.setForeground(Color.white);
    }//GEN-LAST:event_labelSalir1MouseEntered

    private void labelSalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseExited
        panelSalir.setBackground(new Color(0, 73, 173));
        labelSalir1.setForeground(Color.white);
    }//GEN-LAST:event_labelSalir1MouseExited

    private void labelOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelOcultarMouseClicked

    private void labelOcultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseEntered
        panelOcultar.setBackground(new Color(255, 255, 255));
        labelOcultar.setForeground(Color.black);
    }//GEN-LAST:event_labelOcultarMouseEntered

    private void labelOcultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseExited
        panelOcultar.setBackground(new Color(0, 73, 173));
        labelOcultar.setForeground(Color.white);
    }//GEN-LAST:event_labelOcultarMouseExited

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int xOnSreen = evt.getXOnScreen();
        int yOnScreen = evt.getYOnScreen();

        this.setLocation(xOnSreen - xmouse, yOnScreen - ymouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

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
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private componentesVisuales.LabelAltaDefinicion labelOcultar;
    private componentesVisuales.LabelRedondeada labelRegistrar;
    private componentesVisuales.LabelAltaDefinicion labelSalir1;
    private javax.swing.JPanel panelOcultar;
    private componentesVisuales.PanelRedondeado panelRegistar;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelSuperior;
    private componentesVisuales.PasswordField passtxt;
    private componentesVisuales.LabelAltaDefinicion tituloNuevoUsuario;
    private componentesVisuales.TextFieldRedondeado txtCedula;
    private componentesVisuales.TextFieldRedondeado txtCorreo;
    private componentesVisuales.TextFieldRedondeado txtNombre;
    private componentesVisuales.TextFieldRedondeado txtTelefono;
    private componentesVisuales.TextFieldRedondeado txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void llevarLista(List<String> lista, String nombre, String cedula,
            String correo, String telefono, String usuario, String contraseña,
            String permiso, String estatus, String registrado) {

        lista.add(nombre);
        lista.add(cedula);
        lista.add(correo);
        lista.add(telefono);
        lista.add(usuario);
        lista.add(contraseña);
        lista.add(permiso);
        lista.add(estatus);
        lista.add(registrado);
    }

    private void llenarElementos() {
        elementos.add(txtNombre);
        elementos.add(txtCedula);
        elementos.add(txtCorreo);
        elementos.add(txtTelefono);
        elementos.add(txtUsuario);

    }

}
