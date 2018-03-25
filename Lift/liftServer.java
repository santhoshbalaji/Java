import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;

class liftServer {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public liftServer(int port) throws IOException {
        server = new ServerSocket(port);
        socket = server.accept();
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        input = new DataInputStream(System.in);
        out = new DataOutputStream(socket.getOutputStream());
        String line = "";
        while (!line.equals("Over")) {
            line = in.readUTF();
            System.out.println(line);
            line = input.readLine();
            out.writeUTF(line);
        }
        server.close();
        socket.close();
        in.close();
    }

    public static void main(String[] args) throws IOException{
        liftServer server = new liftServer(4040);
    }
}