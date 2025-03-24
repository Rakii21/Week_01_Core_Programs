import java.util.Scanner;
import java.util.Arrays;
class Program3{
    public static char[] storeString(String text){
        char[] characters=new char[text.length()];
        for(int i=0;i<text.length();i++){
            characters[i]=text.charAt(i);
        }
        return characters;
    }
    public static boolean compareArr(char[] c1,char[] c2){
        if(Arrays.equals(c1,c2)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char[] characters1=storeString(a);
        char[] characters2=a.toCharArray();
        if(compareArr(characters1, characters2)) System.out.println("Both are equal");
        else System.out.println("Both are not equal");
    

    }
}