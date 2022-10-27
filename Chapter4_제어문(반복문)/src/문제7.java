// 5~16까지의 합을 구하시오
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        // 시작점     끝나는 점 몇개증가   i++ , i+=2 , i+=3.... 
        for(int i=5;i<=16;i++)
        {
        	sum+=i;
        }
        
        System.out.println("sum="+sum);
	}

}
