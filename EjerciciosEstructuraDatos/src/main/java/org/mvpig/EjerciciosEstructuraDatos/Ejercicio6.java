package org.mvpig.EjerciciosEstructuraDatos;
/**Se define el punto de silla de una matriz de orden 3x3 como el elemento de la matriz
 *  que es el más pequeño de su fila y el más grande de su columna. 
 *  Escribe un programa que proporcione valores a una matriz en su declaración y 
 *  que calcule si tiene o no punto de silla.*/

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[][] matriz = { { 2, 1, 3 }, //Declaramos  nuestra matriz 3*3
						   { 1, 3, 4 }, 
						   { 7, 5, 6 } };       
		int mayor = 0;
		int menor = 0;
		int columna = 0;
		boolean silla = false;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < matriz.length; i++) {

			//localizo el menor de una fila
			menor = matriz[i][0];
			columna = 0;
			for (int j = 1; j < matriz[i].length; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					columna = j;
				}
			}

			//localizo el mayor de la columna donde esta el menor
			mayor = matriz[0][columna];
			for (int f = 0; f < 3; f++) {
				if (matriz[f][columna] > mayor) {
					mayor = matriz[f][columna];
				}
			}

			if (mayor == menor) {
				silla = true;
				System.out.println("el numero " + mayor
						+ " es un punto de silla, esta en la posicion: ("
						+ i + "," + columna + ")");
			}           
		}
		if (silla == false) {
			System.out.println("la matriz no tiene punto de silla");            
		}
	}
}
