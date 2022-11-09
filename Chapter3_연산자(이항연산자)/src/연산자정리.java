/*
 *    1. 단항연산자 
 *       = 증감연산자 (++,--) : 반복문 , 데이터베이스 값을 읽는 경우 , 파일 읽기 
 *         => 한개를 증가 , 한개를 감소 (정수형,문자형) 
 *         ** 전치 연산자  ++a ==> 먼저 증가후에 대입 
 *         int a=10;
 *         int b=++a; 
 *             ++a , b=a
 *         ** 후치 연산자  a++ ==> 대입을 먼저하고 나중에 증가 
 *         int a=10;
 *         int b=a++;
 *             b=a , a++
 *       = 부정 연산자 (!) : 조건문 , 예약일이 아닌 경우 
 *         => boolean에서만 사용이 가능 (true/false)
 *         => 좌석 예매 => 영화 , (맛집 , 도서관)
 *         
 *       = 형변환 연산자 : 자동 처리 , 필요할때 강제 형변환 (숫자=> 정수,문자,실수)
 *         => 클래스 형변환 (*******)
 *         => (데이터형)값 =====================> 큰데이터형 , 작은 데이터형(강제)
 *             (char)65 , (int)10.5
 *             *** 오버플로우 ===================> (byte)300  ==> 44
 *       = 음수/양수 ( - , + )
 *    2. 이항연산자 : 연산자는 항상 같은 데이터형이 있어야 연산처리(다른 데이터형이 있는 경우에 변경 처리) 
 *       = 산술연산자 ( + , - , * , / , % ) => 웹에서 가장 많이 사용되는 연산자 
 *         => 다른 데이터형을 묶어서 연산 => 자동 형변환이 된다 (산술변환)
 *            (가장 큰 데이터형으로 변환)
 *            int + int = int , long + long = long , double + double =double
 *            int + long = long
 *            ----------(X)
 *            int => long 
 *            
 *            double + int 
 *                     --- double
 *            double+double=double
 *            
 *            (int)double + int = int
 *         => / ==> 0으로 나눌 수 없다 , 정수/정수=정수  ==> 소수점 (정수/실수)
 *              5/2 ==> 2.5 ==> 2 
 *         => % ==> 결과값이 왼쪽부호가 나온다 
 *              + % + => +
 *              - % + => -
 *              + % - => +
 *              - % - => -
 *       = 비교연산자 : 조건문 , 반복문 => 응용 (제어문) , 삼항연산자 (결과값이 boolean) => true/false
 *              == 같다 (정수,실수,문자,논리) ==> 문자열은 비교가 불가능 하다 (equals) , 객체 비교(instanceof)
 *              != 같지않다 (정수,실수,문자,논리)
 *              <  작다 (정수,실수,문자)
 *              >  크다 (정수,실수,문자)
 *              <= 작거나 같다 (정수,실수,문자)  ==>  < || ==  7<=7 ==> true
 *              >= 크거나 같다 (정수,실수,문자)  ==>  > || == 
 *       = 논리연산자 : 조건문 , 반복문 (제어문에서 주로 사용한다) ===> 결과값은 무조건 boolean
 *              *** && > || (연산 우선 순위 &&)
 *              && (범위포함) ==>  두개의 조건이 true일 경우에만 true
 *              || (범위미포함)==>  두개의 조건중에 한개이상 true일 경우에 true
 *              (조건) && (조건) 
 *              (조건) || (조건) 
 *              
 *              ==> 효율적인 연산 
 *              (조건) && (조건) 
 *              false    -----  수행하지 않는다 : 앞에 조건이 false을 확률이 높은 것에 앞에 배치 
 *              (조건) || (조건)
 *              true     -----  수행하지 않는다 : 앞에 조건이 true을 확률이 높은 것에 앞에 배치 
 *       = 대입연산자 
 *         = 대입 (값)
 *         int a=10;
 *         +=
 *         ==================> a+=5 ==> a값에 5을 더한다  a=a+5
 *         -=
 *         ===================> a-=5 ==> a값에 5를 뺀다   a=a-5
 *         *=
 *         ==================== a*=5;  a=a*5
 *         /= 
 *         ==================== a/=5   a=a/5
 *         복합 대입 연산자 
 */
// 국어 , 영어 , 수학 점수를 받아서 총점 , 평균을 구한 다음 60이상 Pass , 60이하 Fail
import java.util.Scanner;
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); //키보드 입력값을 받을 준비 => 클래스는 메모리에 저장시에 반드시 new
		// ==> JVM에서 저장 메모리 크기를 확인 배치 ==> heap (관리는 GC)
		System.out.println("국어,영어,수학 점수 입력(90 90 90):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		int temp=(int)avg;
		
		System.out.println("국어점수:"+kor); // void java.io.PrintStream.println(string x)
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%2.f\n",avg); //
		System.out.println(temp>60?"Pass":"Fail");
		//PrintStream java.io.PrintStream.printf(String format, Object... args)
		

	}

}
