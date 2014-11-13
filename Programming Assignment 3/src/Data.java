import java.util.ArrayList;


public class Data {

	String stringData;
	int pageNumber;
	ArrayList<Integer> intList;

	public Data(String someString, int someInt)
	{
		stringData = someString;
		pageNumber = someInt;
		intList = new ArrayList<Integer>();
	}
}