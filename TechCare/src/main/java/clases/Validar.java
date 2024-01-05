package clases;

import componentesVisuales.ComboBoxHD;
import componentesVisuales.LabelAltaDefinicion;
import java.awt.Color;
import componentesVisuales.PasswordField;
import componentesVisuales.TextFieldRedondeado;
import java.util.List;

public class Validar {

    static int validador = 0;

    public static boolean validarLogin(TextFieldRedondeado elemento1, PasswordField elemento2) {

        validador = 0;

        if (elemento1.getText().equals("Ingrese su nombre de usuario")
                || elemento1.getText().equals("")) {
            elemento1.setForeground(Color.red);
            elemento1.setText("Ingrese su nombre de usuario");
            validador++;

        }
        if (String.valueOf(elemento2.getPassword()).equals("**********")
                || String.valueOf(elemento2.getPassword()).equals("")) {
            elemento2.setForeground(Color.red);
            elemento2.setText("**********");
            validador++;
        }
        if (validador == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarUsuarios(List<TextFieldRedondeado> elementos, PasswordField elemento2,
            List<ComboBoxHD> elementos3, List<LabelAltaDefinicion> label) {

        TextFieldRedondeado nombre;
        TextFieldRedondeado cedula, correo, telefono, usuario;

        validador = 0;
        nombre = elementos.get(0);
        cedula = elementos.get(1);
        correo = elementos.get(2);
        telefono = elementos.get(3);
        usuario = elementos.get(4);

        if (nombre.getText().equals("Ingrese el Nombre") || nombre.getText()
                .isEmpty()) {
            validador++;
            nombre.setForeground(Color.red);
            nombre.setText("Ingrese el Nombre");
        }

        if (cedula.getText().equals("Ingrese la Cedula") || cedula.getText()
                .isEmpty()) {
            validador++;
            cedula.setForeground(Color.red);
            cedula.setText("Ingrese la Cedula");
        }

        if (correo.getText().equals("Ingrese el Correo") || correo.getText()
                .isEmpty()) {
            validador++;
            correo.setForeground(Color.red);
            correo.setText("Ingrese el Correo");
        }

        if (telefono.getText().equals("Ingrese el Telefono") || telefono.getText()
                .isEmpty()) {
            validador++;
            telefono.setForeground(Color.red);
            telefono.setText("Ingrese el Telefono");
        }

        if (usuario.getText().equals("Nombre de Usuario") || usuario.getText()
                .isEmpty()) {
            validador++;
            usuario.setForeground(Color.red);
            usuario.setText("Nombre de Usuario");
        }

        if (elemento2 != null) {

            if (String.valueOf(elemento2.getPassword()).equals("**********")
                    || String.valueOf(elemento2.getPassword()).isEmpty()) {
                validador++;
                elemento2.setForeground(Color.red);
                elemento2.setText("**********");
            }
        }

        if (elementos3 != null) {

            if (elementos3.get(0) != null) {
                if (elementos3.get(0).getSelectedIndex() == 0) {
                    validador++;
                    System.out.println(" com1 si");
                    elementos3.get(0).setSelectedIndex(0);
                    label.get(0).setForeground(Color.red);
                    label.get(0).setText("X->");
                }
            }

            if (elementos3.get(1) != null) {

                if (elementos3.get(1).getSelectedIndex() == 0) {
                    System.out.println("com2 si");
                    validador++;
                    elementos3.get(1).setSelectedIndex(0);
                    label.get(1).setForeground(Color.red);
                    label.get(1).setText("X->");
                }
            }
        }

        if (validador == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarClientes(List<TextFieldRedondeado> elementos) {
        validador = 0;
        if (elementos.get(0) != null) {
            if (elementos.get(0).getText().equals("Ingrese el Nombre")
                    || elementos.get(0).getText().isEmpty()) {
                elementos.get(0).setForeground(Color.red);
                elementos.get(0).setText("Ingrese el Nombre");
                validador++;
            }
        }
        if (elementos.get(1).getText().equals("Ingrese la Cedula")
                || elementos.get(1).getText().isEmpty()) {
            elementos.get(1).setForeground(Color.red);
            elementos.get(1).setText("Ingrese la Cedula");
            validador++;
        }

        if (elementos.get(2).getText().equals("Ingrese el Correo")
                || elementos.get(2).getText().isEmpty()) {
            elementos.get(2).setForeground(Color.red);
            elementos.get(2).setText("Ingrese el Correo");
            validador++;
        }
        if (elementos.get(3).getText().equals("Ingrese su Direccion")
                || elementos.get(3).getText().isEmpty()) {
            elementos.get(3).setForeground(Color.red);
            elementos.get(3).setText("Ingrese su Direccion");
            validador++;
        }
        if (elementos.get(4).getText().equals("Ingrese el Telefono")
                || elementos.get(4).getText().isEmpty()) {
            elementos.get(4).setForeground(Color.red);
            elementos.get(4).setText("Ingrese el Telefono");
            validador++;
        }

        if (validador != 0) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean validarEquipos(List<TextFieldRedondeado> elementos, List<ComboBoxHD> elemento2,
            List<LabelAltaDefinicion> label) {
        if (elementos.get(0) != null) {
            if (elementos.get(0).getText().equals("Modelo")
                    || elementos.get(0).getText().isEmpty()) {
                elementos.get(0).setForeground(Color.red);
                elementos.get(0).setText("Modelo");
                validador++;
            }
        }
        if (elementos.get(1).getText().equals("Numero de Serie")
                || elementos.get(1).getText().isEmpty()) {
            elementos.get(1).setForeground(Color.red);
            elementos.get(1).setText("Numero de Serie");
            validador++;
        }

        if (elemento2 != null) {

            if (elemento2.get(0).getSelectedIndex() == 0) {
                label.get(0).setForeground(Color.red);
                label.get(0).setText("X->");
                validador++;
            }

            if (elemento2.get(1) != null) {
                if (elemento2.get(1).getSelectedIndex() == 0) {
                    label.get(1).setForeground(Color.red);
                    label.get(1).setText("X->");
                    validador++;
                }
            }

            if (elemento2.get(2) != null) {
                if (elemento2.get(2).getSelectedIndex() == 0) {
                    label.get(2).setForeground(Color.red);
                    label.get(2).setText("X->");
                    validador++;
                }
            }
        }

        if (validador == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validacionSimple(TextFieldRedondeado elemento, int seleccion) {
        if (seleccion == 1) {
            if (elemento.getText().equals("Ingrese la Marca")
                    || elemento.getText().isEmpty()) {
                elemento.setForeground(Color.red);
                elemento.setText("Ingrese la Marca");
                validador++;
            }
        }
        
        if (seleccion == 2) {
            if (elemento.getText().equals("Ingrese el Tipo de Equipo")
                    || elemento.getText().isEmpty()) {
                elemento.setForeground(Color.red);
                elemento.setText("Ingrese el Tipo de Equipo");
                validador++;
            }
        }
        
        if(validador ==0){
            return true;
        }else{
            return false;
        }
    }
}
