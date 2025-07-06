/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELOreg;

import MODELOobj.*;

/**
 *
 * @author rodri
 */
public class registroMesasElectorales {

    private mesaElectoral[] me;
    private int n;
    private static final int MAX = 100;

    public registroMesasElectorales() {
        me = new mesaElectoral[MAX];
        n = 0;
    }

    public int longitud() {
        return n;
    }

    public void agregar(mesaElectoral m) {
        if (n < MAX) {
            me[n] = m;
            n++;
        } else {
            System.out.println("No hay Espacio en el Registro");
        }

    }

    public mesaElectoral iesimo(int x) {
        if (x >= 0 && x < n) {
            return me[x];
        }
        return null;
    }

     public mesaElectoral buscarID(String id){
         for (int i = 0; i < n; i++) {
             if (me[i].getIdMesa().equals(id)) {
                 return me[i];
             }
         }
         return null;
     }
    

}
