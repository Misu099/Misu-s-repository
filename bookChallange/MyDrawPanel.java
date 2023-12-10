package bookChallange;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class MyDrawPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Get the size of the panel
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Create a random gradient for the circle
        Color color1 = getRandomColor();
        Color color2 = getRandomColor();
        GradientPaint gradient = new GradientPaint(0, 0, color1, panelWidth, panelHeight, color2);

        // Set the gradient paint
        g2d.setPaint(gradient);

        // Draw a circle with the random gradient
        int circleSize = Math.min(panelWidth, panelHeight) / 2;
        int x = (panelWidth - circleSize) / 2;
        int y = (panelHeight - circleSize) / 2;
        Ellipse2D circle = new Ellipse2D.Double(x, y, circleSize, circleSize);
        g2d.fill(circle);
    }

    private Color getRandomColor() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }
}

