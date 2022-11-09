/*
 *   1.변수 2.연산자 3.제어문 4.화면출력
 *   ------------------------------재사용 (모아서 저장) => 메소드, 클래스 (해킹=> 데이터 보호(캡슐화)) => 상속,포함
 *   1. 프로그램(소스 코딩 방복)
 *   
 *   데이터 저장  ===> 데이터 조작 ===> 화면출력
 *     (변수)        연산자,제어문
 *                  ----------     
 *   데이터형: 메모리 크기(기본형)
 *   -----------------------
 *   정수
 *     byte(1byte): -128~127
 *     ***int(4byte): 일반 정수 저장 ==> -21억 4천 ~ 21억 4천
 *     ***long(8byte): 빅테이터, 챗봇
 *   실수
 *     ***double(8byte): 소수점 15자리
 *   문자
 *     char(2byte): 0~65535 => 모든 문자는 번호 => 'A'(65), 'a'(97), '0'(48)
 *                  *** 연산처리시에 정수형으로 변경
 *                  *** 참조변수 => string
 *   논리
 *     ***boolean(1byte): true/false
 *   
 *   데이터형의 크기 => 필요시에는 언제든지 데이터형을 변경(형변환)
 *   -----------
 *    byte < char < int < long < float < double
 *    연산처리
 *      int + long = long
 *      double + int + char = double
 *      ex)10+10.5 ==> 20.5
 *         --
 *         10.0
 *         10.0+10.5 ==> 20.5 ==> 자동 형변환
 *         
 *    화면 출력 ==> 36page
 *    System.out.println() ==> 세로 출력 ==> In newLine
 *    System.out.print() ==> 가로 출력 
 *    System.out.printf() ==> 서식
 *          => %d , %c, %f, %s
 *             ---------------
 *             %d: 정수
 *             %c: 문자
 *             %f: 실수
 *             %s: 문자열
 *             ---%o(8진법), %x(16진법), %e(지수), %b(boolean): 오늘만
 *             
 *     특수문자
 *     ------
 *       \t => tap:일정 간격 처리
 *       \n => 다음줄 출력: newLine
 *       \" => 경로명
 *     -------------------------------------------  
 */
public class 화면출력_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //println()
		//System.out.println("Hello");
		//System.out.println("Java");
		//System.out.print("\n") <==> System.out.println()
		//System.out.print("Hello\n");
		//System.out.println("Java");
		//System.out.printf("%s,%s","Hello","Java");
		System.out.printf("국어점수:%d",80);
		System.out.println("평균:"+(85/3.0));
		//System.out.printf("평균:%.2f",(85/3.0)); //소수점, 간격을 설정
		// %5d %-5d ==> 3자리
		//System.out.printf("%-5d%-5d%-5d",90,80,70); //jdk 1.5 ==> c언어 ==>printf
		System.out.println(90+"   "+80+"   "+70);
		
		
	}

}
