import java.util.Scanner;


public class HW6_2{
	public static void main(String[] args){
		String keyword = "pre"; //�̸� ����� ���ڿ�
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���:");
		String message = s.nextLine();
		
		if(message.equals(keyword)) System.out.print("���ڿ� ��ġ"); //equals�� boolean������  ��ȯ		
		else System.out.print("���ڿ� ����ġ"); 
		
		s.close();
	}
}
