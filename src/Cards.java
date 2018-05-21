/*Name: Chintan PAtel
 * CSU ID : 2473177
 * Assigment 8: Phone number 
 */
public class Cards {
	String recipient;
	
	public Cards() {
		this("John Smith");
	}

	public Cards(String recipient) {
		this.recipient = recipient;
	}
	
	public void greeting(){
		System.out.println("dear" + recipient + ":\n");
		System.out.println("Wish you a wonderful summer!");
	}

}
