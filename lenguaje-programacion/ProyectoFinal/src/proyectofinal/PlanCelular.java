/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author josti
 */
public abstract class PlanCelular {

    protected String propietario;
    protected String cedula;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numero;

    public PlanCelular() {

    }

    public PlanCelular(String prop, String dni, String ciu, String mar, String mod, String num) {
        propietario = prop;
        cedula = dni;
        ciudad = ciu;
        marca = mar;
        modelo = mod;
        numero = num;
    }

    public void establecerPropietario(String prop) {
        propietario = prop;
    }

    public void establecerCedula(String dni) {
        cedula = dni;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public void establecerModelo(String mod) {
        modelo = mod;
    }

    public void establecerNumero(String num) {
        numero = num;
    }

    public String obtenerPropietario() {

        return propietario;
    }

    public String obtenerCedula() {

        return cedula;
    }

    public String obtenerCiudad() {

        return ciudad;
    }

    public String obtenerMarca() {

        return marca;
    }

    public String obtenerModelo() {

        return modelo;
    }

    public String obtenerNumero() {

        return numero;
    }

    public String toString() {
        String cadena = "";
        cadena = String.format("Propietario: %s\tCedula: %s\tCiudad: %s\t"
                + "Marca: %s\tModelo: %s\tNumero: %s\t",
                propietario,
                cedula,
                ciudad,
                marca,
                modelo,
                numero);

        return cadena;
    }

    public abstract void calcularPagoMensual();

    public abstract double obtenerPagoMensual();

}
