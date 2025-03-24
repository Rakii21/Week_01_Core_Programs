import java.util.Scanner;

public class Review {
    public static int findLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }
    public static String[][] getFrequency(String s){
        int[] freq=new int[256];
        int len=findLength(s);
        for(int i=0;i<len;i++){
            freq[s.charAt(i)]++;
        }
        int count=0;
        for(int j=0;j<256;j++){
            if(freq[j]>1){
                count++;
            }
        }
        String[][] result=new String[count][2];
        int index=0;
        for(int k=0;k<256;k++){
            if(freq[k]>1){
                result[index][0]=Character.toString((char)k);
                result[index][1]=Integer.toString(freq[k]);
                index++;
            }
            
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String[][] result=getFrequency(str);
        String output="";
        for(String[] entry:result){
            output+=entry[0];
            output+=entry[1];
        }
        System.out.println(output);
    }
    
}