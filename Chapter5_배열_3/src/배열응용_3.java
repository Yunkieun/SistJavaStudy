// 숫자 야구 게임
/*
 *  765 => 167 ==>1S-1B ==> 3S 나오면 종료
 */
// 사용자가 입력
import java.util.Arrays;
import java.util.Scanner;
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   1. 난수 ==> 정수 3개 ==> 중복없는 난수 ==> int => 3개
		 *   2. 사용자 입력
		 *   3. 비교
		 *   4. 힌트
		 *      S:●
		 *      B:○○
		 *   5. 종료 여부 확인
		 */
		// 변수 => 난수 , 사용자 입력
		int[] com=new int[3]; // 게임에 필요한 난수 저장
		int[] user=new int[3]; // 사용자 입력값 저장
		// 중복없는 난수 ==> 예약
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1~9 사이의 난수 발생
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		int count=0;
		//System.out.println(Arrays.toString(com));
	    Scanner scan=new Scanner(System.in);
        while(true)
        {
        	// 사용자 입력을 받는다
        	System.out.print("세자리 정수를 입력하세요:");
        	int input=scan.nextInt();
        	// 오류 처리
        	if(input<100 || input>999)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue; // 조건식으로 이동 ==> 처음부터 다시 시작한다
        	}
        	// 배열에 저장 
        	/*
        	 *  765/100 ==> 7
        	 *  765%100 ==> 65/10 ==> 6
        	 *  765%10  ==> 5
        	 */
        	user[0]=input/100;
        	user[1]=(input%100)/10;
        	user[2]=input%10;
        	
        	// 오류 처리
        	// 1. 같은 수를 입력(X) , 0을 입력하면 안된다
        	if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
        	{
        		System.out.println("같은 수는 사용할 수 없습니다!!");
        		 continue;
        	}
        	
        	if(user[0]==0 || user[1]==0 || user[2]==0)
            {
	            System.out.println("0은 사용할 수 없습니다!!");
	            continue;
            }
        	
        	int s=0,b=0; // s=> 같은 자리에 , b=다른 자리에
        	// 비교
        	for(int i=0;i<3;i++) // com
        	{
        		for(int j=0;j<3;j++) // user
        		{
        			if(com[i]==user[j])
        			{
        				if(i==j)
        					s++;
        				else
        					b++;
        			}
        		}
        	}
        	// 힌트
        	//System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
        	System.out.println("======힌트======");
        	System.out.print("S:");
        	for(int i=0;i<s;i++)
        	{
        		System.out.print("●");
        	}
        	System.out.print("\nB:");
        	for(int i=0;i<b;i++)
        	{
        		System.out.print("○");
        	}
        	System.out.println("\n===============");
        	// 종료여부 확인
        	if(s==3)
        	{
        		System.out.println("Game Over!!");       		
        		break;
        	}
        }
	}

}
