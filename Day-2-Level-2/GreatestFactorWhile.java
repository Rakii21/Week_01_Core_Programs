import java.util.Scanner;
public class GreatestFactorWhile{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0){
		int counter=number-1;
		while(counter>0){
			if(number%counter==0){
				System.out.println(counter);
				break;
			}
			
			counter--;
			}
		}
		else return;
		sc.close();
		}
	}