
package tabla_multiplicar;

import java.util.Scanner;

public class Tabla_multiplicar {

    public static void main(String[] args) {
       int it_I, it_J;
       
       for (it_I = 1; it_I< 11; it_I++)
       {
           System.out.print("\n\n");
           
       for (it_J = 1; it_J< 11; it_J++)  
       {
           
           System.out.print(it_I + " X " + it_J + " = " + (it_I* it_J));
           System.out.print("\n");
       }
       }
    }
}
