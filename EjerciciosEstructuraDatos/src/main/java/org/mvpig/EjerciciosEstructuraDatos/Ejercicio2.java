package org.mvpig.EjerciciosEstructuraDatos;
/**
2. Declara un Array de nombre lista que estará formado por 25 datos de tipo entero generados al azar comprendidos entre 25 y 50.
Declara otro vector de nombre auxiliar formado por 4 datos de tipo real. Almacenar en este Array lo siguiente: 
Posición 0: número de números pares en lista. 
Posición 1: número de números impares de lista. 
Posición 2: media de los números impares de lista. 
Posición 3: suma de los números enteros comprendidos entre 1 y el valor par más pequeño de lista. 
Escribe a continuación el contenido de lista, así como los resultados obtenidos y almacenados en auxiliar.
*
*/
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		int[] lista = new int[25]; //Array nombre lista, de 25 datos de tipos entero
		Random aleatorio = new Random();//Generar al azar entre 25 y 50
		double[] auxiliar = new double[4]; //Otro vector de nombre auxiliar
		int sumaImpares = 0;
		int min = 0;

		// damos valores a lista
		for (int i = 0; i < lista.length; i++) {
			lista[i] = aleatorio.nextInt(26) + 25;
		}

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] % 2 == 0) {
				auxiliar[0]++;
			} else {
				auxiliar[1]++;
			}
			if (i == 0) {
				min = lista[i];
			} else if (lista[i] < min) {
				min = lista[i];
			}
		}
		auxiliar[2] = sumaImpares / auxiliar[1];
		for (int i = 1; i <= min; i++) {
			auxiliar[3] += i;
		}

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion " + i + " de la lista =" + lista[i]);
		}
		System.out.println();

		System.out.println("Numero de elementos pares: " + auxiliar[0]);
		System.out.println("Numero de elementos impares: " + auxiliar[1]);
		System.out.println("Media impares: " + auxiliar[2]);
		System.out.println("Suma de los enteros comprendidos entre 1 y el minimo de la lista: "
				+ auxiliar[3]);
	}

}

