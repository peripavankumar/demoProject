package demoJava;

public class EnhancedForLoop {

	int a[]=new int[5];
	
	public void subjects() {
		int b[]= {50,60,70,80,90};
		for(int c=0;c<b.length;c++) {
			a[c]=b[c];
			System.out.println("Print values:");
		}
		System.out.println("Values are stored in the array"+a.length);
	}
	
	public void print() {
		
		for(int i:a) {
			System.out.println("The Value of subject in display class is"+ i);
		}
	}
	
	public static void main(String[] args) {

		EnhancedForLoop en=new EnhancedForLoop();
		en.subjects();
		en.print();
	}

}
