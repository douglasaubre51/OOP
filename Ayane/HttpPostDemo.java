import java.net.URL;
import java.net.URI;
import java.net.HttpURLConnection;
import java.io.*;
import java.util.Scanner;

public class HttpPostDemo{
    public static void main(String[] args){
	System.out.println("starting http client!");

	Scanner scanner=new Scanner(System.in);

	System.out.print("enter name:");
	String name=scanner.nextLine();

	System.out.print("enter email:");
	String email=scanner.nextLine();

	System.out.print("enter password:");
	String password=scanner.nextLine();

	String uploadData="{\"name\":\""+name+"\",\"email\":\""+email+"@gmail.com\",\"password\":\""+password+"\"}";

	try{
	    System.out.println("starting post connection!");

	    String urlDataString="http://localhost:8080/users";
	    URL url=new URI(urlDataString).toURL();

	    HttpURLConnection connection=(HttpURLConnection) url.openConnection();

	    connection.setRequestMethod("POST");
	    connection.setDoOutput(true);
	    connection.setRequestProperty("Content-Type","application/json");

	    try(DataOutputStream dos=new DataOutputStream(connection.getOutputStream())){
		System.out.println("sending payload!");
		dos.writeBytes(uploadData);
		dos.flush();
	    }

	    int responseCode=connection.getResponseCode();

	    if(responseCode==HttpURLConnection.HTTP_OK){
		StringBuilder response=new StringBuilder();

		try(BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()))){
		    String line;
		    System.out.println("getting response stream!");

		    while((line=reader.readLine())!=null){
			System.out.println("reading response!");
			response.append(line);
		    }

		    System.out.println("response : "+response.toString());
		}
	    }
	    else{
		System.out.println("error : "+connection.getResponseCode());
	    }

	    connection.disconnect();
	}
	catch(Exception e){
	    System.out.println(e.toString());
	    e.printStackTrace();
	}

	System.out.println("bye!");
    }
}
