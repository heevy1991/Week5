package week5Project;

public class AsteriskLogger implements Logger{

	public static void main(String[] args) {
		}

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		System.out.println("***" + "Error:" + "Hello" + "***");
		
	}

	@Override
	public void split(Object log) {
		// TODO Auto-generated method stub
		
	}

}
