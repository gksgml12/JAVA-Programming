import java.util.Scanner;
class HW4_2{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		String type;
		
			System.out.print("도형의 타입을 입력하세요(피라미드, 사각형, 다이아몬드): ");
			type = s.nextLine();
			int line, i, j, k;
			switch(type){
			case "피라미드"://--------------------------------------------------------
				System.out.print("출력할 줄 수(10이하 양의 정수): ");	
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
			
			case "사각형"://--------------------------------------------------------
			int garo, sero, banbok;
				
			System.out.print("가로 : ");
			garo = s.nextInt();
			System.out.print("세로 : ");
			sero = s.nextInt();
			System.out.print("반복횟수 : ");
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
			
			case "다이아몬드"://--------------------------------------------------------
				
				System.out.print("출력할 줄 수(홀수): ");	
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
				System.out.println("도형 타입을 제대로 입력하세요.\n");
				break;		
			}	
		}
	}
