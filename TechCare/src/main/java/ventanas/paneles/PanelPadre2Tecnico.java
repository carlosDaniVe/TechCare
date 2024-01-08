package ventanas.paneles;

/**
 *
 * @author Carlos Hernandez
 */
public class PanelPadre2Tecnico extends javax.swing.JPanel {

    
    
    public PanelPadre2Tecnico() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogoPrincipal = new componentesVisuales.LabelAltaDefinicion();
        info1 = new componentesVisuales.LabelAltaDefinicion();
        info3 = new componentesVisuales.LabelAltaDefinicion();
        labelAltaDefinicion1 = new componentesVisuales.LabelAltaDefinicion();
        tituloCapturista = new componentesVisuales.LabelAltaDefinicion();

        setBackground(new java.awt.Color(255, 255, 255));

        labelLogoPrincipal.setIcono(new javax.swing.ImageIcon(getClass().getResource("/TechCareLogoAzul-removebg-preview.png"))); // NOI18N

        info1.setForeground(new java.awt.Color(102, 102, 102));
        info1.setText("• Obten Datos Relevantes  con Graficas");
        info1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        info3.setForeground(new java.awt.Color(102, 102, 102));
        info3.setText("• Registra Equipos y Gestionalos");
        info3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        labelAltaDefinicion1.setForeground(new java.awt.Color(102, 102, 102));
        labelAltaDefinicion1.setText("  Funciones: ");
        labelAltaDefinicion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tituloCapturista.setForeground(new java.awt.Color(51, 51, 51));
        tituloCapturista.setText("Tecnico: Vista");
        tituloCapturista.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCapturista, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAltaDefinicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(info1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(labelLogoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tituloCapturista, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(labelAltaDefinicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(info3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(info1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelLogoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion info1;
    private componentesVisuales.LabelAltaDefinicion info3;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion1;
    private componentesVisuales.LabelAltaDefinicion labelLogoPrincipal;
    private componentesVisuales.LabelAltaDefinicion tituloCapturista;
    // End of variables declaration//GEN-END:variables
}
