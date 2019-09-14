package demoJava;

public class HashCodeEqualsContract {

	private int custId;
	private String custName;
	
	public HashCodeEqualsContract(int custId,String custName) {
		this.custId=custId;
		this.custName=custName;
	}
	public int hashCode() {
		System.out.println("Customer Id is: "+custId);
		return custId;
	}
	
	public boolean equals(Object ob){
		HashCodeEqualsContract hec= (HashCodeEqualsContract)ob;
		System.out.println("Hash Code of this method is: "+this.hashCode());
		System.out.println("Hash Code of Class method is: "+hec.hashCode());
		if(this.hashCode()!=hec.hashCode()) {
			System.out.println("Customer Name of this method is: "+this.custName);
			System.out.println("Customer Name of Class Method is: "+hec.custName);
			return this.custName.equals(hec.custName);
		}
		return false;
	}
	
	public static void main(String[] args) {
		HashCodeEqualsContract hec1= new HashCodeEqualsContract(12,"Ajay");
		HashCodeEqualsContract hec2 = new HashCodeEqualsContract(13,"Ajay");
		if(hec1.equals(hec2)) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
		
	}

}
