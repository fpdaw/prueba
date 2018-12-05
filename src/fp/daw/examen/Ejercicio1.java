package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'contiene' que
	 * reciba dos parámetros: un vector de cadenas de caracteres y una cadena.
	 * El método retornará true si la cadena recibida en el segundo parámetro
	 * se encuentra almacenada en el vector y false en caso contrario.
	 * El método incluirá una única sentencia 'return' y no está permitido el
	 * uso de variables booleanas.
	 */
	
	public static boolean contiene(String [] vector, String s) {
		int i=0;
		while (i < s.length() && !vector[i].equals(s))
			i++;
		return i < s.length();
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'contiene' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	static String [] vector = {"lunes", "martes", "miércoles", "jueves", "viernes", "sabado", "domingo" };
	
	static void comprobar(String s) {
		System.out.println("\"" + s + "\"" + (contiene(vector, s) ? " " : " no ") + "está contenida en el vector");
	}
	
	public static void main(String[] args) {
		comprobar("hola");
		comprobar("lunes");
		comprobar("jueves");
		comprobar("domingo");
	}


}
