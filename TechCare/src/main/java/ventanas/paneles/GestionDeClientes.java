package ventanas.paneles;

import clases.LlenarModeloTabla;
import clases.Mostrar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import componentesVisuales.ScrollBar;
import ventanas.Capturista;

/**
 *
 * @author Carlos Hernandez
 */
public class GestionDeClientes extends javax.swing.JPanel {

    public static String cedula;

    public GestionDeClientes() {
        initComponents();
        sp.setVerticalScrollBar(new ScrollBar());
        

        DefaultTableModel modelo = llenerModelo(new DefaultTableModel());
        tabla1.setModel(LlenarModeloTabla.llenarModelo("select nombre, cedula, "
                + "correo, telefono from clientes", modelo));
        
        
        tabla1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tabla1.rowAtPoint(e.getPoint());
                int columna = 1;

                if (fila > -1) {
                    if (fila > -1) {
                        cedula = (String) tabla1.getModel().getValueAt(fila, columna);
                        Mostrar.mostrarPanel(Capturista.panelPadre, 
                                new InformacionCliente());
                    }

                }
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        tabla1 = new componentesVisuales.Tabla();
        labelAltaDefinicion1 = new componentesVisuales.LabelAltaDefinicion();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Nombres", "Cedulas", "Correo", "Telefonos"
            }
        ));
        sp.setViewportView(tabla1);

        labelAltaDefinicion1.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion1.setText("Gestion de Clientes Registrados");
        labelAltaDefinicion1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(labelAltaDefinicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelAltaDefinicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion1;
    private javax.swing.JScrollPane sp;
    private componentesVisuales.Tabla tabla1;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel llenerModelo(DefaultTableModel modelo) {
        modelo.addColumn("Nombres");
        modelo.addColumn("Cedulas");
        modelo.addColumn("correo");
        modelo.addColumn("telefonos");

        return modelo;
    }

}
