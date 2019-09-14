package demoJava;

public class TesterCircle {

	public static void main(String[] args) {

		Circle c1=new Circle(20.0f);
		Circle c2=new Circle(22.0f);
		
		//System.out.println(c1.equals(c2));
		//System.out.println(c1.has);
		//System.out.println(c1.hashCode()==c2.hashCode());
		
		if(c1.equals(c2) && c1.hashCode()==c2.hashCode()) {
			c1.calculateArea();
			System.out.println(c1.toString());
		}
		else {
			System.out.println("The two circles are not equal");
		}	
	}

}
