/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Enlace {

    /**
     * Connect to a sample database
     *
     * @return
     */
    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base01.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarInformacion(TiposPlanes plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Plan (Propietario, Cedula, Ciudad, Marca,Modelo,Numero, Pago) "
                    + "values ('%s','%s','%s','%s','%s',%s , %.2f)",
                    plan.obtenerPropietario(),
                    plan.obtenerCedula(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNumero(),
                    plan.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<TiposPlanes> obtenerDataCiudad() {
        ArrayList<TiposPlanes> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Plan;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanCelular miPlan = new PlanCelular(rs.getString("Propietario, Cedula, Ciudad, Marca,Modelo,Numero"), rs.getDouble("Pago"));
                lista.add(miPlan);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
