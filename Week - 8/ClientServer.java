import java.io.*;
import java.net.*;
import java.util.*;

public class ClientServer {

    static class Server extends Thread {

        public void run() {

            try {

                ServerSocket ss = new ServerSocket(5000);

                System.out.println("Server started...");

                System.out.println("Waiting for client...");

                Socket s = ss.accept();

                DataInputStream dis =

                        new DataInputStream(s.getInputStream());

                DataOutputStream dos =

                        new DataOutputStream(s.getOutputStream());

                double radius = dis.readDouble();

                double area = Math.PI * radius * radius;

                dos.writeDouble(area);

                System.out.println("Radius received: " + radius);

                System.out.println("Area calculated: " + area);

                s.close();

                ss.close();

            } catch (Exception e) {

                System.out.println(e);

            }

        }

    }

    static class Client extends Thread {

        public void run() {

            try {

                Thread.sleep(1000);

                Socket s = new Socket("localhost", 5000);

                DataInputStream dis =

                        new DataInputStream(s.getInputStream());

                DataOutputStream dos =

                        new DataOutputStream(s.getOutputStream());

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter radius: ");

                double radius = sc.nextDouble();

                dos.writeDouble(radius);

                double area = dis.readDouble();

                System.out.println("Area of circle = " + area);

                s.close();

            } catch (Exception e) {

                System.out.println(e);

            }

        }

    }

    public static void main(String args[]) {

        Server server = new Server();

        Client client = new Client();

        server.start();

        client.start();

    }

}
