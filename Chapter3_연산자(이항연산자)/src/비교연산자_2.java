import java.util.Scanner;

/*
 *  char 비교 : char는 정수형으로 변경 후 비교
 *  -----------------------------------
 *    'A'<'B'
 *    --   --
 *    65   66
 *    
 *    1 > '0' => false
 *    -   ---
 *         48  ==> 1>48 ==> '1' ==> 49 , '2' ==> 50
 *    모든 문자마다 번호 (아스키 코드)
 *    -------------------------
 *     아스키 코드 | 스캔코드 (키보드 번호)
 *        8          8 ====> 쉬프트연산자 (C언어)
 *    -------------------------
 *    C언어 / 자바
 *    => C언어는 변수 선언 시 먼저
 *    => 자바는 원하는 위치에서 변수 선언이 가능
 */
public class 비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A'; //65
		char b='a'; //97
		
		System.out.printf("%c == %c : %b\n",a,b,a==b);
		System.out.printf("%c == %c : %b\n",a,b,(a+32)==b);
		// 대소문자의 차이 ==> 32의 차이가 남
		System.out.printf("%c != %c : %b\n",a,b,a!=b);
		// %b ==> boolean 출력
		/*
		 * %d ==> 대입하는 데이터는 정수
		 * %c ==> 문자
		 * %f => 실수
		 * %s ==> 문자열 (문자는 '', 문자열 "aaaaaaaaaa")
		 * %b ==> boolean (true/false)
		 */
         int c=98;
         System.out.printf("%d == %c : %b\n",c,b,c==b); //char는 모든 연산이 있는 경우 정수로 변경이 된다
         // == , != , < , > , <= , >= 비교가 가능
         // ==, != (Boolean) true, false
         
         boolean b1=true;
         boolean b2=false;
         System.out.printf("%b == %b : %b\n",b1,b2,b1==b2);
         System.out.printf("%b != %b : %b\n",b1,b2,b1!=b2);
         /*System.out.printf("%b < %b : %b\n",b1,b2,b1!<b2);*/
         // 소스 코딩시마다 컴파일한다
         
         Scanner scan=new Scanner(System.in);
         System.out.print("정수 입력:");
         int k=scan.nextInt();
         System.out.println((k%2==0)?"짝수":"홀수"); // 삼항연산자 => 성별 ==> 주민번호 확인
	}

}
