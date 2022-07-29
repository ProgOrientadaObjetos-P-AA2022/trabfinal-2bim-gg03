/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author josti
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private double minutos;
    private double costoMn;
    private double megas;
    private double gigas;
    private double costoXgiga;
    private int porcentajeDesc;

    public PlanPostPagoMinutosMegasEconomico() {

    }

    public PlanPostPagoMinutosMegasEconomico(String prop, String dni, String ciu,
            String mar, String mod, String num, double min, double m) {
        super(prop, dni, ciu, mar, mod, num);
        minutos = min;
        costoMn = 0.15;
        megas = m;
        gigas = megas/1000;
        costoXgiga = 1.5;
        porcentajeDesc = 10;
    }

    public void establecerMinutos(double mn) {
        minutos = mn;
    }

    public void establecerDescuento(int porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public void establecerCostoMinutos() {
        costoMn = 0.10;
    }

    public void establecerMegas(double m) {
        megas = m;
    }

    public void establecerGigas(double g) {
        gigas = g;
    }

    public void establecerCostoPorGiga() {
        costoXgiga = 1;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMn() {
        return costoMn;
    }

    public int obtenerDescuento() {
        return porcentajeDesc;
    }

    public double obtenerMegas() {
        return megas;
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoXgiga() {
        return costoXgiga;
    }

    @Override
    public void calcularPagoMensual() {
        double suma;
        suma = (minutos * costoMn) + (gigas * costoXgiga);
        pagoMensual = suma -(suma * porcentajeDesc) / 100;
    }

    public void establecerPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public String toString() {
        String cadena = "";

        cadena = String.format("%s\tMegas: %.2f\tGigas: %.2f\tMinutos: %.2f\tDescuento: %d\t"
                + "Pago: %.2f\n",
                super.toString(),
                obtenerMegas(),
                obtenerGigas(),
                obtenerMinutos(),
                obtenerDescuento(),
                obtenerPagoMensual());
        return cadena;
    }

}
