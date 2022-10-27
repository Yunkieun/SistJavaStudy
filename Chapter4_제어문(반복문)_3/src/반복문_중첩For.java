/*
 *    1) 조건문 중첩 
 *       if(조건문)  ===> 로그인
 *       {
 *          if(조건문) ==> Admin
 *          {
 *             ==================> if(조건문 && 조건문) ==> Admin메뉴
 *          }
 *          else ==> User
 *          {
 *             =================> User메뉴
 *          }
 *          
 *       }
 *       else
 *       {
 *          Guest  =========> 일반 메뉴
 *       }
 *       
 *    2) 선택문 중첩 ====>게임 ,네트워크 ==> 웹(if)
 *       switch(변수)
 *       {
 *         case 값:
 *            switch(변수)
 *            {
 *              case 값:
 *            }
 *            break;
 *       }
 *    3) 반복문 중첩 
 *       ===========> for
 *       for()
 *       {
 *          for()
 *          {
 *          }
 *       }
 *       
 *       for()
 *       {
 *          while()
 *          {
 *          }
 *       }
 *       
 *       while()
 *       {
 *          for()
 *          {
 *          }
 *       }
 *       
 *       while()
 *       {
 *          while()
 *          {
 *          }
 *       }
 *       ========================================
 *       이중 for문 
 *       변수
 *       for()   ======> 줄수
 *       {
 *          변수
 *          for()
 *          {
 *             변수
 *             실제 출력물 
 *          }
 *          \n
 *       }
 *       
 *       A
 *       AB
 *       ABC
 *       ABCD  
 *       ABCDE
 *       ABCDEF
 *       
 *       -------------------
 *       *
 *       **
 *       ***
 *       ****
 *       
 *       ****
 *       ***
 *       **
 *       *
 *       
 *        *
 *       ***
 *      *****
 *     *******
 *     
 *     ===========>  변수위치 
 *     
 *     *****
 *     *****
 *     *****
 *     *****
 *     *****
 *      
 *      형식)              | false ==> for종료
 *                 1     2    7
 *            for(초기값;조건식;증가식)
 *            {
 *                       | true 
 *              ------------------------
 *                          | false ==> 1차 for의 증가식 
 *                    3 ->  4  <-  6
 *               for(초기값;조건식;증가식)
 *               {
 *                      | true  ↗
 *                   실행문장 5
 *               }
 *              ------------------------
 *            }
 *            
 *            ==>  for(int i=1;i<=10;i++)
 *                 {
 *                    for(int j=1;j<=10;j++)
 *                    {
 *                    }
 *                 }
 *                 
 *                 i=1  ==> j=1,2,3
 *                 i=2  ==> j=1,2,3
 *                 i=3  ==> j=1,2,3
 *                 i가 false종료
 */
public class 반복문_중첩For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("★★★★★");
        System.out.println("★★★★★");
        System.out.println("★★★★★");
        System.out.println("★★★★★");
        System.out.println("★★★★★");
        // 1차 for
        for(int i=1;i<=5;i++)
        	System.out.print("☆");
        System.out.println();
        for(int i=1;i<=5;i++)
        	System.out.print("☆");
        System.out.println();
        for(int i=1;i<=5;i++)
        	System.out.print("☆");
        System.out.println();
        for(int i=1;i<=5;i++)
        	System.out.print("☆");
        System.out.println();
        for(int i=1;i<=5;i++)
        	System.out.print("☆");
        System.out.println();
        
        System.out.println("2차 For문 이용");
        // 줄수 ==> 5
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
            	System.out.print("★");
        	System.out.println();
        }
	}

}
