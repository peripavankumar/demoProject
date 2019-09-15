package demoJava;

import com.google.common.base.CaseFormat;

public class CaseTest {

	public String snakeCase(String word) {
		
		String word2=CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE,word);
		return word2;
	}
}
