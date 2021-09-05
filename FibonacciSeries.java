package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int range=8;
		int sum=0;
		System.out.print(firstNum);
		System.out.print(" " +secNum);
	
		for(int i=1;i<=range-2;i++)
		{
			sum=firstNum+secNum;
			System.out.print(" " +sum);
			firstNum =secNum;
			secNum=sum;
			
		}

	}

}
