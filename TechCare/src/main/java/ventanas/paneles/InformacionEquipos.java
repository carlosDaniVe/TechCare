package ventanas.paneles;

import clases.Conectar;
import clases.Fechas;
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
import componentesVisuales.ScrollBar;
import componentesVisuales.TextFieldRedondeado;
import java.awt.HeadlessException;
import ventanas.Login;

/**
 *
 * @author Carlos Hernandez
 */
public class InformacionEquipos extends javax.swing.JPanel {

    List<TextFieldRedondeado> elementos = new ArrayList<>();
    List<ComboBoxHD> boxes = new ArrayList<>();
    List<LabelAltaDefinicion> label = new ArrayList<>();

    String cliente, cedula1, user, query;
    int id;

    public InformacionEquipos(int id, int bandera) {
        this.id = id;
        initComponents();
        spComentario.setVerticalScrollBar(new ScrollBar());
        spDaños.setVerticalScrollBar(new ScrollBar());
        txaComentarios.setLineWrap(true);
        txaDaños.setLineWrap(true);

        cedula1 = InformacionCliente.cedula;
        user = Login.user;
        cliente = InformacionCliente.cliente;
        

        if (bandera == 2) {

            try {
                Connection conexion = Conectar.conectar();
                PreparedStatement ps = conexion.prepareStatement(
                        "select cedulaCliente from equipos where id = ?");

                ps.setString(1, String.valueOf(id));

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    cliente = rs.getString("cedulaCliente");
                }
                conexion.close();
                rs.close();
                ps.close();
            } catch (SQLException e) {
                System.out.println("Error en colsultar cedula: " + e);
            }
        }
        
        labelCliente3.setText("Cliente: " + cliente);
        
        if (bandera == 1) {
            query = "select * from equipos where cedulaCliente = '" + cedula1+ "' "
                    + "and id = '" +id+"'";
        } else if (bandera == 2) {
            query = "select * from equipos where id = '" + id + "'";
        }
        llenarCombobox();

        try {
            Connection cn = Conectar.conectar();
            PreparedStatement ps = cn.prepareStatement(
                    query);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                tipo.setSelectedItem(rs.getString("tipo"));
                marca.setSelectedItem(rs.getString("marca"));
                txtModelo.setText(rs.getString("modelo"));
                txtNumeroSerie.setText(rs.getString("serie"));
                ultimoMoL.setText("Ultimo en Modificar: " + rs.getString("ultimo"));
                fechaIngresoL.setText("Fecha de Ingreso: " + rs.getString("fechaIngreso"));
                ultimaM.setText("Ultima Modificacion: " + rs.getString("ultimaFecha"));
                cbxEstatus.setSelectedItem(rs.getString("estatus"));
                txaDaños.setText(rs.getString("observaciones"));
                txaComentarios.setText(rs.getString("comentariosTecnicos"));
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        llenarElementos();
    }

