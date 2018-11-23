import java.util.Scanner;

public class HW9_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int [][] seats = new int [10][10];
		Theater.initSeats(seats);
		Theater.showSeats(seats);
		char rsv;
		while(true){
			System.out.print("���� �Ͻðڽ��ϱ�?(Y(y)/N(n))");
			rsv = s.next().charAt(0); //next()�޼ҵ带 ���� ���ڿ��� �Է¹ް�, �� ���ڿ��� ù���ڸ� rsv ������ ����. 
			if(rsv!='n'&&rsv!='N'&&rsv!='y'&&rsv!='Y'){
				System.out.println("�ùٸ� ���� �Է��ϼ���.");
				continue;
			}
			if(rsv=='n'||rsv=='N'){
				System.out.println("���� �ý����� �����մϴ�.");
				break;
			}
			Theater.reserve(seats);
		}
	}
}

class Theater{ //���� Ŭ���� �ۼ�
	public static void initSeats(int [][] seats){//��� �¼��� ���Ƿ� ����Ϸ�(1), �̿���(0)���� �����ϴ� �޼ҵ�
		for(int i=0; i<seats.length;i++){
			for(int j=0; j<seats[i].length; j++){
				seats[i][j] = (int)(Math.random()*2);
			}
		}
	}
	public static void showSeats(int [][] seats){//���� ������¸� �����ִ� �޼ҵ�
		System.out.println("���� �¼� ���� ����");
		System.out.print("   ");		
		for(int i=0; i<seats[0].length;){
			System.out.printf("  %2d  ", ++i);
		}
		System.out.println();
		for(int i=0; i<seats.length;i++){
			System.out.printf(" %c ", (char)('a'+i));	
			for(int j=0; j<seats[i].length; j++){
				if(seats[i][j]==1) System.out.printf("  %2c  ", 'X');
				else System.out.printf("  %2c  ", ' ');
			}
			System.out.println();
		}
	}
	public static void reserve(int [][] seats){//�����ϴ� �޼ҵ�
		Scanner s = new Scanner(System.in);
		int row, col;
		while(true){
			System.out.print("�¼��� ��: ");	
			row = (int)(s.next().charAt(0)-'a');
			System.out.print("�¼��� ��: ");	
			col = s.nextInt()-1;
			if(seats[row][col]==1){
				System.out.println("�̹� ����� �¼��Դϴ�. �¼��� �ٽ� �����ϼ���.");
				continue;
			}
			else{
				seats[row][col]=1;
				System.out.printf("%c�� %d�� ���� ����!\n", (char)('a'+row), col+1);
				showSeats(seats);
				break;
			}
		}
	}
}