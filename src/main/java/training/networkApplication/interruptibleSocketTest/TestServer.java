//package training.networkApplication.interruptibleSocketTest;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class TestServer implements Runnable{
//    @Override
//    public void run() {
//        try (var s = new ServerSocket(8189)) {
//            Socket incoming = s.accept();
//            Runnable r = new TestServerHandler(incoming);
//            new Thread(r).start();
//        } catch (IOException e) {
//            mess
//            throw new RuntimeException(e);
//        }
//    }
//}
