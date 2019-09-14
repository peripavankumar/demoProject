package demoJava;

class Square1 implements demoImplement{
	public void perimeter(int a, int b) {
		int s=2*a*b;
		System.out.println("Perimeter of the Square is:"+s);
	}
	public void nameOfTheShape() {
		System.out.println("Shape is Square");
	}
}

class Rectangle1 implements demoImplement{
	public void perimeter(int a, int b) {
		int s=2*(a+b);
		System.out.println("Perimeter of the Rectangle is:"+s);
	}
	public void nameOfTheShape() {
		System.out.println("Shape is Rectangle");
	}
}

public class demoMethodOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square1 s = new Square1();
Rectangle1 r = new Rectangle1();

s.nameOfTheShape();
s.perimeter(5, 5);

r.nameOfTheShape();
r.perimeter(5, 4);


	}

}
