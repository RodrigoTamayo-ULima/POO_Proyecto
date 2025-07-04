
package MODELOobj;

public class mesaElectoral {
    private String idMesa;
    private miembroMesa[] miembros;
    private int cantidadMiembros;
    

    public mesaElectoral() {
        cantidadMiembros=0;
        idMesa="a1";
        miembros=new miembroMesa[5];
        
    }

    public mesaElectoral(String idMesa, miembroMesa[] miembros) {
        
        this.idMesa = idMesa;
        this.miembros = miembros;
        this.cantidadMiembros = 0;
        
       
    }

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        this.idMesa = idMesa;
    }

    public miembroMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(miembroMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getCantidadMiembros() {
        return cantidadMiembros;
    }

    public void setCantidadMiembros(int cantidadMiembros) {
        this.cantidadMiembros = cantidadMiembros;
    }

    
    
    
    public void agregarMiembro(miembroMesa a){
        if (cantidadMiembros<miembros.length) {
            miembros[cantidadMiembros]=a;
            cantidadMiembros++;
        }else{System.out.println("Ya se ha alcanzado la cantidad maxima de miembros");}
    }
    
    public miembroMesa buscarPorNombre(String nombre,String apellido){
        for (miembroMesa miembro : miembros) {
            if (miembro.getNombre() == nombre&&miembro.getApellido()==apellido) {
                return miembro;
            }
        }
        return null;
       
    }
    
    public void mostrarInfoMiembros(){
        for (miembroMesa miembro : miembros) {
            miembro.mostrarInfo();
        }
    }
    
        public void eliminarPorNombre(String nombre,String apellido){
        for (miembroMesa miembro : miembros) {
            if (miembro.getNombre() == nombre&&miembro.getApellido()==apellido) {
                for (int i = 0; i < cantidadMiembros-1; i++) {
                    miembros[i]=miembros[i+1];
                    
                }
                miembros[cantidadMiembros-1]=null;
                cantidadMiembros--;
                System.out.println("Se elimino de la mesa Correctamente a:" +nombre+" "+apellido);
            }
            System.out.println("No se encontro a ese miembro en la mesa");
        }
        
       
    }
}
