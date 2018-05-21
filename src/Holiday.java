
public class Holiday extends Cards {
	public Holiday(String string) {
		super(string);
	}

	public void greeting(){
		System.out.println("Dear" + " " + recipient);
		System.out.println("Season's Greetings!");
	}
	

}

