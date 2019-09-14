package demoJava;

public class demoStatic {

	/*
	public static String attribute;
	public static String name;
	
	public static String getAttribute() {
		return attribute;
	}

	public static void setAttribute(String attribute) {
		demoStatic.attribute = attribute;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		demoStatic.name = name;
	}
	*/
	
	public String attribute;
	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;
	
	demoStatic(String attribute,String name){
		System.out.println("Entered Constructor Class");
		this.attribute=attribute;
		this.name=name;	
	}
	
	@Override
	public boolean equals(Object o)
	{
		
		demoStatic ds=(demoStatic) o;
		System.out.println("Attribute value:"+attribute);
		System.out.println("name value:"+name);
		System.out.println("Override Attribute value:"+ds.attribute);
		System.out.println("Override Name value:"+ds.name);
		System.out.println("Output is:"+String.CASE_INSENSITIVE_ORDER.compare(attribute, ds.attribute));
		System.out.println("Output is:"+String.CASE_INSENSITIVE_ORDER.compare(name, ds.name));
		return String.CASE_INSENSITIVE_ORDER.compare(attribute, ds.attribute)==0 && String.CASE_INSENSITIVE_ORDER.compare(name, ds.name)==0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoStatic d1=new demoStatic("name", "pavan");
		//demoStatic d2=new demoStatic("name", "pavan");
		demoStatic d2=new demoStatic("name1", "kumar");
		//System.out.println("simple attribute:"+attribute);
		//System.out.println("simple name:"+name);
		System.out.println("d1 attribute:"+d1.getAttribute());
		System.out.println("d2 attribute:"+d2.getAttribute());
		System.out.println("d1 name:"+d1.getName());
		System.out.println("d2 name:"+d2.getName());
		System.out.println("Output is:"+d1.equals(d2));
		
	}

}
