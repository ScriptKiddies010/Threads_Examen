/* Examen4cuat3parc

Realizar un Thread que en su método run  ejecute la siguiente tarea:

Generar 10 números aleatorios en el rango de 1 a 10, con esta información realizar lo siguiente:

a) Contar e imprimir el total de números pares e impares                                                                             5pts                                                    

b) Sumar los números pares e impares por separado e imprimir el resultado.                                          5pts

c) Imprimir la suma de los 10 números aleatorios                                                                                         10pts

d) Contar e imprimir el total de números repetidos para cada número.                                                       35pts

e) Agregar el método sleep() para que el tiempo entre cada impresión sea de 2 segundos.                 15pts


Nota: Al principio imprimir los números aleatorios separados por comas y después  imprimir en forma de lista
 llevando un orden del inciso a hasta e.


Ejemplo de una corrida:


3, 7, 6, 10, 2, 9, 6, 3, 8, 9, 
a)Pares=5  Impares=5
b)Suma pares=32 suma impares=31
c)Suma de los 10 números aleatorios=63
d)Números repetidos para cada número:
 rep 1=0, rep 2=0, rep 3=1, rep 4=0, rep 5=0, rep 6=1, rep 7=0, rep 8=0, rep 9=1, rep 10=0



-------------------------------
utilizamos el operador “%” para calcular el “resto” de la división del número “x” entre “2”. Si el número tiene resto igual a cero sabemos que es par.
*/

package ejemplohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String args[]) {

        EjemploHilos eh1 = new EjemploHilos("q");

        eh1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Fin del main");

    }

}

