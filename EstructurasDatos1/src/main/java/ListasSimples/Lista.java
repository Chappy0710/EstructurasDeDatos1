package ListasSimples;

public class Lista {
    
    private Nodo cabeza;
    
    public void inserta(Persona p){
        if(cabeza==null){ //cuando lista es vacia
            cabeza = new Nodo(p);
        }else if(p.getId()<cabeza.getDato().getId()){ //si ocupa ir a la izq de la cabeza
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);     
            cabeza = aux;
        }else if(cabeza.getNext()==null){  //si tiene un elemento que se debe insertar a la derecha
            cabeza.setNext(new Nodo(p));
        }else{  //se debe insertar al medio o al final
            Nodo aux = cabeza;
            while (aux.getNext() != null && aux.getNext().getDato().getId()<p.getId()){
                aux=aux.getNext();
            }
            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }
    
    public void elimina(int id){
        if(cabeza!=null){
        if(cabeza.getDato().getId() == id){
            cabeza = cabeza.getNext();
        }
        else{
            Nodo aux = cabeza;
            while(aux.getNext()!=null && aux.getNext().getDato().getId() < id){
                aux = aux.getNext();
            }
            
            if(aux.getNext()!=null && aux.getNext().getDato().getId() == id){
                aux.setNext(aux.getNext().getNext());
            }
        }
        }
    }
    
    public boolean existe(int id){
        boolean esta = false;
        if(cabeza!=null){
            Nodo aux = cabeza;
            
            while(aux != null && aux.getDato().getId() < id){
                aux = aux.getNext();
            }
            esta = (aux != null && aux.getDato().getId() == id);
        }
        return esta;
    }
    
    public void modifica (Persona p) {
        if(cabeza != null){
            Nodo aux = cabeza;
            while(aux != null && aux.getDato().getId() < p.getId()){
                aux = aux.getNext();
            }
            
            if(aux != null && aux.getDato().getId() == p.getId()){
                aux.getDato().setNombre(p.getNombre());
            }
        }
    }
    
    public Persona extrae (int id){
        Persona p = null;
        
        if(cabeza != null){
            if(cabeza.getDato().getId() == id){
                cabeza = cabeza.getNext();
            }
            else{
                Nodo aux = cabeza;
                while(aux.getNext()!=null && aux.getNext().getDato().getId() < id){
                    aux = aux.getNext();
                }
                if(aux.getNext() != null && aux.getNext().getDato().getId() == id){
                    p = aux.getNext().getDato();
                    aux.setNext(aux.getNext().getNext());
                }
            }
        }
        return p;
    }

    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s = "Lista: ";
        while(aux!=null){
            s+=aux+", ";
            aux=aux.getNext();
        }
        return s;
    }
    
    
}
