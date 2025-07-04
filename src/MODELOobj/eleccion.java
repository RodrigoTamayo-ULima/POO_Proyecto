
package MODELOobj;

public class eleccion {

   private String fecha;
   private String tipo;
   private candidato[] candidatos;
   private int cantidadCandidatos;

    public eleccion() {
        fecha="";
        tipo="";
        candidatos= new candidato[100];
        cantidadCandidatos=0;
      
    }

    public eleccion(String fecha, String tipo, candidato[] candidatos) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidatos = candidatos;
        this.cantidadCandidatos=0;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public candidato[] getCandidatosAsociados() {
        return candidatos;
    }

    public void setCandidatosAsociados(candidato[] candidatosAsociados) {
        this.candidatos = candidatosAsociados;
    }

    public int getCantidadCandidatos() {
        return cantidadCandidatos;
    }

    public void setCantidadCandidatos(int cantidadCandidatos) {
        this.cantidadCandidatos = cantidadCandidatos;
    }
    
    
   
    public void agregarCandidato(candidato c){
        if (cantidadCandidatos<candidatos.length) {
            candidatos[cantidadCandidatos]=c;
            cantidadCandidatos++;
        }else{System.out.println("Ya se ha alcanzado la cantidad maxima de candidatos");}
    }
   
   public void mostrarInfoCandidatos(){
       for (candidato candidato : candidatos) {
           candidato.mostrarInfo();
       }
    }
   
   public void eliminarPorNombre(String nombre,String apellido){
        for (candidato candidato : candidatos) {
            if (candidato.getNombre() == nombre&&candidato.getApellido()==apellido) {
                for (int i = 0; i < cantidadCandidatos-1; i++) {
                    candidatos[i]=candidatos[i+1];
                    
                }
                candidatos[cantidadCandidatos-1]=null;
                cantidadCandidatos--;
                System.out.println("Se elimino de las elecciones Correctamente a:" +nombre+" "+apellido);
            }
            System.out.println("No se encontro a ese candidato en las elecciones");
        }
        
       
    }
   
   public void eliminarPorDni(String dni){
        for (candidato candidato : candidatos) {
            if (candidato.getDni() == dni) {
                for (int i = 0; i < cantidadCandidatos-1; i++) {
                    candidatos[i]=candidatos[i+1];
                    
                }
                candidatos[cantidadCandidatos-1]=null;
                cantidadCandidatos--;
                System.out.println("Se elimino de las elecciones al candidato con el dni: " +dni);
            }
            System.out.println("No se encontro a ese candidato en las elecciones");
        }
        
       
    }
   
   
}
