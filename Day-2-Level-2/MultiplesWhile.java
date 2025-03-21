import java.util.Scanner;
public class MultiplesWhile{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0 && number<100){
			int counter=number-1;
			while(counter>1){
				counter--;
				if(number%counter==0){
					System.out.println(counter);
					continue;
					}
				}
			}
		}
	}