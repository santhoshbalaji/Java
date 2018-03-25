// A Java program for a Server
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;

public class Server {
    //initialize socket and input stream
    public Socket socket = null;
    public ServerSocket server = null;
    public DataInputStream in = null;
    public LinkedList<Message> queue = null;
    public ArrayList<DataOutputStream> clientList = null;
    public ArrayList<String> clients = null;

    // constructor with port
    public Server(int port) {
        // starts server and waits for a connection
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");
            int count = 1;
            queue = new LinkedList<Message>();
            clientList = new  ArrayList<DataOutputStream>();
            clients = new ArrayList<String>();
            while (true) {
                socket = server.accept();
                Thread Serverthread = new Thread(new ServerSocketthread(socket, queue,clientList,clients), "Client"+count);
                Serverthread.start();
                Thread serverthread = new Thread(new Socketthread(socket,queue, clientList,clients), "Client" + count);
                serverthread.start();
                count++;
            }
        } catch (Exception i) {
            System.out.println(i);
        } finally {
            try {
                server.close();
                socket.close();
                System.out.println("Closing Server connection");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        Server server = new Server(2029);
    }
}
