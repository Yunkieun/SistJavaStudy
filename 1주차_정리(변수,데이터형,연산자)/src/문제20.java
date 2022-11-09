/*
 *   //산술 대입 연산자 : +=, -=, *=, /=, %=                
		//연산 처리속도가 훨씬 빠르므로 사용 권장함                
		+= : 왼쪽과 오른쪽의 값을 더한 후 값을 왼쪽 공간(변수)에 대입                 
		-= : 왼쪽과 오른쪽의 값을 뺀 후 값을 왼쪽 공간(변수)에 대입                 
		= : 왼쪽과 오른쪽의 값을 곱한 후 값을 왼쪽 공간(변수)에 대입                 
		 /= : 왼쪽과 오른쪽의 값을 나눈 후 값을 왼쪽 공간(변수)에 대입                  
		%= : 왼쪽과 오른쪽의 값을 나누고 나머지 값을 왼쪽 공간(변수)에 대입                               
		int num = 12;                
		System.out.println("num : " + num);   //12                              
		num = num + 3;                
		System.out.println("num : " + num);  // 15                             
		num += 3;        //연산 속도가 더 빠름, 메모리에 직접 연산 수행                
		System.out.println("num : " + num);    // 18                       
		 num -= 5;        //num = num - 5;                
		System.out.println("num : " + num);    // 13                            
		num *= 2;        //num값 2배 증가                
		System.out.println("num : "+ num);  // 26                              
		num /= 2;        //num값 2배 감소               
		System.out.println("num : " + num);//13
 */
public class 문제20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;                
		System.out.println("num : " + num);   //12                              
		num = num + 3;                
		System.out.println("num : " + num);  // 15                             
		num += 3;        //연산 속도가 더 빠름, 메모리에 직접 연산 수행
		// 
		System.out.println("num : " + num);    // 18                       
		 num -= 5;        //num = num - 5;                
		System.out.println("num : " + num);    // 13                            
		num *= 2;        //num값 2배 증가    
		// num = num*2
		System.out.println("num : "+ num);  // 26                              
		num /= 2;        //num값 2배 감소      
		// num = num/2
		System.out.println("num : " + num);//13
	}

}
