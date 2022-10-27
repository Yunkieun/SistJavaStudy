/*
 *  12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램

 */
public class 문제12 {
     // 갯수 : ++ , 누적 +=
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count3=0,count5=0;
        for(int i=0;i<=10;i++)
        {
        	int num=(int)(Math.random()*100)+1;
        	System.out.println("num="+num);
        	
        	if(num%3==0)
        		count3++;
        	if(num%5==0)
        		count5++;
        }
        
        System.out.println("count3="+count3);
        System.out.println("count5="+count5);
	}

}
