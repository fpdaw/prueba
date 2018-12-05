package fp.daw.examen;

import java.util.Random;

public class Ejercicio6 {

	/* 
	 *  2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que cree un vector de números enteros de un
	 * tamaño aleatorio comprendido entre 100 y 500. Una vez creado lo llenará llenará con
	 * números aleatorios comprendidos entre 0 y 1000000. Después de llenar el vector 
	 * mostrará la mínima diferencia entre dos valores adyacentes. La diferencia entre dos
	 * valores adyacentes se calcula como el valor almacenado en cada posición [i] (excepto
	 * la primera) menos el valor almacenado en la posición [i-1].
	 */
		
	public static void main(String[] args) {
		Random r = new Random();
		int [] vector = new int[r.nextInt(401) + 100];
		for (int i=1; i<vector.length; i++)
			vector[i] = r.nextInt(1000001);
		int min = Integer.MAX_VALUE;
		for (int i=1; i<vector.length; i++) {
			int dif = vector[i] - vector[i-1];
			if (dif < min)
				min = dif;
		}
		System.out.println("Diferencia mínima entre dos valores adyacentes: " + min);	
	}


}
