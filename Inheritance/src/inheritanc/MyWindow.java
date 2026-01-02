
	package inheritanc;

//import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Swing App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);

            JPanel panel = new JPanel();
            JLabel label = new JLabel("Hello from Swing!");
            JButton btn = new JButton("Click me");
            btn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked!"));

            panel.add(label);
            panel.add(btn);
            frame.setContentPane(panel);
            frame.setLocationRelativeTo(null); // center
            frame.setVisible(true);
        });
    }
}