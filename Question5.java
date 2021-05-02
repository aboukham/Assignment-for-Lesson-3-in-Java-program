
import java.util.Scanner;


public class PersonAge {
	final static int ACTUAL_YEAR = 2021;

	public static void main(String[] args) {
		int age = 0;
		int year = 0;
		Scanner input = null;
		
		System.out.println("enter a year you are born"); 
		input = new Scanner(System.in);
		year = input.nextInt();
		age = ACTUAL_YEAR - year;
		System.out.println("You were born in " + year + " and will be (are) " + age + " this year.");

	}

}
