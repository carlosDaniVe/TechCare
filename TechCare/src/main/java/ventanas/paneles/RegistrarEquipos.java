package ventanas.paneles;

import clases.Conectar;
import clases.Fechas;
import clases.PlaceHonder;
import clases.Validar;
import java.awt.Color;
import java.awt.HeadlessException;
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
import ventanas.Login;

/**
 *
 * @author Carlos Hernandez
 */
public class RegistrarEquipos extends javax.swing.JPanel {

    List<TextFieldRedondeado> elementos = new ArrayList<>();
    List<ComboBoxHD> boxes = new ArrayList<>();
    List<LabelAltaDefinicion> label = new ArrayList<>();
    String cedula, user, cliente;
   
    public static int id =0;

    public RegistrarEquipos() {
        initComponents();
        sp.setVerticalScrollBar(new ScrollBar());
        txaObservasiones.setLineWrap(true);

        llenarElementos();
        llenarCombobox();

        cedula = InformacionCliente.cedula;
        user = Login.user;
        
        cliente = InformacionCliente.cliente;
        labelCliente.setText("Cliente: " + cliente);
        
        try {
            Connection cn = Conectar.conectar();
            PreparedStatement ps = cn.prepareStatement(
            "select MAX(id) AS maximo from equipos");
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                id =rs.getInt("maximo");
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error al consultar id maximo en Registro de equipos: "+e);
        }

    }

    private void llenarElementos() {
        elementos.add(txtModelo);
        elementos.add(txtNumeroSerie);
        boxes.add(tipo);
        boxes.add(marca);
        boxes.add(null);
        label.add(alertaTipo);
        label.add(alertaMarca);
        label.add(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rGISTRO = new javax.swing.JPanel();
        titulo = new componentesVisuales.LabelAltaDefinicion();
        registrarEquipods = new componentesVisuales.PanelRedondeado();
        registrar = new componentesVisuales.LabelAltaDefinicion();
        marca = new componentesVisuales.ComboBoxHD();
        tipo = new componentesVisuales.ComboBoxHD();
        txtNumeroSerie = new componentesVisuales.TextFieldRedondeado();
        txtModelo = new componentesVisuales.TextFieldRedondeado();
        sp = new javax.swing.JScrollPane();
        txaObservasiones = new javax.swing.JTextArea();
        panelCliente = new componentesVisuales.PanelRedondeado();
        labelCliente = new componentesVisuales.LabelAltaDefinicion();
        lbObservaciones = new componentesVisuales.LabelAltaDefinicion();
        alertaTipo = new componentesVisuales.LabelAltaDefinicion();
        alertaMarca = new componentesVisuales.LabelAltaDefinicion();

        rGISTRO.setBackground(new java.awt.Color(255, 255, 255));
        rGISTRO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Registro de Equipos");
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        rGISTRO.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 277, 42));

        registrarEquipods.setBackground(new java.awt.Color(0, 73, 173));
        registrarEquipods.setPreferredSize(new java.awt.Dimension(380, 80));
        registrarEquipods.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar.setText("REGISTRAR EQUIPO");
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

