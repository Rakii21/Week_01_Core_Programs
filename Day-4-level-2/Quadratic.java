import java.util.Scanner;

public class Quadratic {
    public double[] findRoots(double a,double b,double c){
        double delta= Math.pow(b, 2)-4*a*c;
        if(delta>0){
            double root1= (-b+Math.sqrt(delta))/(2*a);
            double root2= (-b-Math.sqrt(delta))/(2*a);
            return new double[]{root1,root2};
        }
        else if(delta==0){
            double root= -b/(2*a);
            return new double[]{root};
        }
        else return new double[0];
    }
    public static void main(String[] args) {
        Quadratic obj=new Quadratic();
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double[] root=obj.findRoots(a, b, c);
        if(root.length==2) System.out.println("Root1: "+root[0]+" Root2: "+root[1]);
        else if(root.length==1) System.out.println("Root: "+root[0]);
        else System.out.println("No roots");
    }
    
}
