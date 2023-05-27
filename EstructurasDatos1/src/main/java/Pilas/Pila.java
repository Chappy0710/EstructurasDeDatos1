
public class Pila {

    private NodoPila cima;
    private int largo;
    private int clasificados;

    public Pila() {
        this.cima = null;  //modificado
        this.largo = 0; //modificado
        this.clasificados = 0; //modificado
    }

    public int getClasificados() {
        return clasificados;
    }

    public boolean Vacia() {
        return cima == null;
    }

    public int tamanio() {
        return this.largo;
    }

    public void pushNormal(Archivos dato) {
        NodoPila newNode = new NodoPila();
        newNode.setDato(dato);

        if (this.Vacia()) {
            this.cima = newNode;
        } else {
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }

    public void pop() {
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }

    public boolean search(Archivos reference) {
        // Crea una copia de la pila.
        NodoPila aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference.getNumeroDocumentoAsociado().equals(
                    aux.getDato().getNumeroDocumentoAsociado())) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }

    public void listar() {
        // Crea una copia de la pila.
        NodoPila aux = cima;
        // Recorre la pila hasta el ultimo node.
        while (aux != null) {
            System.out.println("|\t"
                    + aux.getDato().getNumeroDocumentoAsociado() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
