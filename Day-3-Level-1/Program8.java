import java.util.Scanner;
public class Program8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int maxFactor =10;
        int[] factors=new int[maxFactor];
        int ind=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(ind==maxFactor){
                    maxFactor*=2;
                    int[] temp=new int[maxFactor];
                    System.arraycopy(factors,0, temp, 0, factors.length);
                    factors=temp;
                    
                }
                factors[ind++]=i;
            }
            
        }
        for(int j=0;j<ind;j++){
            System.out.print(factors[j]+" ");

        }
        sc.close();
    }
}