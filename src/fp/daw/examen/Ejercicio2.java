package fp.daw.examen;

public class Ejercicio2 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'stringToArray' que
	 * reciba a través de un parámetro formal un objeto de tipo String y retorne
	 * un vector de caracteres de la misma longitud que la cadena recibida que 
	 * contenga los mismos caracteres que ésta y en el mismo orden. 
	 */
	
	/*
	 * No necesito escribir un método así, ya existe uno que hace esto en la clase String
	 */
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'stringToArray' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	static void mostrarVector(char [] vector) {
		System.out.print("[");
		for (int i=0; i<vector.length; i++)
			System.out.print("'" + vector[i] + "'" + (i == vector.length - 1 ? "" : ", "));
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		mostrarVector("Hola Mundo".toCharArray());
	}


}
