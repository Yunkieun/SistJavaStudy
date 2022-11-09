/*
 *   정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
         판단해보자.
         
      형식)
           if(a>50)
           {
               그 수가 50 이상의 수 ==> 조건 true일때 처리하는 영역
           }
           else
           {
               50미만의 수 ==>조건이 false일때 처리하는 영역
           }
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        int num=scan.nextInt();
        
        if(num>=50)
        {
        	System.out.println(num+"은(는) 50이상입니다!!");
        }
        else
        {
        	System.out.println(num+"은(는) 50미만입니다!!");
        }
	}

}
