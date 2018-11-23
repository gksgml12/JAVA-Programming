import java.util.Scanner;

public class HW2_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		int num, tmp;
		System.out.print("1억 미만의 정수: ");
		num = s.nextInt();
		
		tmp = num/10000;
		num %= 10000;		
		if(tmp==1) 		System.out.print("만 ");
		else if(tmp!=0) System.out.print(tmp+"만 ");
		
		tmp = num/1000;
		num %= 1000;		
		if(tmp==1) 		System.out.print("천 ");
		else if(tmp!=0) System.out.print(tmp+"천 ");
		
		tmp = num/100;
		num %= 100;
		if(tmp==1) 		System.out.print("백 ");
		else if(tmp!=0) System.out.print(tmp+"백 ");
			
		tmp = num/10;
		num %= 10;
		if(tmp==1) 		System.out.print("십 ");
		else if(tmp!=0) System.out.print(tmp+"십 ");
		
		if(num!=0) System.out.println(num+"입니다.");
		else System.out.println("입니다.");//추가
	}
}