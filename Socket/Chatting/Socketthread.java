import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;

class Socketthread implements Runnable {
    Socket socket = null;
    DataInputStream input = null;
    DataOutputStream out = null;
    ServerSocket serverSocket = null;
    public LinkedList<Message> queue = null;
    public ArrayList<DataOutputStream> clientList = null;
    public ArrayList<String> clients = null;

    public Socketthread(Socket socket) {
        this.socket = socket;
    }

    public Socketthread(Socket socket, LinkedList queue, ArrayList clientList,ArrayList clients) {
        this.socket = socket;
        this.queue = queue;
        this.clientList = clientList;
        this.clients = clients;
    }

    public Socketthread(Socket socket, ServerSocket serverSocket) {
        this.socket = socket;
        this.serverSocket = serverSocket;
    }

    public void run() {
        String line = "";
        String to[] = {};
        try {
            while (!line.equals("Over")) {
                try {
                    input = new DataInputStream(System.in);
                    Message message = new Message();
                    synchronized (queue) {
                        for (int i = 0; i < queue.size(); i++) {
                            message = queue.get(i);
                            to = message.getTo().split(",");
                            System.out.println(clientList.size());
                            for (int j = 0; j < clientList.size(); j++) {
                                out = clientList.get(j);
                                // if (Thread.currentThread().getName().equals(clients.get(j))) {
                                    if (clients.get(j).equals(message.getFrom())) {
                                        out.writeUTF("Message sent");
                                    } else {
                                        out.writeUTF(message.getMessage());
                                        line = message.getMessage();
                                    }
                                // }
                            }
                            queue.remove(i);
                        }
                    }
                } catch (IOException e) {

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                System.out.println("Closing thread socket connection");
            } catch (IOException e) {
                //TODO: handle exception
            }
        }
    }

}