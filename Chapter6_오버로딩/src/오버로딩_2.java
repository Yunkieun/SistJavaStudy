/*
 *   add(int a,int b)
 *   add(double d,double d2)
 *   add(float f1,float f2)
 *   add(char c1,char c2)
 *   add(String s1,String s2)
 *   add(double d,int i)
 *   add(float f,char c)
 *   ...
 *   ...
 *   add(Object o1,Object o2)
 *   
 *   // 다른 데이터형이 여러개 ==> Object
 *   // 개수가 여러개 ==> ...
 */
public class 오버로딩_2 {
    /*void names(String n1)
    {
    	System.out.println(n1);
    }
    void names(String n1,String n2)
    {
    	System.out.println(n1+" "+n2);
    }
    void names(String n1,String n2,String n3)
    {
    	System.out.println(n1+" "+n2+" "+n3);
    }
    void names(String n1,String n2,String n3,String n4)
    {
    	System.out.println(n1+" "+n2+" "+n3+" "+n4);
    }
    void names(String n1,String n2,String n3,String n4,String n5)
    {
    	System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
    }*/
    // 가변 매개변수 ==> 웹 ==> 사용자가 보내준 데이터를 받는 경우
    void names(String...name)
    {
    	for(String s:name)
    	{
    		System.out.print(s+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_2 a=new 오버로딩_2();
		a.names("홍길동");
		a.names("홍길동","박문수");
		a.names("홍길동","박문수","이순신");
		a.names("홍길동","박문수","이순신","김두한");
		a.names("홍길동","박문수","이순신","김두한","강감찬");
		//System.out.printf("%d",10);
		//System.out.printf("%d%d%d%f%s",10,20,30,30.0,"");
		//int a=10;
		/*Object o=10;
		o="";
		o='A';
		o=10.5;
		o=true;
		o=a;
		o=new int[10];
		// =======================> var a=10 a='' a=[]*/

	}

}
