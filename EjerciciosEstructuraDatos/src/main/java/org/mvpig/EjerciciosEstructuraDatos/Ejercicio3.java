package org.mvpig.EjerciciosEstructuraDatos;
/**
 *Asigna a un Array 30 números enteros comprendidos entre 1 y 20.
 *Muestra en consola el contenido del Array ordenado de menor a mayor. 
 *Utilizar el método sort de la clase Arrays.
*/
import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vector = new int[30]; //Array 30 numeros enteros entre 1 y 20
        Random random = new Random(); //Usamos Random

        for (int i = 0; i < vector.length; i++) { //Bucle para recorrer el vector 
            vector[i] =random.nextInt(20) + 1; //Returns the next pseudorandom,
        }

        Arrays.sort(vector);  //Metodo array.sort
        for (int numero : vector) {
            System.out.println(numero);
        }
    }
}
