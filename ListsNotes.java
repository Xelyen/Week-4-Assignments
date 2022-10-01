import java.util.ArrayList;
import java.util.List;

public class ListsNotes {

	public static void main(String[] args) {
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		//List<E> list of E where E is the generic that will be replaced with the type you use.
		//List<String> reads as "List of String"
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		
		//For lists we use .size not .length
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		

	}

}
