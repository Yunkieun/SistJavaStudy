/*
 *     ★
 *     ★★
 *     ★★★
 *     ★★★★
 *        i     j    i=j  ==> j=i
 *       줄수   별표
 *        1     1
 *        2     2
 *        3     3
 *        4     4    
 *     ★★★★
 *     ★★★
 *     ★★
 *     ★
 *       i    j   ==> i+j=5  ==> j=5-i
 *      줄수  별표
 *       1    4
 *       2    3
 *       3    2
 *       4    1
 *   -------------------------
 *     A
 *     BC
 *     DEF
 *     GHIJ
 *     
 *     A
 *     AB
 *     ABC
 *     ABCD
 *     
 *     
 *     
 */
import java.util.Scanner;
public class 반복문_중첩For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		//System.out.print("정수 입력:");
		//int n=scan.nextInt();
		// 1. 변수위치
		
        for(int i=1;i<=4;i++) // 정렬 , 빈도 구하기 , 통계 , 순위 결정 ==> 배열 
        {
        	char c='A';
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(c++);
        	}
        	System.out.println();
        }
	}

}
