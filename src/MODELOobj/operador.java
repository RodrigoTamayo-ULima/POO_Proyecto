
package MODELOobj;


public class operador extends persona {
    
    private String usuario;
    private String contrasenia;

    public operador() {
        super();
        usuario="";
        contrasenia="";
    }

  
    public operador(String usuario, String contrasenia, String nombre, String apellido) {
        super(nombre, apellido);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
     @Override
    public void mostrarInfo(){
        System.out.println("El nombre del usuario es: "+getNombreCompleto());
        
    }
    
    //public boolean autentificarAcceso(String usuario , String contrasenia){
        
    //}
    
}
