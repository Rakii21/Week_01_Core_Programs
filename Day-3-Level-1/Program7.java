import java.util.Scanner;
public class Program7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        if(number<0){
            System.out.println("Error");
            System.exit(0);
        }
        int[] evenArr = new int[number/2+1];
        int[] oddArr = new int[number/2+1];
        int oddInd=0;
        int evenInd=0;
        for(int i=1;i<=number;i++){
            if(i%2==0) evenArr[evenInd++]=i;
            else oddArr[oddInd++]=i;
        }
        System.out.println("Odd:");
        for(int j=0;j<oddInd;j++){
            System.out.println(oddArr[j]);
        }
        System.out.println("Even:");
        for(int k=0;k<evenInd;k++){
            System.out.println(evenArr[k]);
        }
    }
}
