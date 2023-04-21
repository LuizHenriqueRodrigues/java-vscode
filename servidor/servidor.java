package servidor;

import java.net.ServerSocket;
import java.net.Socket;

public class servidor {
    public static void main(String[] args) {
        
        ServerSocket server;
        final int PORT = 12345;
        try {
            server = new ServerSocket(PORT);

            while(true){
                System.out.println("aguardando um cliente...");
                Socket cliente = server.accept();
                
                threadcalc calc = new threadcalc(cliente);
                calc.start();
            }
        } catch (Exception e) {
            System.out.println("erro "+ e.getMessage());
        }






    }
}
