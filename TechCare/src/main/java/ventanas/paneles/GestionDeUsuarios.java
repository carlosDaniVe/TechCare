package ventanas.paneles;

import clases.LlenarModeloTabla;
import clases.Mostrar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import componentesVisuales.ScrollBar;
import ventanas.Administrador;

/**
 *
 * @author Carlos
 */
public class GestionDeUsuarios extends javax.swing.JPanel {

    public static String cedula = "";

    public GestionDeUsuarios() {
        initComponents();
        sp.setVerticalScrollBar(new ScrollBar());

        DefaultTableModel modelo = llenerModelo(new DefaultTableModel());
        tabla1.setModel(LlenarModeloTabla.llenarModelo("select nombre, cedula, username,"
                + " nivel, estatus from usuarios", modelo));

        tabla1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int fila = tabla1.rowAtPoint(e.getPoint());
                int columna = 1;

                if (fila > -1) {
                    cedula = (String) tabla1.getModel().getValueAt(fila, columna);
                   
                    Mostrar.mostrarPanel(Administrador.PanelPadre,
                            new InformacionUsuarios());
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAltaDefinicion1 = new componentesVisuales.LabelAltaDefinicion();
        sp = new javax.swing.JScrollPane();
        tabla1 = new componentesVisuales.Tabla();

        setBackground(new java.awt.Color(255, 255, 255));

        labelAltaDefinicion1.setForeground(new java.awt.Color(51, 51, 51));
        labelAltaDefinicion1.setText("Gestion de Usuarios");
        labelAltaDefinicion1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Cedulas", "Nombres de Usuarios", "Estatus", "Permisos"
            }
        ));
        sp.setViewportView(tabla1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(labelAltaDefinicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        modelo.addColumn("Nombres de Usuarios");
        modelo.addColumn("Estatus");
        modelo.addColumn("Permisos");

        return modelo;
    }

}
