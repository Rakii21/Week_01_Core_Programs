import java.util.Scanner;
public class Program2{
    public static int findSum(int number){
        if(number==1) return 1;
        else
            return number+findSum(number-1);
        
    }
    public static int formulaSum(int number){
        int sum=number*(number+1)/2;
        return sum;
    }
    

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        if(number<=0) return;
        int sum=findSum(number);
        int formulaSum=formulaSum(number);
        if(sum==formulaSum) System.out.println("Both are same "+sum+" and "+formulaSum);
    } 
}
