import java.util.Scanner;


public class HW6_1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String message = s.nextLine();	//예) 사용자가 abc를 입력한 경우 
		String rev = ""; //rev에 역순 문자열을 저장할 것임. 
		
		for(int i=0; i<message.length(); i++){
			rev = message.charAt(i)+rev; 
		}
		System.out.print("반전된 문자열:"+rev);
		s.close();
	}
}
/*
			rev는 반복문을 돌때마다 차례로 
			a
			ba
			cba
			가 되어 결과적으로 abc의 역순 문자열이 됨
			*/