import java.util.Scanner;
public class Triangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int base= sc.nextInt();
		int height= sc.nextInt();
		double areaInCm= 0.5*base*height;
		double areaInInch = areaInCm*0.155;
		System.out.println("The area of triangle in square centimeters is "+areaInCm+" and in square inches is "+areaInInch);
		}
	}