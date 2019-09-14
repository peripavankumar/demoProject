package demoJava;

public class TesterAbstract {

	public static void main(String[] args) {
		GraduateStudent s2=new GraduateStudent("Ajay");
		s2.setTestScore(0, 70);
		s2.setTestScore(1, 69);
		s2.setTestScore(2, 71);
		s2.setTestScore(3, 55);
		s2.generateResult();
UnderGraduateStudent s1=new UnderGraduateStudent("Mehul");
s1.setTestScore(0, 70);
s1.setTestScore(1, 69);
s1.setTestScore(2, 71);
s1.setTestScore(3, 55);
s1.generateResult();
	}

}
