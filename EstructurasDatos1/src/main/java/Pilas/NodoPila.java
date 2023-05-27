public class NodoPila {
    
    private Archivos dato;
    private NodoPila siguiente;

    public NodoPila() {
       this.dato = null;
        this.siguiente = null;
    }

    public Archivos getDato() {
        return dato;
    }

    public void setDato(Archivos dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
