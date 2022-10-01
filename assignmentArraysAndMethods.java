
public class assignmentArraysAndMethods {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 2};
		System.out.println(ages[0] - ages[ages.length - 1]);
		
		double sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		
		double avg = (sum / ages.length);
		System.out.println(avg);
		System.out.println("----------------------");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double sumOfName = 0;
		
		for (int i = 0; i < names.length; i++) {
			double wordLength = names[i].length();
			sumOfName += wordLength;
		}
		
		double nameAvg = sumOfName / names.length;
		System.out.println(nameAvg);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
			
		}
		System.out.println("");
		System.out.println("----------------------");
		
		/* How do you access the last element of any array?
		 * nameOfArray.length - 1
		 * 
		 * How do you access the first element of any array?
		 * nameOfArray[0]
		 */
		
		int[] nameLengths = new int[6];
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i]);
		}
		
		
		int sumOfNameLengths = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfNameLengths += nameLengths[i];
		}
		System.out.println(sumOfNameLengths);
		System.out.println("----------------------");
		
		//concatWord Method
		System.out.println(concatWord("Hello", 3));
		
		//fullName Method
		System.out.println(fullName("Kevin", "Hoang"));
		
		//isGreaterThan100 Method
		int[] sumOfAllInts = {25, 25, 25, 25, 25};
		System.out.println(isGreaterThan100(sumOfAllInts));
		
		//avgOfAllElements Method
		double[] avgElements = {23, 4, 15, 2, 29, 8, 22};
		System.out.println(avgOfAllElements(avgElements));
		
		//Making another Method to compare
		
		//avgOfAllElements2 Method
		double[] avgElements2 = {10, 42, 20, 1, 6, 33, 9};
		System.out.println(avgOfAllElements2(avgElements2));
		
		//compareElements Method
		System.out.println(compareElements(avgElements, avgElements2));
		
		//willBuyDrink Method
		boolean isHotOutside = true;
		double moneyInPocket = 13.50;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		System.out.println("----------------------");
		
		//oddNumbers Method
		int[] orderedNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println("Odd Numbers: ");
		System.out.println(oddNumbers(orderedNums));
		//This method prints out odd numbers and created it because I thought it would be simple
		//and good practice with methods.
		
	}
	
	public static String concatWord(String word, int n) {
		String str = "";
		for (int i = 0; i < n; i++) {
			str += word;
		}
		return str;
	}
	
	public static String fullName(String firstName, String lastName) {
		String combineName = "";
		combineName = firstName + " " + lastName;
		return combineName;
	}
	
	public static boolean isGreaterThan100(int[] sumOfAllInts) {
		int sum = 0;
		for (int i = 0; i < sumOfAllInts.length; i++) {
			sum += sumOfAllInts[i];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double avgOfAllElements(double[] avgElements) {
		double sum = 0;
		for (int i = 0; i < avgElements.length; i++) {
			sum += avgElements[i];
		}
		return sum / avgElements.length;
	}
	
	public static double avgOfAllElements2(double[] avgElements2) {
		double sum = 0;
		for (int i = 0; i < avgElements2.length; i++) {
			sum += avgElements2[i];
		}
		return sum / avgElements2.length;
	}
	
	public static boolean compareElements(double[] avgElements, double[] avgElements2) {
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < avgElements.length; i++) {
			sum += avgElements[i];
		}
		avg = sum / avgElements.length;
		
		double sum2 = 0;
		double avg2 = 0;
		for (int i = 0; i < avgElements2.length; i++) {
			sum2 += avgElements2[i];
		}
		avg2 = sum2 / avgElements2.length;
		
		if (avg > avg2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int oddNumbers(int[] orderedNums) {
		int nums = 0;
		for (int i = 0; i < orderedNums.length; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		return nums;
	}
		

}
