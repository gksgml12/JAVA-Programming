import java.util.Scanner;

class Test4{
	public static void main(String [] args){
		int month;
		Scanner s = new Scanner(System.in);
		System.out.print("몇 월: ");
		month = s.nextInt();
		
		switch(month){
		case 1: case 2: case 3: 
			System.out.println("1분기입니다. ");
			break;
		case 4: case 5: case 6: 
			System.out.println("2분기입니다. ");
			break;
		case 7: case 8: case 9: 
			System.out.println("3분기입니다. ");
			break;
		case 10: case 11: case 12: 
			System.out.println("4분기입니다. ");
			break;
		default:
			System.out.println("[입력 오류]그런 달은 없습니다. ");
		}
	}
}