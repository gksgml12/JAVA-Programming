import java.util.Scanner;
class HW4_2{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		String type;
		
			System.out.print("������ Ÿ���� �Է��ϼ���(�Ƕ�̵�, �簢��, ���̾Ƹ��): ");
			type = s.nextLine();
			int line, i, j, k;
			switch(type){
			case "�Ƕ�̵�"://--------------------------------------------------------
				System.out.print("����� �� ��(10���� ���� ����): ");	
				line = s.nextInt();
				for(i=0;i<line;i++){
					for(j=line-1-i;j>0;j--){
						System.out.print(" ");
					}
					for(j=i;j>=0;j--){
						System.out.print(j);
					}
					for(j=1;j<=i;j++){
						System.out.print(j);
					}
					System.out.println();
				}
			break;
			
			case "�簢��"://--------------------------------------------------------
			int garo, sero, banbok;
				
			System.out.print("���� : ");
			garo = s.nextInt();
			System.out.print("���� : ");
			sero = s.nextInt();
			System.out.print("�ݺ�Ƚ�� : ");
			banbok = s.nextInt();
				
			for(i=0;i<sero;i++){
				for(j=0;j<banbok;j++){
					for(k=0; k<garo; k++){
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
			break 
			
			case "���̾Ƹ��"://--------------------------------------------------------
				
				System.out.print("����� �� ��(Ȧ��): ");	
				line = s.nextInt();
				
				
			for(i=0;i<=line/2;i++){
				for(j=line/2-i; j>0;j--){//j=0;j<line/2-i;j++
					System.out.print(" ");
				}
				for(j=0; j<2*i+1;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			for(i=0;i<line/2;i++){
				for(j=0; j<=i;j++){
					System.out.print(" ");
				}
				for(j=0; j<2*(line/2-i)-1;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			break;	
			
			default:	
				System.out.println("���� Ÿ���� ����� �Է��ϼ���.\n");
				break;		
			}	
		}
	}
