/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudestudiantessistemas;


/**
 *
 * @author irevo
 */
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.Statement;
public class conexionMysql 
{
    Connection cn;//variable de conexion 
    public Connection conectar()//metodo conectar tipo connection
    {
    try
    {
     Class.forName( "com.mysql.jdbc.Driver"); //carga la clase del controlador de MySQL en memoria, que es necesario para establecer una conexión con la base de datos.
     cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/crudestudiantes","root","");//ruta de conexion 
     System.out.println("CONECTADO");
     
    } catch (ClassNotFoundException | SQLException e){
            System.out.println("ERROR"+e);
    }
            return cn;
        }    
   
}
