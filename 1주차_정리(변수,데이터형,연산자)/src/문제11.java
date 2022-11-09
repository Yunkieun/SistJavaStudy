/*
 *   사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 
 *   연산의 결과를 출력하는 프로그램을 작성
 */
import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.print("첫번째 정수 입력:");
	        int num1=scan.nextInt();
	        
	        System.out.print("두번째 정수 입력:");
	        int num2=scan.nextInt();
	        
	        System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
	        System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
	        
	        // printf ==> 원하는 객수만큼 대입 (가변매개변수)  ...
	        // (String format, Object... args) ==> 메소드
	        /*
	         *    int a=10;
	         *    a++;
	         *    // 증가
	         *    ++a; //증가 
	         *    
	         *    int a=10;
	         *    System.out.println(a++) => 10
	         *    //증가 
	         *    System.out.println(++a) => 12
	         */
	}

}
