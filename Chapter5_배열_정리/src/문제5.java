import java.util.Arrays;

/*
 *  5. 1~100사이의 정수를 10개 저장하고  
       정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장
       정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장

 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 짝수/홀수합
		int even=0,odd=0;
		for(int i:arr)
		{
			if(i%2==0)
				even+=1;
			else
				odd+=i;
		}
		System.out.println("짝수의 합:"+even);
		System.out.println("홀수의 합:"+odd);

	}

}
