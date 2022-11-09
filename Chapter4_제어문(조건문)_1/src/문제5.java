/*
 * 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
         프로그램 작성
    if ~ else
    if(num<0) 
       JSP
    
       <%
           if(num<0)
           {
       %>
             <b>음수입니다</b>
       <%
           }
           else
           {
       %>
             양수입니다
       <%
           }
       %>
       
       <%  
           num<0?num+"는(은) 음수입니다":num+"는(은) 양수입니다"
       %>
 */
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.print("정수 입력:");
	        int num=scan.nextInt();
	        
	        if(num<0) // num>-1
	        	System.out.println(num+"는(은) 음수입니다");
	        else
	        	System.out.println(num+"는(은) 양수입니다");
	        // 한줄 표현 if~else=삼항연산자
	        System.out.println(num<0?num+"는(은) 음수입니다":num+"는(은) 양수입니다");
	        
	}

}
