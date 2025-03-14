import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class HttpClientDemo {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://localhost:8080");
            URLConnection _conn=url.openConnection();

            InputStreamReader streamReader=new InputStreamReader(_conn.getInputStream());
            BufferedReader reader=new BufferedReader(streamReader);

            String data;

            while((data=reader.readLine())!=null){
                System.out.println("got : "+data);
            }

            streamReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}