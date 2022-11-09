/*
 *  산술연산자 => 산술변환
 *             연산은 무조건 같은 데이터형이어야 연산처리가 된다
 *                        ----------
 *              다른 데이터형이 연산되면 => 큰데이터형으로 변경 후 연산처리를 한다 (자동 형변환) ==> 92page
 *                                    --------------- 자동
 *                                    예)
 *                                       int + double
 *                                       ---
 *                                       double로 변경
 *                                       ------------
 *                                       double + double = double
 *                                       
 *                                       int + char
 *                                             ----
 *                                             int변경
 *                                       -------------
 *                                       int + int = int
 *                                       ***int이하 데이터형 (byte,char) ==> 결과값이 int
 *                                       char + byte = int
 *                                       char + char = int
 *                                       byte + byte = int
 *                                    작은 데이터형으로 변경 후 연산처리
 *                                    ----------------- 강제
 *                                    double + int = int
 *                                    ------
 *                                    int로 변경
 *                                    (int)double + int = int
 *                                    
 *            *** 여러개의 연산이 되면 => 가장 큰데이터형의 결과를 가지고 온다
 *                char + int + double ==>
 *                ----
 *                int
 *                ----------
 *                double + double = double
 *                
 *                byte< char < int < long < float < double
 */
public class 산술연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int c='A'+'B';
        //System.out.println(c);
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2); // 결과값 int 
		System.out.println(b3);// 오버플로우 발생 가능성이 있다 ==> 방지 int로 받아서 저장
		
		char c='A';
		int d=100;
		int k=c+d;
		 // c=65 ===> 65+100 ==>165
		System.out.println(k);
		
		int m=(int)10.5+(int)10.5;
		/*
		 *   (int)10.5 ==> 10 ==> 소수점을 지운다
		 *   (int)10.5 ==> 10
		 *   10+10 = 20
		 *   (type) > 산술연산자보다 계산 순서가 높다
		 */
		int n=(int)(10.5+10.5); //순위 결정
		// 지니뮤직 , 멜론 , Mnet ==>
		/*
		 *    () : 최우선 순위 ==> 10.5+10.5 ==> 21.0
		 *    (int)21.0 =21
		 */
		// m=4, 10.5+10.5=8 ==> 작은 메모리에 저장이 불가능하기 때문에 오류 발생(오른쪽에 있는 데이터가 작거나 같아야 ㅎ)
	    System.out.println("m="+m);
	    System.out.println("n="+n);
	}

}
