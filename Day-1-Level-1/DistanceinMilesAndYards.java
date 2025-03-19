import java.util.Scanner;
public class DistanceinMilesAndYards{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double feets=sc.nextInt();
		double yards=feets/3;
		double miles=yards/1760;
		System.out.println("The distance in yards is "+String.format("%.2f",yards)+" and in miles is "+String.format("%.2f",miles));
		}
	}