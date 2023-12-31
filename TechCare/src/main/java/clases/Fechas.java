package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Esta clase se encarga de formatear las fechas

public class Fechas {

    public static String fechaDiaMesAñoHora(int seleccion){
        
        String fechaFormateada ="";
        
        if(seleccion == 1){ 
            
        // obtiene la fecha y hora actual
        LocalDateTime fechaHora = LocalDateTime.now(); 
        // define el formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        // obtiene la fecha y hora en el formato deseado
        fechaFormateada = fechaHora.format(formato); 
            
        
        } 
        
        if(seleccion == 2){
          
        LocalDateTime fechaHora = LocalDateTime.now(); 
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(
                "dd-MM-yyyy hh:mm:ss a"); 
        fechaFormateada = fechaHora.format(formato); 
        
       
        }
        
        if(seleccion ==3){
            LocalDateTime fechaHora = LocalDateTime.now();
            int year = fechaHora.getYear();
            fechaFormateada = String.valueOf(year);
        }
        return fechaFormateada;
    }
   
}
