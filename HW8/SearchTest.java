import java.util.Scanner;

class Search{
	Scanner s = new Scanner(System.in);//��ĳ�ʸ� �ʵ�� ������ ���� ����
	
	String inputString(String prompt){//�Ű������� ���� ���ڿ��� ����ϰ� ����ڰ� �Է��� ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
		System.out.print(prompt);
		return s.nextLine();
	}
	
	void searchKeyword(String sentence, String keyword){//����� �˻��� �ܾ �Ű������� �޾� �˻� ����� ����ϴ� �޼ҵ� 
		int i, n=0, cnt=1; //n: �˻�Ƚ��, cnt: ��������
		int lenKey = keyword.length();
		
		System.out.print("�˻� ���: ");
		for(i=0; i<sentence.length()+1-lenKey; i++){
			if(sentence.charAt(i)==' '){
				cnt++;
			}//������ ���ö����� ���� ���� �߰�
			if(keyword.equalsIgnoreCase(sentence.substring(i, i+lenKey))){
				System.out.print(cnt+"��°, ");//���ڿ��� i��° ���ں��� Ű������̸�ŭ �߶����� Ű����� ��ҹ��� �����ϰ� ��ġ�Ѵٸ� �˻� ����� ���� ���� �߰�
				n++; //�˻�Ƚ�� �߰�
			}
		}
		if(n>0) System.out.print("\b\b �������� \""+keyword+"\"�� �˻��Ǿ�, ");
		
		System.out.println("�� "+n+"ȸ �˻��Ǿ����ϴ�.");
	}	
}


class SearchTest{
	public static void main(String [] args){
		Search st = new Search();
		String s = st.inputString("����: ");
		String k = st.inputString("�˻��� �ܾ�: ");
		st.searchKeyword(s, k);
	}
}