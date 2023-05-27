package ListasSimples;


import ListasSimples.Lista;

public class Main {

    public static void main(String[] args) {
        
        Lista laLista = new Lista();
        laLista.inserta(new Persona(13, "Juan"));
        laLista.inserta(new Persona(3, "Emilia"));
        laLista.inserta(new Persona(12, "Belen"));
        laLista.inserta(new Persona(14, "Aaron"));
        laLista.inserta(new Persona(9, "Pepe"));

        
        System.out.println(laLista);
    }
    
}
