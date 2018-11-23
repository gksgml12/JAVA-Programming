class StringManipulate{
	
	String concat(String s1, String s2){	//�� ���ڿ� s1, s2�� �Ű������� �޾� s1�� s2�� �����Ű�� �����Ų ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		return s1+s2;
	}
	
	void toUpper(String s){	//���ڿ� s�� �Ű������� �޾� �ҹ��ڰ� ��Ÿ�������� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� �޼ҵ�, �ҹ��ڿ��� �ٸ� ���ڴ� ��ȯ���� �ʰ� ��ŵ
		int i;
		for(i=0; i<s.length(); i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')//���ڿ� s�� i��° ���ڰ� �ҹ��ڶ��
				System.out.print((char)(s.charAt(i)-32));//�빮�ڷ� ��ȯ�ؼ� ���
										 //�빮�ڴ� �ҹ��ڿ��� 32�� ���� ��. 
			else //���ڿ� s�� i��° ���ڰ� �ҹ��ڰ� �ƴ϶�� 
				System.out.print(s.charAt(i));	//�׳� i��° ���� �״�� ���
		}
	}
	
	boolean equals(String s1, String s2){//�� ���ڿ��� �Է¹޾� ������ ��ġ�ϴ��� ���θ� ��ȯ�ϴ� �޼ҵ� 
		int i; 
		if(s1.length() != s2.length()) return false;//�� ���ڿ��� ���̰� �ٸ��ٸ� ����ġ�ϹǷ� false��ȯ.
		for(i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i)) return false;//i��° ���ڰ� �ٸ��ٸ� false��ȯ
		}
		//���������ڱ��� ���� ��츸 �ݺ��� ������ ��������. 
		return true; //�̱��� �Դٴ� ���� �� ���ڿ��� ���ٴ� ���̱� ������ true ��ȯ
	}
}

class HW7_3{
	public static void main(String [] args){
		String st1 = "Hello ", st2 = "Hi!", st3 = "Hello ";
		StringManipulate sm = new StringManipulate();
		
		System.out.println("st1�� st2�� ����: "+sm.concat(st1, st2));
		sm.toUpper(st2);
		System.out.println();
		System.out.println("st1, st2 ��ġ?: "+sm.equals(st1, st2));
		System.out.println("st1, st3 ��ġ?: "+sm.equals(st1, st3));
		
	}
}