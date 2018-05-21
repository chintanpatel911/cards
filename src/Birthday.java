
public class Birthday extends Cards{
	int age;
	Birthday( String recipient ,int age){
		super(recipient);
		this.age = age;
		
	}
	public void greeting(){
		System.out.println("Dear" +" : " +recipient );
		System.out.println("Happy" + age +"th" + "Birthday!");
	}


}
