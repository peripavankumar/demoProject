package demoJava;

//public class TesterInterface {
//
//	public static void main(String[] args) {
//
//		Intern i=new Intern(283,77);
//		i.calcPercantage();
//		
//		Trainee t=new Trainee(370);
//		t.calcPercantage();
//		
//		Trainee t1 =new Trainee(410);
//		t1.calcPercantage();
//	}
//
//}

public class TesterInterface {
//    public static void main(String[] args) {
//        display(5, "Infosys");
//        display(4, "Infosys", "Limited");
//    }
//    
//    public static void display(int b, String... strings) {
//        System.out.print(strings[strings.length-1] + " ");
//    }
	 public static void main(String[] args) {
	        displayRegistration("Hockey");              // Line 1
	        displayRegistration("Kho-Kho",1,2,3);  
	    }
	    
	    public static void displayRegistration(String nameOfSport, int... ids) {
	        System.out.print("Registration for " + nameOfSport + ": ");
	        for(int i=0; i<ids.length; i++) {
	            System.out.print(ids[i] + " ");
	        }
	      //  System.out.println();
	    }
}
