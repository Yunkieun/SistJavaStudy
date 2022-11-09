/*
 *  => 41page~84page
 *     -------------
 *     화면 출력 / 키보드 입력값 / 형변환
 *     -------
 *      System.out.println() => 가장 많이 사용되는 화면 출력 기능 (출력을 하고 다음줄로 이동해서 풀력)
 *      System.out.print() => 다음줄로 이동하지 않고 출력(옆으로 출력)
 *      System.out.printf() => 출력 형식을 만들어서 출력(서식있는 출력)
 *         => 데이터형 출력 종류(%d => 정수, %f => 실수, %c=> 문자, %s=> 문자열) => %o, %x, %b
 *                                                                      (8진법),(16진법),boolean
 *                                                                      
 *         => %5d ==> 출력할때 5칸 확보
 *                    300
 *                    ()()(3)(0)(0) => 오른쪽 정렬
 *            %-5d ==>(3)(0)(0)()()=> 왼쪽 정렬
 *     화면 입력
 *      Scanner => 사용방법 (40page) ==> 도스에서만 사용(문법)
 *       1)클래스 ==> 메모리 저장
 *         Scanner scan=new Scanner(System.in) => System.in (키보드 입력값)
 *                      ----클래스를 메모리에 저장시에 반드시 사용 (동적메모리 할당)
 *                          malloc() ==> new
 *                          free()   ==> delete : GC
 *       2)클래스가 가지고 있는 기능을 활용
 *         Scanner가 가지고 있는 기능
 *         정수값 받을 경우 : nextInt() (메소드: 한가지 기능을 가지고 있다)
 *         문자열 받는 경우 : next()
 *         논리형 받기 : nextBoolean()
 *         실수형 받기 : nextDouble()
 *         --------------------------------java.io(BufferedReader) ==> 예외처리
 *     진법
 *       표현법 : 8진법(0~), 16진법(0x~)
 *       =>2진법 : 0,1
 *         8진법 : 0~7
 *         16진법 : 0~15 => 10(a)~~15(f) ==> color지정 0xFF ==> 255
 *                                                16^1*15 + 16^0*15
 *                                                          ------- 15
 *                                                -------
 *                                                  240   + ============255 (White)
 *       =>음수 표현 (2의 보수) ==> 양수보다는 1이 크다
 *                               70 ==> -71(~:반전 연산자) 
 *    ***** 형변환 (UpCasting, DownCasting: 데이터형을 작게 만든다) Number
 *                ---------- ------------
 *                데이터형을 크거나 변환
 *                ----------------- int ==> double
 *                                  int ==> char
 *                1)UpCasting(자동 형변환)
 *                  변수 초기값
 *                  double d=10 ==> 10을 실수로 변경해서 저장 10.0
 *                  -------- --(int) d=10.0
 *                  int a='A'
 *                        --- int 변경한 다음 대입 ==> int a=65
 *                  -----------------> 변수의 데이터형 >= 값
 *                  'A'
 *                    => char , int , long, folat , double : 가급적이면 같은 데이터형으로 받는 것이 좋다
 *                       'A'     65    65L   65.0F  65.0
 *                     10.5F
 *                     => float, double
 *                     10.5
 *                     => double
 *                     10
 *                     => int, float, long, double
 *                         10  10.0F  10L   10.0
 *                      65
 *                       => int, char
 *                          65   'A'                         
 *                  연산자
 *     =자동 형변환
 *     =강제 형변환   
 *     =======================연산자에 등장    
 */
public class 화면출력_진법_형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=(int)10.5; // 소수점을 지운다 ==> 10
        System.out.println(a);
        a=(int)10.5F; //10
        System.out.println(a);
        a=(int)10L; //10 ========================>오버플로우
        System.out.println(a);
        byte b=(byte)300;
        System.out.println(b);
	}

}
