import java.util.Scanner;


public class Test3 {
	public static void main(String[] args){		
		double input;
		int intInput, absInt;
		int quo, res;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요. ");
		input = s.nextDouble();
		
		intInput = (int)input;
				
		if((intInput & 0x80000000) != 0) absInt = ~intInput + 1; 
		else absInt = intInput;
		
		quo = absInt >> 5;
		res = absInt & 0x1f;

		System.out.printf("\"%d의 절댓값은 %d이고,\n", intInput, absInt);
		System.out.printf("\t그 수를 32로 나눈 몫은 %d이고,\n", quo);
		System.out.printf("\t\t나머지는 %d 입니다.\"", res);	
		
		s.close();
	}	
}