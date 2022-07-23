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

    public PlanCelular(String prop, String dni, String ciu, String mar, String mod, String num) {
        propietario = prop;
        cedula = dni;
        ciudad = ciu;
        marca = mar;
        modelo = mod;
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

    public abstract void calcularPagoMensual();

    public abstract double obtenerPagoMensual();

}
