public class Main {

    public static void main(String[] args) {
        
        Pila pila = new Pila();
        pila.pushNormal(new Archivos("001", 550, false));
        pila.pushNormal(new Archivos("003", 200, false));
        pila.pushNormal(new Archivos("004", 430, false));
        pila.pushNormal(new Archivos("002", 420, false));
        pila.listar();
        
    }
    
}
