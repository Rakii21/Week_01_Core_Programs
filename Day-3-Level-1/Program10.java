import java.util.Scanner;
public class Program10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            String[] fizzbuzz=new String[number+1];
            for(int i=0;i<=number;i++){
                if(i%3==0 && i%5==0) fizzbuzz[i]="FizzBuzz";
                else if(i%3==0) fizzbuzz[i]="Fizz";
                else if(i%5==0) fizzbuzz[i]="Buzz";
                else fizzbuzz[i]=String.valueOf(i);
            }
        

            for(int j=0;j<=number;j++){
                System.out.println(fizzbuzz[j]);
            }
        }
        else System.out.println("Enter positive number");
    }
}
