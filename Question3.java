
import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConvert {

	public static void main(String[] args) {
		double fahrenheit;
		DecimalFormat df = null;
		Scanner input = null;
		
		System.out.print("enter a temperature on celsius");
		input = new Scanner(System.in);
		fahrenheit = CelsiusToFahrenheit(input.nextDouble()); 
		df = new DecimalFormat("0.000");
		System.out.print(df.format(fahrenheit) + " fahrenheit");

	}
	
	public static double CelsiusToFahrenheit(double celsius){
		return celsius * 1.8 + 32;
	}

}
