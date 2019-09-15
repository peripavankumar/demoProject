package demoJava;

import java.awt.Point;

public class constructorOverloading {
	
	private Point p1;
	private Point p2;
	private Point p3;

	public constructorOverloading() {
		p1=new Point(0,0);
		p2=new Point(1,1);
		p3=new Point(2,5);
	}
	constructorOverloading(double x1,double x2, double x3, double y1, double y2, double y3){
		
	}
	constructorOverloading(Point p1, Point p2, Point p3){
		
	}
	double x1=p1.getX();
	double x2=p2.getX();
	double x3=p3.getX();
	double y1=p1.getY();
	double y2=p2.getY();
	double y3=p3.getY();
	
	double a =Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
	double b =Math.sqrt((Math.pow((x3-x2), 2)+Math.pow((y3-y2), 2)));
	double c =Math.sqrt((Math.pow((x3-x1), 2)+Math.pow((y3-y1), 2)));
	double s=(a+b+c)/2;
	double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	double perimeter=a+b+c;
	
	public static void main(String[] args) {
		constructorOverloading c1=new constructorOverloading();
		System.out.println("Area of a Triangle is: "+c1.area);
		System.out.println("Perimeter of a Triangle is: "+c1.perimeter);
		//constructorOverloading c2=new constructorOverloading();
		//constructorOverloading c3=new constructorOverloading();
	}
}
