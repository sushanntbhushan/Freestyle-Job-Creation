import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class DemoApp {

    // Create the GUI on the Event Dispatch Thread
    private static void createAndShowGUI() {
        // Create the frame (window)
        JFrame frame = new JFrame("Demo App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Add a simple label
        JLabel label = new JLabel("Hello, this is a demo app!", JLabel.CENTER);
        frame.getContentPane().add(label);

        // Center the window and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule the GUI creation on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
