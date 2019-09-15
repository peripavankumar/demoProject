package demoJava;

abstract public class Student {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	private int[] test=new int[4];
	
	public int[] getTest() {
		return test;
	}
	private String result;
	
	Student(String name){
		this.name=name;
	}
	public void setTestScore(int testNumber,int testScore) {
		for(int i=0; i<test.length;i++) {
			if(i==testNumber) {
				test[i]=testScore;
			}
		}
	}

	abstract void generateResult();
}
