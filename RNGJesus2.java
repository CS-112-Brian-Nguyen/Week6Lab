import java.util.Scanner;
public class RNGJesus2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int num,num1;
		
		num1 = 0 +(int)(Math.random() * 10);
		
		System.out.println("Please enter a number: ");
		num = input.nextInt();
		
		if (num == num1)
		{
			System.out.println("Congradulations you won!");
		}
		else if (num > num1)
		{
			System.out.println("Your number is greater than the random number :(");
		}
		else 
		{
			System.out.println("Your number is lower than the random number :(");
		}

	}

}
