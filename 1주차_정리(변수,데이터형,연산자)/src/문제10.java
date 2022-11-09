/*
 *   public static void main(String[] arg) 
    {
        int i = 0;
        int re = 0;
        i=3;
        re = ++i; //re=4
        System.out.println("re:"+re + ", i:"+i);
        i = 3;
        re = i++; //re=3
        System.out.println("re:"+re + ", i:"+i);
     }
 */
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
	    int re = 0;
	    i=3;
	    re = ++i; //re=4
	    System.out.println("re:"+re + ", i:"+i);// re=4,i=4
	    re = i++; //re=3
	    System.out.println("re:"+re + ", i:"+i);//re=4 , i=5
	}

}
