import java.util.Arrays;

public class 배열응용_9 {
  // page 204 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10); //0~9
		}
		System.out.println(Arrays.toString(arr));
		// 빈도를 저장하는 배열 (0~9)
		int[] result=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			result[arr[i]]++; //주의
		}
        // 출력
		for(int i=0;i<result.length;i++)
		{
			System.out.println(i+"=>"+result[i]);	
		}
	}

}
