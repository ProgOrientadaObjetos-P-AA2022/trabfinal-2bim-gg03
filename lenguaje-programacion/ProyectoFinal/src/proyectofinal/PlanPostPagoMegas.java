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
    private double gigas;

    public PlanPostPagoMegas() {
    }

    public PlanPostPagoMegas(String prop, String dni, String ciu, String mar,
            String mod, String num, double m) {
        super(prop, dni, ciu, mar, mod, num);
        megas = m / 1000;
        costoXgigas = 1;
        tarifaBase = 15;
    }

    public void establecerMegas(double m) {
        megas = m;
    }

    public void establecerGigas(double megas) {
        gigas = (megas / 1000);
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

    public double obtenerGigas() {

        return gigas;
    }

    public double obtenerTarifaBase() {

        return tarifaBase;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = tarifaBase + (gigas * costoXgigas);
    }

    public void establecerPagoMensual(double pM) {
        pagoMensual = pM;
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public String toString() {
        String cadena = "";

        cadena = String.format("%s\tMegas: %.2f\tGigas: %.2f\tPago: %.2f\n",
                super.toString(),
                obtenerMegas(),
                obtenerGigas(),
                obtenerPagoMensual());
        return cadena;
    }

}
