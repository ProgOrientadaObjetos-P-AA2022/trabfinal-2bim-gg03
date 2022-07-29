/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author josti
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double megas;
    private double costoXgigas;
    private double tarifaBase;

    public PlanPostPagoMegas() {
    }

    public PlanPostPagoMegas(String prop, String dni, String ciu, String mar,
            String mod, String num, double m) {
        super(prop, dni, ciu, mar, mod, num);
        megas = m;
        costoXgigas = 1;
        tarifaBase = 15;
    }

    public void establecerMegas(double m) {
        megas = (m / 1000);
    }

    public void establecerCostoporGigas(double cxg) {
        costoXgigas = cxg;
    }

    public void establecerTarifaBase(double tB) {
        tarifaBase = tB;
    }

    public double obtenerCostoporGigas() {

        return costoXgigas;
    }

    public double obtenerMegas() {

        return megas;
    }

    public double obtenerTarifaBase() {

        return tarifaBase;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = tarifaBase + (obtenerMegas() * costoXgigas);
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

        cadena = String.format("%s\tGigas: %.2f\tPago: %.2f\n",
                super.toString(),
                obtenerMegas(),
                obtenerPagoMensual());
        return cadena;
    }

}
