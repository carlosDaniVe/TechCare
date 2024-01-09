package ventanas.paneles;

import clases.Conectar;
import clases.LlenarModeloTabla;
import clases.Mostrar;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import ventanas.Tecnico;

/**
 *
 * @author Carlos Hernandez
 */

public class GestionDeEquipos extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    public static int id;

    public GestionDeEquipos() {
        initComponents();

        modelo = llenerModelo(new DefaultTableModel());
        tablaG.setModel(LlenarModeloTabla.llenarModelo("select tipo, marca,"
                + " estatus, id from equipos", modelo));
        

        tablaG.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablaG.rowAtPoint(e.getPoint());
                int columna = 3;

                if (fila > -1) {
                    id = (int) tablaG.getModel().getValueAt(fila, columna);
                    Mostrar.mostrarPanel(Tecnico.panelPadre, new InformacionEquipos(id,2));
                }
            }
        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new componentesVisuales.LabelAltaDefinicion();
        buscar = new componentesVisuales.PanelRedondeado();
        labelBuscar = new componentesVisuales.LabelRedondeada();
        sp = new javax.swing.JScrollPane();
        tablaG = new componentesVisuales.Tabla();
        cbxEstatus = new componentesVisuales.ComboBoxHD();
        alerta = new componentesVisuales.LabelAltaDefinicion();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Gestion de Equipos Registrados");
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 19, -1, 33));

        buscar.setBackground(new java.awt.Color(0, 73, 173));
        buscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBuscar.setText("BUSCAR");
        labelBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelBuscarMousePressed(evt);
            }
        });
        buscar.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 252, -1));

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
                "Tipos", "Marcas", "Estatus", "ID"
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

        add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 976, 440));

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
        add(cbxEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 229, 34));

        alerta.setForeground(new java.awt.Color(0, 0, 0));
        alerta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add(alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void labelBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseEntered
        buscar.setBackground(new Color(3, 88, 202));
    }//GEN-LAST:event_labelBuscarMouseEntered

    private void labelBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMouseExited
        buscar.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_labelBuscarMouseExited

    private void labelBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBuscarMousePressed

        String seleccion = (String) cbxEstatus.getSelectedItem();

        if (seleccion.equals("Seleccione")) {
            alerta.setForeground(Color.red);
            alerta.setText("X->");
        } else {

            modelo = llenerModelo(new DefaultTableModel());
            
            try {
                Connection cn = Conectar.conectar();
                PreparedStatement ps = cn.prepareStatement(
                        "select tipo, marca, estatus, id from equipos where"
                        + " estatus = '" + seleccion + "'");

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
                cn.close();
                ps.close();
                rs.close();
                
            } catch (SQLException e) {
                System.out.println("Error en llenar Tabla GestionClientes: " + e);
            }

        }
    }//GEN-LAST:event_labelBuscarMousePressed

    private void cbxEstatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxEstatusMousePressed
        alerta.setForeground(Color.WHITE);
    }//GEN-LAST:event_cbxEstatusMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion alerta;
    private componentesVisuales.PanelRedondeado buscar;
    private componentesVisuales.ComboBoxHD cbxEstatus;
    private componentesVisuales.LabelRedondeada labelBuscar;
    private javax.swing.JScrollPane sp;
    private componentesVisuales.Tabla tablaG;
    private componentesVisuales.LabelAltaDefinicion titulo;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel llenerModelo(DefaultTableModel modelo) {
        modelo.addColumn("Tipo");
        modelo.addColumn("Marca");
        modelo.addColumn("Estatus");
        modelo.addColumn("Id");

        return modelo;
    }
}
