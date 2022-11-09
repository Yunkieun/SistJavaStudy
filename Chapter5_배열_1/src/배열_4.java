// 초기화 ==> 사용자 입력 ==> 배열 : 같은 데이터형을 모아서 관리
// 기능별로 모아서 처리
/*
 *  과일
 *  --- 종류별 사과, 배...
 *  
 *  3명의 학생 ==> 국어, 영어, 수학 점수를 입력을 받아서 총점, 평균, 학점을 출력
 *  --------------------------------------------------------------
 *  변수 18개
 *  배열 6개 => 국어, 영어, 수학, 총점, 평균, 학점 ==> 인덱스 0,1,2
 */
import java.util.Scanner;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어 3개 저장 공간
		int[] kor=new int[3];
		// 영어 3개 저장 공간
		int[] eng=new int[3];
		// 수학
		int[] math=new int[3];
		// 총점
		int[] total=new int[3];
		// 평균
		double[] avg=new double[3];
		// 학점
		char[] score=new char[3];
		// 라이브러리 (자바제공) ==> 70%, 사용자 정의 20% ==> 10% Jsoup
		Scanner scan=new Scanner(System.in);
		//점수를 부여
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"번째 국어점수 입력:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어점수 입력:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학점수 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
		}
		// 학점
		for(int i=0;i<3;i++)
		{
			// 88/10 8 80/10 8 => B
			switch((int)(avg[i]/10)) // 정수, 문자, 문자열 ==> double
			{
			case 10: case 9:
			    score[i]='A';
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
		    default:
		    	score[i]='F';
					
			}
		}
		// 출력 ==> 배열 1개에 있는 값만 출력이 가능 ==> 배열 5개 동시에 출력 (일반 => 인덱스)
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%7.2f\n",kor[i],eng[i],math[i],total[i],avg[i],score[i]);
		}

	}

}
