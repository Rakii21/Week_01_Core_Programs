import java.util.Scanner;
public class Weight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int weight=sc.nextInt();
		double weightInKilo=weight*2.2;
		System.out.println("The weight of the person in pound is "+weight+" and in kg is "+weightInKilo);
		}
	}