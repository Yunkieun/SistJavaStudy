/*
 *  (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장하 고 1) 아래와 같이 출력하시오.
     1번 학생 : 100점  
     2번 학생 : 90점  
     3번 학생 : 85점  

     2) 학생들의 총점을 출력하시오.
     ---------------------------
     
     1. 배열 저장
         데이터형[] 배열명
         => 초기화
         int[] arr={1,2,3,4,5}
         int[] arr;
         arr={1,2,3,4,5} ==> 오류
         arr=new int[]{1,2,3,4,5}
         
         int[] arr=new int[10] ==> 가장 많이 사용
         ------ 클래스도 가능하다 ( 클래스도 변수의 일종 : 사용자 정의)       
     2. 배열 데이터 출력
     3. 배열에 있는 가공하는 문제
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장
		int[] score= {100,90,85};
		for(int i=0;i<score.length;i++)
		{
			System.out.println((i+1)+"번 학생 : "+score[i]);
		}
        // 총점을 저장하는 메모리가 필요
		int sum=0;
		for(int i:score)
		{
			sum+=i;
		}
		// 요청한 결과값을 출력
		System.out.println("총점:"+sum);
	}

}
