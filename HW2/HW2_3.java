import java.util.Scanner;

public class HW2_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double p1x, p1y, p2x, p2y;	//���� �� �� p1, p2�� x,y ��ǥ
		double width, height; //���簢�� ����, ����
		
		System.out.print("ù��° ���� x ��ǥ: ");
		p1x = s.nextDouble();
		System.out.print("ù��° ���� y ��ǥ: ");
		p1y = s.nextDouble();		
		System.out.print("�ι�° ���� x ��ǥ: ");
		p2x = s.nextDouble();
		System.out.print("�ι�° ���� y ��ǥ: ");
		p2y = s.nextDouble();
		
		width = p1x-p2x;
		height = p1y-p2y;
		
		if(width<0) width *= -1;	//���ΰ� ������ ��� ����� ��ȯ
		if(height<0) height *= -1;	//���ΰ� ������ ��� ����� ��ȯ
		
		if(width==0 || height==0) System.out.println("�Է��� ������ ���簢���� �̷��� �ʽ��ϴ�. "); 	//���γ� ���ΰ� 0�� ��� ���簢���� �̷��� ����
		else{
			System.out.printf("���簢���� �ѷ� ����: %.1f\n", 2*(width+height));
			System.out.printf("���簢���� ����: %.1f\n", width*height);
		}
		
		s.close(); //��ĳ�� ����� ��ġ�� �ݾ���. 
		//�����ð��� �����帮�ڽ��ϴ�~~
	}
}