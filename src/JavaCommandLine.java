
import java.io.Console;


public class JavaCommandLine {


	public static void main (String varArgs[]){
			
		System.out.println("Hello");
		

		Console c = System.console();	
		String name = c.readLine("Enter your name:");
		System.out.println("Your name is " + name);

	}
}
