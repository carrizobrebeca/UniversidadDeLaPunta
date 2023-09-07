/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidaddelapunta;

import java.sql.Connection;
import universidaddelapunta.AccesoADatos.conexion;

/**
 *
 * @author crist
 */
public class UniversidadDeLaPunta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con=conexion.getConexion();
    }
    
}
