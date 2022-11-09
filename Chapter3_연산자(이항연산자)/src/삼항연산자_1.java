/*
 *  삼항연산자 : 피연산자 3개인 경우 연산자
 *  형식)
 *          (조건)?값1:값2
 *          조건 true ==> 값1
 *          조건 false ==> 값2 ===> if ~ else
 *          페이지 (이전/다음)
 */
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='1';
        System.out.println((c>'A' && c<='Z')||(c>='a' && c<='Z')?"알파벳":"알파벳이 아니다");
	}

}
