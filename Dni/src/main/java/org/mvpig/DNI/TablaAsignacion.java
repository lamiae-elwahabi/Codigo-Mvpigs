package org.mvpig.DNI;

public class TablaAsignacion {
	//Propiedad
	//Nuestro array para almacenar los carateres no va cambiar en el tiempo de ejecion
	char[] tabla =  {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };


	public char getLetra(int posicion){

		return this.tabla[posicion];
	}

	public int getModulo(){
		return this.tabla.length;
	}

	public Boolean letraPermitida(char letra){
		String tablaString = String.valueOf(tabla);
		// contains() requiere una secuencia de caracteres: convertir el caracter letra a un string
		return tablaString.contains( Character.toString(letra) );
	}

	public char calcularLetra(String DNI){
		// Obtener el numero del dni del string => dni sano
		// Dividirlo por el número de letras (actualmente 23) y obtener el resto (división módulo)
		// Consultar TablaAsignacion con ese resto = posicion
		int dni = Integer.parseInt(DNI);
		int posicion = dni % getModulo();
		return getLetra(posicion);
	}



}


