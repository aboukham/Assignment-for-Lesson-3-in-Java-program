
import java.util.Scanner;


public class DistanceConvert {

	public static void main(String[] args) {
		double	distance = 0;
		Scanner input = null;
		
		input = new Scanner(System.in);
		System.out.println("enter a distance on centimeters");
		distance = centimeterToInches(input.nextDouble());
		System.out.println((int)(distance/12) + " feet and " + (int)(distance % 12) + " inches");
	}
	
	public static double centimeterToInches(double distance){
		return distance / 2.54;
	}

}
