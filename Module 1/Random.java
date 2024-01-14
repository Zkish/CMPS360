import javax.swing.JOptionPane;

public class Random {
    public static void main(String[] args){
        // generating a random number
        int randomNumber = (int) (Math.random() * 100) + 1; // random number that is 1 - 100
        // popup for the random number generated
        JOptionPane.showMessageDialog(null, "Random number:" + randomNumber, "random number generated", JOptionPane.INFORMATION_MESSAGE);
    }
}
