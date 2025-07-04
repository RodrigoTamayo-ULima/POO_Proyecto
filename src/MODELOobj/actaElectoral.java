package MODELOobj;

public class actaElectoral {

    private String numeroActa;
    private String tituloDocumento;
    private String fecha;
    private String hora;
    private String lugar;
    private String idMesa;
    private String[] miembrosMesa;
    private int cantidadMiembrosMesa;
    private int votos;
    private int votosEfectivos;
    private int votosBlancos;
    private int votosNulos;
    private candidato[] candidatos;
    private int[] votosCandidatos;
    private String observaciones;
    private String firmas;
    private boolean sello;

    public actaElectoral(String numeroActa, String tituloDocumento, String fecha,
            String hora, String lugar, String idMesa, String[] miembrosMesa,
            int votos, int votosEfectivos, int votosBlancos, int votosNulos,
            candidato[] candidatos, int[] votosCandidatos, String observaciones, String firmas, boolean sello) {
        this.numeroActa = numeroActa;
        this.tituloDocumento = tituloDocumento;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.idMesa = idMesa;
        this.miembrosMesa = miembrosMesa;
        this.votos = votos;
        this.votosEfectivos = votosEfectivos;
        this.votosBlancos = votosBlancos;
        this.votosNulos = votosNulos;
        this.candidatos = candidatos;
        this.votosCandidatos = votosCandidatos;
        this.observaciones = observaciones;
        this.firmas = firmas;
        this.sello = sello;
    }

    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public String getTituloDocumento() {
        return tituloDocumento;
    }

    public void setTituloDocumento(String tituloDocumento) {
        this.tituloDocumento = tituloDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        this.idMesa = idMesa;
    }

    public String[] getMiembrosMesa() {
        return miembrosMesa;
    }

    public void setMiembrosMesa(String[] miembrosMesa) {
        this.miembrosMesa = miembrosMesa;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getVotosEfectivos() {
        return votosEfectivos;
    }

    public void setVotosEfectivos(int votosEfectivos) {
        this.votosEfectivos = votosEfectivos;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }

    public void setVotosBlancos(int votosBlancos) {
        this.votosBlancos = votosBlancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public int[] getVotosCandidatos() {
        return votosCandidatos;
    }

    public void setVotosCandidatos(int[] votosCandidatos) {
        this.votosCandidatos = votosCandidatos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFirmas() {
        return firmas;
    }

    public void setFirmas(String firmas) {
        this.firmas = firmas;
    }

    public boolean isSello() {
        return sello;
    }

    public void setSello(boolean sello) {
        this.sello = sello;
    }

    public void registrarVotoBlanco(int cantidad) {
        votosBlancos += cantidad;

    }

    public void registrarVotoNulo(int cantidad) {
        votosNulos += cantidad;

    }

    public void registrarVoto(int indiceCandidato, int cantidad) {
        votosCandidatos[indiceCandidato] += cantidad;
        votosEfectivos += cantidad;
    }

    public boolean agregarMiembroMesa(String nombre) {
        if (cantidadMiembrosMesa < miembrosMesa.length) {
            miembrosMesa[cantidadMiembrosMesa] = nombre;
            cantidadMiembrosMesa++;
            return true;
        }
        return false;
    }

    public int getTotalVotosEmitidos() {
        return votosEfectivos + votosBlancos + votosNulos;
    }

    public void aplicarVotosACandidatos() {
        for (int i = 0; i < candidatos.length; i++) {
            for (int j = 0; j < votosCandidatos[i]; j++) {
                candidatos[i].agregarVoto();
            }
        }
    }

    public boolean verificarFirmasYSello() {
        if (sello) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarResumenActa() {

    }

}
