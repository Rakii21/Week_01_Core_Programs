import java.util.Scanner;
public class Program8{
    public String findYoung(String[] names,int[] age){
        int minAge=age[0];
        String young=names[0];
        for(int i=1;i<age.length;i++){
            if(age[i]<minAge){
                minAge=age[i];
                young=names[i];
            }
        }
        return young;

    }
    public String findTallest(String[] names,int[] height){
        int maxHeight=height[0];
        String tallest=names[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>maxHeight){
                maxHeight=height[i];
                tallest=names[i];
            }
        }
        return tallest;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Program8 obj=new Program8();
        String[] boys={"Amar","Akbar","Anthony"};
        int[] age=new int[3];
        int[] height=new int[3];
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextInt();
        }
        System.out.println("Youngest: "+obj.findYoung(boys, age));
        System.out.println("Tallest: "+obj.findTallest(boys, height));
        
    }
}