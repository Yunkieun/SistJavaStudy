import java.util.Scanner;

/*
 *  6. 0~9사이의 난수를 100개 발생해서 
       빈도를 구해서 출력하시오 
       예)
          0의 개수: 1
          1의 개수: 1
          ..
          9의 개수: 0
          
      ==============> 같은 용도인지 확인
      10개(int) 평균(double), 총점(int), 순위(int)
 */
/*
 *   1. 3명의 국어, 영어, 수학, 총점, 평균, 등수
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		// int[][] 성적=new int[3][5];
		double[] avg=new double[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"번째 국어 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 영어 입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 수학 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
					rank[i]++;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",
					kor[i],eng[i],math[i],total[i],avg[i]);
		}

	}

}
