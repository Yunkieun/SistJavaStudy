/*
 *   16)	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 
 *   12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 
 *   출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.

결과)
달을 입력하세요(1~12) >> 9

 */
import java.util.Scanner;
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12) >> ");
        int month=scan.nextInt();
        
        /*if(month>=3 && month<=5)
        	System.out.println("봄");
        else if(month>=6 && month<=8)
        	System.out.println("여름");
        else if(month>=9 && month<=11)
        	System.out.println("가을");
        else if(month==12 || month==1 || month==2)
        	System.out.println("겨울");*/
        /*
         *   switch(문자,문자열,정수)
         *   {
         *     case '' , "" , 1:
         *        출력;
         *        break;
         *     default: 생략 
         *   }
         */
        // case 라벨: 라벨은 중복 사용이 불가능 
        // case 라벨 : 실수는 사용할 수 없다 ==> 게임 , 메뉴 <a>
        switch(month)
        {
        case 1:case 2:case 12:
        	System.out.println("겨울");
        	break;
        case 3:case 4:case 5:
        	System.out.println("봄");
        	break;
        case 6:case 7:case 8:
        	System.out.println("여름");
        	break;
        default:
        	System.out.println("가을");
        }
	}

}
