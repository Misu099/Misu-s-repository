package bookChallange;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SimpleAnimation {
    private int xPos = 0;
    private int yPos = 0;

    private int xPos2 = 400;
    private int yPos2 = 0;


    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();


    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();


        frame.getContentPane().add(drawPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);

        for (int i = 0; i < 400; i++) {
            xPos++;
            yPos++;
            drawPanel.repaint();
            xPos2--;
            yPos2++;
            drawPanel.repaint();
            try {
                TimeUnit.MICROSECONDS.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.green);
            g.fillOval(xPos, yPos, 40, 40);
            g.setColor(Color.blue);
            g.fillOval(xPos2,yPos2,40,40);
        }
    }

}
