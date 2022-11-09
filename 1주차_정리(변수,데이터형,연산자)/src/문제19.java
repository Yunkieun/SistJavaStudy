/*
 *   Scanner sc = new Scanner(System.in);                                
		System.out.print("정수 하나 입력 : ");                
		int num = sc.nextInt();                             
		#1 
		num>=1 && num<=100 ==> 범위 포함   ==> 1~100사이의 수  
		System.out.println("1부터 100 사이인지 확인 : " + (#1));                               
		 //5~10 사이의 범위에 해당하지 않은 값이면 true 아니면 false를 리턴   
		#2 
		!(num>=5 && num<=10)           
		System.out.println("5부터 10 사이의 값이 아닌지 확인 : " + (#2));                                
		//영어 대문자냐?                
		//--> 문자변수 >= 'A' && 문자변수 <= 'Z'                
		System.out.print("문자 하나 입력 : ");                
		char ch = sc.next().charAt(0);   
		#3
		ch>='A' && ch<='Z    ==> ch>='a' && ch<='z'
		                     ==> ch>='가' && ch<='힣' [^가-힣]        
		System.out.println("영어 대문자인지 확인 : " + (#3));                                
		// || : 여러 값을 제시하고 그 중에 하나라도 맞는게 있는지 물어볼 때 사용                
		// 입력 문자가 대 소문자 상관 없이 'y' 혹은 'Y' 인지 물어볼 때               
		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요 : ");                
		char ch2 = sc.next().charAt(0);    
		#4
		ch2=='y' || ch2=='Y'            
		System.out.println("영문자 y 혹은 Y인지 확인 : " + (#4));  
		 // 알파벳 대문자 이거나 소문자인지 확인                
		System.out.print("문자 하나 입력 : ");                
		char ch3 = sc.next().charAt(0);
		 #5
		 !(ch>='A' && ch<='Z||ch>='a' && ch<='z')              
		 System.out.println("알파벳인지 확인 : " +($5));    
 */
public class 문제19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
