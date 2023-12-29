package clases;

import java.awt.Color;
import java.util.List;
import componentesVisuales.PasswordField;
import componentesVisuales.TextFieldRedondeado;

/* Esta clase ejecuta la funcion de placeHolder en los campos
*  de texto de los paneles
*/
public class PlaceHonder {

    public static void placeHolderLogin(TextFieldRedondeado elemento1, PasswordField elemento2,
            int seleccion) {
        
        if (seleccion == 1) {
            
            if (elemento1.getText().equals("Ingrese su nombre de usuario")) {
                elemento1.setText("");
                elemento1.setForeground(Color.black);

            }
            
            if (String.valueOf(elemento2.getPassword()).isEmpty()) {
                elemento2.setText("**********");
                elemento2.setForeground(new Color(153, 153, 153));
            }
            
        } else if (seleccion == 2) {
            
            if (String.valueOf(elemento2.getPassword()).equals("**********")) {
                elemento2.setText("");
                elemento2.setForeground(new Color(0, 0, 0));

            }
            if (elemento1.getText().isEmpty()) {
                elemento1.setText("Ingrese su nombre de usuario");
                elemento1.setForeground(new Color(153, 153, 153));
            }
        }

    }
    
    public static void placeHolderUser(List<TextFieldRedondeado> elemento, PasswordField elemento2,
            int seleccion) {

        if (seleccion == 1) {
            if (elemento.get(0).getText().equals("Ingrese el Nombre")) {
                elemento.get(0).setText("");
                elemento.get(0).setForeground(new Color(53, 53, 53));
            }

            if (elemento.get(1).getText().isEmpty()) {
                elemento.get(1).setText("Ingrese la Cedula");
                elemento.get(1).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(2).getText().isEmpty()) {
                elemento.get(2).setText("Ingrese el Correo");
                elemento.get(2).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(3).getText().isEmpty()) {
                elemento.get(3).setText("Ingrese el Telefono");
                elemento.get(3).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(4).getText().isEmpty()) {
                elemento.get(4).setText("Nombre de Usuario");
                elemento.get(4).setForeground(new Color(153, 153, 153));
            }
            if (elemento2 != null) {
                if (String.valueOf(elemento2.getPassword()).isEmpty()) {
                    elemento2.setText("**********");
                    elemento2.setForeground(new Color(153, 153, 153));
                }
            }

        } else if (seleccion == 2) {
            if (elemento.get(0).getText().isEmpty()) {
                elemento.get(0).setText("Ingrese el Nombre");
                elemento.get(0).setForeground(new Color(153, 153, 153));
            }

            if (elemento.get(1).getText().equals("Ingrese la Cedula")) {
                elemento.get(1).setText("");
                elemento.get(1).setForeground(new Color(53, 53, 53));
            }
            if (elemento.get(2).getText().isEmpty()) {
                elemento.get(2).setText("Ingrese el Correo");
                elemento.get(2).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(3).getText().isEmpty()) {
                elemento.get(3).setText("Ingrese el Telefono");
                elemento.get(3).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(4).getText().isEmpty()) {
                elemento.get(4).setText("Nombre de Usuario");
                elemento.get(4).setForeground(new Color(153, 153, 153));
            }
            if (elemento2 != null) {
                if (String.valueOf(elemento2.getPassword()).isEmpty()) {
                    elemento2.setText("**********");
                    elemento2.setForeground(new Color(153, 153, 153));
                }
            }
        } else if (seleccion == 3) {
            if (elemento.get(0).getText().isEmpty()) {
                elemento.get(0).setText("Ingrese el Nombre");
                elemento.get(0).setForeground(new Color(153, 153, 153));
            }

            if (elemento.get(1).getText().isEmpty()) {
                elemento.get(1).setText("Ingrese la Cedula");
                elemento.get(1).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(2).getText().equals("Ingrese el Correo")) {
                elemento.get(2).setText("");
                elemento.get(2).setForeground(new Color(53, 53, 53));
            }
            if (elemento.get(3).getText().isEmpty()) {
                elemento.get(3).setText("Ingrese el Telefono");
                elemento.get(3).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(4).getText().isEmpty()) {
                elemento.get(4).setText("Nombre de Usuario");
                elemento.get(4).setForeground(new Color(153, 153, 153));
            }
            if (elemento2 != null) {
                if (String.valueOf(elemento2.getPassword()).isEmpty()) {
                    elemento2.setText("**********");
                    elemento2.setForeground(new Color(153, 153, 153));
                }
            }
        } else if (seleccion == 4) {
            if (elemento.get(0).getText().isEmpty()) {
                elemento.get(0).setText("Ingrese el Nombre");
                elemento.get(0).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(1).getText().isEmpty()) {
                elemento.get(1).setText("Ingrese la Cedula");
                elemento.get(1).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(2).getText().isEmpty()) {
                elemento.get(2).setText("Ingrese el Correo");
                elemento.get(2).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(3).getText().equals("Ingrese el Telefono")) {
                elemento.get(3).setText("");
                elemento.get(3).setForeground(new Color(53, 53, 53));
            }
            if (elemento.get(4).getText().isEmpty()) {
                elemento.get(4).setText("Nombre de Usuario");
                elemento.get(4).setForeground(new Color(153, 153, 153));
            }
            if (elemento2 != null) {
                if (String.valueOf(elemento2.getPassword()).isEmpty()) {
                    elemento2.setText("**********");
                    elemento2.setForeground(new Color(153, 153, 153));
                }
            }
        } else if (seleccion == 5) {
            if (elemento.get(0).getText().isEmpty()) {
                elemento.get(0).setText("Ingrese el Nombre");
                elemento.get(0).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(1).getText().isEmpty()) {
                elemento.get(1).setText("Ingrese la Cedula");
                elemento.get(1).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(2).getText().isEmpty()) {
                elemento.get(2).setText("Ingrese el Correo");
                elemento.get(2).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(3).getText().isEmpty()) {
                elemento.get(3).setText("Ingrese el Telefono");
                elemento.get(3).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(4).getText().equals("Nombre de Usuario")) {
                elemento.get(4).setText("");
                elemento.get(4).setForeground(new Color(53, 53, 53));
            }
            if (elemento2 != null) {
                if (String.valueOf(elemento2.getPassword()).isEmpty()) {
                    elemento2.setText("**********");
                    elemento2.setForeground(new Color(153, 153, 153));
                }
            }
        } else if (seleccion == 6) {
            if (elemento.get(0).getText().isEmpty()) {
                elemento.get(0).setText("Ingrese el Nombre");
                elemento.get(0).setForeground(new Color(53, 53, 53));
            }
            if (elemento.get(1).getText().isEmpty()) {
                elemento.get(1).setText("Ingrese la Cedula");
                elemento.get(1).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(2).getText().isEmpty()) {
                elemento.get(2).setText("Ingrese el Correo");
                elemento.get(2).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(3).getText().isEmpty()) {
                elemento.get(3).setText("Ingrese el Telefono");
                elemento.get(3).setForeground(new Color(153, 153, 153));
            }
            if (elemento.get(4).getText().isEmpty()) {
                elemento.get(4).setText("Nombre de Usuario");
                elemento.get(4).setForeground(new Color(153, 153, 153));
            }
            if (elemento2 != null) {
                if (String.valueOf(elemento2.getPassword()).equals("**********")) {
                    elemento2.setText("");
                    elemento2.setForeground(new Color(53, 53, 53));
                }
            }
        }
    }
}
