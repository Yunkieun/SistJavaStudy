import java.util.Arrays;
/*
 *  배열, 클래스 ==> 참조 변수 (메모리 주소)
 *     배열    실제값
 *   (Stack) (Heap)
 *  기본형 ==> 메모리 자체
 */

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		//    ---
		int[] copy=new int[arr.length]; 
		//    ---- 데이터가 저장된 주소를 저장하고 있다(참조변수)
		
		for(int i=0;i<arr.length;i++)
		{
			copy[i]=arr[i];
		}
		// copy=arr
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
		
        copy[0]=100;
        System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
        
	}

}
