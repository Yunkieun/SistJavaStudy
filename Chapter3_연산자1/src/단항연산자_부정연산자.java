/*
 *   부정연산자(!) ==> boolean만 사용이 가능
 *                   1:1 (턴) => 반대 효과
 *                !true ==> false
 *                !false ==> true
 *    boolean bCheck=false;
 *    while(true)
 *     {
 *        bCheck=!bCheck;
 *        if( bCheck==true)
 *        {
 *           컴퓨터
 *        }
 *        else
 *        {
 *            플레이어
 *        }
 *     }
 *     
 *     !(조건) => 자바스크립트, 오라클
 *   
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bCheck=false;
        bCheck=!bCheck;
        System.out.println(bCheck);
	}

}
