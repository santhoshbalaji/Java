import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

class liftClient {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    private DataInputStream in = null;

    public liftClient(String address, int port) throws UnknownHostException, IOException {
        socket = new Socket(address, port);
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        input = new DataInputStream(System.in);
        out = new DataOutputStream(socket.getOutputStream());
        String line = "";
        int count = 1;
        while (!line.equals("Over")) {
            line = input.readLine();
            out.writeUTF(line);
            line = in.readUTF();
            System.out.println(line);
        }
        socket.close();
        input.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        liftClient client = new liftClient("127.0.0.1",4040);
    }
}