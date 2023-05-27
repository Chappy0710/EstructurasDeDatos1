
public class Cola {

    private NodoCola frente;
    private NodoCola ultimo;
    private int largo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }

    public void encolaNormal(NodoCola nuevoNodo) {  //agrega
        if (frente == null) {  // significa que la cola esta vacia
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }
        largo++;
    }

    public NodoCola atiende() {  //elimina
        NodoCola aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }

        public boolean encuentra(Citas referencia){  //busca
        if(frente != null){
            if (ultimo.getDato().getCedula().equals(referencia.getCedula())){
                return true;
            }else{
                NodoCola aux=frente;
                while(aux!=null){
                    if(aux.getDato().getCedula().equals(referencia.getCedula())){
                        return true;
                    }
                    aux=aux.getAtras();
                }
            }
        }
        return false;
    }
        
        public String imprimir(){  //muestra
        String s="";
        NodoCola aux=frente;
        while(aux!=null){
            s+=aux.getDato().getCedula()+"\n";
            aux=aux.getAtras();
        }
        return s;
    }   
    
}
