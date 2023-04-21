package cliente;

import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Socket socket;
        final String HOST  = "localhost";
        final int PORT = 12345;
        double value1, value2;
        char oper;
        Scanner entrada = new Scanner(System.in);


        try {
            socket = new Socket(HOST, PORT);

            socket.close();
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
}
