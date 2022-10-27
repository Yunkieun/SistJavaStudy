/*
 *   자바 지원하는 조건문 (1.형식 , 2. 순서 , 3. 응용 => 사용처) 
 *   ---------------
 *     1) 단일 조건문 
 *        1. 형식 
 *           if(조건문) =================> true/false :  부정연산자 , 비교연산자 , 논리연산자 
 *             조건이 true일때 실행문장 (실행문장이 1개일때)
 *            
 *           **조건이 true일때 실행문장이 여러개 
 *           if(조건문)
 *           {
 *              => 기본 제어문 바로 밑에 있는 문장만 수행 
 *           }
 *           
 *           ----------------
 *           if(조건문)
 *             실행문장 1
 *           ----------------
 *             실행문장 2 => if와 관련없는 문장 
 *             실행문장 3 => if와 관련없는 문장
 *             
 *           ==> ==,!=, < , > , <= , >=
 *               ----------------------- 정수형 , 실수형 , 문자형 
 *               ----- 논리형(boolean)
 *               -----------------------------------------------------------------------
 *               "" =>  문자열 (equals , compare) => 0(==) , 음수(>) , 양수(<) ==> 문자열 정렬 
 *                            ------ equals() ==
 *                                   !equals()
 *               -----------------------------------------------------------------------
 *           && : 범위안에 포함 
 *           || : 범위밖에 있는 경우 
 *             
 *     2) 선택 조건문 (웹에서 가장 많이 사용)
 *                  => 로그인인 된 상태 / 로그인이 안된 상태 (회원가입 , 로그인창)
 *                     => main으로 이동 
 *                  => 회원 가입 => 가입 / 취소
 *                  => 아이디 중복 
 *                  => 아이디 찾기 / 비밀번호 찾기
 *            필요시에만 수행 ==> 필요없는 경우에는 건너뛴다
 *         1. 형식 
 *            if(조건문)
 *            {
 *                조건문이 true일때 처리하는 문장 
 *            }
 *            else
 *            {
 *                조건문이 false일때 처리하는 문장 
 *            }
 *     3) 다중 조건문 
 *         1. 형식 
 *            if(조건문) ==> +
 *            {
 *                true => 문장수행을 하고 종료
 *                false => 밑에 있는 조건으로 이동 
 *                     ↓
 *            }
 *            else if(조건문) ==> -
 *            {
 *                true => 문장수행을 하고 종료
 *                false => 밑에 있는 조건으로 이동 
 *                    ↓
 *            }
 *            else if(조건문) ==> *
 *            {
 *                true => 문장수행을 하고 종료
 *                false => 밑에 있는 조건으로 이동 
 *                    ↓
 *            }
 *            else if(조건문) ==> /
 *            {
 *                true => 문장수행을 하고 종료
 *                false => 밑에 있는 조건으로 이동 
 *                    ↓
 *            }
 *            else
 *            {
 *                해당 조건이 없는 경우에 수행되는 문장 (default) ==> 생략이 가능 
 *                경고 
 *            }
 *     3-1) 중첩 if  ==> &&  ===> 게임 
 *          int a=10;
 *          int b=20;
 *          if(a==10 && b==20)
 *          
 *          if(a==10)
 *          {
 *             if(b==20)
 *             {
 *                실행 문장 
 *             }
 *          }
 *          
 *          웹
 *            if(로그인이 되었다면)  ==> 메뉴변경 , 권한(Security) 
 *            {
 *               if(어드민)
 *               {
 *               }
 *               else
 *               {
 *                  사용자라면 
 *               }
 *            }
 *            
 *            1. 가독성 
 *            2. 최적화 
 *            3. 간결화
 *            ---------- 
 *     4) 선택문 : 조건을 제시하는 것이 아니라 ==> 값을 한개 선택 (키보드, 점수...) : 네트워크 , 게임 , 메뉴 처리 
 *        page 146
 *        형식)
 *             switch(정수/문자/문자열) ==> 다중조건문과 비슷 
 *             {
 *                case 값:
 *                  처리문장 
 *                case 값:
 *                  처리문장
 *                case 값:
 *                  처리문장
 *             }
 *             
 *             no=1
 *             switch(no)
 *             {
 *                case 1:
 *                  처리문장 1;
 *                  break;
 *                case 2:
 *                  처리문장 2;
 *                  break;
 *                case 3:
 *                  처리문장 3;
 *                case 4:
 *                  처리문장 4;
 *                  break;
 *                default: 해당 번호가 없는 경우에 사용 ==> 생략이 가능 
 *             }
 *             
 *             ==> 1,2,3,4 수행을 한다 
 */
// 4칙 연산 , 학점 
import java.util.Scanner;
public class 조건문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // + , - , * , / 
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		switch(scan.next())// 문자열 ==> 정수 , 문자 '', 문자열 "" 
		{
		   case  "+":
			   System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			   break;//switch종료 
		   case "-":
			   System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			   break;
		   case "*":
			   System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			   break;
		   case "/":
			   if(num2==0)
				   System.out.println("0으로 나눌 수 없습니다!!"); // 오류 처리 
			   else
				   System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
			   break;
			default:
				System.out.println("+,-,*,/를 입력하세요!!");
			   
		}
		
	}

}





