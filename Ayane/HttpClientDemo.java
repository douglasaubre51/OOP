import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class HttpClientDemo {
	public static void main(String[] args) {
		System.out.println("Starting GET ayane-api-client...");

		System.out.println("enter user id:");
		Scanner scanner=new Scanner(System.in);
		Long id=scanner.nextLong();

		try {
			//use http instead of https!
			URL url=new URL("http://localhost:8080/getUser?id="+id);
			URLConnection _conn=url.openConnection();

			InputStreamReader streamReader=new InputStreamReader(_conn.getInputStream());
			System.out.println("received data from Ayane web api!");

			BufferedReader reader=new BufferedReader(streamReader);

			String data;

			while((data=reader.readLine())!=null){
				System.out.println("payload from Ayane: "+data);
			}


			streamReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
