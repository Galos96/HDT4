/**
* Clase iPila
* @version 22.08.2016
* @author Jorge Mario Lara, Diego Valdez
* @param <T>
* parametro generico
*/
public interface iPila <T> {

/**
*
* @param num: T
*/
public void push(T num);

/**
* @return num: T
*/
public T pop();
}