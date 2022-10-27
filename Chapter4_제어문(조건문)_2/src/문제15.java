/*
 *    2자리수 정수 입력(10~99) >> 77 
      10의 자리와 1의 자리가 같습니다.  ==> if ~ else 

 */
import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99) >>");
        int num=scan.nextInt();
        int a=num/10;
        int b=num%10;
        if(a==b)
        	System.out.println("10의 자리와 1의 자리가 같습니다.");
        else
        	System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
	}

}
