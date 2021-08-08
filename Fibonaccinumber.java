package week1.day1;

public class Fibonaccinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8,firstnum=0,lastnum=1,sum=0;
		System.out.print(firstnum+" ");
		System.out.print(lastnum);
		for (int i = 1; i <= n-2; i++) {
			sum=firstnum+lastnum;
			firstnum=lastnum;
			lastnum=sum;
			System.out.print(" "+sum);
		}
		
		

	}

}
