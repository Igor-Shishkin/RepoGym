package training.networkApplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedEchoServer {
    public static void main(String[] args)  {
        System.out.println("Start");
        try (var serverSocket = new ServerSocket( 8089);) {
            System.out.println("create serverSocket");
            int i = 1;
            while (true) {
                System.out.println("WHILE begins");
                Socket incoming = serverSocket.accept();
                System.out.println("Spawning " + i);
                Runnable r = new ThreadedEchoHandler(incoming);
                var thread = new Thread(r);
                System.out.println("r created");
                thread.start();
                System.out.println("Thread starts");
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
