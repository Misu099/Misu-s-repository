package bookChallange;

import javax.swing.*;
import java.awt.*;

public class TextArea1 {
    private int count = 0;

    public static void main(String[] args) {
        TextArea1 gui = new TextArea1();
        gui.go();
    }

    public void go() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Do NOT click me!!!");
        JButton button1 = new JButton("Reset count!");

        JTextArea text = new JTextArea(10, 20);
        text.setLineWrap(true);
        button.addActionListener(e -> {
            count++;
            text.append("The button was CLICKED for " + count + " times!! \n");
        });
        button1.addActionListener(e -> {
            count = 0;
            text.append("\n The count has been reset! \n \n");
        });

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.EAST, button1);

        frame.setSize(350, 300);
        frame.setVisible(true);


    }


}
