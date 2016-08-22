/**
* Clase Menu
* @author Jorge Mario Lara, Diego Valdez
* @version 22.08.2016
*/

import java.util.Scanner;
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String snum1, snum2;
        Calculador calc = new Calculador();
        String c;
        Lector lec = new Lector();
        String text="";
        PilaFactory factory = new PilaFactory();
        // Recuerde cambiar la dirección de su archivo de texto con el siguiente formatocde ejemplo
        text= lec.leer("C:\\Users\\Diego Valdez\\Desktop\\datos.txt");
        Scanner  Teclado=new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Bienvenido a la Hoja de Trabajo 4");
        int opcion=0;
        while (opcion != 4) {
            System.out.println("--------------------------------------");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. List");
            System.out.println("4. Salir");
            System.out.println("--------------------------------------");
            opcion =Integer.parseInt(Teclado.nextLine());
            while ((opcion != 2) && (opcion != 1)&& (opcion != 3)&& (opcion != 4)) {
                System.out.println("--------------------------------------");
                System.out.println("1. ArrayList");
                System.out.println("2. Vector");
                System.out.println("3. List");
                System.out.println("4. Salir");
                System.out.println("--------------------------------------");
                opcion =Integer.parseInt(Teclado.nextLine());
            }
            if (opcion== 3) {
                aPila stk = factory.crearInstancia("List");
                for (int i=0; i <= text.length()-1; i++){
                    c = ""+ text.charAt(i); 
                    if ((!c.equals("*") )&& (!c.equals("/"))&& (!c.equals("+"))&& (!c.equals("-"))){
                        if (!c.equals(" ") ){
                            stk.push(c);
                        }
                    }else{
                        snum1 = (String) stk.pop();
                        snum2 = (String) stk.pop();
                        stk.push(calc.calculo(snum1, snum2, c));
                    }
                }
                System.out.println("El resultado con List es: " + stk.pop());
            }
            
            if (opcion== 1) {
                aPila stk = factory.crearInstancia("ArrayList");
                for (int i=0; i <= text.length()-1; i++){
                    c = ""+ text.charAt(i); 
                    if ((!c.equals("*") )&& (!c.equals("/"))&& (!c.equals("+"))&& (!c.equals("-"))){
                        if (!c.equals(" ") ){
                            stk.push(c);
                        }
                    }else{
                        snum1 = (String) stk.pop();
                        snum2 = (String) stk.pop();
                        stk.push(calc.calculo(snum1, snum2, c));
                    }
                }
                System.out.println("El resultado con ArrayList es: " + stk.pop());
            }
            
            if (opcion== 2) {
               aPila stk = factory.crearInstancia("Vector");
                for (int i=0; i <= text.length()-1; i++){
                    c = ""+ text.charAt(i); 
                    if ((!c.equals("*") )&& (!c.equals("/"))&& (!c.equals("+"))&& (!c.equals("-"))){
                        if (!c.equals(" ") ){
                            stk.push(c);
                        }
                    }else{
                        snum1 = (String) stk.pop();
                        snum2 = (String) stk.pop();
                        stk.push(calc.calculo(snum1, snum2, c));
                    }
                }
                System.out.println("El resultado con Vector es: " + stk.pop());
            }
        }
        System.out.println("Hasta Luego");
    }
    
}
