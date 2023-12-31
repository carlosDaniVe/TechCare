package clases;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class LlenarModeloTabla {

    public static DefaultTableModel llenarModelo(String query, DefaultTableModel modelo) {

        try {
            Connection conexion = new Conectar().conectar();

            PreparedStatement ps = conexion.prepareStatement(
                    query);

            ResultSet rs = ps.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            int cantidadDeColumnas = metaData.getColumnCount();

            while (rs.next()) {
                Object[] filas = new Object[cantidadDeColumnas];

                for (int i = 0; i < cantidadDeColumnas; i++) {

                    filas[i] = rs.getObject(i + 1);

                }
                modelo.addRow(filas);
            }

            conexion.close();
            ps.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error en el metodo llenar modelo ");
            System.out.println("en la clase SQL :" + e);
        }
        return modelo;
    }
    
    
}
