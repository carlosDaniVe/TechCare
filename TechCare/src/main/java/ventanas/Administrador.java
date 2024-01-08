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
import javax.swing.JFrame;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.Date;
import ventanas.paneles.AcercaDe;
import ventanas.paneles.GestionDeUsuarios;
import ventanas.paneles.PanelPadre2Admin;
import ventanas.paneles.RegistroDeUsuarios;

/**
 *
 * @author Carlos Hernandez
 */
public class Administrador extends javax.swing.JFrame {

    int xmouse, ymouse;
    String usuario;
    public static int bandera = 0;

    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        usuario = Login.user;
        labelBienvanida.setText("Bienvenido: " + usuario);
        banerInferior.setText("TechCare® " + Fechas.fechaDiaMesAñoHora(3));
        Mostrar.mostrarPanel(PanelPadre, new PanelPadre2Admin());
        lFechaActual.setText("Hoy es: " + Fechas.fechaDiaMesAñoHora(1) + " | ");

        try {
            Connection cn2 = Conectar.conectar();
            String ultimoIngreso = Fechas.fechaDiaMesAñoHora(2);
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

        String ultimoIngreso = Login.ultimoIngreso1;
        ultimaSesion.setText("Su ultima sesion fue: " + ultimoIngreso);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        PanelTituloB = new javax.swing.JPanel();
        labelBienvanida = new componentesVisuales.LabelAltaDefinicion();
        ultimaSesion = new componentesVisuales.LabelAltaDefinicion();
        panelIzquierdo = new javax.swing.JPanel();
        labelLogo = new componentesVisuales.LabelAltaDefinicion();
        gestionarUsuarios = new javax.swing.JPanel();
        Lgestionar = new componentesVisuales.LabelAltaDefinicion();
        lGestionarIc = new componentesVisuales.LabelAltaDefinicion();
        capturistaB = new javax.swing.JPanel();
        lCapturista = new componentesVisuales.LabelAltaDefinicion();
        lCapturistaIc = new componentesVisuales.LabelAltaDefinicion();
        panelHome = new javax.swing.JPanel();
        lHome = new componentesVisuales.LabelAltaDefinicion();
        lHomeIc = new componentesVisuales.LabelAltaDefinicion();
        acercadeB = new javax.swing.JPanel();
        lAcercaDeIc = new componentesVisuales.LabelAltaDefinicion();
        lAcercaDe = new componentesVisuales.LabelAltaDefinicion();
        opciones = new javax.swing.JPanel();
        lBaner = new componentesVisuales.LabelAltaDefinicion();
        banerInferior = new componentesVisuales.LabelAltaDefinicion();
        bannerInferior2 = new componentesVisuales.LabelAltaDefinicion();
        registrarUsuarioB1 = new javax.swing.JPanel();
        lRegistrar1 = new componentesVisuales.LabelAltaDefinicion();
        lRegistrarIc1 = new componentesVisuales.LabelAltaDefinicion();
        tecnicoB = new javax.swing.JPanel();
        lTecnicoIc = new componentesVisuales.LabelAltaDefinicion();
        lTecnico = new componentesVisuales.LabelAltaDefinicion();
        panelSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        labelSalir1 = new componentesVisuales.LabelAltaDefinicion();
        panelOcultar = new javax.swing.JPanel();
        labelOcultar = new componentesVisuales.LabelAltaDefinicion();
        lFechaActual = new componentesVisuales.LabelAltaDefinicion();
        hora = new componentesVisuales.LabelAltaDefinicion();
        PanelPadre = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                    .addComponent(ultimaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        panelIzquierdo.setBackground(new java.awt.Color(0, 74, 173));

        labelLogo.setIcono(new javax.swing.ImageIcon(getClass().getResource("/LOGO2.png"))); // NOI18N

        gestionarUsuarios.setBackground(new java.awt.Color(0, 74, 173));
        gestionarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionarUsuariosMouseClicked(evt);
            }
        });
        gestionarUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lgestionar.setForeground(new java.awt.Color(255, 255, 255));
        Lgestionar.setText(" Gestionar Usuarios");
        Lgestionar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Lgestionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LgestionarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LgestionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LgestionarMouseExited(evt);
            }
        });
        gestionarUsuarios.add(Lgestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 70));

        lGestionarIc.setIcono(new javax.swing.ImageIcon(getClass().getResource("/gestionUsers.png"))); // NOI18N
        lGestionarIc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGestionarIcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lGestionarIcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lGestionarIcMouseExited(evt);
            }
        });
        gestionarUsuarios.add(lGestionarIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        capturistaB.setBackground(new java.awt.Color(0, 73, 173));
        capturistaB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lCapturista.setForeground(new java.awt.Color(255, 255, 255));
        lCapturista.setText("      Capturista");
        lCapturista.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lCapturista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCapturistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lCapturistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lCapturistaMouseExited(evt);
            }
        });
        capturistaB.add(lCapturista, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 70));

        lCapturistaIc.setIcono(new javax.swing.ImageIcon(getClass().getResource("/capturista.png"))); // NOI18N
        lCapturistaIc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCapturistaIcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lCapturistaIcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lCapturistaIcMouseExited(evt);
            }
        });
        capturistaB.add(lCapturistaIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        panelHome.setBackground(new java.awt.Color(0, 74, 173));
        panelHome.setPreferredSize(new java.awt.Dimension(210, 70));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lHome.setForeground(new java.awt.Color(255, 255, 255));
        lHome.setText("    Principal");
        lHome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lHomeMouseExited(evt);
            }
        });
        panelHome.add(lHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 70));

        lHomeIc.setIcono(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        lHomeIc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lHomeIcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lHomeIcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lHomeIcMouseExited(evt);
            }
        });
        panelHome.add(lHomeIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        acercadeB.setBackground(new java.awt.Color(0, 73, 173));
        acercadeB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lAcercaDeIc.setIcono(new javax.swing.ImageIcon(getClass().getResource("/acercaDe.png"))); // NOI18N
        lAcercaDeIc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lAcercaDeIcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lAcercaDeIcMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lAcercaDeIcMousePressed(evt);
            }
        });
        acercadeB.add(lAcercaDeIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        lAcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        lAcercaDe.setText("   Acerce de");
        lAcercaDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lAcercaDeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lAcercaDeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lAcercaDeMousePressed(evt);
            }
        });
        acercadeB.add(lAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 72));

        opciones.setBackground(new java.awt.Color(0, 74, 173));
        opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lBaner.setForeground(new java.awt.Color(255, 255, 255));
        lBaner.setText("TechCare®");
        lBaner.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        banerInferior.setForeground(new java.awt.Color(255, 255, 255));
        banerInferior.setText("TechCare®");
        banerInferior.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        banerInferior.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        bannerInferior2.setForeground(new java.awt.Color(255, 255, 255));
        bannerInferior2.setText("System");
        bannerInferior2.setFont(new java.awt.Font("Segoe UI", 3, 50)); // NOI18N

        registrarUsuarioB1.setBackground(new java.awt.Color(0, 74, 173));
        registrarUsuarioB1.setPreferredSize(new java.awt.Dimension(210, 70));
        registrarUsuarioB1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        lRegistrar1.setText("    Registrar Usuario");
        lRegistrar1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lRegistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lRegistrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lRegistrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lRegistrar1MouseExited(evt);
            }
        });
        registrarUsuarioB1.add(lRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 70));

        lRegistrarIc1.setIcono(new javax.swing.ImageIcon(getClass().getResource("/user-addlist.png"))); // NOI18N
        lRegistrarIc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lRegistrarIc1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lRegistrarIc1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lRegistrarIc1MouseExited(evt);
            }
        });
        registrarUsuarioB1.add(lRegistrarIc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        tecnicoB.setBackground(new java.awt.Color(0, 73, 173));
        tecnicoB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lTecnicoIc.setIcono(new javax.swing.ImageIcon(getClass().getResource("/tecnico.png"))); // NOI18N
        lTecnicoIc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lTecnicoIcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTecnicoIcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTecnicoIcMouseExited(evt);
            }
        });
        tecnicoB.add(lTecnicoIc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        lTecnico.setForeground(new java.awt.Color(255, 255, 255));
        lTecnico.setText("     Tecnico");
        lTecnico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lTecnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lTecnicoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lTecnicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lTecnicoMouseExited(evt);
            }
        });
        tecnicoB.add(lTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 70));

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lBaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(registrarUsuarioB1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(gestionarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tecnicoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(capturistaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(acercadeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bannerInferior2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(banerInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lBaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registrarUsuarioB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gestionarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(tecnicoB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(capturistaB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(acercadeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bannerInferior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(banerInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        capturistaB.getAccessibleContext().setAccessibleName("");

        panelFondo.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 800));

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
        panelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelSuperior.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, -1, -1));

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

        panelSuperior.add(panelOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, -1, -1));

        lFechaActual.setForeground(new java.awt.Color(102, 102, 102));
        lFechaActual.setText("Hoy es");
        lFechaActual.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lFechaActual.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelSuperior.add(lFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 5, 200, 20));

        hora.setForeground(new java.awt.Color(102, 102, 102));
        hora.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        hora.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelSuperior.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 6, 220, 20));

        panelFondo.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 30));

        PanelPadre.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPadreLayout = new javax.swing.GroupLayout(PanelPadre);
        PanelPadre.setLayout(PanelPadreLayout);
        PanelPadreLayout.setHorizontalGroup(
            PanelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        PanelPadreLayout.setVerticalGroup(
            PanelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        panelFondo.add(PanelPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 1020, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int xOnSreen = evt.getXOnScreen();
        int yOnScreen = evt.getYOnScreen();

        this.setLocation(xOnSreen - xmouse, yOnScreen - ymouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void labelSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_labelSalir1MouseClicked

    private void labelSalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseEntered
        panelSalir.setBackground(new Color(220, 0, 0));
        labelSalir1.setForeground(Color.white);
    }//GEN-LAST:event_labelSalir1MouseEntered

    private void labelSalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalir1MouseExited
        panelSalir.setBackground(new Color(255, 255, 255));
        labelSalir1.setForeground(Color.black);
    }//GEN-LAST:event_labelSalir1MouseExited

    private void labelOcultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseEntered
        panelOcultar.setBackground(new Color(0, 153, 204));
        labelOcultar.setForeground(Color.white);
    }//GEN-LAST:event_labelOcultarMouseEntered

    private void labelOcultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseExited
        panelOcultar.setBackground(new Color(255, 255, 255));
        labelOcultar.setForeground(Color.black);
    }//GEN-LAST:event_labelOcultarMouseExited

    private void labelOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOcultarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelOcultarMouseClicked

    private void lTecnicoIcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTecnicoIcMouseEntered
        tecnicoB.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lTecnicoIcMouseEntered

    private void lTecnicoIcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTecnicoIcMouseExited
        tecnicoB.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lTecnicoIcMouseExited

    private void lTecnicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTecnicoMouseEntered
        tecnicoB.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lTecnicoMouseEntered

    private void lTecnicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTecnicoMouseExited
        tecnicoB.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lTecnicoMouseExited

    private void lTecnicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTecnicoMouseClicked
        
        bandera = 1;
        new Tecnico().setVisible(true);
    }//GEN-LAST:event_lTecnicoMouseClicked

    private void lTecnicoIcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lTecnicoIcMouseClicked
      
        bandera = 1;
        new Tecnico().setVisible(true);
    }//GEN-LAST:event_lTecnicoIcMouseClicked

    private void lRegistrarIc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrarIc1MouseExited
        registrarUsuarioB1.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lRegistrarIc1MouseExited

    private void lRegistrarIc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrarIc1MouseEntered
        registrarUsuarioB1.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lRegistrarIc1MouseEntered

    private void lRegistrarIc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrarIc1MouseClicked
        RegistroDeUsuarios registrarr = new RegistroDeUsuarios();
        Mostrar.mostrarPanel(PanelPadre, registrarr);
    }//GEN-LAST:event_lRegistrarIc1MouseClicked

    private void lRegistrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrar1MouseExited
        registrarUsuarioB1.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lRegistrar1MouseExited

    private void lRegistrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrar1MouseEntered
        registrarUsuarioB1.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lRegistrar1MouseEntered

    private void lRegistrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lRegistrar1MouseClicked
        RegistroDeUsuarios registrar = new RegistroDeUsuarios();
        Mostrar.mostrarPanel(PanelPadre, registrar);
    }//GEN-LAST:event_lRegistrar1MouseClicked

    private void lAcercaDeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAcercaDeMousePressed
        Mostrar.mostrarPanel(PanelPadre, new AcercaDe());
    }//GEN-LAST:event_lAcercaDeMousePressed

    private void lAcercaDeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAcercaDeMouseExited
        acercadeB.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lAcercaDeMouseExited

    private void lAcercaDeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAcercaDeMouseEntered
        acercadeB.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lAcercaDeMouseEntered

    private void lAcercaDeIcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAcercaDeIcMousePressed
        Mostrar.mostrarPanel(PanelPadre, new AcercaDe());
    }//GEN-LAST:event_lAcercaDeIcMousePressed

    private void lAcercaDeIcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAcercaDeIcMouseExited
        acercadeB.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lAcercaDeIcMouseExited

    private void lAcercaDeIcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lAcercaDeIcMouseEntered
        acercadeB.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lAcercaDeIcMouseEntered

    private void lHomeIcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeIcMouseExited
        panelHome.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lHomeIcMouseExited

    private void lHomeIcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeIcMouseEntered
        panelHome.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lHomeIcMouseEntered

    private void lHomeIcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeIcMouseClicked
        Mostrar.mostrarPanel(PanelPadre, new PanelPadre2Admin());
    }//GEN-LAST:event_lHomeIcMouseClicked

    private void lHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeMouseExited
        panelHome.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lHomeMouseExited

    private void lHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeMouseEntered
        panelHome.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lHomeMouseEntered

    private void lHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lHomeMouseClicked
        PanelPadre2Admin p2 = new PanelPadre2Admin();
        Mostrar.mostrarPanel(PanelPadre, p2);
    }//GEN-LAST:event_lHomeMouseClicked

    private void lCapturistaIcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCapturistaIcMouseExited
        capturistaB.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lCapturistaIcMouseExited

    private void lCapturistaIcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCapturistaIcMouseEntered
        capturistaB.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lCapturistaIcMouseEntered

    private void lCapturistaIcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCapturistaIcMouseClicked
        // new Capturista().setVisible(true);
    }//GEN-LAST:event_lCapturistaIcMouseClicked

    private void lCapturistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCapturistaMouseExited
        capturistaB.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lCapturistaMouseExited

    private void lCapturistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCapturistaMouseEntered
        capturistaB.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lCapturistaMouseEntered

    private void lCapturistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCapturistaMouseClicked

        bandera = 1;
        Capturista capturista = new Capturista();
        capturista.setVisible(true);

    }//GEN-LAST:event_lCapturistaMouseClicked

    private void gestionarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionarUsuariosMouseClicked
        
        bandera = 1;
        Capturista capturista = new Capturista();
        capturista.setVisible(true);

    }//GEN-LAST:event_gestionarUsuariosMouseClicked

    private void lGestionarIcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGestionarIcMouseExited
        gestionarUsuarios.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_lGestionarIcMouseExited

    private void lGestionarIcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGestionarIcMouseEntered
        gestionarUsuarios.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_lGestionarIcMouseEntered

    private void lGestionarIcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGestionarIcMouseClicked
        GestionDeUsuarios gestionUsers = new GestionDeUsuarios();
        Mostrar.mostrarPanel(PanelPadre, gestionUsers);
    }//GEN-LAST:event_lGestionarIcMouseClicked

    private void LgestionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LgestionarMouseExited
        gestionarUsuarios.setBackground(new Color(0, 73, 173));
    }//GEN-LAST:event_LgestionarMouseExited

    private void LgestionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LgestionarMouseEntered
        gestionarUsuarios.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_LgestionarMouseEntered

    private void LgestionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LgestionarMouseClicked
        GestionDeUsuarios gestionUsers = new GestionDeUsuarios();
        Mostrar.mostrarPanel(PanelPadre, gestionUsers);
    }//GEN-LAST:event_LgestionarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentesVisuales.LabelAltaDefinicion Lgestionar;
    public static javax.swing.JPanel PanelPadre;
    private javax.swing.JPanel PanelTituloB;
    private javax.swing.JPanel acercadeB;
    private componentesVisuales.LabelAltaDefinicion banerInferior;
    private componentesVisuales.LabelAltaDefinicion bannerInferior2;
    private javax.swing.JPanel capturistaB;
    private javax.swing.JPanel gestionarUsuarios;
    private componentesVisuales.LabelAltaDefinicion hora;
    private componentesVisuales.LabelAltaDefinicion lAcercaDe;
    private componentesVisuales.LabelAltaDefinicion lAcercaDeIc;
    private componentesVisuales.LabelAltaDefinicion lBaner;
    private componentesVisuales.LabelAltaDefinicion lCapturista;
    private componentesVisuales.LabelAltaDefinicion lCapturistaIc;
    private componentesVisuales.LabelAltaDefinicion lFechaActual;
    private componentesVisuales.LabelAltaDefinicion lGestionarIc;
    private componentesVisuales.LabelAltaDefinicion lHome;
    private componentesVisuales.LabelAltaDefinicion lHomeIc;
    private componentesVisuales.LabelAltaDefinicion lRegistrar1;
    private componentesVisuales.LabelAltaDefinicion lRegistrarIc1;
    private componentesVisuales.LabelAltaDefinicion lTecnico;
    private componentesVisuales.LabelAltaDefinicion lTecnicoIc;
    private componentesVisuales.LabelAltaDefinicion labelBienvanida;
    private componentesVisuales.LabelAltaDefinicion labelLogo;
    private componentesVisuales.LabelAltaDefinicion labelOcultar;
    private componentesVisuales.LabelAltaDefinicion labelSalir1;
    private javax.swing.JPanel opciones;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelOcultar;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel registrarUsuarioB1;
    private javax.swing.JPanel tecnicoB;
    private componentesVisuales.LabelAltaDefinicion ultimaSesion;
    // End of variables declaration//GEN-END:variables
}
