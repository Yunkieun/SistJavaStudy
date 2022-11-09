import java.util.Arrays;

public class 배열응용_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[10];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
        System.out.println(Arrays.toString(arr));
        // 정렬
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]<arr[j]) //꺽새 차이로 오름차순, 내림차순 정렬됨
        		{
        			char temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
	}

}
