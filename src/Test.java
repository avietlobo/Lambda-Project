
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(()->
            
                System.out.println("New thread created")
            
        ).start();
		
		Animal animal= ()-> System.out.println("Animal");
		animal.getName();
	

	}

}
