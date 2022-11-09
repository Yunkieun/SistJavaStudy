/*
 *   252page
 *   **메소드
 *     1) 인스턴스 메소드 : 인스턴스 변수를 이용할 때 
 *     2) 정적 메소드, 공유 메소드 (static) : 인스턴스 변수를 이용하지 않을 경우에 주로 사용
 *     예)
 *        String s="Hello Java!!";
 *        s.subsring()
 *        String.ValueOf(10)
 *        
 *        class Member
 *        {
 *           String id,pwd; // Heap
 *           boolean isLogin(String id,String pwd) // Stack
 *           {
 *              this.id / id
 *           }
 *           구구단을 출력
 *           static void gugudan()
 *           {
 *           }
 *        }
 *     
 *     *** static : 공유
 *     *** instance : 개인
 *     =========================> 메소드 (static , instance)
 *   1. 메소드 선언
 *      1) 인스턴스
 *          리턴형 메소드명(매개변수...)
 *          {
 *             return 값; ==> 생략이 가능 ==> 결과값 (없는 경우 => void => return 생략 가능)
 *          }
 *      2) 정적 (static)
 *          static 리턴형 메소드명 (매개변수...)
 *          {
 *             return 값;
 *          }
 *   2. 메소드 호출 방식 ===========> 메소드는 메모리 저장을 해서 사용 
 *      1) 인스턴스 : new를 메소드가 저장 된다
 *         A a=new A();
 *             --- a가 메모리 주소의 별칭 => a라는 공간에 메소드, 변수
 *             예)
 *                class A
 *                {
 *                   int a;
 *                   String name
 *                   
 *                   void insert(int age, String name)
 *                   {
 *                   }
 *                   void update(int age, String name)
 *                   {
 *                   }
 *                   void list()
 *                   {
 *                   }
 *                }
 *                
 *                A a=new A();
 *                
 *                 a==> -----------------
 *                            age
 *                      -----------------
 *                            name
 *                      -----------------
 *                           insert()
 *                      -----------------
 *                           update()
 *                      -----------------
 *                            list()
 *                      -----------------
 *                      
 *                  a.age , a.insert() , a.update , a.list()
 *                  ---------------------------------------- 인스턴스변수, 인스턴스메소드
 *                      
 *      2) 정적 (static) : 컴파일러에 의해서 메모리 저장
 *         class A
 *         {
 *            static int a;
 *            static void list(){}
 *            -------------------------- 저장이 완료
 *         }
 *         클래스명.a , 클래스명.list()
 *         ----------------------- 클래스변수, 클래스메소드
 *         
 *         라이브러리 ==> 클래스명.메소드()
 *                     Math.random() , String.valueOf()
 *   3. 리턴형 / 매개변수 (사용자 => 클릭 , 선택 , 입력 : 주소창) ==> 파일명?
 *      ----   ------
 *      화면출력
 *      
 *      리턴형 : 기본형 (int , double..) , 배열 , 클래스
 *             
 *      매개변수 : 기본형 (int , double..) , 배열 , 클래스
 *              ----------------------  ------------
 *               Call By Value(값)       Call By Reference(주소)
 */
class Names{
	String name1;
	String name2;
}
public class 메소드_1 {
  // 메소드 선언 ==> 같은 메소드를 사용해서 출력 => 오버로딩 : 같은 클래스에서 같은 메소드를 이용해서 새로운 기능 첨부
  // 메소드명이 동일 , 매개변수의 갯수 , 데이터형이 다르면 ==> 다른 메소드로 인식을 한다
  void swap(int a,int b)
  {
	  int temp=a;
	  a=b;
	  b=temp;
	  System.out.println("swap:a="+a+",b="+b);
  }
    void swap(String name1,String name2)
    {
      String temp=name1;
      name1=name2;
      name2=temp;
      System.out.println("swap:name1="+name1+",name2="+name2);
    }
    void swap(String[] names)
    {
    	String temp=names[0];
    	names[0]=names[1];
    	names[1]=temp;
    	
    	System.out.println("swap:names[0]"+names[0]+",names[1]="+names[1]);
    }
 
    void swap(Names name)
    {
    	String temp=name.name1;
    	name.name1=name.name2;
    	name.name2=temp;
    	System.out.println("name1="+name.name1+",name2="+name.name2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        메소드_1 m=new 메소드_1();
        // swap ==> m에 첨부
        int x=10;
        int y=20;
        System.out.println("main:x="+x+",y="+y);
        m.swap(x, y);
        System.out.println("main:x="+x+",y="+y); // Call By Value (값만 전송) => 메소드 안에서만 변경
        // x,y 메모리 ==> 메소드 호출 (매개변수 다른 메모리가 생성) => 복사본 (원본은 그대로 , 복사본 안에서만 변경)
        // 클래스 , 배열 ==> 원본이 변경 (예외 => String)
        // System.out.print;
        String name1="홍길동";
        String name2="박문수";
        m.swap(name1, name2);
        System.out.println("main:name1="+name1+",name2="+name2);
        
        String[] names= {"이순신","강감찬"};
        m.swap(names);
        System.out.println("swap:names[0]"+names[0]+",names[1]="+names[1]);
        /*
         *   값만 변경 (메소드안에서만 변경) : 일반 데이터값 (기본형) , String
         *   자체 변경 (주소) : 클래스 (사용자 정의 클래스), 배열
         */
        Names n=new Names();
        n.name1="홍길동";
        n.name2="김두한";
        m.swap(n);
        System.out.println("name1="+n.name1+",name2="+n.name2);
        // 매개변수 => 클래스, 배열, 일반 데이터
        // 리턴형 => 기본형, 배열, 클래스 (리턴형이 없어도 된다)
	}

}
