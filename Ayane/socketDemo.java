import java.io.*;
import java.net.Socket;

public class socketDemo {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",8080);

            InputStream inputStream=socket.getInputStream();
            InputStreamReader streamReader=new InputStreamReader(inputStream);

            BufferedReader bufferedReader=new BufferedReader(streamReader);

            String data;

            System.out.println("the beginning!");

            while((data=bufferedReader.readLine())!=null){
                System.out.println("api server sent: "+data);
            }

            System.out.println("the end!");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
