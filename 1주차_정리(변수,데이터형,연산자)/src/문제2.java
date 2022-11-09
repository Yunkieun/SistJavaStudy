/*
 *   public static void main(String[] arg) 
     {  
	    int a, b;  
	    a = 6;  
	    b = 2;   
	    System.out.printf("덧셈 연산 결과: %d \n", a+b);  
	    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  
	    System.out.printf("곱셈 연산 결과: %d \n", a*b);  
	    System.out.printf("나누기 연산 결과: %d \n", a/b); 
	    System.out.printf("나머지 연산 결과: %d \n", a%b); 
     }     
     
     산술연산 
      => 산술변환이 된다 (자동 형변환)
         ** 같은 데이터형만이 연산된다 
         다른 데이터형인 경우에는 큰데이터형으로 변경 => 연산 
         정수/정수=정수 , 정수/실수=실수 
         ==> 정수/(double)정수
         ** %는 부호만 확인 (왼쪽부호)
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;  
	    a = 6;  
	    b = 2;   
	    System.out.printf("덧셈 연산 결과: %d \n", a+b);  
	    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  
	    System.out.printf("곱셈 연산 결과: %d \n", a*b);  
	    System.out.printf("나누기 연산 결과: %.1f \n", a/(double)b); 
	    System.out.printf("나머지 연산 결과: %d \n", a%b);
	    // printf는 반드시 패턴 (출력) ==> 자바에서 문법상에서만 사용 ==> System.out.println()
	    /*
	     *   %d ==> 정수
	     *   %f ==> 실수 
	     *   %c ==> 문자
	     *   %s ==> 문자열 
	     *   %b ==> boolean
	     */
	}

}
