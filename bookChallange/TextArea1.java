package bookChallange;

import javax.swing.*;
import java.awt.*;

public class TextArea1 {
    private int count =1;
    public static void main(String[] args) {
        TextArea1 gui = new TextArea1();
        gui.go();
    }


    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Do NOT click me!!!");

        JTextArea text = new JTextArea(10,20);
        text.setLineWrap(true);
        button.addActionListener(e-> count++);
        button.addActionListener(e-> text.append("The button was CLICKED for " + count + " times!! \n"));

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);

        frame.setSize(350,300);
        frame.setVisible(true);



    }


}
