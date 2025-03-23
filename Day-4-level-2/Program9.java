import java.util.Scanner;
public class Program9{
    public boolean isPositive(int number){
        return number>=0;
    }
    public boolean isEven(int number){
        return number%2==0;
    }
    public int compare(int n1,int n2){
        if(n1>n2) return 1;
        else if(n1==n2) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Program9 obj=new Program9();
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(obj.isPositive(arr[i])){
                if(obj.isEven(arr[i])) System.out.println(arr[i]+" is Positive and even");
                else System.out.println(arr[i]+" is Positive and odd");
            }else System.out.println(arr[i]+" is Negative");
        }
        int result=obj.compare(arr[0], arr[4]);
        if(result==1) System.out.println("First is greater than the last");
        else if(result==0) System.out.println("Both are equal");
        else System.out.println("First is less than the last");
        sc.close();
        
    }
}