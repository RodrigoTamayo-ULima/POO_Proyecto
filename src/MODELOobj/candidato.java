
package MODELOobj;


public class candidato extends persona {
    private String dni;
    private String partidoPolitico;
    

    public candidato() {
        super();
        dni = "";
        partidoPolitico="";
        
       
        
    }

   
    public candidato(String nombre, String apellido,String dni,String partidoPolitico) {
        super(nombre, apellido);
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
       
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

   
    
     @Override
    public void mostrarInfo(){
        System.out.println("El nombre del Candidato es: "+getNombreCompleto());
        System.out.println("Con el dni: "+this.dni );
         System.out.println("Y pertene al partido politico: " +this.partidoPolitico);
    }
    
    
   
}
