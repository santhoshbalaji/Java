import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;

class ServerSocketthread implements Runnable {
    private Socket socket = null;
    DataInputStream in = null;
    public LinkedList<Message> queue = null;
    public ArrayList<DataOutputStream> clientList = null;
    public DataOutputStream out = null;
    public ArrayList clients = null;

    public ServerSocketthread(Socket socket, LinkedList queue, ArrayList clientList,ArrayList clients) {
        this.socket = socket;
        this.queue = queue;
        this.clientList = clientList;
        this.clients = clients;
    }

    public void run(){
        try {
            System.out.println("Client accepted");

            // takes input from the client socket
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            out = new DataOutputStream(socket.getOutputStream());
            synchronized(clientList){
                clients.add(Thread.currentThread().getName());
                clientList.add(out);
            }

            // reads message from client until "Over" is sent
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    // System.out.println(line);
                   Message message = new Message();
                   message.setFrom(Thread.currentThread().getName());
                   String to = "";
                   for(int i = 0; i < clients.size(); i++){
                        if(!(clients.get(i).equals(Thread.currentThread().getName()))){
                            if(!(clients.size()-1 == i)){
                                to += clients.get(i) + ",";
                            }
                            else{
                                to += clients.get(i);
                            }
                        }
                   }
                   message.setTo(to);
                   message.setMessage(line);
                   synchronized(queue){
                        queue.add(message);
                   }
                } catch (IOException i) {
                    // System.out.println(i);
                }
            }
        }
        catch (Exception err) {
            System.out.println(err);
        }
            
    }
}