/**
* Clase aPila
* @version 22.08.2016
* @author Jorge Mario Lara, Diego Valdez
* @param <T>
* parametro generico
*/
public abstract class aPila <T> implements iPila <T>{
    
    @Override
    public abstract void push(T num);


    @Override
    public  abstract T pop();
}
