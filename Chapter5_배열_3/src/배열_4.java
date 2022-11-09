import java.util.Arrays;
import java.util.Scanner;
/*
 *   1. 데이터 저장 : 변수 , 배열
 *   2. 초기화
 *   3. 제어 (사용자 요청) ===>
 *   4. 제어 결과값 출력 ===>
 *   
 *   데이터저장 == 데이터 가공 === 출력 (도스 , 브라우저 , 모바일)
 *                 |
 *               메소드화
 */

// => O , X ==> 10개 저장
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] munje=new char[10];
		char[] user=new char[10];
		for(int i=0;i<munje.length;i++)
		{
			int a=(int)(Math.random()*2);
			if(a==0)
				munje[i]='O';
			else
				munje[i]='X';
		}
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++) // 증가돼서 나옴
		{
			System.out.print((i+1)+"번째 O,X입력:");
			char dap=scan.next().charAt(0);
			if(!(dap=='O' || dap=='X'))
			{
				System.out.println("잘못된 입력입니다!!");
				i--;       // 감소시켜줘야 원래값으로 되돌림
				continue; // 증가식으로 올라간다
			}
			user[i]=dap;
		}
		System.out.println(Arrays.toString(munje));
        System.out.println(Arrays.toString(user));
        // 확인
        int count=0;
        for(int i=0;i<user.length;i++)
        {
        	if(munje[i]==user[i])
        		count++;
        }
        System.out.println("정답:"+count+"개 입니다");
	}

}
