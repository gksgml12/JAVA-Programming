import java.util.Scanner;


public class HW5_2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("���� �޽����� �Է��ϼ���:");
		String message = s.nextLine();
		char c;
		int cnt1=0, cnt2=0;  
		for(int i=0; i<message.length(); i++){
			c = message.charAt(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') cnt1++;
				else cnt2++;
			}
		}
		System.out.println("���� ��: " + cnt1);
		System.out.println("���� ��: " + cnt2);
		
		s.close();
	}
}
