import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Serverthread implements Runnable {
    Socket socket = null;
    DataInputStream input = null;
    DataOutputStream out = null;
    ServerSocket serverSocket = null;

    public Serverthread(Socket socket){
        this.socket = socket;
    }

    public Serverthread(Socket socket, ServerSocket serverSocket) {
        this.socket = socket;
        this.serverSocket = serverSocket;
    }

    public void run() {
        String line = "";
        try {
            while (!line.equals("Over")) {
                try {
                    input = new DataInputStream(System.in);
                    out = new DataOutputStream(socket.getOutputStream());
                    line = input.readLine();
                    out.writeUTF(line);
                    if (line.equals("Over")) {
                        Thread.currentThread().stop();
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