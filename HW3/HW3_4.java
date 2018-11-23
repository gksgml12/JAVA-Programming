import java.util.Scanner;

public class HW3_4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("점수: ");
		int score = s.nextInt();
		
		if(score>=90)		System.out.println("수");
		else if(score>=80)	System.out.println("우");
		else if(score>=70)	System.out.println("미");
		else if(score>=60)	System.out.println("양");
		else 				System.out.println("가");
		
	}
}
