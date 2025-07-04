
package MODELOobj;


public class candidato extends persona {
    private String dni;
    private String partidoPolitico;
    private int votosPreferenciales;

    public candidato() {
        super();
        dni = "";
        partidoPolitico="";
        votosPreferenciales=0;
       
        
    }

   
    public candidato(String dni, String partidoPolitico, int votosPreferenciales, String nombre, String apellido) {
        super(nombre, apellido);
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
        this.votosPreferenciales = votosPreferenciales;
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

    public int getVotosPreferenciales() {
        return votosPreferenciales;
    }

    public void setVotosPreferenciales(int votosPreferenciales) {
        this.votosPreferenciales = votosPreferenciales;
    }
    
    
    public void agregarVoto(){
        votosPreferenciales+=1;
    }
    
    public int getVotos(){
        return votosPreferenciales;
    }
    
     @Override
    public void mostrarInfo(){
        System.out.println("El nombre del Candidato es: "+getNombreCompleto());
        System.out.println("Con el dni: "+this.dni );
         System.out.println("Y pertene al partido politico: " +this.partidoPolitico);
         System.out.println("Cuenta con un total de: "+ getVotos()+" Votos Preferenciales");
    }
    
}
