class HW8_1{
	public static void main(String [] args){
		Student st = new Student("ȫ�浿", 20, 4.6);
		System.out.println(st);
	}
}

class Student{
	private String name;
	private int age;
	private double grade;
	
	public Student(){//����Ʈ �����ڴ� �̿� ���� �ƹ� �ϵ� ���� �ʾƵ� ����. 	
	}
	
	public Student(String name, int age, double grade){
		this.name = name;
		
		if(age<0||age>200) this.age = 20;
		else this.age = age;
		
		if(grade<0||grade>4.3) this.grade = 3.0;
		else this.grade = grade;
	}
	
	public String toString(){ //�л� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
		return String.format("\n-�л� ����-\n\n�̸�: %s\n����: %d\n����: %.2f\n", name, age, grade); //���ڿ��� ������ �����ϰ� ���� ��� StringŬ������ format()�޼ҵ带 ���
		//format()�޼ҵ�� printf()�� ������ ����
	}
}