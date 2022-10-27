// 1~10까지 짝수 출력 
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=10;i++)
        {
        	if(i%2==0)
        	{
        		System.out.print(i+" ");
        	}
        }
        System.out.println();
        /*
         *    2  => i<=10  true  ==> 2
         *   +2
         *    4  => i<=10  true  ==> 4
         *   +2
         *    6  => i<=10  true  ==> 6
         *   +2
         *    8  => i<=10  true  ==> 8
         *   +2
         *   10  => i<=10  true  ==> 10
         *   +2
         *   12  => i<=10  false ==> 종료
         */
        for(int i=2;i<=10;i+=2)  // 초기값(어디서부터) , 조건식(어디까지) , 증감식(몇개 증가)
        {
        	System.out.print(i+" ");
        }
	}

}
