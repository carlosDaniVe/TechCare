package ventanas;

import clases.Fechas;
import clases.Mostrar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import ventanas.paneles.GestionDeClientes;
import ventanas.paneles.PanelPadre2Capturista;
import ventanas.paneles.RegistrarCliente;


/**
 *
 * @author Carlos Hernandez
 */
public class RegistrarEquiposForm extends javax.swing.JFrame {

    int xmouse, ymouse;
    String usuario, ultimoIngreso;
    
    public RegistrarEquiposForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        usuario = Login.user;
        ultimoIngreso = Login.ultimoIngreso1;
        Mostrar.mostrarPanel(panelPadre, new ventanas.paneles.RegistrarEquipos());
        labelBienvanida.setText("Bienvenido: " + usuario);
        lFechaActual.setText("Hoy es: " + Fechas.fechaDiaMesAñoHora(1) + " | ");
        ultimaSesion.setText("Su ultima sesion fue: " + ultimoIngreso);
        
        Timer horaActual = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hora.setText("Hora: " + new SimpleDateFormat("hh:mm:ss").format(new Date()));
            }
        });
        horaActual.setRepeats(true);
        horaActual.setCoalesce(true);
        horaActual.setInitialDelay(0);
        horaActual.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        labelLogo = new componentesVisuales.LabelAltaDefinicion();
        panelNuevoTipo = new javax.swing.JPanel();
        agregarTipo = new componentesVisuales.LabelAltaDefinicion();
        agregarTipoICO = new componentesVisuales.LabelAltaDefinicion();
        lBaner = new componentesVisuales.LabelAltaDefinicion();
        banerInferior = new componentesVisuales.LabelAltaDefinicion();
        bannerInferior2 = new componentesVisuales.LabelAltaDefinicion();
        agregarMarcaP = new javax.swing.JPanel();
        agregarMarcaICO = new componentesVisuales.LabelAltaDefinicion();
        agregarMarca = new componentesVisuales.LabelAltaDefinicion();
        panelHome = new javax.swing.JPanel();
        principal = new componentesVisuales.LabelAltaDefinicion();
        labelAltaDefinicion2 = new componentesVisuales.LabelAltaDefinicion();
        PanelTituloB = new javax.swing.JPanel();
        labelBienvanida = new componentesVisuales.LabelAltaDefinicion();
        ultimaSesion = new componentesVisuales.LabelAltaDefinicion();
        panelSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        labelSalir1 = new componentesVisuales.LabelAltaDefinicion();
        panelOcultar = new javax.swing.JPanel();
        labelOcultar = new componentesVisuales.LabelAltaDefinicion();
        lFechaActual = new componentesVisuales.LabelAltaDefinicion();
        hora = new componentesVisuales.LabelAltaDefinicion();
        panelPadre = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(0, 74, 173));
        panelIzquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcono(new javax.swing.ImageIcon(getClass().getResource("/LOGO2.png"))); // NOI18N
        panelIzquierdo.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 141, 141));

        panelNuevoTipo.setBackground(new java.awt.Color(0, 73, 173));
        panelNuevoTipo.setPreferredSize(new java.awt.Dimension(210, 70));
        panelNuevoTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNuevoTipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelNuevoTipoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelNuevoTipoMouseExited(evt);
            }
        });
        panelNuevoTipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarTipo.setForeground(new java.awt.Color(255, 255, 255));
        agregarTipo.setText("     Agregar Nuevo Tipo");
        agregarTipo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        agregarTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarTipoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarTipoMouseExited(evt);
            }
        });
        panelNuevoTipo.add(agregarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 0, 180, 70));

        agregarTipoICO.setIcono(new javax.swing.ImageIcon(getClass().getResource("/user-addlist.png"))); // NOI18N
        agregarTipoICO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTipoICOMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarTipoICOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarTipoICOMouseExited(evt);
            }
        });
        panelNuevoTipo.add(agregarTipoICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        panelIzquierdo.add(panelNuevoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 70));

        lBaner.setForeground(new java.awt.Color(255, 255, 255));
        lBaner.setText("TechCare®");
        lBaner.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        panelIzquierdo.add(lBaner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        banerInferior.setForeground(new java.awt.Color(255, 255, 255));
        banerInferior.setText("TechCare®");
        banerInferior.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        banerInferior.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        panelIzquierdo.add(banerInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 200, 40));

        bannerInferior2.setForeground(new java.awt.Color(255, 255, 255));
        bannerInferior2.setText("System");
        bannerInferior2.setFont(new java.awt.Font("Segoe UI", 3, 50)); // NOI18N
        panelIzquierdo.add(bannerInferior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 170, -1));

        agregarMarcaP.setBackground(new java.awt.Color(0, 73, 173));
        agregarMarcaP.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        agregarMarcaP.setPreferredSize(new java.awt.Dimension(210, 70));
        agregarMarcaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMarcaPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarMarcaPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarMarcaPMouseExited(evt);
            }
        });
        agregarMarcaP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarMarcaICO.setIcono(new javax.swing.ImageIcon(getClass().getResource("/gestionUsers.png"))); // NOI18N
        agregarMarcaICO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarMarcaICOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarMarcaICOMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarMarcaICOMousePressed(evt);
            }
        });
        agregarMarcaP.add(agregarMarcaICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        agregarMarca.setForeground(new java.awt.Color(255, 255, 255));
        agregarMarca.setText("    Agregar Marca");
        agregarMarca.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        agregarMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarMarcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarMarcaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarMarcaMousePressed(evt);
            }
        });
        agregarMarcaP.add(agregarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 70));

        panelIzquierdo.add(agregarMarcaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 347, 230, 70));

        panelHome.setBackground(new java.awt.Color(0, 74, 173));
        panelHome.setPreferredSize(new java.awt.Dimension(210, 70));
        panelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelHomeMouseExited(evt);
            }
        });
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setForeground(new java.awt.Color(255, 255, 255));
        principal.setText("   Principal");
        principal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                principalMousePressed(evt);
            }
        });
        panelHome.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 8, 170, 60));

        labelAltaDefinicion2.setIcono(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        labelAltaDefinicion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAltaDefinicion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAltaDefinicion2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelAltaDefinicion2MousePressed(evt);
            }
        });
        panelHome.add(labelAltaDefinicion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        panelIzquierdo.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 208, 230, 70));

        panelFondo.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 800));

        PanelTituloB.setBackground(new java.awt.Color(0, 74, 173));

        labelBienvanida.setForeground(new java.awt.Color(255, 255, 255));
        labelBienvanida.setText("Bienvenido:");
        labelBienvanida.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N

        ultimaSesion.setForeground(new java.awt.Color(255, 255, 255));
        ultimaSesion.setText("Su ultima sesion fue :");
        ultimaSesion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout PanelTituloBLayout = new javax.swing.GroupLayout(PanelTituloB);
        PanelTituloB.setLayout(PanelTituloBLayout);
        PanelTituloBLayout.setHorizontalGroup(
            PanelTituloBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloBLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelTituloBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBienvanida, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ultimaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        PanelTituloBLayout.setVerticalGroup(
            PanelTituloBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBienvanida, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ultimaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelFondo.add(PanelTituloB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 1020, 110));

        panelSuperior.setBackground(new java.awt.Color(255, 255, 255));
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

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));
        panelSalir.setPreferredSize(new java.awt.Dimension(31, 30));

        labelSalir1.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addComponent(labelSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addComponent(labelSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        panelOcultar.setBackground(new java.awt.Color(255, 255, 255));
        panelOcultar.setPreferredSize(new java.awt.Dimension(32, 30));

        labelOcultar.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(panelOcultarLayout.createSequentialGroup()
                .addComponent(labelOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        panelOcultarLayout.setVerticalGroup(
            panelOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOcultarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lFechaActual.setForeground(new java.awt.Color(102, 102, 102));
        lFechaActual.setText("Hoy es");
        lFechaActual.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lFechaActual.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        hora.setForeground(new java.awt.Color(102, 102, 102));
        hora.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        hora.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(lFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(584, 584, 584)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panelFondo.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, -1));

        panelPadre.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPadreLayout = new javax.swing.GroupLayout(panelPadre);
        panelPadre.setLayout(panelPadreLayout);
        panelPadreLayout.setHorizontalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        panelPadreLayout.setVerticalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        panelFondo.add(panelPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 1020, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelNuevoTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNuevoTipoMouseClicked
       Mostrar.mostrarPanel(panelPadre, new RegistrarCliente());
    }//GEN-LAST:event_panelNuevoTipoMouseClicked

    private void panelNuevoTipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNuevoTipoMouseEntered
        panelNuevoTipo.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_panelNuevoTipoMouseEntered

    private void panelNuevoTipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNuevoTipoMouseExited
        panelNuevoTipo.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_panelNuevoTipoMouseExited

    private void agregarMarcaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaPMouseClicked
        Mostrar.mostrarPanel(panelPadre, new GestionDeClientes());
    }//GEN-LAST:event_agregarMarcaPMouseClicked

    private void agregarMarcaPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaPMouseEntered
        agregarMarcaP.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_agregarMarcaPMouseEntered

    private void agregarMarcaPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaPMouseExited
        agregarMarcaP.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_agregarMarcaPMouseExited

    private void panelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseClicked
       Mostrar.mostrarPanel(panelPadre, new PanelPadre2Capturista());
    }//GEN-LAST:event_panelHomeMouseClicked

    private void panelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseEntered
        panelHome.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_panelHomeMouseEntered

    private void panelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseExited
        panelHome.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_panelHomeMouseExited

    private void labelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseClicked
        this.dispose();
    }//GEN-LAST:event_labelSalir1MouseClicked

    private void labelSalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseEntered
        panelSalir.setBackground(new Color(220, 0, 0));
        labelSalir1.setForeground(Color.white);
    }//GEN-LAST:event_labelSalir1MouseEntered

    private void labelSalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseExited
        panelSalir.setBackground(new Color(255, 255, 255));
        labelSalir1.setForeground(Color.black);
    }//GEN-LAST:event_labelSalir1MouseExited

    private void labelOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelOcultarMouseClicked

    private void labelOcultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseEntered
        panelOcultar.setBackground(new Color(0, 153, 204));
        labelOcultar.setForeground(Color.white);
    }//GEN-LAST:event_labelOcultarMouseEntered

    private void labelOcultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseExited
        panelOcultar.setBackground(new Color(255, 255, 255));
        labelOcultar.setForeground(Color.black);
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

    private void agregarTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTipoMouseClicked
        // agregar tipo aqui
    }//GEN-LAST:event_agregarTipoMouseClicked

    private void agregarTipoICOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTipoICOMouseClicked
         // agregar tipo aqui
    }//GEN-LAST:event_agregarTipoICOMouseClicked

    private void agregarTipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTipoMouseEntered
        panelNuevoTipo.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_agregarTipoMouseEntered

    private void agregarTipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTipoMouseExited
        panelNuevoTipo.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_agregarTipoMouseExited

    private void agregarTipoICOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTipoICOMouseEntered
        panelNuevoTipo.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_agregarTipoICOMouseEntered

    private void agregarTipoICOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTipoICOMouseExited
        panelNuevoTipo.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_agregarTipoICOMouseExited

    private void principalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseEntered
       panelHome.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_principalMouseEntered

    private void labelAltaDefinicion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAltaDefinicion2MouseEntered
       panelHome.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_labelAltaDefinicion2MouseEntered

    private void principalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseExited
        panelHome.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_principalMouseExited

    private void labelAltaDefinicion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAltaDefinicion2MouseExited
        panelHome.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_labelAltaDefinicion2MouseExited

    private void agregarMarcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaMouseEntered
        agregarMarcaP.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_agregarMarcaMouseEntered

    private void agregarMarcaICOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaICOMouseEntered
        agregarMarcaP.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_agregarMarcaICOMouseEntered

    private void agregarMarcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaMouseExited
        agregarMarcaP.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_agregarMarcaMouseExited

    private void agregarMarcaICOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaICOMouseExited
        agregarMarcaP.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_agregarMarcaICOMouseExited

    private void principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMousePressed
        Mostrar.mostrarPanel(panelPadre, new ventanas.paneles.RegistrarEquipos());
    }//GEN-LAST:event_principalMousePressed

    private void labelAltaDefinicion2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAltaDefinicion2MousePressed
        Mostrar.mostrarPanel(panelPadre, new ventanas.paneles.RegistrarEquipos());
    }//GEN-LAST:event_labelAltaDefinicion2MousePressed

    private void agregarMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaMousePressed
      // agregar Marca aqui
    }//GEN-LAST:event_agregarMarcaMousePressed

    private void agregarMarcaICOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMarcaICOMousePressed
        // agregar Marca aqui
    }//GEN-LAST:event_agregarMarcaICOMousePressed

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
            java.util.logging.Logger.getLogger(RegistrarEquiposForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquiposForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquiposForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquiposForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEquiposForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTituloB;
    private componentesVisuales.LabelAltaDefinicion agregarMarca;
    private componentesVisuales.LabelAltaDefinicion agregarMarcaICO;
    private javax.swing.JPanel agregarMarcaP;
    private componentesVisuales.LabelAltaDefinicion agregarTipo;
    private componentesVisuales.LabelAltaDefinicion agregarTipoICO;
    private componentesVisuales.LabelAltaDefinicion banerInferior;
    private componentesVisuales.LabelAltaDefinicion bannerInferior2;
    private componentesVisuales.LabelAltaDefinicion hora;
    private componentesVisuales.LabelAltaDefinicion lBaner;
    private componentesVisuales.LabelAltaDefinicion lFechaActual;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion2;
    private componentesVisuales.LabelAltaDefinicion labelBienvanida;
    private componentesVisuales.LabelAltaDefinicion labelLogo;
    private componentesVisuales.LabelAltaDefinicion labelOcultar;
    private componentesVisuales.LabelAltaDefinicion labelSalir1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelNuevoTipo;
    private javax.swing.JPanel panelOcultar;
    private javax.swing.JPanel panelPadre;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelSuperior;
    private componentesVisuales.LabelAltaDefinicion principal;
    private componentesVisuales.LabelAltaDefinicion ultimaSesion;
    // End of variables declaration//GEN-END:variables
}
