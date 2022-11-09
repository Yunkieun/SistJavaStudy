/*
 *   구현 내용 : 
 *             국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
 *             각 점수를 키보드로 입력받고,
 *             합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
 *             세 과목의 점수와 평균을 가지고 합격 여부 처리함
               <합격의 조건 >
               세 과목의 점수가 각각 40점이상이면서,
               평균이 60점 이상이면 합격, 아니면 불합격 처리함
 */
import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.print("국어 점수 입력:");
	        int kor=scan.nextInt();
	        
	        System.out.print("영어 점수 입력:");
	        int eng=scan.nextInt();
	        
	        System.out.print("수학 점수 입력:");
	        int math=scan.nextInt();
	        
	        int total=kor+eng+math;
	        double avg=total/3.0;
	        
	        System.out.println("총점:"+total);
	        System.out.printf("평균:%.2f\n",avg);
	        System.out.println((kor>40 && eng>40 && math>40 && avg>60)?"합격":"불합격");
	}

}
