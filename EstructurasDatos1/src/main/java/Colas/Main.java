public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();

        
        cola.encolaNormal(new NodoCola(new Citas("pepe", "1", "2 de noviembre",
                "sin problemas",false, false)));
        cola.encolaNormal(new NodoCola(new Citas("Aaron", "2", "2 de noviembre",
                "sin problemas",false, false)));
        cola.encolaNormal(new NodoCola(new Citas("juan", "3", "2 de noviembre",
                "sin problemas",true, false)));
        cola.encolaNormal(new NodoCola(new Citas("alberto", "4", "2 de noviembre", 
                "sin problemas",false, false)));
        cola.encolaNormal(new NodoCola(new Citas("alberto", "5", "2 de noviembre",
                "sin problemas",true, false)));
        cola.encolaNormal(new NodoCola(new Citas("alberto", "6", "2 de noviembre",
                "sin problemas",false, false)));
         
        
         System.out.println(cola.imprimir());
    }
    
}
