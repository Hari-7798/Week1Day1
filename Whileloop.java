package week1.day1;

public class Whileloop {
	public static void main(String[] args) {
		int i = 123;
		int sum=0;
		int rem=0;
		while(i>0)
		{
			rem = i % 10;
			System.out.print(rem);
			sum = sum + rem;
			//System.out.println(sum);
			i=i/10;
			//System.out.println(i);
		}
		
		System.out.print("="+sum);
	}

}
