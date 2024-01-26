package Swing;
import javax.swing.*;
public class survey {
    public static void main(String[] args){
        String[] questions =
        {
            "How many players played well this season\nA. 4 B. 7 C. 9",
            "How many points did Boswell score this season\nA. 3 B. 40. C. 114",
            "How many penaltys did the steelers have in the season\nA. 1 B. 3 C. 7"
        };

        char[] answers = {'C', 'C', 'B'};
        char ans = ' ';
        int x, correct = 0;
        String entry;
        boolean isGood;
        for (x = 0; x < questions.length; ++x) {
            isGood = false;
            int firstError = 0;
            while(!isGood)
            {
                isGood = true;
                entry = JOptionPane.showInputDialog(null, questions[x]);
                ans = entry.charAt(0);
                if(ans != 'A' && ans != 'B' && ans != 'C' && ans != 'D')
                {
                    isGood = false;
                    if(firstError == 0)
                    {
                        questions[x] = questions[x] + 
                        "\nYour Answer must be A B or C";
                        firstError = 1;
                    }
                }
            }
            if(ans == answers[x])
            {
                ++correct;
                JOptionPane.showMessageDialog(null, "Correct!");
            }
            else
                JOptionPane.showMessageDialog(null, "The correct answer is "
                + answers[x]);
    }
    JOptionPane.showMessageDialog(null, "you recieved"
    + correct + " right and\n" + (questions.length - correct) + " wrong");
}
}