package DSA;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloWorldSwing {

    // Method to create and display the GUI
    private static void createAndShowGUI() {
        // Create a new JFrame (the main window)
        JFrame frame = new JFrame("HelloWorldSwing");

        // Exit the application when the user closes the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel to display the text "Hello, World!"
        JLabel label = new JLabel("Hello, World!");

        // Add the label to the frame's content pane
        frame.getContentPane().add(label);

        // Set the frame size
        frame.setSize(300, 100);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule the creation and display of the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
