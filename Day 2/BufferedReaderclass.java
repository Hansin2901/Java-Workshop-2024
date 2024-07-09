import java.io.*;
public class BufferedReaderclass {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter you string here:");
		String object = bf.readLine();
		System.out.println(object);	
	}
}
