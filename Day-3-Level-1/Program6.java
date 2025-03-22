import java.util.Scanner;
public class Program6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum =0.0;
        for(int i=0;i<11;i++){
            heights[i]=sc.nextDouble();
        }
        for(int j=0;j<11;j++){
            sum+=heights[j];
        }
        double mean=sum/11;
        System.out.println("The Mean Height of football team is "+String.format("%.2f",mean));

    }
}
