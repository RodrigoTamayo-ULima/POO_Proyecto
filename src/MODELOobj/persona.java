
package MODELOobj;


public abstract class persona {
    private String nombre;
    private String apellido;

    public persona() {
         nombre = "";
         apellido = "";
    }

    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //OVERRIDE?
    public String getNombreCompleto(){
        return this.nombre+" "+this.apellido;
    }
    
    public abstract void mostrarInfo();
}
