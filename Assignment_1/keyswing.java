import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keyswing extends JFrame implements KeyListener {

    private JLabel label;

    public keyswing() {
        setTitle("Key Event Demo");
        label = new JLabel("Press any key...", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        add(label);
        addKeyListener(this);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new keyswing();
    }
}
