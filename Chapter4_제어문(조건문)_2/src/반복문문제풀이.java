import java.util.Scanner;

public class 반복문문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  for(int i=1;i<=30;i++) 
		  { 
			  if(i%2==0) {
		                   System.out.printf("%5d",i); 
		                   if(i%3==0) 
		                	   System.out.println();  
		                  }
		  }
		 
		Scanner scan=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int num=scan.nextInt();
		//int a=num/10;
		//int b=num%10;
		if(num%11==0)
			System.out.println("10의 자리와 1의 자리가 같습니다");
		else
			System.out.println("10의 자리와 1의 자리가 같지 않습니다");
	}

}
