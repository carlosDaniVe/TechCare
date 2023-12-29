package clases;

import java.awt.Color;
import componentesVisuales.PasswordField;
import componentesVisuales.TextFieldRedondeado;

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
}