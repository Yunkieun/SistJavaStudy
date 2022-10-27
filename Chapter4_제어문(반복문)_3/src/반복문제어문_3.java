/*
 *     1. 컴퓨터 가위바위보 
 *        ------------- 계속 진행 ===> q/Q
 */
import java.util.Scanner;
public class 반복문제어문_3 {
    // 종료 => break , continue => 잘못된 입력 (경고)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int win=0,lose=0,same=0;
        int count=0; // 게임 횟수 
        //new ==> 메모리가 공간이 다르다 
        Scanner scan=new Scanner(System.in);
        
        while(true)
        {
        	 // 난수 발생 ==> 게임 시점 ==> 0(가위),1(바위),2(보)
        	 int com=(int)(Math.random()*3); // 0~2
        	 // ==> 웹 (예약일) 0.0~0.99 ==> 0.0~2.999  ==> 0~2
        	 System.out.print("가위(0),바위(1),보(2):");
        	 int user=scan.nextInt();
        	 if(user<0 || user>2)// 잘못된 입력
        	 {
        		 System.out.println("가위(0),바위(1),보(2)를 입력하세요!!");
        		 continue;// 처음부터 다시 실행 ==> while의 조건문으로 이동 
        	 }
        	 count++;// 게임 횟수 
        	 // 결과값 
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
        	 
        	 // 확인 
        	 /*
        	  *                         com-user
        	  *    com    user
        	  *  0(가위)     0 (가위)      0 (s)
        	  *            1 (바위)     -1  u-w
        	  *            2 (보)      -2  c-w
        	  *    com    user
        	  * 1(바위)      0(가위)    1    c-w
        	  *            1(바위)     0    s
        	  *            2(보)      -1   u-w
        	  *    com    user
        	  * 2(보)      0(가위)      2   u-w
        	  *            1(바위)      1  c-w
        	  *            2(보)        0 s
        	  *  ----------------------------------> user ==> -1,2
        	  *  ----------------------------------> com  ==> -2,1
        	  */
        	 // 10전 4승 2무 4패
        	 switch(com-user)
        	 {
        	 case -1: case 2:
        		 System.out.println("사용자 Win!!");
        		 win++;// 이긴 횟수
        		 break;
        	 case -2: case 1:
        		 System.out.println("컴퓨터 Win!!");
        		 lose++; // 진 횟수
        		 break;
        	 case 0:
        		 System.out.println("비겼다");
        		 same++; // 비긴 횟수 
        	 }
        	 
        	 // 종료 확인 
        	 System.out.print("게임을 종료할까요?(y/n):");
        	 char c=scan.next().charAt(0); // Scanner로 문자한개 받기 
        	 if(c=='y' || c=='Y')
        	 {
        		 System.out.println("Game Over!!");
        		 break; // while을 종료
        	 }
        	 
        }
        // 게임 종료 여부 확인 
        System.out.printf("%d전 %d승 %d무 %d패\n",count,win,same,lose);
        
	}

}





