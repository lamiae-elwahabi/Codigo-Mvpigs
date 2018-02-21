package org.mvpig.EjerciciosEstructuraDatos;
/**Escribe un programa que genere y escriba una matriz unitaria de orden 10. 
 * Una matriz unitaria de orden 10 es una matriz de 10x10 en la que todos los elementos valen 0, 
 * excepto los de la diagonal principal que valen 1. La diagonal principal es la que va de la esquina
 *  superior izquierda a la inferior derecha.
*/
public class Ejercicio4 {
	public static void main(String[] args) {

		int[][] matriz = new int[10][10];//matriz unitaria de orden 10
		int[][] matrices = new int[20][20];//matriz unitaria de orden 20

		//damos valores y los escribimos para matriz
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				}
				else{
					matriz[i][j] = 0;
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("Este es la matriz 10*10");
			System.out.println();

		}
		//damos valores y los escribimos para matrices
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j) {
					matrices[i][j] = 1;
				}
				else{
					matrices[i][j] = 0;
				}
				System.out.print(matrices[i][j] + " ");
			}
			System.out.print("Este es la matriz 20*20");
			System.out.println();
		}

	}
}
