import java.util.Scanner;

class Test4{
	public static void main(String [] args){
		int month;
		Scanner s = new Scanner(System.in);
		System.out.print("�� ��: ");
		month = s.nextInt();
		
		switch(month){
		case 1: case 2: case 3: 
			System.out.println("1�б��Դϴ�. ");
			break;
		case 4: case 5: case 6: 
			System.out.println("2�б��Դϴ�. ");
			break;
		case 7: case 8: case 9: 
			System.out.println("3�б��Դϴ�. ");
			break;
		case 10: case 11: case 12: 
			System.out.println("4�б��Դϴ�. ");
			break;
		default:
			System.out.println("[�Է� ����]�׷� ���� �����ϴ�. ");
		}
	}
}