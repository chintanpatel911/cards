
public class Valentine extends Cards {
	int number;
	Valentine( String recipient ,int number){
		super(recipient);
		this.number = number;
		
	}
	public void greeting(){
		System.out.println("Dear" +" : "+ recipient );
		System.out.println("Love and Kisses");
		for (int i = 0; i < number; i++){
			System.out.print("X");
		}
	}

}
