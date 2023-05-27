package ListasDoblesCirculares;

import java.util.Set;

public class ListaDobleCircular {
            
    private Nodo cabeza;
    private Nodo ultimo;
    
    public void inserta(Persona p){
        if(cabeza==null){ //si esta vacia
            cabeza = new Nodo(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if(p.getId()<cabeza.getDato().getId()){  //debe ir a la izq de la cabeza
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);     
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if(ultimo.getDato().getId() <= p.getId()){  // agrega si se debe insertar al final de la lista
            ultimo.setNext(new Nodo (p));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else{
            Nodo aux = cabeza;
            while (aux.getNext().getDato().getId()<p.getId()){ //se elimino la primera condicion
                aux=aux.getNext();
            }
            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext()); 
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp); 
        }
        ultimo.setNext(cabeza);
        
    }
    
    public void elimina(int id){
        if(cabeza!=null){
        if(cabeza.getDato().getId() == id){
            cabeza = cabeza.getNext();
        }
        else{
            Nodo aux = cabeza;
            while(aux.getNext().getDato().getId() < id){
                aux = aux.getNext();
            }
            
            if(aux.getNext().getDato().getId() == id){
                aux.setNext(aux.getNext().getNext());
            }
        }
        }
    }
    
    public boolean existe(int id){
        boolean esta = false;
        if(cabeza!=null){
            Nodo aux = cabeza;
            
            while(aux.getDato().getId() < id){
                aux = aux.getNext();
            }
            esta = (aux.getDato().getId() == id);
        }
        return esta;
    }
    
    public void modifica (Persona p) {
        if(cabeza != null){
            Nodo aux = cabeza;
            while(aux.getDato().getId() < p.getId()){
                aux = aux.getNext();
            }
            
            if(aux.getDato().getId() == p.getId()){
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
                while(aux.getNext().getDato().getId() < id){
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
        if(aux != null){
            s+=aux+", ";
            aux=aux.getNext();
            while(aux != cabeza){
                s+=aux+", ";
                aux=aux.getNext();
            }
        }else{
            s+="vacia";
        }
        return s;
    }
    
}
