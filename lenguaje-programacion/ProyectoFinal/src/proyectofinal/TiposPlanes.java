/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author josti
 */
public class TiposPlanes {

    private ArrayList<PlanCelular> planes;

    public void establecerPlanes(ArrayList<PlanCelular> p) {
        planes = p;
        
    }

    public ArrayList<PlanCelular> obtenerPlanes() {
        return planes;
    }

}
