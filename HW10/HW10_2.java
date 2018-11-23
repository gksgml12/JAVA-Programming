class HW10_2{
	public static void main(String [] args){
		//��� �� �� ���� �� �� ����� ���� ���
		Person hong = new Person("ȫ�浿", 20);
		System.out.println(hong);
		//������ �� �� ������ �� ����� ���� ���
		Director jang = new Director("�����", 20);
		System.out.println(jang);
		//�����ڰ� ���� 10�� ���� 
		jang.eat("��", 10);
		
		//�ǾƴϽ�Ʈ �� �� ������ �� ����� ���� ���
		Pianist bee = new Pianist("���亥", 20, "��â�ǾƳ�");
		System.out.println(bee);
		//�ǾƴϽ�Ʈ�� ���ڸ� 10���� ���� 
		bee.eat("����", 10);
	}
}

class Person{
	protected int age;
	protected String name;
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void eat(String menu, int num){
		System.out.printf("%s��(��) %s�� %d�� �Խ��ϴ�.\n", name, menu, num);
	}	
	public String toString(){
		return String.format("�� %s�� �̸��� %s, ���̴� %d�Դϴ�.", this.getClass().getName(), name, age);
	}
}

class Player extends Person{
	Player(){}
	Player(String name, int age){
		super(name, age);
	}
	public void play(){
		System.out.println("�����մϴ�.");
	}
}

class Director extends Person{
	Director(){}
	Director(String name, int age){
		super(name, age);
	}
	public void direct(){
		Pianist p = new Pianist("ȫ�浿", 20, "��â�ǾƳ�");
		p.play();		
		Violinist v = new Violinist();
		v.play();
		Cellist c = new Cellist();
		c.play();		
	}
}



class Pianist extends Player{
	String typeOfPiano; //�ǾƳ� ����ȸ��
	//�ǾƴϽ�Ʈ ������	
	Pianist(){}
	Pianist(String n, int a, String brand){
		/*
		name = n;
		age = a;*/
		super(n, a);
		typeOfPiano = brand;
	}
	public String toString(){
		//return super.toString()+String.format(", �ǾƳ� �귣��: %s", typeOfPiano);
		return super.toString()+" �׸��� �ǾƳ� �귣��� "+typeOfPiano+"�Դϴ�.";
	}
	public void play(){//����(�θ�)Ŭ�����κ��� ��ӹ��� �޼ҵ带 �ڽ��� Ŭ������ �����ϰ� ����: �޼ҵ� ������(override)
		System.out.println("�ǾƳ븦 �����մϴ�.");
	}
}
class Violinist extends Player{
	@Override
	public void play(){//�θ�Ŭ������ play()�޼ҵ带 �������Ϸ��� �ǵ������� Ÿ������ �߸��� play�� �ƴ� ply�޼ҵ带 ����� ��. 
		System.out.println("���̿ø��� �����մϴ�.");
	}
}
class Cellist extends Player{
	@Override
	public void play(){
		System.out.print("ÿ�θ� ");
		super.play();
	}
} 