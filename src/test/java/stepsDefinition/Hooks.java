package stepsDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void start() {
		System.out.println("Starting execution");
	}
	@After
	public void stop() {
		
		System.out.println("Ending execution");
		
	}

}
