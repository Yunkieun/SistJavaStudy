
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*300);
        System.out.println("num="+num);
        String s="";
        while(true)
        {
            int a=num%2;
            s+=a;
            num=num/2;
            if(num==0)
        		break;	
            
        }
        //System.out.println(s);
        for(int i=s.length()-1;i>=0;i--)
        {
        	System.out.print(s.charAt(i));
        }
	}

}
