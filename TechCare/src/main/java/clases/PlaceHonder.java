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
}
