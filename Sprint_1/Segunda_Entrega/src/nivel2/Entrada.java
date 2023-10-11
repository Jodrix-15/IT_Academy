package nivel2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada extends Exception{
	/*Crea una classe anomenada "Entrada". Aquesta classe ha 
	 * de servir per controlar les diferents excepcions que 
	 * poden aparèixer en Java a l’hora d’introduir dades per 
	 * teclat utilitzant la classe Scanner.
	 * El primer que s’ha de fer és instanciar un objecte de la 
	 * classe Scanner i a partir d’aquí, crear mètodes estàtics per 
	 * llegir els diferents tipus de dades des del teclat
	 */
	
	/*Tots els mètodes reben un String amb el missatge que es vol 
	 * mostrar a l’usuari/ària, per exemple: “Introdueix la teva edat”, 
	 * i retornen la dada oportuna introduïda per l’usuari/ària en cada 
	 * mètode, per exemple: un byte amb l’edat de l’usuari/ària.
	 * Mètodes a implantar capturant l’excepció de la classe InputMismatchException:
		public static byte llegirByte(String missatge)
		public static int llegirInt(String missatge);
		public static float llegirFloat(String missatge);
		public static double llegirDouble(String missatge);
		
		Mètodes a implantar capturant l’excepció de la classe Exception:
		public static char llegirChar(String missatge);
		public static String llegirString(String missatge);
		public static boolean llegirSiNo(String missatge), 
		si l’usuari/ària introdueix “s”, retorna “true”, si 
		l’usuari introdueix “n”, retorna “false”.
	 */
	public static Scanner input() {

		return new Scanner(System.in);
	}
	
	public static byte llegirByte(String msj) throws InputMismatchException {
		byte num;
		System.out.println(msj);
		System.out.println(((Object) input().nextByte()).getClass().getSimpleName());
		
		if(!((Object) input().nextByte()).getClass().getSimpleName().equalsIgnoreCase("Byte")) {
			throw new InputMismatchException();
		}else {
			num = input().nextByte();
		}
		
		
		return num;
	}
	
	public static int llegirInt(String msj) {
		return 0;
	}
	
	public static float llegirFloat(String msj) {
		return 2f;
	}
	
	public static double llegirDouble(String msj) {
		return 2.0;
	}
	
	public static char llegirChar(String msj) {
		return 'd';
	}
	
	public static String llegirString(String msj) {
		
		
		return msj;
	}
	
	public static boolean llegirSiNo(String msj) {
		/*si l’usuari/ària introdueix “s”, retorna “true”, si 
		l’usuari introdueix “n”, retorna “false”.*/
		
		return false;
	}

}
