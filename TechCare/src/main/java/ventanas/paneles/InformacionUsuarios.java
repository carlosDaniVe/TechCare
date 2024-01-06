package ventanas.paneles;

import clases.Conectar;
import clases.PlaceHonder;
import clases.Validar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import componentesVisuales.ComboBoxHD;
import componentesVisuales.LabelAltaDefinicion;
import componentesVisuales.TextFieldRedondeado;
import ventanas.Login;
import ventanas.RestaurarContraseña;
//--> crar e importar desde ventanas.RestaurarContraseña ;

/**
 *
 * @author Carlos
 */
public class InformacionUsuarios extends javax.swing.JPanel {

    List<TextFieldRedondeado> elementos = new ArrayList<>();
    List<LabelAltaDefinicion> labels = new ArrayList<>();
    List<ComboBoxHD> boxes = new ArrayList<>();

    public static String cedula, usuario;

    public InformacionUsuarios() {
        initComponents();
        
        cedula = GestionDeUsuarios.cedula;
        usuario = Login.user;
        
        llenarElementos();
        
        try {
            
            Connection conexion = Conectar.conectar();
            PreparedStatement ps = conexion.prepareStatement(
                    "select * from usuarios where cedula = '"+cedula+"'");

            ResultSet rsw = ps.executeQuery();
            if(rsw.next()){
                txtNombre.setText(rsw.getString("nombre"));
                txtCedula.setText(rsw.getString("cedula"));
                txtCorreo.setText(rsw.getString("correo"));
                txtTelefono.setText(rsw.getString("telefono"));
                txtUsuario.setText(rsw.getString("username"));
                comboBoxP.setSelectedItem(
                        rsw.getString("nivel"));
                estatus.setSelectedItem(rsw.getString("estatus"));
                registradoPorL.setText(rsw.getString("registrado_por"));
            }
            conexion.close();
            ps.close();
            rsw.close(); 
            
        }catch(NumberFormatException | SQLException e){
            System.out.println("Error en llenar campos en panel InformacionUsuario: "+e);
        }    

       
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new componentesVisuales.TextFieldRedondeado();
        txtCedula = new componentesVisuales.TextFieldRedondeado();
        txtCorreo = new componentesVisuales.TextFieldRedondeado();
        txtTelefono = new componentesVisuales.TextFieldRedondeado();
        txtUsuario = new componentesVisuales.TextFieldRedondeado();
        restaurarP = new componentesVisuales.PanelRedondeado();
        restaurarL = new componentesVisuales.LabelRedondeada();
        tituloNuevoUsuario = new componentesVisuales.LabelAltaDefinicion();
        registradoPor = new componentesVisuales.LabelAltaDefinicion();
        estatusl = new componentesVisuales.LabelAltaDefinicion();
        cedulal = new componentesVisuales.LabelAltaDefinicion();
        correol = new componentesVisuales.LabelAltaDefinicion();
        nombrel = new componentesVisuales.LabelAltaDefinicion();
        nombreUsuariol = new componentesVisuales.LabelAltaDefinicion();
        permisosl = new componentesVisuales.LabelAltaDefinicion();
        actualizarP = new componentesVisuales.PanelRedondeado();
        actualizarL = new componentesVisuales.LabelRedondeada();
        estatus = new componentesVisuales.ComboBoxHD();
        comboBoxP = new componentesVisuales.ComboBoxHD();
        alerta1 = new componentesVisuales.LabelAltaDefinicion();
        alerta2 = new componentesVisuales.LabelAltaDefinicion();
        panelRedondeado1 = new componentesVisuales.PanelRedondeado();
        registradoPorL = new componentesVisuales.LabelAltaDefinicion();
        telefono1 = new componentesVisuales.LabelAltaDefinicion();

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
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 380, 80));

        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setText("Ingrese la Cedula");
        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCedula.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/id24.png"))); // NOI18N
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 380, 80));

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
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 380, 80));

        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ingrese el Telefono");
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTelefono.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/phone24.png"))); // NOI18N
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 380, 80));

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
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 380, 80));

        restaurarP.setBackground(new java.awt.Color(0, 74, 173));

        restaurarL.setForeground(new java.awt.Color(255, 255, 255));
        restaurarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restaurarL.setText("RESTAURAR CONTRASEÑA");
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
            .addGroup(restaurarPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restaurarL, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        restaurarPLayout.setVerticalGroup(
            restaurarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(restaurarL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        add(restaurarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 380, 100));

        tituloNuevoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        tituloNuevoUsuario.setText("Informacion del Usuario");
        tituloNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(tituloNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 370, 60));

        registradoPor.setForeground(new java.awt.Color(51, 51, 51));
        registradoPor.setText("Registrado por :");
        registradoPor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(registradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 140, -1));

        estatusl.setForeground(new java.awt.Color(51, 51, 51));
        estatusl.setText("Estatus");
        estatusl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(estatusl, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 150, -1));

        cedulal.setForeground(new java.awt.Color(51, 51, 51));
        cedulal.setText("Cedula");
        cedulal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(cedulal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, -1));

        correol.setForeground(new java.awt.Color(51, 51, 51));
        correol.setText("Correo");
        correol.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(correol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 70, -1));

        nombrel.setForeground(new java.awt.Color(51, 51, 51));
        nombrel.setText("Nombre");
        nombrel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(nombrel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, -1));

        nombreUsuariol.setForeground(new java.awt.Color(51, 51, 51));
        nombreUsuariol.setText("Nombre de usuario");
        nombreUsuariol.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(nombreUsuariol, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 150, -1));

        permisosl.setForeground(new java.awt.Color(51, 51, 51));
        permisosl.setText("Permisos");
        permisosl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(permisosl, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 150, 30));

        actualizarP.setBackground(new java.awt.Color(0, 74, 173));

        actualizarL.setForeground(new java.awt.Color(255, 255, 255));
        actualizarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarL.setText("ACTUALIZAR");
        actualizarL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        actualizarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actualizarLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout actualizarPLayout = new javax.swing.GroupLayout(actualizarP);
        actualizarP.setLayout(actualizarPLayout);
        actualizarPLayout.setHorizontalGroup(
            actualizarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(actualizarL, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        actualizarPLayout.setVerticalGroup(
            actualizarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        add(actualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 380, 90));

        estatus.setBackground(new java.awt.Color(255, 255, 255));
        estatus.setForeground(new java.awt.Color(51, 51, 51));
        estatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Activo", "Inactivo" }));
        estatus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        estatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                estatusMousePressed(evt);
            }
        });
        add(estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 350, -1));

        comboBoxP.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxP.setForeground(new java.awt.Color(51, 51, 51));
        comboBoxP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Administrador", "Capturista", "Tecnico" }));
        comboBoxP.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        comboBoxP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboBoxPMousePressed(evt);
            }
        });
        add(comboBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 350, 30));

        alerta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alerta1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(alerta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 40, 30));

        alerta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alerta2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(alerta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 40, 30));

        panelRedondeado1.setBackground(new java.awt.Color(102, 102, 102));
        panelRedondeado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registradoPorL.setBackground(new java.awt.Color(255, 255, 255));
        registradoPorL.setText("     Registrado por:");
        registradoPorL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelRedondeado1.add(registradoPorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 60));

        add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 380, 60));

        telefono1.setForeground(new java.awt.Color(51, 51, 51));
        telefono1.setText("Telefono");
        telefono1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void restaurarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurarLMouseEntered
        restaurarP.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_restaurarLMouseEntered

    private void restaurarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurarLMouseExited
        restaurarP.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_restaurarLMouseExited

    private void actualizarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarLMouseEntered
        actualizarP.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_actualizarLMouseEntered

    private void actualizarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarLMouseExited
        actualizarP.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_actualizarLMouseExited

    private void restaurarLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurarLMousePressed
         new RestaurarContraseña().setVisible(true);
    }//GEN-LAST:event_restaurarLMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        PlaceHonder.placeHolderUser(elementos, null,
                1);
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        PlaceHonder.placeHolderUser(elementos, null,
                2);
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        PlaceHonder.placeHolderUser(elementos, null,
                3);
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        PlaceHonder.placeHolderUser(elementos, null,
                4);
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        PlaceHonder.placeHolderUser(elementos, null,
                5);
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void actualizarLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarLMousePressed

        if (Validar.validarUsuarios(elementos, null,
                boxes, labels)) {
            
            String nombre = txtNombre.getText().trim();
            String correo = txtCorreo.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String user = txtUsuario.getText().trim();
            String cedulaId = txtCedula.getText().trim();
            String permisos = String.valueOf(comboBoxP.getSelectedItem());
            String estatus1 = String.valueOf(this.estatus.getSelectedItem());
            

            try {
            Connection conexion2 =  Conectar.conectar();
            PreparedStatement pst = conexion2.prepareStatement(
                    "UPDATE usuarios SET nombre = ?, cedula = ?, correo = ?,"
                            + " telefono = ?, username = ?, nivel = ?, estatus = ?, "
                            + "registrado_por = ? WHERE cedula = '"+cedula+"'");
            
            pst.setString(1, nombre);
            pst.setString(2, cedulaId);
            pst.setString(3, correo);
            pst.setString(4, telefono);
            pst.setString(5, user);
            pst.setString(6, permisos);
            pst.setString(7, estatus1);
            pst.setString(8, usuario);
            cedula = cedulaId;
            
            int resultado = pst.executeUpdate();
            
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }

            conexion2.close();

        } catch (SQLException e) {
            System.out.println("Error en Boton registrar de la clase InformacionUsuarios: " + e);
            
        }

        }
    }//GEN-LAST:event_actualizarLMousePressed

    private void comboBoxPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxPMousePressed
        alerta1.setForeground(Color.red);
        alerta1.setText("");
    }//GEN-LAST:event_comboBoxPMousePressed

    private void estatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estatusMousePressed
        alerta2.setForeground(Color.red);
        alerta2.setText("");
    }//GEN-LAST:event_estatusMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelRedondeada actualizarL;
    private componentesVisuales.PanelRedondeado actualizarP;
    private componentesVisuales.LabelAltaDefinicion alerta1;
    private componentesVisuales.LabelAltaDefinicion alerta2;
    private componentesVisuales.LabelAltaDefinicion cedulal;
    private componentesVisuales.ComboBoxHD comboBoxP;
    private componentesVisuales.LabelAltaDefinicion correol;
    private componentesVisuales.ComboBoxHD estatus;
    private componentesVisuales.LabelAltaDefinicion estatusl;
    private componentesVisuales.LabelAltaDefinicion nombreUsuariol;
    private componentesVisuales.LabelAltaDefinicion nombrel;
    private componentesVisuales.PanelRedondeado panelRedondeado1;
    private componentesVisuales.LabelAltaDefinicion permisosl;
    private componentesVisuales.LabelAltaDefinicion registradoPor;
    private componentesVisuales.LabelAltaDefinicion registradoPorL;
    private componentesVisuales.LabelRedondeada restaurarL;
    private componentesVisuales.PanelRedondeado restaurarP;
    private componentesVisuales.LabelAltaDefinicion telefono1;
    private componentesVisuales.LabelAltaDefinicion tituloNuevoUsuario;
    private componentesVisuales.TextFieldRedondeado txtCedula;
    private componentesVisuales.TextFieldRedondeado txtCorreo;
    private componentesVisuales.TextFieldRedondeado txtNombre;
    private componentesVisuales.TextFieldRedondeado txtTelefono;
    private componentesVisuales.TextFieldRedondeado txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void llenarElementos() {
        elementos.add(txtNombre);
        elementos.add(txtCedula);
        elementos.add(txtCorreo);
        elementos.add(txtTelefono);
        elementos.add(txtUsuario);
        labels.add(alerta1);
        labels.add(alerta2);
        boxes.add(comboBoxP);
        boxes.add(estatus);
    }

    
}
