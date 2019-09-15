package employee;

public class MainClass {

	public static void main(String[] args) {
PermanentEmployee pe=new PermanentEmployee();
pe.setBasicpay(10000);
pe.setVariablecomponent(2);
pe.setHRA(100);

//pe.calculateEMI();


System.out.println(pe.getSalary());

int a=5;

if(a==0) {
	System.out.println("The value of a is: "+a);
}
else if(a<0){
	System.out.println();
}
else {
	System.out.println();
}
	}
	
	

}

