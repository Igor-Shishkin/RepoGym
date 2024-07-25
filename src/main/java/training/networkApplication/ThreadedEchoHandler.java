package training.networkApplication;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ThreadedEchoHandler implements Runnable{

    private Socket incoming;

    public ThreadedEchoHandler(Socket incoming) {
        this.incoming = incoming;
    }

    @Override
    public void run() {
        try (InputStream inStream = incoming.getInputStream();
            OutputStream outStream = incoming.getOutputStream();
            var in = new Scanner(inStream, StandardCharsets.UTF_8);
            var out = new PrintWriter(new OutputStreamWriter(outStream, StandardCharsets.UTF_8), true); ) {

            out.println("Witaj! Wpisz BYE, by zakożczyć");

            var done = false;
            while (!done && in.hasNextLine()) {
                String line = in.nextLine();
                out.println("ECHO: " + line);
                if (line.trim().equalsIgnoreCase("bye")) {
                    done = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
