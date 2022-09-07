import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.net.*;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SO {
   public static void main(String[] args) throws Exception {
        URL yahoo = new URL("https://stackoverflow.com/questions/1359689/how-to-send-http-request-in-java");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;
        
        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        
    }
    in.close();
}
}