/*
 *    public  static void main(String[] arg) 
      {  
		   int a;   
		   int b;   
		   a=3;   
		   b=a+5;       
		   System.out.printf("a의 값: %d \n", a);   
		   System.out.printf("b의 값: %d \n", b);   
      }
      변수의 초기화 
      = 명시적인 초기화 
        int a=10;
      = 입력값을 받아서 처리 
        int a=scan.nextInt() 
        ==> 웹,윈도우 (입력창=>입력값)
      = 난수 발생 
        Random r=new Random();
        int a=r.nextInt(100)+1; 1~100
      = 이미 저장된 변수의 값을 대입 
        int a=10;
        int b=a;
        int c=b;
      = 연산처리 
        int a=1024*1024*100; ==> 업로드 (총크기) ==> 100M
        int total=60*60*24 
      ==> 변수를 설정하면 
          멤버변수 (클래스 영역에 선언되는 변수) => 자동 초기화 (int a; ==> a=0)
          **지역변수 (메소드 영역에 선언되는 변수) => 자동 초기화(X) => 사용하기 전에 반드시 초기화 
          ** 변경할 수 있는 값 ==> 임의로 설정 => 나중에 값을 변경해서 사용 
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name=JOptionPane.showInputDialog("이름");
        //System.out.println(name);
		   int a=3;   
		   int b=a+5;        
		   System.out.printf("a의 값: %d \n", a);   
		   System.out.printf("b의 값: %d \n", b); 
	}

}
