public class NodoCola {
    private Citas dato;
    private NodoCola atras;
    
    public NodoCola(Citas dato) {
        this.dato = dato;
        this.atras = null;
    }

    public Citas getDato() {
        return dato;
    }

    public void setDato(Citas dato) {
        this.dato = dato;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }
}
