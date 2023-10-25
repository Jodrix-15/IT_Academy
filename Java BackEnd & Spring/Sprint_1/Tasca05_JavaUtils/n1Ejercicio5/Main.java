package n1Ejercicio5;

public class Main {

	public static void main(String[] args) {
	
		
		String file ="miObject1.ser";
		
		ObjectFileManager objectFileManager = new ObjectFileManager(file, true);
	
	
		ObjectTest myObject = new ObjectTest("Pedro", 37);
		objectFileManager.serializeObject(myObject, file);
		
		ObjectTest myObjectReturn = (ObjectTest) objectFileManager.desSerializeObject(file);
			if(myObjectReturn != null) {
				System.out.println("Deserialized object is: "+myObjectReturn.getClass()+ "\nInfo  Object:\n"+ myObjectReturn.toString());
			}
	}

}
