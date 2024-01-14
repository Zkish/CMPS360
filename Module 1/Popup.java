import javax.swing.JOptionPane;

public class Popup {
    public static void main(String[] args){
        // popup with the message in it.
        JOptionPane.showMessageDialog(null, "Welcome to spring 2024 semester", "Popup", JOptionPane.INFORMATION_MESSAGE);
    }
}
// null represents that the popup should be centered on the screen.
// JOptionPane.INFORMATION_MESSAGE  decides what type of message is being displayed.
