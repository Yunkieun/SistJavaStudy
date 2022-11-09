/*
 *   다중조건문 (해당 조건문 1개만 수행) ==> 141page
 *   1)형식 
 *     if(조건문)
 *     {
 *       조건 true일때만 수행하는 문장 ↗ 종료
 *       
 *           ↓false
 *     }
 *     else if(조건문)
 *     {
 *       조건 true일때만 수행하는 문장 ↗ 종료
 *       
 *           ↓false
 *     }
 *     ...
 *     ...
 *     else
 *     {
 *        //생략이 가능
 *        해당 조건이 없는 모든 내용을 수행
 *     }
 *     
 *     1~100까지의 정수중 3의 배수, 5의배수, 7의배수를 출력
 *                     ------------------------- 단일 조건문 사용 (15의 경우 중복)
 */
public class 제어문_다중조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=(int)(Math.random()*51); //0~100사이
        //            ------------------ 0.0~100.0 ==> 0~100
		int eng=(int)(Math.random()*51);
		int math=(int)(Math.random()*51);
		
		int avg=(kor+eng+math)/3;
		
		char hakjum='A';
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else
			hakjum='F';
		
		
		//if여러개 사용 ==> 여러번 수행(단일 조건문 여러개), 한번만 수행(다중 조건문)
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("학점:"+hakjum);
				
		
	}

}
