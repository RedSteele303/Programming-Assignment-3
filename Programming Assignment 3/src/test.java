import java.io.File;
import java.util.ArrayList;


public class test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		File f = new File (args[0]);
		
		textReader t = new textReader();
		t.readFile(f);
		
		String tempWord = "the";
		int key = 0;
		for (int j = 0; j < tempWord.length(); j++){
			key += tempWord.charAt(j);
//			System.out.println(key);
		}
		
		System.out.println(t.hashCodes[key].getHead().getValue().stringData);
	}
	
}
