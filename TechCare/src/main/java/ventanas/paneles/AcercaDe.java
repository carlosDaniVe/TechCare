package ventanas.paneles;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import componentesVisuales.ScrollBar;

/**
 *
 * @author Carlos Hernandez
 */
public class AcercaDe extends javax.swing.JPanel {

   
    public AcercaDe() {
        initComponents();
        sp.setVerticalScrollBar(new ScrollBar());
        txaAcercade.setEditable(false);
        
        // Crear el menú contextual y el elemento de menú
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem copyItem = new JMenuItem("Copiar");

        // Agregar un ActionListener al elemento de menú
        copyItem.addActionListener(e -> txaAcercade.copy());

        // Agregar el elemento de menú al menú contextual
        popupMenu.add(copyItem);

        // Establecer el menú contextual en el JTextArea
        txaAcercade.setComponentPopupMenu(popupMenu);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        txaAcercade = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        txaAcercade.setColumns(20);
        txaAcercade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txaAcercade.setForeground(new java.awt.Color(51, 51, 51));
        txaAcercade.setRows(5);
        txaAcercade.setText("                                                                                      ACERCA DE TECHCARE\n     NOMBRE DE LA APPLICACION:\n          TechCare\n\n     VERSION:\n          1.0\n\n     DESCRIPCION DE LA APLICACION:\n          TechCare es una aplicación diseñada para empresas dedicadas a la reparación de equipos tecnológicos como\n          computadoras, celulares, tablets y otros. Esta aplicación permite registrar y gestionar clientes, usuarios y equipos. \n          Cuenta con tres niveles de permisos y privilegios: Administrador, Capturista y Técnico.\n\n                    •ADMINISTRADOR: Tiene acceso total al sistema, puede registrar y gestionar usuarios, clientes y equipos.\n                    •CAPTURISTA: Puede registrar y gestionar la información de los clientes y los equipos.\n                    •TECNICO: Encargado de revisar y reparar los equipos, puede gestionar y modificar la información de los\n                     equipos. Además, tiene a su disposición gráficas que muestran información importante.\n\n    DERECHOS DE AUTOR:\n        TechCare © 2023. Todos los derechos reservados.\n\n   TERMINOS DE SERVICIOS Y POLITICAS DE PRIVACIDAD:\n     \n     Términos de Servicio:\n\n        Uso del Software: Este software puede ser utilizado por cualquier persona, siempre y cuando se atribuya al autor\n          original. El uso del software implica la aceptación de estos términos.\n\n        Modificación: El software puede ser modificado por terceros, siempre y cuando se atribuya al autor original.\n          Cualquier modificación debe ser notificada al autor original.\n\n        No Comercialización: Este software no puede ser vendido ni comercializado. Cualquier uso comercial del software  \n          está estrictamente prohibido.\n\n     Política de Privacidad\n\n     Recopilación de Información: No se recopila ninguna información personal por parte de terceros. La información \n      recopilada por el software se almacena únicamente en la base de datos local para el funcionamiento del programa.\n\n     Uso de la Información: La información recopilada se utiliza exclusivamente para el funcionamiento del software y no se\n       comparte con terceros.\n\n    Seguridad de la Información: Se toman medidas razonables para proteger la información recopilada por el software. \n     Sin embargo, no se puede garantizar la seguridad absoluta de la información.\n\n    INFORMACION DE CONTACTO  DEL DESARROLLADOR:\n             •Correo Electrónico:           profesionalengineer123@gmail.com\n             •WhatsApp y Telegram:    +584129345420\n             •LinkedIn:                          Carlos Daniel Hernández Duran\n                             ( https://www.linkedin.com/in/carlos-daniel-hern%C3%A1ndez-duran-248b52213 )\n            • \n\n    CREDITOS:\n       Iconos gráficos obtenidos de Flaticon.com\n");
        sp.setViewportView(txaAcercade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextArea txaAcercade;
    // End of variables declaration//GEN-END:variables
}
