/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author josti
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {

    private double minutos;
    private double costoMn;
    private double megas;
    private double costoXgiga;
    private double gigas;

    public PlanPostPagoMinutosMegas() {

    }

    public PlanPostPagoMinutosMegas(String prop, String dni, String ciu,
            String mar, String mod, String num, double min,
            double m) {
        super(prop, dni, ciu, mar, mod, num);
        minutos = min;
        costoMn = 10;
        megas = m;
        costoXgiga = 1;
    }

    public void establecerMinutos(double mn) {
        minutos = mn;
    }

    public void establecerCostoMinutos(double cosMn) {
        costoMn = cosMn;
    }

    public void establecerMegas(double m) {
        megas = m;
    }

    public void establecerGigas(double megas) {
        gigas = (megas / 1000);
    }

    public void establecerCostoPorGiga(double cosG) {
        costoXgiga = cosG;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMn() {
        return costoMn;
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
        pagoMensual = (minutos * costoMn) + (gigas * costoXgiga);
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

        cadena = String.format("%s\tMegas: %.2f\tGigas: %.2f\tMinutos: %.2f\tPago: %.2f\n",
                super.toString(),
                obtenerMegas(),
                obtenerGigas(),
                obtenerMinutos(),
                obtenerPagoMensual());
        return cadena;
    }
}
