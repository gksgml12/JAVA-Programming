import java.util.Scanner;


public class HW6_1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���:");
		String message = s.nextLine();	//��) ����ڰ� abc�� �Է��� ��� 
		String rev = ""; //rev�� ���� ���ڿ��� ������ ����. 
		
		for(int i=0; i<message.length(); i++){
			rev = message.charAt(i)+rev; 
		}
		System.out.print("������ ���ڿ�:"+rev);
		s.close();
	}
}
/*
			rev�� �ݺ����� �������� ���ʷ� 
			a
			ba
			cba
			�� �Ǿ� ��������� abc�� ���� ���ڿ��� ��
			*/