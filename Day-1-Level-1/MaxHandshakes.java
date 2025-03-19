import java.util.Scanner;
public class MaxHandshakes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int maxhandshakes = (numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("The number of possible handshakes "+maxhandshakes);
		}
	}