        rGISTRO.add(registrarEquipods, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 380, 80));

        marca.setBackground(new java.awt.Color(255, 255, 255));
        marca.setForeground(new java.awt.Color(51, 51, 51));
        marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca" }));
        marca.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                marcaMousePressed(evt);
            }
        });
        rGISTRO.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 380, 50));

        tipo.setBackground(new java.awt.Color(255, 255, 255));
        tipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tipo.setForeground(new java.awt.Color(51, 51, 51));
        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Equipo" }));
        tipo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tipoMousePressed(evt);
            }
        });
        rGISTRO.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 380, 50));

        txtNumeroSerie.setForeground(new java.awt.Color(153, 153, 153));
        txtNumeroSerie.setText("Numero de Serie");
        txtNumeroSerie.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtNumeroSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroSerieMousePressed(evt);
            }
        });
        rGISTRO.add(txtNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 380, 80));

        txtModelo.setForeground(new java.awt.Color(153, 153, 153));
        txtModelo.setText("Modelo");
        txtModelo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtModeloMousePressed(evt);
            }
        });
        rGISTRO.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 380, 80));

        txaObservasiones.setColumns(20);
        txaObservasiones.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txaObservasiones.setForeground(new java.awt.Color(51, 51, 51));
        txaObservasiones.setRows(5);
        sp.setViewportView(txaObservasiones);

        rGISTRO.add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 490, 330));

        panelCliente.setBackground(new java.awt.Color(102, 102, 102));
        panelCliente.setPreferredSize(new java.awt.Dimension(380, 80));

        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setText("Cliente");
        labelCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        rGISTRO.add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 380, 80));

        lbObservaciones.setForeground(new java.awt.Color(51, 51, 51));
        lbObservaciones.setText("Observaciones");
        lbObservaciones.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rGISTRO.add(lbObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 170, -1));

        alertaTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaTipo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rGISTRO.add(alertaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 40, 30));

        alertaMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertaMarca.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rGISTRO.add(alertaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
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
            String tipos = (String) tipo.getSelectedItem();
            String marcas = (String) marca.getSelectedItem();
            String modelos = txtModelo.getText().trim();
            String numeroSerie = txtNumeroSerie.getText().trim();
            String observaciones = txaObservasiones.getText();
            String fecha = Fechas.fechaDiaMesAñoHora(1);
            
            try {
                Connection cn = Conectar.conectar();
                PreparedStatement ps = cn.prepareStatement(
                        "insert into equipos values(?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, cedula);
                ps.setString(2, tipos);
                ps.setString(3, marcas);
                ps.setString(4, modelos);
                ps.setString(5, numeroSerie);
                ps.setString(6, fecha);
                ps.setString(7, observaciones);
                ps.setString(8, user);
                ps.setString(9, "Nuevo Ingreso");
                ps.setString(10, "Sin comentarios Tecnicos");
                ps.setString(11, fecha);
                ps.setInt(12, id +1);
                id++;

                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Exitoso");
                }

                limpiar();
                

            } catch (HeadlessException | SQLException e) {
                System.out.println("Error en Registrar cliente: " + e);
            }
        }
    }//GEN-LAST:event_registrarMousePressed

    private void tipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoMousePressed
        alertaTipo.setText("");
    }//GEN-LAST:event_tipoMousePressed

    private void marcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcaMousePressed
        alertaMarca.setText("");
    }//GEN-LAST:event_marcaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion alertaMarca;
    private componentesVisuales.LabelAltaDefinicion alertaTipo;
    private componentesVisuales.LabelAltaDefinicion labelCliente;
    private componentesVisuales.LabelAltaDefinicion lbObservaciones;
    private componentesVisuales.ComboBoxHD marca;
    private componentesVisuales.PanelRedondeado panelCliente;
    private javax.swing.JPanel rGISTRO;
    private componentesVisuales.LabelAltaDefinicion registrar;
    private componentesVisuales.PanelRedondeado registrarEquipods;
    private javax.swing.JScrollPane sp;
    private componentesVisuales.ComboBoxHD tipo;
    private componentesVisuales.LabelAltaDefinicion titulo;
    private javax.swing.JTextArea txaObservasiones;
    private componentesVisuales.TextFieldRedondeado txtModelo;
    private componentesVisuales.TextFieldRedondeado txtNumeroSerie;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        tipo.setSelectedIndex(0);
        marca.setSelectedIndex(0);
        txtModelo.setForeground(new Color(153, 153, 153));
        txtModelo.setText("Modelo");
        txtNumeroSerie.setForeground(new Color(153, 153, 153));
        txtNumeroSerie.setText("Numero de Serie");
        txaObservasiones.setText("");
    }

    private void llenarCombobox() {
        try {
            Connection cn = new Conectar().conectar();
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
