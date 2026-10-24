import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample extends JFrame implements ActionListener {

    JLabel label;
    JTextField textField;
    JButton button;

    SwingExample() {

        setTitle("Simple Swing Application");
        setSize(400, 200);
        setLayout(new FlowLayout());

        label = new JLabel("Enter text:");
        textField = new JTextField(15);
        button = new JButton("Display");

        add(label);
        add(textField);
        add(button);

        button.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText(textField.getText());
    }

    public static void main(String[] args) {
        new SwingExample();
    }
}