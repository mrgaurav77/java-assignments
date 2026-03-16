import javax.swing.*;
import java.awt.*;

public class NumberButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("0 to 9 Buttons");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        for (int i = 0; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            frame.add(button);
        }

        frame.setVisible(true);
    }
}
