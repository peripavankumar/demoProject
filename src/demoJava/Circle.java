package demoJava;

public class Circle {

	public final static float pi=3.14f;
	
	private float radius;
	
	public Circle(float radius){
		this.radius=radius;
	}
	
	public float calculateArea() {
		return pi*radius*radius;
	}
	
	/*class Customer {
	    // Attributes and methods

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((name == null) ? 0 : name.hashCode());
	        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        Customer other = (Customer) obj;
	        if (name.equals(other.name))
	            if (phone.equals(other.phone))
	                return true;
	        return false;
	    }
	}*/
	
	
	
	public boolean equals(Object o) {
		
		Circle other=(Circle) o;
		if(radius==other.radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashCode() {
		return 1;
	}
	
	public String toString() {
		
		return "The two circles are equal" + "The radius is: "+radius +"and the area is: "+ calculateArea();
	}
	
}
