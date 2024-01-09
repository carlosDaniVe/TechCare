package ventanas;

import clases.Conectar;
import clases.Fechas;
import clases.Mostrar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import ventanas.paneles.GestionDeEquipos;
import ventanas.paneles.GraficaEstatus;
import ventanas.paneles.GraficaMarcas;
import ventanas.paneles.GraficaTipos;
import ventanas.paneles.PanelPadre2Tecnico;


/**
 *
 * @author Carlos Hernandez
 */
public class Tecnico extends javax.swing.JFrame {

    int xmouse, ymouse, bandera;
    String usuario, ultimoIngreso;
    
    public Tecnico() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        bandera = Administrador.bandera;
        usuario = Login.user;
        ultimoIngreso = Login.ultimoIngreso1;
        labelBienvanida.setText("Bienvenido: " + usuario);
        lFechaActual.setText("Hoy es: " + Fechas.fechaDiaMesAñoHora(1) + " | ");
        ultimaSesion.setText("Su ultima sesion fue: " + ultimoIngreso);
        
        try {
            Connection cn2 = Conectar.conectar();
            ultimoIngreso = Fechas.fechaDiaMesAñoHora(2);
            PreparedStatement ps2 = cn2.prepareStatement(
                    "UPDATE usuarios SET ultimoIngreso = ? WHERE username = ?");

            ps2.setString(1, ultimoIngreso);
            ps2.setString(2, usuario);
            ps2.executeUpdate();

            cn2.close();
            ps2.close();

        } catch (SQLException e) {
            System.out.println("Error actualizar fecha " + e);
        }
        
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
        
