package org.mvpigs.chapter7;

import java.time.LocalDate;

public class Person {
	//Propiedades
		String name = "";
		LocalDate birthdate;
		
		//Constructor
		public Person (String name, int year, int month, int day) {
			LocalDate tempBD = LocalDate.of(year, month, day);
			this.name = name;
			this.birthdate = tempBD;
		}
		public void printName() {
			System.out.print(this.name);
		}

	

}
