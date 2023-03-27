import javax.swing.*;
import java.awt.*;

public class intro {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("FIRST GUI WIND FROM JAVA ") ;
//        or
// it's allow us to create our own window --
        JFrame frame = new JFrame();
        frame.setTitle("FIRST GUI WINDOW FROM JAVA ");
                // --
        frame.setLocation(200, 200 );// it will give the location of frame
        frame.setSize(800, 600);  // gives height nd width
        frame.setBackground(Color.cyan); // give the navbar black
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.orange); // it will give us black content page
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // USE TO CLOSE MY FRAME WHENEVER I HIT CROSS BUTTON THEN CLOSED
    }
}
