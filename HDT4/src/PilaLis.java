
import java.util.LinkedList;

/**
* Clase PilaLis
* @version 22.08.2016
* @author Jorge Mario Lara, Diego Valdez
* @param <T>
* parametro generico
*/
public  class PilaLis <T> extends aPila <T> {

     /**
     * atributos
     * vec
     */
    private  LinkedList<String> vec;
    
    /**
     * Constructor de la clase PilaLis, donde se le asignan valores iniciales
     */
    public PilaLis(){
        vec = new LinkedList<String>();
    }
    
     /**
     * @param vecto : ArrayList
     * Recibe el vector tipo ArrayList
     */
    public void setVec( LinkedList<String> vecto) {
        this.vec = vecto;
    }
    
    /**
     * 
     * @return vec : ArrayList
     * Devuelve el vector
     */
    public  LinkedList<String> getVec() {
        return vec;
    }
    
    @Override
    public void push(T num) {
        vec.add((String)num);
    }

    @Override
    public T pop() {
        int pos ;
        String num;
        pos = vec.size();
        num = (String) vec.get(pos-1);
        vec.remove(pos-1);
        return (T) num;
    }
}