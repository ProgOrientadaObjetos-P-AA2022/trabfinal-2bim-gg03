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
    private double megasGigas;
    private double costoXgiga;
    private int porcentajeDesc;
    private double pagoMensual;

    public PlanPostPagoMinutosMegasEconomico(String prop, String dni, String ciu,
            String mar, String mod, String num, double min, double megasG) {
        super(prop, dni, ciu, mar, mod, num);
        minutos = min;
        costoMn = 0.10;
        megasGigas = megasG;
        costoXgiga = 1;
        porcentajeDesc = 10;
    }

    public void establecerMinutos(double mn) {
        minutos = mn;
    }

    public void establecerDescuento() {
        porcentajeDesc = 10;
    }

    public void establecerCostoMinutos() {
        costoMn = 0.10;
    }

    public void establecerMegasEnGigas(double mG) {
        megasGigas = mG / 100;
    }

    public void establecerCostoPorGiga() {
        costoXgiga = 1;
    }

    public void establecerPorcentajeDescuento() {
        porcentajeDesc = 10;
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

    public double obtenerMegasGigas() {
        return megasGigas;
    }

    public double obtenerCostoXgiga() {
        return costoXgiga;
    }

    @Override
    public void calcularPagoMensual() {
        double suma;
        suma = (minutos * costoMn) + (megasGigas * costoXgiga);
        pagoMensual = suma * (porcentajeDesc / 100);
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

}
