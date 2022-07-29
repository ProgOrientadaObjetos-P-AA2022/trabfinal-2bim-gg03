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
     *rf
     * @return
     */
    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base01.bd.db";
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
            String data = String.format("INSERT INTO PlanPostPagoMegas "
                    + "(Propietario, Cedula, Ciudad, Marca,Modelo,Numero, "
                    + "Gigas , Pago) "
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
            String data = String.format("INSERT INTO PlanPostPagoMinutos "
                    + "(Propietario, Cedula, Ciudad, Marca,Modelo,Numero, "
                    + "MinutosNacionales, MinutosInternacionales, Pago) "
                    + "values ('%s','%s','%s','%s','%s','%s',%s, %s, %s)",
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
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas "
                    + "(Propietario, Cedula, Ciudad, Marca,Modelo,Numero,"
                    + "Minutos, Gigas, Pago) "
                    + "values ('%s','%s','%s','%s','%s','%s' ,%s, %s,%s)",
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
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEconomico "
                    + "(Propietario, Cedula, Ciudad, Marca,Modelo,Numero,"
                    + "Minutos,Gigas,Descuento,Pago) "
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

    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMegas p1 = new PlanPostPagoMegas();
                p1.establecerPropietario(rs.getString("Propietario"));
                p1.establecerCedula(rs.getString("Cedula"));
                p1.establecerCiudad(rs.getString("Ciudad"));
                p1.establecerMarca(rs.getString("Marca"));
                p1.establecerModelo(rs.getString("Modelo"));
                p1.establecerNumero(rs.getString("Numero"));
                p1.establecerMegas(rs.getDouble("Gigas"));
                p1.establecerPagoMensual(rs.getDouble("Pago"));
                lista.add(p1);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutos p1 = new PlanPostPagoMinutos();
                p1.establecerPropietario(rs.getString("Propietario"));
                p1.establecerCedula(rs.getString("Cedula"));
                p1.establecerCiudad(rs.getString("Ciudad"));
                p1.establecerMarca(rs.getString("Marca"));
                p1.establecerModelo(rs.getString("Modelo"));
                p1.establecerNumero(rs.getString("Numero"));
                p1.establecerMinutosNacionales(rs.getDouble("MinutosNacionales"));
                p1.establecerMinutosInternacionales(rs.getDouble("MinutosInternacionales"));
                p1.establecerPagoMensual(rs.getDouble("Pago"));
                lista.add(p1);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanPostPagoMinutosMegas() {
        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegas p1 = new PlanPostPagoMinutosMegas();
                p1.establecerPropietario(rs.getString("Propietario"));
                p1.establecerCedula(rs.getString("Cedula"));
                p1.establecerCiudad(rs.getString("Ciudad"));
                p1.establecerMarca(rs.getString("Marca"));
                p1.establecerModelo(rs.getString("Modelo"));
                p1.establecerNumero(rs.getString("Numero"));
                p1.establecerMegasEnGigas(rs.getDouble("Gigas"));
                p1.establecerMinutos(rs.getDouble("Minutos"));
                p1.establecerPagoMensual(rs.getDouble("Pago"));
                lista.add(p1);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlanPostPagoMinutosMegasEconomico() {
        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegasEconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico p1 = new PlanPostPagoMinutosMegasEconomico();
                p1.establecerPropietario(rs.getString("Propietario"));
                p1.establecerCedula(rs.getString("Cedula"));
                p1.establecerCiudad(rs.getString("Ciudad"));
                p1.establecerMarca(rs.getString("Marca"));
                p1.establecerModelo(rs.getString("Modelo"));
                p1.establecerNumero(rs.getString("Numero"));
                p1.establecerMegasEnGigas(rs.getDouble("Gigas"));
                p1.establecerMinutos(rs.getDouble("Minutos"));
                p1.establecerDescuento(rs.getInt("Descuento"));
                p1.establecerPagoMensual(rs.getDouble("Pago"));
                lista.add(p1);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
