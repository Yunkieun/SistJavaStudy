/*
 *   public static void main(String[] arg) 
	{
	       int num1=10, num2=10;   
	       int a, b;   
	       a = ++num1;   //증가된 상태 대입 ============  11
	       b = num2++;   //증가전 값을 대입 ==> 나중 증가 == 10
	
	       System.out.printf("%d, %d \n", b, num2);
	}
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=10;   
	       int a, b;   
	       a = ++num1;   //증가된 상태 대입 ============  11
	       b = num2++;   //증가전 값을 대입 ==> 나중 증가 == 10
	
	       System.out.printf("a=%d, b=%d \n", a, b);
	}

}
