package week5Project;

public class SpacedLogger implements Logger {

	public static void main(String[] args) {
		}

	@Override
	public void log(String log) {
		for (int i=0; i<log.length(); i++);
			int i = 0;
			char curr= log.charAt(i);
			System.out.println(curr + "");
			
	}	
	@Override
	public void error(String error) {
		System.out.println("Error: ");
		
	}

	@Override
	public void split(Object log) {
		
		
	}
	
}
