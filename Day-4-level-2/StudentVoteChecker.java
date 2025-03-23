import java.util.Scanner;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){
        if(age<0) return false;
        else if(age>=18) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentVoteChecker obj=new StudentVoteChecker();
        int[] students=new int[10];
        for(int i=0;i<10;i++){
            students[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++){
            boolean canVote= obj.canStudentVote(students[j]);
            if(students[j]<0) System.out.println("Student "+(j+1)+" age is invalid");
            else System.out.println("Student "+(j+1)+" of age "+students[j]+" can vote? "+canVote);
        }
    }
}