    private void llenarElementos() {
        elementos.add(txtModelo);
        elementos.add(txtNumeroSerie);
        boxes.add(tipo);
        boxes.add(marca);
        boxes.add(cbxEstatus);
        label.add(alertaTipo);
        label.add(alertaMarca);
        label.add(alertaEstatus);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechaIngresop = new componentesVisuales.PanelRedondeado();
        fechaIngresoL = new componentesVisuales.LabelAltaDefinicion();
        tipo = new componentesVisuales.ComboBoxHD();
        marca = new componentesVisuales.ComboBoxHD();
        txtModelo = new componentesVisuales.TextFieldRedondeado();
        txtNumeroSerie = new componentesVisuales.TextFieldRedondeado();
        ultimoModi = new componentesVisuales.PanelRedondeado();
        ultimoMoL = new componentesVisuales.LabelAltaDefinicion();
        cbxEstatus = new componentesVisuales.ComboBoxHD();
        ultimaMf = new componentesVisuales.PanelRedondeado();
        ultimaM = new componentesVisuales.LabelAltaDefinicion();
        estatusl = new componentesVisuales.LabelAltaDefinicion();
        panelCliente3 = new componentesVisuales.PanelRedondeado();
        labelCliente3 = new componentesVisuales.LabelAltaDefinicion();
        spComentario = new javax.swing.JScrollPane();
        txaComentarios = new javax.swing.JTextArea();
        spDaños = new javax.swing.JScrollPane();
        txaDaños = new javax.swing.JTextArea();
        registrarEquipods = new componentesVisuales.PanelRedondeado();
        registrar = new componentesVisuales.LabelAltaDefinicion();
        dañosRl = new componentesVisuales.LabelAltaDefinicion();
        comentariosTL = new componentesVisuales.LabelAltaDefinicion();
        labelAltaDefinicion1 = new componentesVisuales.LabelAltaDefinicion();
        dañosRl1 = new componentesVisuales.LabelAltaDefinicion();
        Modelo = new componentesVisuales.LabelAltaDefinicion();
        alertaMarca = new componentesVisuales.LabelAltaDefinicion();
        alertaTipo = new componentesVisuales.LabelAltaDefinicion();
        alertaEstatus = new componentesVisuales.LabelAltaDefinicion();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaIngresop.setBackground(new java.awt.Color(102, 102, 102));
        fechaIngresop.setPreferredSize(new java.awt.Dimension(380, 80));

        fechaIngresoL.setForeground(new java.awt.Color(255, 255, 255));
        fechaIngresoL.setText("Fecha de Ingreso:");
        fechaIngresoL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout fechaIngresopLayout = new javax.swing.GroupLayout(fechaIngresop);
        fechaIngresop.setLayout(fechaIngresopLayout);
        fechaIngresopLayout.setHorizontalGroup(
            fechaIngresopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fechaIngresopLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(fechaIngresoL, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        fechaIngresopLayout.setVerticalGroup(
            fechaIngresopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fechaIngresopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechaIngresoL, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(fechaIngresop, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 380, 60));

        tipo.setBackground(new java.awt.Color(255, 255, 255));
        tipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tipo.setForeground(new java.awt.Color(51, 51, 51));
        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Equipo", "1" }));
        tipo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tipoMousePressed(evt);
            }
        });
        add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 380, 50));

        marca.setBackground(new java.awt.Color(255, 255, 255));
        marca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        marca.setForeground(new java.awt.Color(51, 51, 51));
        marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca", "1" }));
        marca.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                marcaMousePressed(evt);
            }
        });
        add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 380, 50));

        txtModelo.setForeground(new java.awt.Color(153, 153, 153));
        txtModelo.setText("Modelo");
        txtModelo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtModeloMousePressed(evt);
            }
        });
        add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 380, 80));

        txtNumeroSerie.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroSerie.setText("Numero de Serie");
        txtNumeroSerie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumeroSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroSerieMousePressed(evt);
            }
        });
        add(txtNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 380, 80));

        ultimoModi.setBackground(new java.awt.Color(102, 102, 102));
        ultimoModi.setPreferredSize(new java.awt.Dimension(380, 80));

        ultimoMoL.setForeground(new java.awt.Color(255, 255, 255));
        ultimoMoL.setText("Ultimo en Modificar: ");
        ultimoMoL.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout ultimoModiLayout = new javax.swing.GroupLayout(ultimoModi);
        ultimoModi.setLayout(ultimoModiLayout);
        ultimoModiLayout.setHorizontalGroup(
            ultimoModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ultimoModiLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(ultimoMoL, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ultimoModiLayout.setVerticalGroup(
            ultimoModiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimoModiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ultimoMoL, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(ultimoModi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 380, 60));

        cbxEstatus.setBackground(new java.awt.Color(255, 255, 255));
        cbxEstatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbxEstatus.setForeground(new java.awt.Color(51, 51, 51));
        cbxEstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Nuevo Ingreso", "En Revision", "Reparado", "No Reparado", "Entregado" }));
        cbxEstatus.setFocusable(false);
        cbxEstatus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbxEstatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxEstatusMousePressed(evt);
            }
        });
        add(cbxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 380, 40));

        ultimaMf.setBackground(new java.awt.Color(102, 102, 102));
        ultimaMf.setPreferredSize(new java.awt.Dimension(380, 80));

        ultimaM.setForeground(new java.awt.Color(255, 255, 255));
        ultimaM.setText("Ultima modificacion");
        ultimaM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout ultimaMfLayout = new javax.swing.GroupLayout(ultimaMf);
        ultimaMf.setLayout(ultimaMfLayout);
        ultimaMfLayout.setHorizontalGroup(
            ultimaMfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ultimaMfLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(ultimaM, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ultimaMfLayout.setVerticalGroup(
            ultimaMfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimaMfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ultimaM, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(ultimaMf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 380, 60));

        estatusl.setForeground(new java.awt.Color(51, 51, 51));
        estatusl.setText("Estatus");
        estatusl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(estatusl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 150, -1));

        panelCliente3.setBackground(new java.awt.Color(102, 102, 102));
        panelCliente3.setPreferredSize(new java.awt.Dimension(380, 80));
        panelCliente3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCliente3.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente3.setText("Cliente");
        labelCliente3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelCliente3.add(labelCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 349, 45));

        add(panelCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 380, 60));

        txaComentarios.setBackground(new java.awt.Color(255, 255, 255));
        txaComentarios.setColumns(20);
        txaComentarios.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txaComentarios.setForeground(new java.awt.Color(51, 51, 51));
        txaComentarios.setRows(5);
        spComentario.setViewportView(txaComentarios);

        add(spComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 450, 100));

        txaDaños.setEditable(false);
        txaDaños.setBackground(new java.awt.Color(255, 255, 255));
        txaDaños.setColumns(20);
        txaDaños.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txaDaños.setForeground(new java.awt.Color(51, 51, 51));
        txaDaños.setRows(5);
        spDaños.setViewportView(txaDaños);

        add(spDaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 450, 110));

        registrarEquipods.setBackground(new java.awt.Color(0, 73, 173));
        registrarEquipods.setPreferredSize(new java.awt.Dimension(380, 80));
        registrarEquipods.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar.setText("ACTUALIZAR EQUIPO");
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarMousePressed(evt);
            }
        });
        registrarEquipods.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 379, 79));

        add(registrarEquipods, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 380, 80));

        dañosRl.setForeground(new java.awt.Color(51, 51, 51));
        dañosRl.setText("Numero de Serie");
        dañosRl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(dañosRl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        comentariosTL.setForeground(new java.awt.Color(51, 51, 51));
        comentariosTL.setText("Comentario Tecnicos");
        comentariosTL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(comentariosTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        labelAltaDefinicion1.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion1.setText("Informacion del Equipo");
        labelAltaDefinicion1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(labelAltaDefinicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        dañosRl1.setForeground(new java.awt.Color(51, 51, 51));
        dañosRl1.setText("Daños Reportados");
        dañosRl1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(dañosRl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        Modelo.setForeground(new java.awt.Color(51, 51, 51));
        Modelo.setText("Modelo");
        Modelo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        alertaMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaMarca.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(alertaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 40, 30));

        alertaTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaTipo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(alertaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 30));

        alertaEstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaEstatus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(alertaEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseEntered

        registrarEquipods.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_registrarMouseEntered

    private void registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseExited
        registrarEquipods.setBackground(new Color(0, 74, 173));
    }//GEN-LAST:event_registrarMouseExited

    private void txtModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModeloMousePressed
        PlaceHonder.placeHolderEquipos(elementos, 1);
    }//GEN-LAST:event_txtModeloMousePressed

    private void txtNumeroSerieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroSerieMousePressed
        PlaceHonder.placeHolderEquipos(elementos, 2);
    }//GEN-LAST:event_txtNumeroSerieMousePressed

    private void registrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMousePressed

        if (Validar.validarEquipos(elementos, boxes, label)) {
            String tipot = (String) tipo.getSelectedItem();
            String marcat = (String) marca.getSelectedItem();
            String modelos = txtModelo.getText().trim();
            String serie = txtNumeroSerie.getText().trim();

            String daños = txaDaños.getText();
            String estatus = (String) cbxEstatus.getSelectedItem();
            String comentarios = txaComentarios.getText();

            try {
                Connection cn = Conectar.conectar();
                PreparedStatement ps = cn.prepareStatement("update equipos set tipo = ?, marca = ?, modelo = ?,"
                        + " serie = ?, observaciones = ?, ultimo = ?,"
                        + " estatus = ?, comentariosTecnicos = ?, ultimaFecha = ?"
                        + " where id = '" + id + "'");

                ps.setString(1, tipot);
                ps.setString(2, marcat);
                ps.setString(3, modelos);
                ps.setString(4, serie);
                ps.setString(5, daños);
                ps.setString(6, user);
                ps.setString(7, estatus);
                ps.setString(8, comentarios);
                ps.setString(9, Fechas.fechaDiaMesAñoHora(1));

                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Actualizado");
                }

                cn.close();
                ps.close();

            } catch (HeadlessException | SQLException e) {
                System.out.println("Error en Actualizar Infromacion del Equipo: " + e);
            }

        }
    }//GEN-LAST:event_registrarMousePressed

    private void cbxEstatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxEstatusMousePressed
        alertaMarca.setText("");
    }//GEN-LAST:event_cbxEstatusMousePressed

    private void tipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoMousePressed
        alertaTipo.setText("");
    }//GEN-LAST:event_tipoMousePressed

    private void marcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcaMousePressed
        alertaEstatus.setText("");
    }//GEN-LAST:event_marcaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion Modelo;
    private componentesVisuales.LabelAltaDefinicion alertaEstatus;
    private componentesVisuales.LabelAltaDefinicion alertaMarca;
    private componentesVisuales.LabelAltaDefinicion alertaTipo;
    private componentesVisuales.ComboBoxHD cbxEstatus;
    private componentesVisuales.LabelAltaDefinicion comentariosTL;
    private componentesVisuales.LabelAltaDefinicion dañosRl;
    private componentesVisuales.LabelAltaDefinicion dañosRl1;
    private componentesVisuales.LabelAltaDefinicion estatusl;
    private componentesVisuales.LabelAltaDefinicion fechaIngresoL;
    private componentesVisuales.PanelRedondeado fechaIngresop;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion1;
    private componentesVisuales.LabelAltaDefinicion labelCliente3;
    private componentesVisuales.ComboBoxHD marca;
    private componentesVisuales.PanelRedondeado panelCliente3;
    private componentesVisuales.LabelAltaDefinicion registrar;
    private componentesVisuales.PanelRedondeado registrarEquipods;
    private javax.swing.JScrollPane spComentario;
    private javax.swing.JScrollPane spDaños;
    private componentesVisuales.ComboBoxHD tipo;
    private javax.swing.JTextArea txaComentarios;
    private javax.swing.JTextArea txaDaños;
    private componentesVisuales.TextFieldRedondeado txtModelo;
    private componentesVisuales.TextFieldRedondeado txtNumeroSerie;
    private componentesVisuales.LabelAltaDefinicion ultimaM;
    private componentesVisuales.PanelRedondeado ultimaMf;
    private componentesVisuales.LabelAltaDefinicion ultimoMoL;
    private componentesVisuales.PanelRedondeado ultimoModi;
    // End of variables declaration//GEN-END:variables

    private void llenarCombobox() {

        try {
            Connection cn = Conectar.conectar();
            PreparedStatement ps = cn.prepareStatement(
                    "select * from tipos");

            ResultSet rs = ps.executeQuery();
            //tipo.addItem("Tipos de Equipos");
            while (rs.next()) {
                tipo.addItem(rs.getString("tipos"));
            }
            rs.close();
            ps.close();

            PreparedStatement ps2 = cn.prepareStatement(
                    "select * from marcas");
            ResultSet rs2 = ps2.executeQuery();
            //marca.addItem("Marcas");
            while (rs2.next()) {
                marca.addItem(rs2.getString("marcas"));
            }

        } catch (SQLException e) {
            System.out.println("Error en llenar ComboBox (Panel ResgistroDeEquipos): " + e);
        }

    }

}
