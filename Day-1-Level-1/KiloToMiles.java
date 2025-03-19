import java.util.Scanner;
public class KiloToMiles{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double km = sc.nextInt();
		double miles = 0.6*km;
		System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
		sc.close();
		}
	}