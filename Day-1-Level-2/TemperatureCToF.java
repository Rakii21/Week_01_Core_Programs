import java.util.Scanner;
public class TemperatureCToF{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double celcius = sc.nextDouble();
		double fahrenheit =  (celcius *9/5) + 32;
		System.out.println("The "+celcius+" celsius is "+fahrenheit+" fahrenheit");
		}
	}