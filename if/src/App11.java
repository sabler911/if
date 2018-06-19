
public class App11 {
	public static void main(String[] args) {
		
		int loop = 0;
		
		while(true) {
			System.out.println("Looping: " + loop);
			
			if(loop == 7) {
				break;
			}
			
			loop++;
			
			System.out.println("Running");
		}
	}

}
