/*
 *   173page 
 *   -------
 *    초기값
 *    do{
 *         반복 수행문장 
 *         증가식 ====================> 증가후에 비교
 *    }while(조건식);
 *    
 *    int i=1;  ===============================> i=1
 *    do{
 *         System.out.println("i="+i);     i=1 i=2 i=3.....i=9 i=10
 *         i++;  => i=2 i=3... i=9 i=10 i=11
 *    }while(i<=10);                    ------ 종료
 */
public class 반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         *     *
         *    **
         *   ***
         *  ****
         *  
         *      i    j   k
         *     줄수  공백 별표
         *     1    3    1      i+j=4  ==>j=4-i  k=i
         *     2    2    2
         *     3    1    3
         *     4    0    4
         *     
         *     1    0    4    j+1=i  ==> j=i-1  k=5-i
         *     2    1    3
         *     3    2    2
         *     4    3    1
         */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *       i    j                   ==> i+j=4 ==> j=4-i
		 *      줄수  공백 별표  
		 *      1    3   1                    i*2-1 ==> j
		 *      2    2   3
		 *      3    1   5
		 *      4    0   7
		 */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// 1111 222
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(k);
				
			}
			k++;
			// 2
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)
		{
			k=1;
			for(int j=1;j<=5;j++)
			{
				System.out.print(k++);//12345 12345
			}
			
			System.out.println();
		}
	}
	/*
	 *   1. 형식 
	 *   2. 2차 for ==> 
	 *      for()
	 *      {
	 *         for(;조건문;)
	 *              ----
	 *         {
	 *         }
	 *      }
	 *    3. 변수위치 , 증가식 
	 */

}








