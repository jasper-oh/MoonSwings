import javax.swing.*;

public class TeammateApp {
    private JPanel JPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TeammateApp");
        frame.setContentPane(new TeammateApp().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
