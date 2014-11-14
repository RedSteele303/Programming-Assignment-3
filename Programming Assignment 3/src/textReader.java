import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class textReader {

	public static linkedList[] hashCodes;

	@SuppressWarnings("static-access")
	public static void readFile(File text){
		Scanner scanner = null;
		try {
			scanner = new Scanner(text);
		} catch (FileNotFoundException e) {
			System.out.println("This is not a valid File. Operation aborted");
			e.printStackTrace();
		}
		int biggestKey = 0;
		while(scanner.hasNext()){
			int keyValue = 0;
			String someString = scanner.next();
			for (int j = 0; j < someString.length(); j++){
				keyValue += someString.charAt(j);
				if (keyValue > biggestKey){
					biggestKey = keyValue;
				}
				hashCodes = new linkedList[biggestKey];
			}
			
			
			
		}
		//Tests for invalid inputs

		//Adds file inputs to arrays
		while(scanner.hasNext()){
			String tempWord = scanner.next();
			int key = 0;
			for (int j = 0; j < tempWord.length(); j++){
				key += tempWord.charAt(j);
				System.out.println(key);
			}
//			int temp = Math.abs(tempWord.hashCode());
			notInHash: if(hashCodes[key] != null){
				for(int i = 0; i<hashCodes[key].length(); i++){
					if(tempWord.compareTo(( hashCodes[key].getNth(i)).stringData) == 0){
						hashCodes[key].getNth(i).addPageToList(scanner.nextInt());
//						break notInHash;
					}
				}
				hashCodes[key].push(new Data(tempWord, scanner.nextInt()));

			}
			else{
				hashCodes[key] = new linkedList();
				hashCodes[key].setHead(new Data(Integer.toString(key), 0));
				hashCodes[key].push(new Data(tempWord, scanner.nextInt()));
			}
		}
	}

}
