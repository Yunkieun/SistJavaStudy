/*
 *   char (문자를 저장하는 메모리의 크기) => 2byte(0~65535) => Unicode 
 *   초기값 설정 : 'A'  ==> 모든 문자는 번호를 가지고 있다 
 *                       실제 저장 ==> 숫자가 저장이 된다 
 *                       'A' ==> 65
 *                       ==> 100001 
 *               초기값을 적용 : '' (오류)
 *               ==> char는 연산처리시 숫자로 변경이 된다 
 *               'A'+1 
 *               ---
 *               65 +1 ==> 66 ==> 정수형으로 취급될 수 있다 
 *    실수 초기화 
 *    float f=10.5; ==> 오류  ==> f=10.5F(f)
 *            ----
 *             double (8)
 *    boolean ==> true/false
 */
public class 변수초기화_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('A'); // char
        System.out.println((int)'A');// int 변환 
        //System.out.println((double)'A');
        //System.out.println(0b100001);
        //System.out.println(Integer.toBinaryString((int)'A'));
        //char c='';
        float f=10.5F;
        double d=10.5;
        d=10.5d;
        boolean b=true;
        b=false;
        
        final int K=100; // 상수 (변경할 수 없는 수) ==> 상수는 모든 알파벳을 대문자로 사용한다
	}

}
