/*
 *  단항연산자
 *   =증감연산자 (++,--)
 *     ++ : 값을 1증가 (무조건 증가)
 *     -- : 값을 1감소 (무조건 감소)
 *     1)전치 연산자
 *       ++a ===> 다른 변수에 대입시 => 먼저 증가후에 증가된 값을 대입
 *                b=++a ==> b=a
 *                  --
 *                  ++a(1)
 *                b=a(2)
 *     2)후치 연산자
 *       a++ ===> 다른 변수에 대입시 ==> 대입을 먼저한 후에 나중에 증가 됨
 *                b=a++
 *                b=a (대입)
 *                  a++
 *   =부정연산자 (!) => boolean만 사용이 가능 (true=>false, false=>true)
 *   =형변환 연산자 (type)
 *      자동 형변환 ==> 변수에 값을 대입, 연산처리시
 *                   int a='A';
 *                   double d=10;
 *                   int + double = double
 *                   ---
 *                   double
 *                  
 *                   char + char
 *                   ----   ----
 *                   int    int
 *                   ----------------int+int=int
 *                  
 *      강제 형변환 ==> 라이브러리에서 데이터 추출 => 강제로 변경
 *         (double)10 ==> 10.0
 *         (int)'A' ==> 65
 *         (char)65 ==> 'A'
 */
public class 단항연산자정리 {

	public static void main(String[] args) {
		 System.out.println("1" + "2");  
		   System.out.println(true + "") ; // ''
		   System.out.println('A' + 'B') ; 
		   //                  65    66  ==> 131
		   System.out.println('1' + 2) ;   
		   //                 49 +2 ==> 51
		   System.out.println('1' + '2'); 
		   //                  49 + 50  ==> 99
		   System.out.println('J' + "ava") ;


	}

}
