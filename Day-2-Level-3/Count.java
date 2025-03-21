import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
		int count=0;
		int originalNumber = number;
		while(number!=0){
			int digit = number%10;
			count+=1;
			number/=10;
			}
		System.out.println("Number of digits in "+originalNumber+" is "+count);
		}
	}