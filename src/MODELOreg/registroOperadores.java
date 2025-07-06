package MODELOreg;

import MODELOobj.*;
import VISTA.*;

public class registroOperadores {

    private operador[] operadores;
    private int n;
    private static final int MAX = 100;

    public registroOperadores() {
        operadores = new operador[MAX];
        operador o0 = new operador("20225306", "camaron123", "Rodrigo", "Tamayo");
        operadores[0] = o0;
        operador o1 = new operador("20230206", "elmascapito", "Karlo", "Arcos");
        operadores[1] = o1;
        operador o2 = new operador("a", "a", "Karloo", "Arcos");
        operadores[2] = o2;
        operador o3 = new operador("0001", "123Tamayo", "Hernan", "Nina");
        operadores[3] = o3;
        operador o4 = new operador("0002", "123Tamayo", "Anghelo", "Taco");
        operadores[4] = o4;

        n = 5;
    }

    public int longitud() {
        return n;
    }

    public void agregar(operador o) {
        if (n < MAX) {
            operadores[n] = o;
            n++;
        } else {
            System.out.println("No hay espacio para mas Administrativos");
        }

    }

    public boolean verificar(String u, String c) {
        
        boolean ayuda=false;
        for (int i = 0; i < n; i++) {
            String ug = operadores[i].getUsuario().trim();
            String cg = operadores[i].getContrasenia().trim();
            String ui = u.trim();
            String ci = c.trim();

            if (ui.equals(ug) && ci.equals(ci)) {
                // System.out.println("OMAGA");
                ayuda= true;
                break;
                

            

            //  System.out.println("comparando...");
            //  System.out.println("ui: "+ui);
            //  System.out.println("ug: "+ug);
            //  System.out.println("ci: "+ci);
            // System.out.println("cg: "+cg);
            
                
            
        }else{ayuda= false;}
       
    }
        return ayuda;
    }

    public void mostra() {
        for (int i = 0; i < n; i++) {
            operadores[i].mostrarInfo();
            System.out.println("la contrasenia es " + operadores[i].getContrasenia());
            System.out.println("el usuario es " + operadores[i].getUsuario());
        }
    }

        
}
