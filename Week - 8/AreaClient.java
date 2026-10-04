import java.io.*;
import java.net.*;
 
public class AreaClient {
	public static void main(String[] args) {
    	try {
            Socket socket = new Socket("localhost", 5000);
 
            DataInputStream in =
                new DataInputStream(socket.getInputStream());
 
            DataOutputStream out =
                new DataOutputStream(socket.getOutputStream());
 
            double radius = 5;
 
            out.writeDouble(radius);
 
            double area = in.readDouble();
 
            System.out.println("Radius: " + radius);
            System.out.println("Area of Circle: " + area);
 
            socket.close();
    	}
    	catch (IOException | ArithmeticException e) {
            System.out.println(e);
    	}
	}
}