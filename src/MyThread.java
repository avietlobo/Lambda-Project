
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable t1=
			()-> {
				for(int i=0;i<100;i++) {
					System.out.println(i);
				}
				
			};
			
		t1.run();
		
		

	

}
}
