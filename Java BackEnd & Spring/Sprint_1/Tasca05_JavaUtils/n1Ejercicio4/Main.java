package n1Ejercicio4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String filePath = "Resources";
		Scanner sc = new Scanner(System.in);
		System.out.println("Que fichero quieres leer? (no escribas la extension): ");
		String file =  sc.nextLine() +".txt";
		
		Directory d = new Directory(filePath);
		MyFiles mf = new MyFiles(file, true);
		
		d.checkDirectory(d.getDirectory(), mf, file);

	}

}
