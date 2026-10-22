import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {

    JRadioButton red, yellow, green;
    ButtonGroup group;
    JPanel lightPanel;

    TrafficLight() {

        setTitle("Traffic Light");
        setSize(300, 400);
        setLayout(new BorderLayout());

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(red);
        buttonPanel.add(yellow);
        buttonPanel.add(green);

        lightPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.BLACK);
                g.fillRect(100, 30, 100, 270);

                g.setColor(red.isSelected() ? Color.RED : Color.GRAY);
                g.fillOval(125, 45, 50, 50);

                g.setColor(yellow.isSelected() ? Color.YELLOW : Color.GRAY);
                g.fillOval(125, 125, 50, 50);

                g.setColor(green.isSelected() ? Color.GREEN : Color.GRAY);
                g.fillOval(125, 205, 50, 50);
            }
        };

        add(buttonPanel, BorderLayout.NORTH);
        add(lightPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        lightPanel.repaint();
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}