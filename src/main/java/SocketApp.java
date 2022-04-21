import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketApp {
    public static void main (String [] args){
        int port = 8085;
        String host = "localhost";
        try(Socket clientSocket = new Socket(host, port);
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
                out.println("Netology");
                String resp = in.readLine();
                System.out.println(resp);
                clientSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
