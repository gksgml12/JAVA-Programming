class Test8{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member("ȫ�浿", 20);		
		System.out.println("�� ��ȣȸ�� ��� ���� "+Member.getNumOfMember()+"�� �Դϴ�.");
	}
}

class Member{
	private String name; 
	private int age;
	private static int numOfMember;
	
	public static int getNumOfMember(){
		return numOfMember;
	}
	
	Member(){
		numOfMember++;
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		numOfMember++;
	}
}