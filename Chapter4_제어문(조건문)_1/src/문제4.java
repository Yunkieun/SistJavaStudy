/*
 *  사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
         합계와 평균을 구해보자.
 */
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=(int)(Math.random()*100)+1;
	        int b=(int)(Math.random()*100)+1;
	        int c=(int)(Math.random()*100)+1;
	        
	        System.out.println("a="+a+",b="+b+",c="+c);
	        
	        int max=a;
	        if(max<b) max=b;
	        if(max<c) max=c;
	        System.out.println("최대값:"+max);
	        
	        int min=a;
	        if(min>b) min=b;
	        if(min>c) min=c;
	        System.out.println("최소값:"+min);
	        
	        int total=a+b+c;
	        double avg=total/3.0;
	        
	        System.out.println("총합:"+total);
	        System.out.printf("평균:%.2f",avg);
	}

}
