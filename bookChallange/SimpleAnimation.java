package bookChallange;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SimpleAnimation {
    private int xPos = 0;
    private int yPos = 0;

    private int xPos2 = 500;
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
        frame.setSize(600, 600);
        frame.setVisible(true);

        for (int i = 0; i < 500; i++) {
            xPos++;
            yPos++;
            drawPanel.repaint();
            xPos2--;
            yPos2++;
            drawPanel.repaint();
            try {
                TimeUnit.MICROSECONDS.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
         xPos = 0;
         yPos = 0;

         xPos2 = 500;
         yPos2 = 0;


        for (int i = 0; i < 500; i++) {
            xPos++;
            yPos++;
            drawPanel.repaint();
            xPos2--;
            yPos2++;
            drawPanel.repaint();
            try {
                TimeUnit.MICROSECONDS.sleep(6000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }







    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0, this.getWidth(),this.getHeight());

            g.setColor(Color.red);
            g.fillOval(xPos, yPos, 40, 40);

            g.setColor(Color.blue);
            g.fillOval(xPos2,yPos2,40,40);
        }
    }

}
