import java.util.ArrayList;


public class Data {

	String stringData;
	
	ArrayList<Integer> intList;

	public Data(String someString, int pageNumber)
	{
		stringData = someString;
		intList = new ArrayList<Integer>();
		intList.add(pageNumber);
	}
	
	public String getStringData() {
		return stringData;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

	public ArrayList<Integer> getIntList() {
		return intList;
	}

	public void setIntList(ArrayList<Integer> intList) {
		this.intList = intList;
	}
	
	public void addPageToList(int page){
		intList.add(page);
	}

}