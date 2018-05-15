package com.cip.prog;
import java.util.Scanner;

public class ColeccionPersonasMain {
	
	
	
	//----- MÉTODO MAIN -----------------------------------------
	public static void main(String[] args) {
		
		//Definición de atributos generales
		Lista listaPersonas = new Lista();
		int opcion = -1;
		Scanner sc_opcion = new Scanner(System.in);		//Se inicializa lector de opcion
		
		
		//----- IMPRESIÓN DE MENU EN PANTALLA ----------------------------------------------
		while (opcion != 0) {
					
			System.out.println("----------------------------------------------------");
			System.out.println("1. Cargar Datos.");
			System.out.println("2. Listar.");
			System.out.println("3. Insertar.");
			System.out.println("4. Eliminar.");
			System.out.println("5. Número de elementos guardados.");
			System.out.println("----------------------------------------------------");
			System.out.println("Escoja una opción: ");
			
			opcion = sc_opcion.nextInt();	//Se almacena en variable la opción seleccionada	
				
			switch (opcion) {
				case 1: listaPersonas.cargar(); break;
				case	 2: listaPersonas.listar(); break;
				case 3: listaPersonas.insertar("NombreEjemplo", "ApellidoEjemplo", "12345678A", 18, "Calle Ejemplo", 38600, "EjemploProvincia"); break;
				case 4: listaPersonas.eliminar("NombreEjemplo"); break;
				case 5: System.out.println("El número de elemtnos guardados en el listado de personas es: " + listaPersonas.numeroElementos()); break;
				default: System.out.println("Introduzca un número correcto");
			}
		
		}
		
		sc_opcion.close();
	//	listaPersonas.cargar();
	//	listaPersonas.listar();
		
	
	
	}
}
