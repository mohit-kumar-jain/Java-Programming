import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener {

    Label label;

    MouseEvents() {

        label = new Label("Perform mouse actions...");
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        add(label);

        addMouseListener(this);

        setSize(500, 300);
        setTitle("Mouse Events");
        setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}