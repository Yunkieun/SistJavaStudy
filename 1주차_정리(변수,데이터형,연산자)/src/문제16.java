/*
 *   구현 내용 :
		정수 변수 선언
		키보드로부터 정수 하나 입력 받음 
		양수가 아니면 "양수가 아니다." 출력
 */
import java.util.Scanner;
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.print("정수 입력:");
	        int a=scan.nextInt();
	        
	        System.out.println(a>0?"양수":"양수가 아니다");
	}

}
