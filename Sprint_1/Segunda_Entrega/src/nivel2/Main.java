package nivel2;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		/*És important que si en algun mètode salta una 
		 * excepció, la tractem i tornem a demanar la dada a 
		 * l’usuari/ària fins que aquesta estigui ben introduïda. 
		 * Per exemple: Si introdueix un float amb un punt en lloc 
		 * d'amb una coma, ha de mostrar “Error de format”. Fins 
		 * que l’usuari/ària no introdueix un float ben format ha 
		 * de seguir demanant la dada.
		 */
		
		Entrada ex = new Entrada();
		boolean esByte = false;
		byte num = 0;
		
		
		do {
			try {
				
				num = ex.llegirByte("Introduce un numero entre -128 y 127: ");
				esByte=true;
			}catch (InputMismatchException e) {
				System.out.println("Debe ser un numero entre -128 y 127: ");
				esByte = false;
			}
		}while(esByte == false);
		
		System.out.println(num);
		
		
		

	}
	
	

}
