package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		int [] unidades = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		Scanner s = new Scanner(System.in);
		String respuesta;
		int cantidad;
		do {
			do {
				System.out.println("¿Qué cantidad de euros deseas desglosar? ");
				if ((cantidad = s.nextInt()) < 1)
					System.out.println("La cantidad tiene que ser exacta y mayor que cero. Introdúcela de nuevo...");
			} while (cantidad < 1);
			
			for (int i=0; i<unidades.length && cantidad > 0; i++) {
				if (cantidad >= unidades[i]) {
					int n = cantidad / unidades[i];
					cantidad = cantidad % unidades[i];
					System.out.println(n + (unidades[i] > 2 ? " billete" : " moneda") + (n > 1 ? "s": "") + " de " + unidades[i] + " euro" + (unidades[i] == 1 ? "" : "s"));
				}
			}
			
			System.out.println("¿Desglosar otra cantidad? (si/no): ");
			respuesta = s.next();
		} while (respuesta.toLowerCase().equals("si"));
	}


}
