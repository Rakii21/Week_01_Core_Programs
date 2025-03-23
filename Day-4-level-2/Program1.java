import java.util.Scanner;
public class Program1{
    public static int[] findFactors(int number){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0) count++;
        }
        int[] arr=new int[count];
        int index=0;
        for(int j=1;j<=number;j++){
            if(number%j==0) arr[index++]=j;  
        }
        return arr;
        
    }
    public static int sumOfFactors(int[] arr){
        int sum=0;
        for(int factor:arr){
            sum+=factor;
        }
        return sum;
    }
    public static int productOfFactors(int[] arr){
        int product=1;
        for(int factor:arr){
            product*=factor;
        }
        return product;
    }
    public static int sumOfSquare(int[] arr){
        int sum=0;
        for(int factor:arr){
            sum+=Math.pow(factor,2);
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int[] arr= findFactors(number);
        System.out.println("Sum of factors: "+sumOfFactors(arr));
        System.out.println("Product of factors: "+productOfFactors(arr));
        System.out.println("Sum of square of factors: "+sumOfSquare(arr));
    } 
}