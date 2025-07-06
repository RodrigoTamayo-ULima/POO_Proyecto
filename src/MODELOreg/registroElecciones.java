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
public class registroElecciones {
    private eleccion[] e;
    private int n ;
    private static final int MAX =100;

    public registroElecciones(){
    e = new eleccion[MAX];
    n=0;
}


 
  
    public int longitud(){
        return n ;
    }
    
    public void agregar (eleccion m){
        if (n<MAX) {
            e[n] = m;
        n++;
        }else{
            System.out.println("No hay Espacio en el Registro");
        }
            
    }
    
    public eleccion iesimo (int x){
        if (x>=0 && x<n) {
            return e[x];
        }
        return null;
    }
    // public String listarNombres(){
     //   String texto="";
     //   for (int i = 0; i < e.length; i++) {
     //       if (i==e.length-1) {
     //       texto+= e[i].getNombreCompleto();
                
      //      }else{
      //      texto+= e[i].getNombreCompleto()+" ";
      //      }
      //  }
     //   return texto;
  //}
    public void saludar(){
        System.out.println("saluda carajo");
    }
    
    
}