package sda.selfStudyJava.broCode.audioTraining;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioTraining {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner in = new Scanner(System.in);
        File audioFile = new File("src/additionalFiles/MoonLight.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P - play\tS - stop\tR - reset\tQ - quit");
            System.out.print("Enter your choice: ");
            response = in.nextLine();
            response = response.toUpperCase();
            switch (response) {
                case "P" : clip.start();
                    break;
                case "S" : clip.stop();
                    break;
                case "R" : clip.setMicrosecondPosition(0);
                    break;
                case "Q" : clip.close();
                    break;
                default:
                    System.out.println("Not a valid response");
            }

        }
    }
}
