import java.util.Scanner;
public class Program8{
    public static int[] findSmallestAndLargest(int number1, int number2,int number3){
        int min=0;
        int max=0;
        if(number1>number2 && number1>number3) max=number1;
        else if(number2>number3) max=number2;
        else max=number3;
        if(number1<number2 && number1<number3) min=number1;
        else if(number2<number3) min=number2;
        else min=number3;
        return new int[]{min,max};
        
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 =sc.nextInt();
        int number3 =sc.nextInt();
        int[] result=findSmallestAndLargest(number1,number2,number3);
        System.out.println("Smallest: "+result[0]+ " Largest: "+result[1]);

    } 
}
