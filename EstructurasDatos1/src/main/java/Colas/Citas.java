//En la clase cita se puede cambiar por las variables que se necesiten al igual que el nombre de la clase
public class Citas {
    private String nombre;
    private String cedula;
    private String fechaCita;
    private String historial;
    private boolean discapacidad;
    private boolean frecuente;

    public Citas(String nombre, String cedula, String fechaCita, String historial, boolean discapacidad, boolean frecuente) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaCita = fechaCita;
        this.historial = historial;
        this.discapacidad = discapacidad;
        this.frecuente = frecuente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public boolean isFrecuente() {
        return frecuente;
    }

    public void setFrecuente(boolean frecuente) {
        this.frecuente = frecuente;
    }
}
