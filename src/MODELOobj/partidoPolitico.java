
package MODELOobj;

public class partidoPolitico {
    private String nombre;
    private String sigla;
    private String representanteLegal;
    private String logoSimbolo;

    public partidoPolitico() {
    }
    
    public partidoPolitico(String nombre, String sigla, String representanteLegal, String logoSimbolo) {
        this.nombre = nombre;
        this.sigla = sigla;
        this.representanteLegal = representanteLegal;
        this.logoSimbolo = logoSimbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }
    
    

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getLogoSimbolo() {
        return logoSimbolo;
    }

    public void setLogoSimbolo(String logoSimbolo) {
        this.logoSimbolo = logoSimbolo;
    }

    @Override
    public String toString() {
        return "partidoPolitico{" + "nombre=" + nombre + ", sigla=" + sigla + ", representanteLegal=" + representanteLegal + ", logoSimbolo=" + logoSimbolo + '}';
    }
    
    
    
    
    
}
