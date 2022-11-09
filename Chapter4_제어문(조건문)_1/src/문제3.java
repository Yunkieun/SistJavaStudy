/*
 * 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!
 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int grade,score;
	        grade=(int)(Math.random()*4)+1;
	        Scanner scan=new Scanner(System.in);
	        System.out.print("정수 입력(0~100):");
	        score=scan.nextInt();
	        // if(score<0 || score>100){경고} else{}
	        // 가장 큰거 
	        if(score>=0 && score<=100)// 정상 입력
	        {
	        		if(grade==4)
	        		{
	        			if(score>=70)
	        				System.out.println("합격==>"+grade);
	        			else
	        				System.out.println("불합격==>"+grade);
	        		}
	        		else // 1,2,3
	        		{
	        			if(score>=60)
	        				System.out.println("합격==>"+grade);
	        			else
	        				System.out.println("불합격==>"+grade);
	        		}
	        }
	        else
	        {
	        	System.out.println("잘못된 입력입니다!!");
	        }
	}

}
