import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int maths = sc.nextInt();
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int percentage=(maths+physics+chemistry)/3;
		if(percentage<=100 && percentage>=80)
			System.out.println(("Average Mark: "+percentage+" Grade: A, Remarks:(Level 4, above agency-normalized standards) "));
		else if(percentage>=70)
			System.out.println(("Average Mark: "+percentage+" Grade: B, Remarks:(Level 3, at agency-normalized standards) "));
		else if(percentage>=60)
			System.out.println(("Average Mark: "+percentage+" Grade: C, Remarks:(Level 2, below, but approaching agency-normalized standards) "));
		else if(percentage>=50)
			System.out.println(("Average Mark: "+percentage+" Grade: D, Remarks:(Level 1, well below agency-normalized standards) "));
		else if(percentage>=40)
			System.out.println(("Average Mark: "+percentage+" Grade: E, Remarks:(Level 1-, too below agency-normalized standards) "));
		else System.out.println(("Average Mark: "+percentage+" Grade: R, Remarks:(Remedial standards) "));
		}
	}