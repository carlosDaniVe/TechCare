package ventanas.paneles;

import clases.Conectar;
import clases.PlaceHonder;
import clases.Validar;
import componentesVisuales.ComboBoxHD;
import componentesVisuales.LabelAltaDefinicion;
import componentesVisuales.TextFieldRedondeado;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ventanas.Login;

/**
 *
 * @author Carlos
 */
public class RegistroDeUsuarios extends javax.swing.JPanel {

    List<TextFieldRedondeado> elementos = new ArrayList<>();
    List<LabelAltaDefinicion> labels = new ArrayList<>();
    List<ComboBoxHD> boxes = new ArrayList<>();
    String usuarioL;

    public RegistroDeUsuarios() {
        initComponents();
        llenarElementos();
        usuarioL = Login.user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new componentesVisuales.TextFieldRedondeado();
        passtxt = new componentesVisuales.PasswordField();
        tituloNuevoUsuario = new componentesVisuales.LabelAltaDefinicion();
        txtCedula = new componentesVisuales.TextFieldRedondeado();
        txtCorreo = new componentesVisuales.TextFieldRedondeado();
        txtTelefono = new componentesVisuales.TextFieldRedondeado();
        txtUsuario = new componentesVisuales.TextFieldRedondeado();
        comboBoxP1 = new componentesVisuales.ComboBoxHD();
        permisosl = new componentesVisuales.LabelAltaDefinicion();
        panelRegistar = new componentesVisuales.PanelRedondeado();
        labelRegistrar = new componentesVisuales.LabelRedondeada();
        alertaLa = new componentesVisuales.LabelAltaDefinicion();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese el Nombre");
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtNombre.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/2user24.png"))); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 380, 80));

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
        add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 380, 80));

        tituloNuevoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        tituloNuevoUsuario.setText("Registro de Nuevo Usuario");
        tituloNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(tituloNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 370, 60));

        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setText("Ingrese la Cedula");
        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCedula.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/id24.png"))); // NOI18N
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 380, 80));

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
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 380, 80));

        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ingrese el Telefono");
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTelefono.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/phone24.png"))); // NOI18N
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 380, 80));

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
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 380, 80));

        comboBoxP1.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxP1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboBoxP1.setForeground(new java.awt.Color(51, 51, 51));
        comboBoxP1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona", "Administrador", "Capturista", "Tecnico" }));
        comboBoxP1.setFocusable(false);
        comboBoxP1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboBoxP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboBoxP1MousePressed(evt);
            }
        });
        add(comboBoxP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 370, 70));

        permisosl.setForeground(new java.awt.Color(51, 51, 51));
        permisosl.setText("Permisos");
        permisosl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(permisosl, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 150, 30));

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

        add(panelRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        alertaLa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaLa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(alertaLa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 1);
    }//GEN-LAST:event_txtNombreMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 6);
    }//GEN-LAST:event_passtxtMousePressed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 2);
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 3);
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 4);
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed

        PlaceHonder.placeHolderUser(elementos, passtxt, 5);
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void comboBoxP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxP1MousePressed
        alertaLa.setForeground(Color.red);
        alertaLa.setText("");
    }//GEN-LAST:event_comboBoxP1MousePressed

    private void labelRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarMouseEntered
        panelRegistar.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_labelRegistrarMouseEntered

    private void labelRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarMouseExited
        panelRegistar.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_labelRegistrarMouseExited

    private void labelRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarMousePressed

        if (Validar.validarUsuarios(elementos, passtxt, boxes, labels)) {
            String nombre = txtNombre.getText().trim();
            String cedula = txtCedula.getText().trim();
            String correo = txtCorreo.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String usuario1 = txtUsuario.getText().trim();
            String contraseña = String.valueOf(passtxt.getPassword());
            String permisos = String.valueOf(comboBoxP1.getSelectedItem());

            try {
                Connection conexion = Conectar.conectar();
                PreparedStatement ps = conexion.prepareStatement(
                        "select username, cedula from usuarios where username = ? and cedula = ?");

                ps.setString(1, usuario1);
                ps.setString(2, cedula);
                
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    String verificarUsuario = rs.getString("username");
                    String verificarCedula = rs.getString("cedula");

                    conexion.close();
                    ps.close();
                    rs.close();

                    if (!verificarUsuario.isEmpty()) {
                        txtUsuario.setForeground(Color.red);
                    }
                    if (!verificarCedula.isEmpty()) {
                        txtCedula.setForeground(Color.red);
                    }

                    JOptionPane.showMessageDialog(null, "Nombre de usuarui o Cedula no disponibles");
                } else {
                    PreparedStatement ps2 = conexion.prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?,?)");

                    ps2.setString(1, nombre);
                    ps2.setString(2, cedula);
                    ps2.setString(3, correo);
                    ps2.setString(4, telefono);
                    ps2.setString(5, usuario1);
                    ps2.setString(6, contraseña);
                    ps2.setString(7, permisos);
                    ps2.setString(8, "Activo");
                    ps2.setString(9, usuarioL);
                    ps2.setString(10, "Sin Historial");

                    int resultado = ps2.executeUpdate();
                    conexion.close();
                    ps2.close();
                    if (resultado > 0) {
                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                    }

                   

                }
            } catch (SQLException e) {
                System.out.println("Error en Boton registrar de la clase RegistrarAdministrador: " + e);
            }

            limpiar();
        }

    }//GEN-LAST:event_labelRegistrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion alertaLa;
    private componentesVisuales.ComboBoxHD comboBoxP1;
    private componentesVisuales.LabelRedondeada labelRegistrar;
    private componentesVisuales.PanelRedondeado panelRegistar;
    private componentesVisuales.PasswordField passtxt;
    private componentesVisuales.LabelAltaDefinicion permisosl;
    private componentesVisuales.LabelAltaDefinicion tituloNuevoUsuario;
    private componentesVisuales.TextFieldRedondeado txtCedula;
    private componentesVisuales.TextFieldRedondeado txtCorreo;
    private componentesVisuales.TextFieldRedondeado txtNombre;
    private componentesVisuales.TextFieldRedondeado txtTelefono;
    private componentesVisuales.TextFieldRedondeado txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtNombre.setForeground(new Color(153, 153, 153));
        txtCedula.setForeground(new Color(153, 153, 153));
        txtCorreo.setForeground(new Color(153, 153, 153));
        txtTelefono.setForeground(new Color(153, 153, 153));
        passtxt.setForeground(new Color(153, 153, 153));
        txtUsuario.setForeground(new Color(153, 153, 153));
        txtNombre.setText("Ingrese el Nombre");
        txtCedula.setText("Ingrese la Cedula");
        txtCorreo.setText("Ingrese el Correo");
        txtTelefono.setText("Ingrese el Telefono");
        txtUsuario.setText("Nombre de Usuario");
        passtxt.setText("**********");
        comboBoxP1.setSelectedIndex(0);
    }

    private void llenarElementos() {
        elementos.add(txtNombre);
        elementos.add(txtCedula);
        elementos.add(txtCorreo);
        elementos.add(txtTelefono);
        elementos.add(txtUsuario);
        labels.add(alertaLa);
        boxes.add(comboBoxP1);
        boxes.add(null);

    }
}