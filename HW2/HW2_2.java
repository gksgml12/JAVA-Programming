import java.util.Scanner;

class HW2_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int input;
		System.out.print("정수: ");
		input = s.nextInt();
			
		System.out.printf("%d의 절댓값은 %d이고,\n\t그 수를 8로 나눈 몫은 %d이고,\n\t\t나머지는 %d입니다.\n", input,((input>>31)&1)==1?~input+1:input, input>>3, input&0b111);//한탭씩이므로 마지막은 \t 2번
		
		//((input)&(int)-Math.pow(2,31))!=0?~input+1:input과 같음
		
		/* 부호확인
			부호는 MSB를 통해 알 수 있다. 
			int형은 32비트이므로 최상위 비트가 1인지 여부를 판단하기 위해서는
			입력값을 31비트만큼 오른쪽으로 시프트하고 그 값이 1인지 확인하면 된다. 
			((input>>31)&1)==1 이 참이면 음수, 거짓이면 양수이다. 
			
			한 가지 다른 방법도 있는데, 이 내용은 수업시간에 해 보도록 하겠습니다.
		*/
		// 8로 나눈 몫은 단순히 오른쪽으로 시프트시키면 됨
		
		// 8로 나눈 나머지는 마지막 3비트이기 때문에 111과 AND 시키면 알아낼 수 있다. 
		
		//8로 나눈 나머지와 몫이 이해된다면 16으로 나눈 몫과 나머지도 구해보세요. 
	}	
}