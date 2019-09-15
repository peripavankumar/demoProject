package demoJava;

public class InterestCalculator1 {
		public double calcSimpleInterest(double principal, double time, double rate) throws Exception {
			if(principal<= 0)
				throw new Exception("INVALID.PrincipalAmount");
			if(time <= 0)
				throw new Exception("INVALID.TimePeriod");
			if(rate <= 0) 
				throw new Exception("INVALID.InterestRate");
			
			double result = principal * time * rate /100.0;
			return result;
		}
}
