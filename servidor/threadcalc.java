package servidor;

import java.net.Socket;

public class threadcalc extends Thread {
    private Socket cliente;

    public  threadcalc (Socket cliente) {
        this.cliente = cliente;
    }
    @Override
    public void run() {
       try {
        System.out.println("connect with"+ cliente.getInetAddress().getHostAddress());
        
        cliente.close();
       } catch (Exception e) {
        System.out.println("error on thread" + e.getMessage());
       }
       
    }
}
