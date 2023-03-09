import java.io.*;

public class ConsoleInputExample{
	public static void main (String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				String line = reader.readLine();

	System.out.println("You entered: " + line);

	InputStream input = System.in;

	int data = input.read();

	System.out.println("You entered: " + data);
	}
}

