import java.util.Scanner;

class Test6{
	public static void main(String [] args){
		int i, n, fact;
		Scanner s = new Scanner(System.in);
		
		while(true){
			fact = 1;
			System.out.print("���� ����: ");	
			n = s.nextInt();
			if(n==-1) break;
			else if(n<=0) {
				System.out.println("���� ������ �Է��ϼ���.");
				continue;
			}
			else if(n%6==0) continue;
			for(i=1; i<=n; i++)	fact *= i;
			System.out.println(n+"! = "+fact);
		}		
	}
}