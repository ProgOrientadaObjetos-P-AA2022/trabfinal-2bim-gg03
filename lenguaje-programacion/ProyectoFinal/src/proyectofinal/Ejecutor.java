/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author josti
 */
public class Ejecutor {

    public static void main(String[] args) {

        planesCelular();

    }

    public static void planesCelular() {
        ArrayList<PlanCelular> lista = new ArrayList();
        Enlace c = new Enlace();
        TiposPlanes pL = new TiposPlanes();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("""
                           --------------------------------------------------
                           Seleccione el plan que desea crear:
                           1.POST PAGO MINUTOS
                           2.POST PAGO MEGAS
                           3.POST PAGO MEGAS Y MINUTOS
                           4.POST PAGO MEGAS Y MINUTOS ECONOMICO
                           5.Salir
                           --------------------------------------------------
                           """);
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                PlanPostPagoMinutos pMin = planPostPagoMinutos();
                lista.add(pMin);
                c.insertarInformacion2(pMin);
                planesCelular();
                break;
            case 2:
                PlanPostPagoMegas pMegas = planPostPagoMegas();
                lista.add(pMegas);
                c.insertarInformacion(pMegas);
                planesCelular();
                break;

            case 3:
                PlanPostPagoMinutosMegas pMinMeg = planPostPagoMinutosMegas();
                lista.add(pMinMeg);
                c.insertarInformacion3(pMinMeg);
                planesCelular();
                break;

            case 4:
                PlanPostPagoMinutosMegasEconomico pMinMegEc = planPostPagoMinutosMegasEconomico();
                lista.add(pMinMegEc);
                c.insertarInformacion4(pMinMegEc);
                planesCelular();
                break;

            case 5:
                pL.establecerPlanes(lista);
                System.out.println("->Programa Finalizado por el usuario.");
                break;

            default:
                System.out.println("Opcion no válida, ingrese nuevamente.");
                planesCelular();
                break;
        }

    }

    public static PlanPostPagoMegas planPostPagoMegas() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del propietario");
        String propietario = entrada.nextLine();
        System.out.println("Ingrese la cedula del propietario");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese la ciudad del propietario");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca del celular");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el numero del celular");
        String numero = entrada.nextLine();
        System.out.println("Ingrese el total de megas utilizadas");
        double megas = entrada.nextDouble();
        entrada.nextLine();
        PlanPostPagoMegas p1 = new PlanPostPagoMegas(propietario, cedula, ciudad,
                marca, modelo, numero, megas);
        return p1;

    }

    public static PlanPostPagoMinutos planPostPagoMinutos() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del propietario");
        String propietario = entrada.nextLine();
        System.out.println("Ingrese la cedula del propietario");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese la ciudad del propietario");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca del celular");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el numero del celular");
        String numero = entrada.nextLine();
        System.out.println("Ingrese el total de minutos Nacionales gastados");
        double minutosNacionales = entrada.nextDouble();
        System.out.println("Ingrese el total de minutos Internacionales Gastados");
        double minutosInternacionales = entrada.nextDouble();
        entrada.nextLine();
        PlanPostPagoMinutos p2 = new PlanPostPagoMinutos(propietario, cedula, ciudad,
                marca, modelo, numero, minutosNacionales, minutosInternacionales);
        return p2;

    }

    public static PlanPostPagoMinutosMegas planPostPagoMinutosMegas() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del propietario");
        String propietario = entrada.nextLine();
        System.out.println("Ingrese la cedula del propietario");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese la ciudad del propietario");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca del celular");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el numero del celular");
        String numero = entrada.nextLine();
        System.out.println("Ingrese el total de minutos gastados");
        double minutos = entrada.nextDouble();
        System.out.println("Ingrese el total de megas Gastados");
        double megas = entrada.nextDouble();
        entrada.nextLine();
        PlanPostPagoMinutosMegas p3 = new PlanPostPagoMinutosMegas(propietario,
                cedula, ciudad, marca, modelo, numero, minutos, megas);
        return p3;
    }

    public static PlanPostPagoMinutosMegasEconomico
            planPostPagoMinutosMegasEconomico() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del propietario");
        String propietario = entrada.nextLine();
        System.out.println("Ingrese la cedula del propietario");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese la ciudad del propietario");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la marca del celular");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el numero del celular");
        String numero = entrada.nextLine();
        System.out.println("Ingrese el total de minutos gastados");
        double minutos = entrada.nextDouble();
        System.out.println("Ingrese el total de megas Gastados");
        double megas = entrada.nextDouble();
        entrada.nextLine();
        PlanPostPagoMinutosMegasEconomico p4
                = new PlanPostPagoMinutosMegasEconomico(propietario,
                        cedula, ciudad, marca, modelo, numero, minutos, megas);
        return p4;
    }
}