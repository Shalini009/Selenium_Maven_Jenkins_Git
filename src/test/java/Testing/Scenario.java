package Testing;

public class Scenario {


	public static void main(String[] args) {
		System.out.println(new Application().getMessage());
	}

	private final String message = "Welcome to Simplilearn !!! Jenkins WebHooks";

	private String getMessage() {
		
		return message ;
	}
	}


