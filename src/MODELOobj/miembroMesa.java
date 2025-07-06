
package MODELOobj;


public class miembroMesa extends persona{
    private String tipo;

    public miembroMesa() {
        tipo = "";
    }

    public miembroMesa(String tipo, String nombre, String apellido) {
        super(nombre, apellido);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public void mostrarInfo(){
        System.out.println("El nombre del Miembro de mesa es: "+getNombreCompleto());
        System.out.println("y es de tipo :");
    }
}
