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
    private double megasGigas;
    private double costoXgiga;

    public PlanPostPagoMinutosMegas() {

    }

    public PlanPostPagoMinutosMegas(String prop, String dni, String ciu,
            String mar, String mod, String num, double min,
            double megasG) {
        super(prop, dni, ciu, mar, mod, num);
        minutos = min;
        costoMn = 10;
        megasGigas = megasG;
        costoXgiga = 1;
    }

    public void establecerMinutos(double mn) {
        minutos = mn;
    }

    public void establecerCostoMinutos(double cosMn) {
        costoMn = cosMn;
    }

    public void establecerMegasEnGigas(double mG) {
        megasGigas = mG / 100;
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

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoXgiga() {
        return costoXgiga;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMn) + (megasGigas * costoXgiga);
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

        cadena = String.format("%s\tMegas: %.2f\tMinutos: %.2f\tPago: %.2f\n",
                super.toString(),
                obtenerMegasGigas(),
                obtenerMinutos(),
                obtenerPagoMensual());
        return cadena;
    }
}
