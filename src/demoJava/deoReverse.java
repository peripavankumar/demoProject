package demoJava;

public class deoReverse {

	public static void main(String[] args) {
		
		String a= "Pavan";
		
		char c[]=a.toCharArray();
		
		String rev="";
		
		System.out.println(c.length);
		
		for(int i=c.length;i>=0;i--)
		{
			System.out.println(i);
			
		rev+=c[i];
		
		}
		//System.out.println(rev);

		//System.out.println("Print the Reverse of the String:"+r);
	}

}
