import java.util.Arrays;

// concat : 문자열 결합
// 문자열.concat(문자열) ==> 문자열 + 문자열
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   int a=10;
		 *   a=5;
		 *   ===> 10에서 5로 값이 바뀌고 저장까지됨
		 *   String s1="Hello";
		 *   s1="lo";
		 *   ===> Hello에서 lo로 값이 바뀌고 저장까지됨
		 */
		String s1="Hello";
		String s2="Java!!";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		// 문장열 ==> 기능 수행 ==> 문자열 변경하지 않는다
		System.out.println(s1);
		s1=s1.substring(3);
		System.out.println(s1);
		
		String msg="Hello Java";
		// a=>b ==> Hello Jbvb (최종결과값)
		System.out.println(msg.replace("a", "b"));
		
		String msg1="홍길동 version 2!!"; // 드라마 |102분|
		System.out.println(msg1.replaceAll("[^가-힣]", ""));
		// [가-힣] [A-Za-z] [0-9] (제외하고 싶을땐 ^ 사용)
		System.out.println(msg1.replaceAll("[^A-Za-z]", ""));
		System.out.println(msg1.replaceAll("[^0-9]", ""));

		String movie="범죄, 스릴러 |한국 |105분 |2022 .10.26 개봉";
		String[] m=movie.split("\\|"); // ^ , | , ? , . , + , \\*
		//                      -- \\사용해야 가능
		System.out.println(Arrays.toString(m));
	}

}
