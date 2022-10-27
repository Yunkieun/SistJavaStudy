/*
 *   6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
     끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
     
     for(int i=10;i<=5;i++)

 */
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int start=0,end=0;
        int gop=1;
        // 오류 처리
        while(true)
        {
        	System.out.print("시작 입력:");
        	start=scan.nextInt();
        	System.out.print("끝 입력:");
        	end=scan.nextInt();
        	if(start<end)
        		break; // 종료
        }
        
        for(int i=start;i<=end;i++)
        {
        	gop*=i;
        }
        System.out.println("gop="+gop);
        
	}

}
