import java.io.*;
import java.net.*;
 
public class AreaServer {
	public static void main(String[] args) {
    	try {
            ServerSocket server = new ServerSocket(5000);
 
            System.out.println("Server is waiting for client...");
 
            Socket socket = server.accept();
 
            DataInputStream in =
                new DataInputStream(socket.getInputStream());
 
            DataOutputStream out =
                new DataOutputStream(socket.getOutputStream());
 
            double radius = in.readDouble();
 
            double area = Math.PI * radius * radius;
 
            out.writeDouble(area);
 
            System.out.println("Radius received: " + radius);
            System.out.println("Area sent: " + area);
 
            socket.close();
            server.close();
    	}
    	catch (IOException | ArithmeticException e) {
            System.out.println(e);
    	}
	}
}