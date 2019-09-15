package demoJava;

class Triangle extends demoAbstract {
	
	int i=0;
	public int area()
	{
		System.out.println("Shape is:"+"Triangle");
		return i;
	}
	public void volume(int l, int b, int h)
	{
		int vol=l*b*h;
		System.out.println("Volume of Triangle:"+vol);
	}
		}
		
	class Square extends demoAbstract {
			
	public int area()
	{
		int i=10;
		System.out.println("Shape is:"+"Square");
		return i;
	}
	public void volume(int l, int b, int h)
	{
		int vol=(l*b*h)/2;
		System.out.println("Volume of Triangle:"+vol);
	}
		}

class demoMethodOverriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Triangle t = new Triangle();
t.area();
t.volume(5, 5, 4);

Square s = new Square();
s.area();
s.volume(5, 5, 4);
	}

}

