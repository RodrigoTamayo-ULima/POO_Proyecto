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
public class registroPartidosPoliticos {

    private partidoPolitico[] partidos;
    private int n;
    private static final int MAX = 100;


    public registroPartidosPoliticos() {
        partidos = new partidoPolitico[MAX];
        n = 0;
      
    }

    public void agregarPP(partidoPolitico p) {

        if (n < MAX) {
            partidos[n]=p;
            n++;
     
    }
    }
    public int longitud(){
        return n;
    }
    
    public void eliminarPP(String nombre) {
        String a = nombre.trim();
        for (int i = 0; i < partidos.length; i++) {

            if (a.equals(partidos[i].getNombre().trim())) {
                for (int j = 0; j < partidos.length - 1; j++) {
                    partidos[j] = partidos[j + 1];
                }
                partidos[partidos.length - 1] = null;
                n--;
            }
        }

    }
    
    public partidoPolitico iesimo (int n){
        if (n>=0 && n<MAX) {
            return partidos[n];
        }
        else{return null;}
       
        
    }

}
