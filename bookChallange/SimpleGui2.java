package bookChallange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui2 implements ActionListener {
    private JButton button;
    private int count;

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();

    }


    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("CLICK ME");

        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);


    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(90, 70, Color.BLUE, 150, 150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }

    public void actionPerformed(ActionEvent event) {
        count++;
        button.setText("I WAS CLICKED: " + count + " times!");
    }


}
