import java.util.Scanner;

public class HW3_4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		int score = s.nextInt();
		
		if(score>=90)		System.out.println("��");
		else if(score>=80)	System.out.println("��");
		else if(score>=70)	System.out.println("��");
		else if(score>=60)	System.out.println("��");
		else 				System.out.println("��");
		
	}
}
