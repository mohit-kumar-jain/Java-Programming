import java.awt.*;
import java.awt.event.*;

public class KeyboardEvents extends Frame implements KeyListener {

    Label label;

    KeyboardEvents() {
        label = new Label("Press any key...");
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        add(label);

        addKeyListener(this);
        setFocusable(true);

        setSize(400, 200);
        setTitle("Keyboard Events");
        setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyboardEvents();
    }
}