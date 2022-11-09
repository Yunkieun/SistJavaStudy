/*
 *   public static void main(String[] arg) 
	{
	      int num1=10;   
	      System.out.printf("%d \n", num1); //10
	      num1++;
	      System.out.printf("%d \n", num1); //11
	      ++num1;
	      System.out.printf("%d \n", num1); //12
	      --num1;
	      System.out.printf("%d \n", num1); //11
	      num1--;
	      System.out.printf("%d \n", num1); //10
	}
 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1=10;   
	      System.out.printf("%d \n", num1); //10=> 저장된 값 출력  num1=10
	      System.out.printf("%d \n", num1++); //10 => 출력하고 num1=10 나중 증가  => num1=11
	      System.out.printf("%d \n", ++num1); //12 ==> num1=11 ==> ++ num1=12
	      System.out.printf("%d \n", --num1); //11
	      System.out.printf("%d \n", num1--); //11
	      
	}

}
