
public class CardTest {
	public static void main(String[] args){
		Cards card = new Holiday("Alicie");
		card.greeting();
		
		card = new Valentine ("Bob" , 12);
		card.greeting();
		
		card = new Birthday("Charlie" , 4);
		card.greeting();
				
	}
	
}
