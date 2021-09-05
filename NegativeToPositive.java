package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		int num = -40;
		if (num < 0) 
		{
			int n = -1 * num;
			System.out.println("The number " + num + " is converted to " + n);
		} 
		else
			System.out.println("The number " + num + " is postive");

	}

}
