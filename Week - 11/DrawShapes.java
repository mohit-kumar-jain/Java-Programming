import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawShapes extends JFrame {

    int x1, y1, x2, y2;
    String shape = "Line";

    DrawShapes() {

        setTitle("Draw Shapes");
        setSize(600, 500);
        setLayout(new BorderLayout());

        JButton line = new JButton("Line");
        JButton rectangle = new JButton("Rectangle");
        JButton oval = new JButton("Oval");

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(line);
        buttonPanel.add(rectangle);
        buttonPanel.add(oval);

        add(buttonPanel, BorderLayout.NORTH);

        DrawingPanel panel = new DrawingPanel();
        add(panel, BorderLayout.CENTER);

        line.addActionListener(e -> shape = "Line");
        rectangle.addActionListener(e -> shape = "Rectangle");
        oval.addActionListener(e -> shape = "Oval");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class DrawingPanel extends JPanel {

        DrawingPanel() {

            addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    x1 = e.getX();
                    y1 = e.getY();
                }

                public void mouseReleased(MouseEvent e) {
                    x2 = e.getX();
                    y2 = e.getY();
                    repaint();
                }
            });
        }

        protected void paintComponent(Graphics g) {

            super.paintComponent(g);

            int x = Math.min(x1, x2);
            int y = Math.min(y1, y2);

            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);

            if (shape.equals("Line")) {
                g.drawLine(x1, y1, x2, y2);
            }
            else if (shape.equals("Rectangle")) {
                g.drawRect(x, y, width, height);
            }
            else if (shape.equals("Oval")) {
                g.drawOval(x, y, width, height);
            }
        }
    }

    public static void main(String[] args) {
        new DrawShapes();
    }
}