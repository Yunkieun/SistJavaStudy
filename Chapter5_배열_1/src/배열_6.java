import java.util.Arrays;

/*
 *  1. 선언
 *      알파벳 대문자 전체를 저장 ==> 선언 ==> 시작과 동시에 메모리를 확보
 *      char[] alpha=new char[26]
 *      정수를 10개 저장
 *      int[] arr=new int[10];
 *      실수를 10개 저장
 *      double[] arr=new double[10];
 *      true/false => 10개 => 빈공백
 *      boolean[] seat=new boolean[100]
 *      ---------          ------------ 메모리 저장 개수 지정 => 자동 초기화      
 *  2. 초기화
 *      1) 명시적인 초기화
 *         정수 5개 저장
 *         int[] arr={10,20,30,40,50};
 *         int[] arr=new int[5];
 *         arr[0]=10;
 *         arr[1]=20;
 *         ..
 *         ..
 *      2) 난수 ==> 로또
 *         int[] arr=new int[5];
 *         arr[0]=(int)(Math.random()*100)
 *         ..
 *         ..
 *      3) 입력값
 *         int[] arr=new int[3];
 *         arr[0]=scan.nextInt()
 *         ..
 *         ..
 *      4) 웹에 데이터 읽기 : Jsoup ==> 예외처리, String
 *  3. 출력
 *      일반 for ==> 데이터 변경이 가능 (인덱스번호를 이용해서 변경)
 *      for(int i=0;i<개수;i++)
 *      {
 *         앞에서부터 ~~
 *      }
 *      for(int i=개수-1;i>=0;i--)
 *      {           
 *         뒤에서부터 ~~ ===> 거꾸로 출력, 이진법 (진법)
 *      }
 *      forEach(향상된 for) ==> jdk1.5이상 ==> readonly(읽기전용)
 *      ==> 값을 읽을때 0번부터
 *      데이터형[] arr=new 데이터형[10]
 *      -------
 *            =
 *           -------
 *         for(데이터형 변수명:배열명) : 출력용으로 주로 사용
 *         {               ----- 배열명 ==> 실제 저장된 데이터를 읽어 온다
 *         
 *         }
 *  4. 배열개수
 *     배열명.length
 *  --------------------- 관련된 데이터
 */
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char[] alpha={'A','B'...}
		char[] alpha=new char[26];
		//초기화
		char c='A';
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=c;
			c++;
		}
        // 출력
		for(char ch:alpha) // 데이터 변경이 불가능 (배열에 저장된 데이터)
		{
			//ch=(char)(ch+32);
			System.out.print(ch);
		}
		// 값을 소문자로 변경
		System.out.println();
		//배열에 있는 데이터를 변경 ==> 인덱스
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)(alpha[i]+32);
		}
		/*
		 *  char c='A';
		 *  c='a'
		 */
		//System.out.println(alpha[0]);
		/*
		 *  배열에 있는 실제 데이터값 변경 ==> 인덱스를 이용한다 => for문은 일반 for문
		 *  배열에 있는 실제 데이터값만 읽을때 ==> for문은 forEach (실제 데이터 변경이 불가능) readonly
		 *  예외) 클래스는 값을 변경할 수 있다
		 */
		System.out.println();
		// 정수 30개 저장 (0,1,2)
		int[] arr=new int[30];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*3);
		}
		System.out.println(Arrays.toString(arr));
		// 빈도수 구하기 (통계)
		int a=0,b=0,d=0;
		for(int i:arr)
		{
			if(i==0) a++;
			else if(i==1) b++;
			else if(i==2) d++;
		}
		System.out.println("0=>"+a);
		System.out.println("1=>"+b);
		System.out.println("2=>"+d);
	}

}
