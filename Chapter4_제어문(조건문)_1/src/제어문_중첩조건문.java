/*
 *    중첩조건문 (이중 if)
 *    if(조건문 && 조건문)
 *    if(조건문)
 *    {
 *       if(조건문)
 *       {
 *       }
 *    }
 *    
 *    컴퓨터 => 가위바위보 
 *    
 *    컴퓨터      사용자 
 *     가위       가위     가위 && 가위
 *               바위
 *               보
 *     바위       가위
 *               바위
 *               보
 *     보        가위
 *              바위
 *              보 =============> 3개로 변경 (알고리즘)
 */
// ==> 가정 가위(0),바위(1),보(2)
import java.util.Scanner;
public class 제어문_중첩조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        //malloc(sizeof()) ==> 승격 (연산자) 
	        System.out.print("가위(0),바위(1),보(2):");
	        int user=scan.nextInt();
	        
	        // 컴퓨터 
	        int com=(int)(Math.random()*3); //0,1,2
	        
	        // 확인 
	        if(com==0)
	        	System.out.println("컴퓨터:가위");
	        else if(com==1)
	        	System.out.println("컴퓨터:바위");
	        else if(com==2)
	        	System.out.println("컴퓨터:보");
	        
	        if(user==0)
	        	System.out.println("사용자:가위");
	        else if(user==1)
	        	System.out.println("사용자:바위");
	        else if(user==2)
	        	System.out.println("사용자:보");
	        // 결과값
	        /*
	         *      com      user  => com-user(*,/,%,-,+)
	         *     컴퓨터     사용자
	         *      가위(0)    가위(0)  0
	         *                바위(1) -1  ===> P
	         *                보(2)  -2   ===> C
	         *      ----------------
	         *      바위(1)    가위(0) 1   ===> C
	         *                바위(1) 0
	         *                보(2)  -1   ==> P
	         *      ----------------
	         *      보(2)    가위(0)  2    ==> P
	         *                바위(1) 1    ==> C
	         *                보(2)  0
	         *                
	         *            com ==> -2 , 1
	         *            play ==> -1 , 2
	         */
	        int res=com-user;
	        if(res==-2 || res==1)
	        	System.out.println("컴퓨터 Win!!");
	        else if(res==-1 || res==2)
	            System.out.println("사용자 Win!!");
	        else
	        	System.out.println("비겼다!!");
	        /*if(com==0)// 가위
	        {
	        	if(user==0) //가위
	        		System.out.println("비겼다!!");
	        	else if(user==1) //바위
	        		System.out.println("사용자 Win!!");
	        	else if(user==2) //보
	        		System.out.println("컴퓨터 Win!!");
	        }
	        
	        else if(com==1)// 바위
	        {
	        	if(user==0) //가위
	        		System.out.println("컴퓨터 Win!!");
	        	else if(user==1) //바위
	        		System.out.println("비겼다!!");
	        	else if(user==2) //보
	        		System.out.println("사용자 Win!!");
	        }
	        
	        else if(com==2)// 보
	        {
	        	if(user==0) //가위
	        		System.out.println("사용자 Win!!");
	        	else if(user==1) //바위
	        		System.out.println("컴퓨터 Win!!");
	        	else if(user==2) //보
	        		System.out.println("비겼다!!");
	        }*/
	

	}

}

