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
    private double pagoMensual;

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

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

}