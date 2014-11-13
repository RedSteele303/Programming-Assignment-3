import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class textReader {
	
	static linkedList[] hashCodes = new linkedList[2147483647];
	
	public static void readFile(File text){
		Scanner scanner = null;
		try {
			scanner = new Scanner(text);
		} catch (FileNotFoundException e) {
			System.out.println("This is not a valid File. Operation aborted");
			e.printStackTrace();
		}
		//Tests for invalid inputs
		
		//Adds file inputs to arrays
		while(scanner.hasNext()){
			String tempWord = scanner.next();
			int temp = Math.abs(tempWord.hashCode());
			if(hashCodes[temp] != null){
				
			}
		}
	}
	
}
