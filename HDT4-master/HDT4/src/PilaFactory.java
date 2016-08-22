/**
* Clase PilaFactory
* @author Jorge Mario Lara, Diego Valdez
* @version 22.08.2016
*/
public class PilaFactory {
    
    /**
     *
     * @param nombre: String
     * @return
     * regresa la instancia requerida
     */
    public aPila crearInstancia(String nombre){
        switch (nombre){
            case "ArrayList": 
                return new PilaArr();
            case "Vector": 
                return new PilaVec();
            case "List": 
                return new PilaLis();
        }
        return null;
    }
}
