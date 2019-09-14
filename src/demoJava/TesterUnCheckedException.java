package demoJava;

public class TesterUnCheckedException {

	public static void main(String[] args) {
try {
	Calculator c=new Calculator();
	c.add("123", "12");
	System.out.println(c.add("123", "12"));
	c.divide("123", "0");
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
	}

}
