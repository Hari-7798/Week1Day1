package week1.day1;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 167;
		int original = input;
		int calculated = 0;
		int remainder;
		
		while( input > 0) {
			remainder = input % 10;
			input = input/10;
			calculated = calculated + (remainder*remainder*remainder);
		}
		
		if(original == calculated) {
			System.out.println("This is a AmstrongNumber");
		}
		else {
			System.out.println("This is not a AmstrongNumber");
		}

	}

}