        Mostrar.mostrarPanel(panelPadre, new PanelPadre2Tecnico());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        labelLogo = new componentesVisuales.LabelAltaDefinicion();
        graficaTip = new javax.swing.JPanel();
        graficasTipos = new componentesVisuales.LabelAltaDefinicion();
        imprimirICO = new componentesVisuales.LabelAltaDefinicion();
        gestionarEq = new javax.swing.JPanel();
        gestionEquipo = new componentesVisuales.LabelAltaDefinicion();
        registarICO = new componentesVisuales.LabelAltaDefinicion();
        lBaner = new componentesVisuales.LabelAltaDefinicion();
        banerInferior = new componentesVisuales.LabelAltaDefinicion();
        bannerInferior2 = new componentesVisuales.LabelAltaDefinicion();
        graficasEs = new javax.swing.JPanel();
        gestionarICO = new componentesVisuales.LabelAltaDefinicion();
        graficasEstatus = new componentesVisuales.LabelAltaDefinicion();
        graficaMar = new javax.swing.JPanel();
        labelAltaDefinicion3 = new componentesVisuales.LabelAltaDefinicion();
        graficaMarca = new componentesVisuales.LabelAltaDefinicion();
        panelHome = new javax.swing.JPanel();
        labelAltaDefinicion2 = new componentesVisuales.LabelAltaDefinicion();
        principal = new componentesVisuales.LabelAltaDefinicion();
        PanelTituloB = new javax.swing.JPanel();
        labelBienvanida = new componentesVisuales.LabelAltaDefinicion();
        ultimaSesion = new componentesVisuales.LabelAltaDefinicion();
        panelSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        labelSalir1 = new componentesVisuales.LabelAltaDefinicion();
        panelOcultar = new javax.swing.JPanel();
        labelOcultar = new componentesVisuales.LabelAltaDefinicion();
        hora = new componentesVisuales.LabelAltaDefinicion();
        lFechaActual = new componentesVisuales.LabelAltaDefinicion();
        panelPadre = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(0, 74, 173));
        panelIzquierdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcono(new javax.swing.ImageIcon(getClass().getResource("/LOGO2.png"))); // NOI18N
        panelIzquierdo.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 141, 141));

        graficaTip.setBackground(new java.awt.Color(0, 73, 173));
        graficaTip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                graficaTipMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graficaTipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graficaTipMouseExited(evt);
            }
        });
        graficaTip.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        graficasTipos.setForeground(new java.awt.Color(255, 255, 255));
        graficasTipos.setText("     Greficas de Tipos");
        graficasTipos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        graficaTip.add(graficasTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 70));

        imprimirICO.setIcono(new javax.swing.ImageIcon(getClass().getResource("/graficaCircular.png"))); // NOI18N
        graficaTip.add(imprimirICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        panelIzquierdo.add(graficaTip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 71));

        gestionarEq.setBackground(new java.awt.Color(0, 73, 173));
        gestionarEq.setPreferredSize(new java.awt.Dimension(210, 70));
        gestionarEq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarEqMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gestionarEqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gestionarEqMouseExited(evt);
            }
        });
        gestionarEq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gestionEquipo.setForeground(new java.awt.Color(255, 255, 255));
        gestionEquipo.setText("    Gestion de Equipos");
        gestionEquipo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        gestionarEq.add(gestionEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 0, 180, 70));

        registarICO.setIcono(new javax.swing.ImageIcon(getClass().getResource("/gestionEquipos.png"))); // NOI18N
        gestionarEq.add(registarICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        panelIzquierdo.add(gestionarEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 281, 230, 70));

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

        graficasEs.setBackground(new java.awt.Color(0, 73, 173));
        graficasEs.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        graficasEs.setPreferredSize(new java.awt.Dimension(210, 70));
        graficasEs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                graficasEsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graficasEsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graficasEsMouseExited(evt);
            }
        });
        graficasEs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gestionarICO.setIcono(new javax.swing.ImageIcon(getClass().getResource("/graficasDebarras.png"))); // NOI18N
        graficasEs.add(gestionarICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        graficasEstatus.setForeground(new java.awt.Color(255, 255, 255));
        graficasEstatus.setText("    Graficas de Estatus");
        graficasEstatus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        graficasEs.add(graficasEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 70));

        panelIzquierdo.add(graficasEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 70));

        graficaMar.setBackground(new java.awt.Color(0, 73, 173));
        graficaMar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graficaMarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graficaMarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                graficaMarMousePressed(evt);
            }
        });
        graficaMar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAltaDefinicion3.setForeground(new java.awt.Color(255, 255, 255));
        labelAltaDefinicion3.setText("  Graficas de Marcas");
        labelAltaDefinicion3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelAltaDefinicion3.setPreferredSize(new java.awt.Dimension(135, 20));
        graficaMar.add(labelAltaDefinicion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 0, 169, 71));

        graficaMarca.setIcono(new javax.swing.ImageIcon(getClass().getResource("/graficasDebarras.png"))); // NOI18N
        graficaMar.add(graficaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        panelIzquierdo.add(graficaMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 230, 71));

        panelHome.setBackground(new java.awt.Color(0, 73, 173));
        panelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHomeMousePressed(evt);
            }
        });
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAltaDefinicion2.setIcono(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        panelHome.add(labelAltaDefinicion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        principal.setForeground(new java.awt.Color(255, 255, 255));
        principal.setText("   Principal");
        principal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelHome.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 70));

        panelIzquierdo.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 70));

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
                    .addComponent(ultimaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        hora.setForeground(new java.awt.Color(102, 102, 102));
        hora.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        hora.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        lFechaActual.setForeground(new java.awt.Color(102, 102, 102));
        lFechaActual.setText("Hoy es");
        lFechaActual.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lFechaActual.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(lFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(561, 561, 561)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void graficaTipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficaTipMouseEntered
        graficaTip.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_graficaTipMouseEntered

    private void graficaTipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficaTipMouseExited
        graficaTip.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_graficaTipMouseExited

    private void graficasEsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficasEsMouseClicked
        Mostrar.mostrarPanel(panelPadre, new GraficaEstatus());
    }//GEN-LAST:event_graficasEsMouseClicked

    private void graficasEsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficasEsMouseEntered
        graficasEs.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_graficasEsMouseEntered

    private void graficasEsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficasEsMouseExited
        graficasEs.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_graficasEsMouseExited

    private void labelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseClicked
        
         if (bandera == 0){
           this.dispose();
           new Login().setVisible(true);
       } else if (bandera != 0){
           this.dispose();
       }
        
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

    private void graficaTipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficaTipMouseClicked
        
        Mostrar.mostrarPanel(panelPadre, new GraficaTipos());
    }//GEN-LAST:event_graficaTipMouseClicked

    private void graficaMarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficaMarMouseEntered
        graficaMar.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_graficaMarMouseEntered

    private void graficaMarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficaMarMouseExited
        graficaMar.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_graficaMarMouseExited

    private void graficaMarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graficaMarMousePressed
       Mostrar.mostrarPanel(panelPadre, new GraficaMarcas());
    }//GEN-LAST:event_graficaMarMousePressed

    private void gestionarEqMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarEqMouseExited
        gestionarEq.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_gestionarEqMouseExited

    private void gestionarEqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarEqMouseEntered
        gestionarEq.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_gestionarEqMouseEntered

    private void gestionarEqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarEqMouseClicked
        Mostrar.mostrarPanel(panelPadre, new GestionDeEquipos());
    }//GEN-LAST:event_gestionarEqMouseClicked

    private void panelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseEntered
        panelHome.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_panelHomeMouseEntered

    private void panelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseExited
        panelHome.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_panelHomeMouseExited

    private void panelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMousePressed
        
       Mostrar.mostrarPanel(panelPadre, new PanelPadre2Tecnico());
       
    }//GEN-LAST:event_panelHomeMousePressed

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
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTituloB;
    private componentesVisuales.LabelAltaDefinicion banerInferior;
    private componentesVisuales.LabelAltaDefinicion bannerInferior2;
    private componentesVisuales.LabelAltaDefinicion gestionEquipo;
    private javax.swing.JPanel gestionarEq;
    private componentesVisuales.LabelAltaDefinicion gestionarICO;
    private javax.swing.JPanel graficaMar;
    private componentesVisuales.LabelAltaDefinicion graficaMarca;
    private javax.swing.JPanel graficaTip;
    private javax.swing.JPanel graficasEs;
    private componentesVisuales.LabelAltaDefinicion graficasEstatus;
    private componentesVisuales.LabelAltaDefinicion graficasTipos;
    private componentesVisuales.LabelAltaDefinicion hora;
    private componentesVisuales.LabelAltaDefinicion imprimirICO;
    private componentesVisuales.LabelAltaDefinicion lBaner;
    private componentesVisuales.LabelAltaDefinicion lFechaActual;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion2;
    private componentesVisuales.LabelAltaDefinicion labelAltaDefinicion3;
    private componentesVisuales.LabelAltaDefinicion labelBienvanida;
    private componentesVisuales.LabelAltaDefinicion labelLogo;
    private componentesVisuales.LabelAltaDefinicion labelOcultar;
    private componentesVisuales.LabelAltaDefinicion labelSalir1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelOcultar;
    public static javax.swing.JPanel panelPadre;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelSuperior;
    private componentesVisuales.LabelAltaDefinicion principal;
    private componentesVisuales.LabelAltaDefinicion registarICO;
    private componentesVisuales.LabelAltaDefinicion ultimaSesion;
    // End of variables declaration//GEN-END:variables
}
