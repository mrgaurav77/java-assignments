import javax.swing.*;
import java.awt.*;

public class ThreeButtonsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Buttons Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton btnOk = new JButton("OK");
        JButton btnReset = new JButton("Reset");
        JButton btnCancel = new JButton("Cancel");
        frame.add(btnOk);
        frame.add(btnReset);
        frame.add(btnCancel);
        frame.setVisible(true);
    }
}
