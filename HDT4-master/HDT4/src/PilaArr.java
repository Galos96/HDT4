
import java.util.ArrayList;

/**
* Clase PilaArr
* @version 22.08.2016
* @author Jorge Mario Lara, Diego Valdez
* @param <T>
* parametro generico
*/
public  class PilaArr <T> extends aPila <T> {

     /**
     * atributos
     * vec
     */
    private ArrayList <String> vec;
    
    /**
     * Constructor de la clase PilaArr, donde se le asignan valores iniciales
     */
    public PilaArr(){
        vec = new ArrayList<String>();
    }
    
     /**
     * @param vecto : ArrayList
     * Recibe el vector tipo ArrayList
     */
    public void setVec(ArrayList<String> vecto) {
        this.vec = vecto;
    }
    
    /**
     * 
     * @return vec : ArrayList
     * Devuelve el vector
     */
    public ArrayList<String> getVec() {
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
