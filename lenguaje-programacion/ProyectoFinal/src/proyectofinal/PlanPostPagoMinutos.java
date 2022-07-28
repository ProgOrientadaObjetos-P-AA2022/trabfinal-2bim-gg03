/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author josti
 */
public class PlanPostPagoMinutos extends PlanCelular {

    private double minutosNacionales;
    private double costoMn;
    private double minutosInternacionales;
    private double costoMi;
    private double pagoMensual;

    public PlanPostPagoMinutos(String prop, String dni, String ciu, String mar,
            String mod, String num, double mn, double mi) {
        super(prop, dni, ciu, mar, mod, num);
        minutosNacionales = mn;
        costoMn = 1.00;
        minutosInternacionales = mi;
        costoMi = 3.00;
    }

    public void establecerMinutosNacionales(double mn) {
        minutosNacionales = mn;
    }

    public void establecerCostoporMinutosNacionales() {
        costoMn = 1.00;
    }

    public void establecerMinutosInternacionales(double mi) {
        minutosInternacionales = mi;
    }

    public void establecerCostoporMinutosInternacionales() {
        costoMi = 3.00;
    }

    public double obtenerMinutosNacionales() {

        return minutosNacionales;
    }

    public double obtenercostoMinutosNacionales() {

        return costoMn;
    }

    public double obtenerMinutosInternacionales() {

        return minutosInternacionales;
    }

    public double obtenercostoMinutosInternacionales() {

        return costoMi;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosNacionales * costoMn) + (minutosInternacionales * costoMi);
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }
}