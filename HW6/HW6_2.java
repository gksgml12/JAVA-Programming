import java.util.Scanner;


public class HW6_2{
	public static void main(String[] args){
		String keyword = "pre"; //미리 저장된 문자열
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String message = s.nextLine();
		
		if(message.equals(keyword)) System.out.print("문자열 일치"); //equals는 boolean형으로  반환		
		else System.out.print("문자열 불일치"); 
		
		s.close();
	}
}
