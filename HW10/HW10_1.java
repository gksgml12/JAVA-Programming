class Figure{
	protected double perimeter;	//�ѷ�����
	protected double area;	//����
	Figure(){} //���⿡�� ����Ʈ �����ڴ� �ƹ� �ϵ� ���� ����
	Figure(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
	}
	public String toString(){	//(Object Ŭ������)toString�޼��� ������
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n", this.getClass().getName(), perimeter, area); //this.getClass().getName()�� ���� �ð��� ��� ���� ���ε��� �˾ƾ� ���� �� �� �ִ� �κ��̶� �׳� �Ѿ�ñ� �ٶ��ϴ�. 
	}
}

class Circle extends Figure{
	protected double radius;
	Circle(){ //����Ʈ �����ڴ� ����ֵ� ������ ���⿡�� �������� 1�� �� �����ϰ� �ۼ�
		super(Math.PI*2, Math.PI);
		radius = 1;
	}
	Circle(double r){	//�������� ���ڷ� �޾� ������, ����, �ѷ����� �ʵ� �ʱ�ȭ
		super(Math.PI*2*r, Math.PI*r*r);
		radius = r;
	}
	public String toString(){	//toString�޼��� ������
		return super.toString()+"�� ���� �������� "+radius+"�Դϴ�.\n";		
	} 
}

class EquilateralTriangle extends Figure{//���� ����.
	protected double side;
	protected double height;
	EquilateralTriangle(){ //���� ���������� ����Ʈ �����ڴ� �Ѻ��� ���̰� 1�� ���ﰢ�� ����
		super(3, Math.sqrt(3)/4);
		side = 1;
		height = Math.sqrt(3)/2;
	}
	EquilateralTriangle(double s){ 
		super(3*s, Math.sqrt(3)/4*s*s);
		side = s;
		height = Math.sqrt(3)/2*side;
	}
	public String toString(){
		return String.format("%s�� �ﰢ���� �Ѻ��� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.\n", super.toString(),side, height);		
	} 
}

class HW10_1{
	public static void main(String args []){
		Circle c = new Circle(3);	//������ 3�� �� ��ü ���� & ������ ���� c�� ������ �� ��ü ����
		System.out.println(c);		//c�� ����Ű�� ���� toString()�޼��尡 ��ȯ�� string ���
		EquilateralTriangle r = new EquilateralTriangle(3);	//���� ����.
		System.out.println(r);
	}	
}
