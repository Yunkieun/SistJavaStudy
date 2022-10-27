/*
 *   단일 조건문 : 독립적인 문장 ==> 여러개를 사용시에는 여러개 문장이 수행할 수 있다
 */
public class 조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=21;
        if(a%3==0)
        {
        	System.out.println(a+"는(은) 3의 배수입니다");
        }
        ////////////////////////
        if(a%5==0)
        {
        	System.out.println(a+"는(은) 5의 배수입니다");
        }
        if(a%7==0)
        {
        	System.out.println(a+"는(은) 7의 배수입니다");
        }
	}

}
