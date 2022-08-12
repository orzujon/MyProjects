//This bot checks if the order of the array is broken or not 
// If its broken it returns "Broken" if not "Ok"
public class BrokenArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {0, 1, 2, 3, 4, 5, 60, 7, 8, 9, 120}; // order is broken
		
		boolean broken = false;
		
		//Iterating over the array
		
		for (int i = 1; i < number.length; i++) {
			System.out.println(i + " i" );
			System.out.println(number[i] + " number[i]");
			System.out.println(number[i-1] + " number[i-1]");
			if(number[i] < number[i - 1]) { //if the order is broken
				broken = true; 	//write a result
				break;			// terminate the loop
			}
		}
		if(broken) {
			System.out.println("Broken");
		} else {
			System.out.println("Ok");
		}
	}
}
