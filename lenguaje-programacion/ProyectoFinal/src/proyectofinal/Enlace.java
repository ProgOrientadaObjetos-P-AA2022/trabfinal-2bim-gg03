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

    public void insertarInformacion(PlanPostPagoMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPlanPostPagoMegas (Propietario, Cedula, Ciudad, Marca,Modelo,Numero, Megas , Pago) "
                    + "values ('%s','%s','%s','%s','%s','%s' , %s, %s)",
                    plan.obtenerPropietario(),
                    plan.obtenerCedula(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNumero(),
                    plan.obtenerMegas(),
                    plan.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
    }

    public void insertarInformacion2(PlanPostPagoMinutos plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos (Propietario, Cedula, Ciudad, Marca,Modelo,Numero, Minutos Nacionales, Minutos Internacionales, Pago) "
                    + "values ('%s','%s','%s','%s','%s','%s' , %s, %s, %s)",
                    plan.obtenerPropietario(),
                    plan.obtenerCedula(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNumero(),
                    plan.obtenerMinutosNacionales(),
                    plan.obtenerMinutosInternacionales(),
                    plan.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
    }

    public void insertarInformacion3(PlanPostPagoMinutosMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas (Propietario, Cedula, Ciudad, Marca,Modelo,Numero,Minutos, Megas, Pago) "
                    + "values ('%s','%s','%s','%s','%s','%s' ,%s %s,%s)",
                    plan.obtenerPropietario(),
                    plan.obtenerCedula(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNumero(),
                    plan.obtenerMinutos(),
                    plan.obtenerMegasGigas(),
                    plan.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
    }

    public void insertarInformacion4(PlanPostPagoMinutosMegasEconomico plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEconomico (Propietario, Cedula, Ciudad, Marca,Modelo,Numero,Minutos,Megas, Descuento, Pago) "
                    + "values ('%s','%s','%s','%s','%s','%s',%s,%s,%s,%s)",
                    plan.obtenerPropietario(),
                    plan.obtenerCedula(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNumero(),
                    plan.obtenerMinutos(),
                    plan.obtenerMegasGigas(),
                    plan.obtenerDescuento(),
                    plan.obtenerPagoMensual());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
    }

    /*public ArrayList<PlanPostPagoMegas> obtenerDataCiudad() {
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Plan;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMegas miPlan = new PlanPostPagoMegas(rs.getString("Propietario, Cedula, Ciudad, Marca,Modelo,Numero"), rs.getDouble("Pago"));
                lista.add(miPlan);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }*/
}
