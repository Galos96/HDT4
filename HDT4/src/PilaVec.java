/**
* Clase PilaVec
* @version 22.08.2016
* @author Jorge Mario Lara, Diego Valdez
* @param <T>
*/
import java.util.Vector;
public  class PilaVec <T> extends aPila <T> {
    
     /**
     * atributos
     * vec
     */
    private Vector vec;
    
    /**
     * Constructor de la clase PilaVec, donde se le asignan valores iniciales
     */
    public PilaVec(){
        vec = new Vector(20,5);
    }
  
    /**
     * @param vecto : Vector
     * Recibe el vector tipo Vector
     */
    public void setVec(Vector vecto) {
        this.vec = vecto;
    }
    
    /**
     * 
     * @return vec : Vector
     * Devuelve el vector
     */
    public Vector getVec() {
        return vec;
    }
    
    @Override
    public void push(T num) {
        vec.addElement(num);
    }

    @Override
    public T pop() {
        int pos ;
        String num;
        pos = vec.size();
        num = (String) vec.elementAt(pos-1);
        vec.removeElementAt(pos-1);
        return (T) num;
    }
    
}
