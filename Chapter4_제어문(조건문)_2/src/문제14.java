// 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=10;i++)
        {
        	//if(!(i%3==0)) // i%3!=0 ==> 제외
        		//System.out.print(i+" ");
        	if(i%3==0)
        		continue;
        	System.out.print(i+" ");
        }
	}

}
