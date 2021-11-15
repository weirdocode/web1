package lambda.basic;

public class Person {
	
	public void greet(Say01 say) {
		say.talking();
	}
	
	public void greet(Say02 say) {
		say.talking();
		
	}	
	public void greet(Say03 say) {
		say.talking("헬로");
		
	}	
	public String greet(Say04 say) {
		String result = say.talking("hi", 3);
		return result;
	}

}
