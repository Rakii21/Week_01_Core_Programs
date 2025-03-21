import java.util.Scanner;
public class GreatestFactor{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		int greatestFactor=1;
		if(number>0){
		for(int i=number-1;i>0;i--){
			if(number%i==0){ System.out.println(i);
			break;
			}
		}
		}
		sc.close();
		}
	}