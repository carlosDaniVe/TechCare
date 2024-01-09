package ventanas.paneles;

import clases.Conectar;
import clases.Mostrar;
import clases.PlaceHonder;
import clases.ReporteInformacionCliente;
import clases.Validar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import componentesVisuales.ScrollBar;
import componentesVisuales.TextFieldRedondeado;
import java.util.HashMap;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import ventanas.Capturista;
import ventanas.RegistrarEquiposForm;

/**
 *
 * @author Carlos Hernandez
 */
public class InformacionCliente extends javax.swing.JPanel {

    List<TextFieldRedondeado> elementos = new ArrayList<>();
    public static String cedula, user, cliente;
    public static DefaultTableModel modelo;
    public static int id;
    String cedulaCliente, correoCliente, telefonoCliente, direccionCliente,
            ultimaModificacionCliente;

    public InformacionCliente() {
        initComponents();
        sp.setVerticalScrollBar(new ScrollBar());

        cedula = GestionDeClientes.cedula;

        try {
            Connection conexion = Conectar.conectar();

            PreparedStatement ps = conexion.prepareStatement(
                    "select * from clientes where cedula = '" + cedula + "'");

            ResultSet rsw = ps.executeQuery();

            if (rsw.next()) {
                txtCedula.setForeground(new Color(53, 53, 53));
                txtCorreo.setForeground(new Color(53, 53, 53));
                txtTelefono.setForeground(new Color(53, 53, 53));
                dirreccion.setForeground(new Color(53, 53, 53));

                cliente = rsw.getString("nombre");
                cedulaCliente = rsw.getString("cedula");
                correoCliente = rsw.getString("correo");
                telefonoCliente = rsw.getString("telefono");
                direccionCliente = rsw.getString("direccion");
                ultimaModificacionCliente = rsw.getString("ultimaModificacion");

                txtNombre.setText(cliente);
                txtCedula.setText(cedulaCliente);
                txtCorreo.setText(correoCliente);
                txtTelefono.setText(telefonoCliente);
                dirreccion.setText(direccionCliente);

                ultima.setText("Ultima Modificacion: " + ultimaModificacionCliente);
            }
            rsw.close();

        } catch (NumberFormatException | SQLException e) {
            System.out.println("Error en llenar campos en panel InformacionCliente: " + e);
        }

        // Hilo para actualizar la Tabla
        modelo = llenerModelo(new DefaultTableModel());

        actualizarTabla(modelo);
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTabla(modelo);
            }
        });
        timer.start();

        tablaG.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablaG.rowAtPoint(e.getPoint());
                int columna = 3;
                
                if (fila > -1) {
                    
                    id = (int) tablaG.getModel().getValueAt(fila, columna);
                    Mostrar.mostrarPanel(Capturista.panelPadre,
                            new InformacionEquipos(id,1));
                }
            }
        });
        llenarElementos();
    }

    private void llenarElementos() {
        elementos.add(txtNombre);
        elementos.add(txtCedula);
        elementos.add(txtCorreo);
        elementos.add(dirreccion);
        elementos.add(txtTelefono);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCedula = new componentesVisuales.TextFieldRedondeado();
        txtCorreo = new componentesVisuales.TextFieldRedondeado();
        dirreccion = new componentesVisuales.TextFieldRedondeado();
        txtTelefono = new componentesVisuales.TextFieldRedondeado();
        panelCliente = new componentesVisuales.PanelRedondeado();
        ultima = new componentesVisuales.LabelAltaDefinicion();
        registrarEquipos = new componentesVisuales.PanelRedondeado();
        lRegistrarE = new componentesVisuales.LabelRedondeada();
        actualizar = new componentesVisuales.PanelRedondeado();
        actualizarl = new componentesVisuales.LabelAltaDefinicion();
        imprimirp = new componentesVisuales.PanelRedondeado();
        imprimir = new componentesVisuales.LabelRedondeada();
        sp = new javax.swing.JScrollPane();
        tablaG = new componentesVisuales.Tabla();
        labelAltaDefinicion1 = new componentesVisuales.LabelAltaDefinicion();
        txtNombre = new componentesVisuales.TextFieldRedondeado();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setText("Ingrese la Cedula");
        txtCedula.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCedula.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/id24.png"))); // NOI18N
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 380, 80));

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
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 380, 80));

        dirreccion.setForeground(new java.awt.Color(153, 153, 153));
        dirreccion.setText("Ingrese su Direccion");
        dirreccion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dirreccion.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/map.png"))); // NOI18N
        dirreccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dirreccionMousePressed(evt);
            }
        });
        add(dirreccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 380, 80));

        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setText("Ingrese el Telefono");
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTelefono.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/phone24.png"))); // NOI18N
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 380, 80));

        panelCliente.setBackground(new java.awt.Color(102, 102, 102));
        panelCliente.setPreferredSize(new java.awt.Dimension(380, 80));

        ultima.setForeground(new java.awt.Color(255, 255, 255));
        ultima.setText("Ultima Modificacion");
        ultima.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ultima, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ultima, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 380, 80));

        registrarEquipos.setBackground(new java.awt.Color(0, 73, 173));
        registrarEquipos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lRegistrarE.setForeground(new java.awt.Color(255, 255, 255));
        lRegistrarE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lRegistrarE.setText("REGISTRAR EQUIPOS");
        lRegistrarE.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lRegistrarE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lRegistrarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lRegistrarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lRegistrarEMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lRegistrarEMousePressed(evt);
            }
        });
        registrarEquipos.add(lRegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 80));

        add(registrarEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 210, 80));

        actualizar.setBackground(new java.awt.Color(0, 73, 173));
        actualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actualizarl.setForeground(new java.awt.Color(255, 255, 255));
        actualizarl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarl.setText("ACTUALIZAR CLIENTE");
        actualizarl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        actualizarl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actualizarlMousePressed(evt);
            }
        });
        actualizar.add(actualizarl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 80));

        add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 210, 80));

        imprimirp.setBackground(new java.awt.Color(0, 73, 173));
        imprimirp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imprimir.setForeground(new java.awt.Color(255, 255, 255));
        imprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imprimir.setText("IMPRIMIR");
        imprimir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imprimirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imprimirMousePressed(evt);
            }
        });
        imprimirp.add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 90));

        add(imprimirp, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 210, 90));

        tablaG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipos", "Marcas", "Estatus", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaG.getTableHeader().setReorderingAllowed(false);
        sp.setViewportView(tablaG);
        if (tablaG.getColumnModel().getColumnCount() > 0) {
            tablaG.getColumnModel().getColumn(0).setResizable(false);
            tablaG.getColumnModel().getColumn(1).setResizable(false);
            tablaG.getColumnModel().getColumn(2).setResizable(false);
        }

        add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 540, 240));

        labelAltaDefinicion1.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion1.setText("Informacion del Cliente");
        labelAltaDefinicion1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(labelAltaDefinicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese el Nombre");
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtNombre.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/2user24.png"))); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 380, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void lRegistrarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrarEMouseEntered
        registrarEquipos.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_lRegistrarEMouseEntered

    private void lRegistrarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrarEMouseExited
        registrarEquipos.setBackground(new Color(0, 74, 173));
    }//GEN-LAST:event_lRegistrarEMouseExited

    private void lRegistrarEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrarEMousePressed
        new RegistrarEquiposForm().setVisible(true);
    }//GEN-LAST:event_lRegistrarEMousePressed

    private void actualizarlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarlMouseEntered
        actualizar.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_actualizarlMouseEntered

    private void actualizarlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarlMouseExited
        actualizar.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_actualizarlMouseExited

    private void imprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMouseEntered
        imprimirp.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_imprimirMouseEntered

    private void imprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMouseExited
        imprimirp.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_imprimirMouseExited

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        PlaceHonder.placeHolderClientes(elementos, 2);
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        PlaceHonder.placeHolderClientes(elementos, 5);
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void dirreccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dirreccionMousePressed
        PlaceHonder.placeHolderClientes(elementos, 4);
    }//GEN-LAST:event_dirreccionMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        PlaceHonder.placeHolderClientes(elementos, 3);
    }//GEN-LAST:event_txtCorreoMousePressed

    private void actualizarlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarlMousePressed

        if (Validar.validarClientes(elementos)) {

            String nombret = txtNombre.getText();
            String cedulat = txtCedula.getText().trim();
            String correot = txtCorreo.getText().trim();
            String telefonot = txtTelefono.getText().trim();
            String direcciont = dirreccion.getText().trim();

            try {

                Connection cn = Conectar.conectar();
                PreparedStatement ps = cn.prepareStatement(
                        "update clientes set nombre = ?, cedula = ?, correo = ?,"
                        + " telefono = ?, direccion = ?"
                        + ", ultimaModificacion = ? where cedula = ?");

                ps.setString(1, nombret);
                ps.setString(2, cedulat);
                ps.setString(3, correot);
                ps.setString(4, telefonot);
                ps.setString(5, direcciont);
                ps.setString(6, user);
                ps.setString(7, cedula);

                int resultado = ps.executeUpdate();

                cn.close();
                ps.close();

                Connection cn2 = Conectar.conectar();
                PreparedStatement ps2 = cn2.prepareStatement(
                        "update equipos set cedulaCliente = ? where cedulaCliente = '" + cedula + "'");
                ps2.setString(1, cedulat);

                int resultado2 = ps2.executeUpdate();
                if (resultado > 0 && resultado2 > 0) {
                    JOptionPane.showMessageDialog(null, "Exitoso");
                }

            } catch (SQLException e) {
                System.out.println("Error en actualizar cliente: " + e);
            }
        }
    }//GEN-LAST:event_actualizarlMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

        PlaceHonder.placeHolderUser(elementos, null, 1);
    }//GEN-LAST:event_txtNombreMousePressed

    private void imprimirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMousePressed

        /* Nota 1: Para mostrar informacion en un reporte usando un HashMap y una 
        *  colleccion de objetos, los campos (parametros y flieds) tienen que ser 
        *  TextFiled y no StaticText en JasperReport.
        *
        *  Nota 2: No colocar break en el reporte, eso va a dividir la pagina creando 
        *  dos hojas.
         */
        HashMap<String, Object> parametros = new HashMap<>();
        parametros.put("cliente", cliente);
        parametros.put("cedula", cedulaCliente);
        parametros.put("correo", correoCliente);
        parametros.put("telefono", telefonoCliente);
        parametros.put("direccion", direccionCliente);
        parametros.put("modificacion", ultimaModificacionCliente);

        try {
            Connection conexion = Conectar.conectar();
            PreparedStatement ps = conexion.prepareStatement(
                    "SELECT tipo, marca, modelo, serie, fechaIngreso, estatus, "
                    + "ultimaFecha FROM equipos WHERE cedulaCliente = ?");
            ps.setString(1, cedula);

            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rmd = rs.getMetaData();

            // Obtener el número de columnas
            int columnas = rmd.getColumnCount();

            // Creacion y llenado del arreglo segun los datos de las Consultas.
            ReporteInformacionCliente informacion;
            List<ReporteInformacionCliente> fuenteDeDatosReporte = new ArrayList<>();

            for (int i = 0; rs.next(); i++) {
                String arreglo[] = new String[columnas];
                for (int j = 0; j < columnas; j++) {

                    arreglo[j] = rs.getString(j + 1);

                }
                informacion = new ReporteInformacionCliente(arreglo[0], arreglo[1], arreglo[2],
                        arreglo[3], arreglo[4], arreglo[5], arreglo[6]);

                fuenteDeDatosReporte.add(informacion);
            }

            String path = "src/main/resources/InformacionCliente.jasper";
            JRBeanCollectionDataSource fuente = new JRBeanCollectionDataSource(
                    fuenteDeDatosReporte);

            try {

                JasperPrint print = JasperFillManager.fillReport(path, parametros, fuente);
                JasperViewer vista = new JasperViewer(print, false);
                vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                vista.setVisible(true);

            } catch (JRException e) {
                System.out.println("Error en crear Reporte: " + e);
            }

        } catch (SQLException e) {
            System.out.println("Error en consultar para hacer reporte: " + e);
        }


    }//GEN-LAST:event_imprimirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.PanelRedondeado actualizar;
    private componentesVisuales.LabelAltaDefinicion actualizarl;
    private componentesVisuales.TextFieldRedondeado dirreccion;
    private componentesVisuales.LabelRedondeada imprimir;
    private componentesVisuales.PanelRedondeado imprimirp;
    private componentesVisuales.LabelRedondeada lRegistrarE;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion1;
    private componentesVisuales.PanelRedondeado panelCliente;
    private componentesVisuales.PanelRedondeado registrarEquipos;
    private javax.swing.JScrollPane sp;
    public static componentesVisuales.Tabla tablaG;
    private componentesVisuales.TextFieldRedondeado txtCedula;
    private componentesVisuales.TextFieldRedondeado txtCorreo;
    private componentesVisuales.TextFieldRedondeado txtNombre;
    private componentesVisuales.TextFieldRedondeado txtTelefono;
    private componentesVisuales.LabelAltaDefinicion ultima;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel llenerModelo(DefaultTableModel modelo) {
        modelo.addColumn("Tipo");
        modelo.addColumn("Marca");
        modelo.addColumn("Estatus");
        modelo.addColumn("id");

        return modelo;
    }

    public void actualizarTabla(DefaultTableModel modelo) {

        modelo.setRowCount(0);

        try {

            Connection conexion = Conectar.conectar();
            PreparedStatement ps = conexion.prepareStatement(
                    "select tipo, marca, estatus, id from equipos where cedulaCliente = ?");
            ps.setString(1, cedula);

            ResultSet rs = ps.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            int cantidadDeColumnas = metaData.getColumnCount();

            while (rs.next()) {
                Object[] filas = new Object[cantidadDeColumnas];

                for (int i = 0; i < cantidadDeColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

            tablaG.setModel(modelo);
            conexion.close();
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error en llenar Tabla GestionClientes: " + e);
        }

        tablaG.repaint();
    }
}
