package client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",9123);
            Scanner scanner = new Scanner(System.in);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String message = scanner.nextLine();
                out.writeUTF(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
