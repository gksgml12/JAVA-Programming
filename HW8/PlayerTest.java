class PlayerTest{//HW8_2Ŭ����
	public static void main(String [] args){
		Player hong = new Player("ȫ�浿"); //ù��° �÷��̾� ȫ�浿 ����
		Player jang = new Player("�����"); //�ι�° �÷��̾� ����� ����
		int i, ptHong, ptJang;
		
		for(i=0; i<5; i++){//������ 5�� �� ���̱� ������ 5�� �ݺ�
			System.out.print(i+1+"��° ���: ");
			System.out.println(hong.play()+", "+jang.play());
		}
		
		ptHong = hong.getTotalPoint();
		ptJang = jang.getTotalPoint();
		
		System.out.println("���� ���");
		if(ptHong > ptJang){
			System.out.printf("����: ȫ�浿(%d)\n", ptHong);
			System.out.printf("����: �����(%d)\n", ptJang);
		}
		else if(ptHong < ptJang){
			System.out.printf("����: �����(%d)\n", ptJang);
			System.out.printf("����: ȫ�浿(%d)\n", ptHong);
		}
		else{
			System.out.println("���º��Դϴ�: "+ptHong);
		}
	}
}

class Player{
	private String name;
	private int totalPoint;
	
	Player(){ } //����Ʈ ������
				//�Ϲ������δ� �������� ���������ڴ� public�� ������ �� ���� ���� ���� �����ڰ� ���� ���� �ֽ��ϴ�~~: �̰��� ��Ű�� ���ؿ��� ������ �����ϰ���~
	Player(String name){
		this.name = name;
	}
	
	int getTotalPoint(){
		return totalPoint;
	}
	
	String play(){
		int point = (int)(Math.random()*7); //�ֻ��� ���� ��� ����
		totalPoint += point;	//�̹� ����� ���� ������ ����
		return String.format("%s(%d)",this.name, point);//�̹� ��� ��ȯ
	}
}