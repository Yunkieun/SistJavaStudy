import java.util.Arrays;

/*
 *   1. 자바 설치 
 *      jdk.java.net/archive/
        14~18
     2. Path : c:\jdk-17.02\bin  ==> 실행 파일 (java,javac)
     3. classpath : 자바에서 지원하는 라이브러리 사용 
                    .;c:\jdk-17.02\lib
     -----------------------------------------------------
     4. 편집기 : eclipse.org ==> 가장 최신버전 (JAVA,JAVAEE)
        Java SE (일반 자바 ==> 자바실행도구 , 라이브러리) *****
        Java EE (기업용 환경 ㅣ 웹) *****
        Java ME (모바일) ===> X (Kotlin)
     5. STS(Spring,Spring-Boot) , Oracle 
     =====================================================
     1) 자바 표현법 
        숫자 관련 
          정수
           = 10진법  10,20....
           = 8진법   012 , 011 
                   ---- 10
                   달력 ==> 01 ,02 , 03 , 07 , 08  ==> 0xx
           = 16진법  0xFF , 0xXX (사용빈도가 거의 없다)
          실수 : 10.5(8byte) , 10.5F (4byte)
                 double        float 
        문자 관련 
           = ''  => 한그자만 저장이 가능  'AB'(X) ==> 'A','홍'
        문자열 관련 : 한글자 이상 ==> "ABC" , "A"....
        논리 관련 :  true/false 
        ================================> 대소문자 구분 , 문장 종료 ;
        ================================> 컴퓨터에 명령을 내리는 것 
                                          순차적으로 내린다 (알고리즘)  ==> ;
                                          int a=10; 4바이트 메모리를 만들고 10을 저장 
     2) 주석 : 컴파일시 번역에서 제외가 되는 부분 = 분석하기 편하다 ==> 8page
              int a=90; // 국어점수 
     3) 문법 에러 사항 
        1. ; 
        2. main을 못찾는 경우 
        3. 대소문자 구분 
         ---------------------------- 클래스명 (대문자 시작), 변수(소문자) , 메소드(소문자)
        4. {} ==> 들여쓰기 
        class A =================> c언어
        {
	        public void main()
	        {
		        if()
		        {
		        }
	        }
        } 
        
        class A {
	        public void main(){
		        if(){
		        }
	        }
        } 
        
        저장명 ===> 10page
         class A   ==> A.java
         {
            
         }
         
         ====================== A.java,B.java
          class A
          {
          }
          class B
          {
          }
         ======================
         
         ====================== B.java
         class A
         {
         }
         public class B
         {
         }
         ======================
     4) 특징 (3,4page)
        1. 운영체제의 독립적이다 (모든 운영체제에서 컴파일된 파일이 동일)
        2. 객체지향 프로그램 (6장 ~ 7장)
           = 재사용 (상속 ,포함) => 새롭게 추가 , 기존의 기능 변경 
                                  오버로딩        오버라이딩 
           = 데이터 보호 : 캡슐화 
           = 유지 보수 목적 
        3.배우기가 쉽다 (포인터 , 구조체 , 상속) ==> 자바에서 생략 
        4.자동 메모리 관리 
          malloc , free , ==> new , delete ==> new ,가비지켈렉션
          System.gc() = 멀티미디어 
        5.동적 로딩 
          프로젝트 : 클래스가 여러개가 있다 ==> 필요시마다 로딩  
          
        ==========> 2장 ~ 8장 , 9장(라이브러리) ~ 13장 , 나머지 흐름 파악(쓰레드 , 네트워크, 람다식)
                    ------------------------------
                    
        jdk ==> 실행 종류 , 가상머신 (JVM) : 자바를 실행하기 위한 기계 장치 
                                        ========================== 운영체제에 따라 다르다 
                자바 애플리케이션 
                =============
                   |
                  JVM  (미들웨어) => Mac , Linux , Window(32/64) ==> zip 
                   |               ------------- tar.gz
                  운영체제
                  
        실행과정 
        Hello.java =================|(JVM) Hello.class ================ 화면에 출력 
                      javac                                 java
        1. 명령어 
           1) javac : 컴파일러 , 인터프리터  ==> 제임스 고슬링 (보안) ==> 샌드박스 ==> 인증 
              .java ===> .class
           2) java : 실행시 사용 
           3) javap : .class ==> .java
           4) jar : 자바 zip파일 
           5) javah  : C언어 호환 
           ----------------------- bin
           
           동원증권 : 자바 구축 (보안) ===> 5000만원 
                    안랩 / 김랩 / 소프트포럼 
                                -------- 33대란 
                                --------------------------------------- 시조 터보백신(안양대1학년)
                                바이로봇 ==> 92% , 치료(X) ==> 바보로봇
                                V3     ==> 86% , 치료(O)
                                ------------------------- 독일 Open(99%)
           
 */
// 주석 : Ctrl+Shift+/      ,  Ctrl+Shift+\(주석 풀기)
// Ctrl+space
// 메뉴 ==> Project ==> clean (버퍼)
public class MainClass_2 {
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * 
	 * 
	 * System.out.println("1"); System.out.println("2"); System.out.println("3");
	 * System.out.println("4"); System.out.println("5");
	 * 
	 * 
	 * 
	 * }
	 * 
	 *      *
	 *      **
	 *      ***
	 *      ****  
	 *          i    j
	 *        줄수   별표
	 *        1      1
	 *        2      2
	 *        3      3
	 *        4      4              ==> i=j  => j=i
	 *        
	 *      ****
	 *      ***
	 *      **
	 *      *
	 *       i     j
	 *      줄수   별표
	 *      1      4
	 *      2      3
	 *      3      2
	 *      4      1  | 더한다     i+j=5  ==> j=5-i
	 *      
	 *      ==> 수열 
	 *       1 1 2 5 3 4 7 8 9 10 10 10 
	 *       1 3 5 7 9 
	 */

	public static void main(String[] args) {
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		} // 유지보수
		System.out.println("=================================");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*"); // 가독성 */
		int[] arr= {10,9,6,8,3};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("====================");
		int[] arr2= {10,9,6,8,3};
		Arrays.sort(arr2);//DESC
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}

	}

}
