import javax.swing.*;

public class Assign2{
    public static void main(String[] args) {
        String[] questions = {
                "How many players played well this season\nA. 4 B. 7 C. 9",
                "How many points did Boswell score this season\nA. 3 B. 40. C. 114",
                "How many penalties did the Steelers have in the season\nA. 1 B. 3 C. 7"
        };

        char[] answers = {'C', 'C', 'B'};
        char ans = ' ';
        int x, correct = 0;

        // added in a string builder so that it can keep track of answers , wrong, correct, and user input
        StringBuilder incorrectAnswers = new StringBuilder();

        for (x = 0; x < questions.length; ++x) {
            boolean isGood = false;
            int firstError = 0;

            while (!isGood) {
                isGood = true;
                String entry = JOptionPane.showInputDialog(null, questions[x]);
                ans = entry.charAt(0);

                if (ans != 'A' && ans != 'B' && ans != 'C' && ans != 'D') {
                    isGood = false;
                    if (firstError == 0) {
                        questions[x] = questions[x] +
                                "\nYour Answer must be A, B, or C";
                        firstError = 1;
                    }
                }
            }

            if (ans == answers[x]) {
                ++correct;
                JOptionPane.showMessageDialog(null, "Correct!");
            } else {
                incorrectAnswers.append("The Question: ".toUpperCase()).append(questions[x]).append("\n");
                incorrectAnswers.append("Your Answer: ".toUpperCase()).append(ans).append("\n");
                incorrectAnswers.append("Correct Answer: ".toUpperCase()).append(answers[x]).append("\n\n");

                JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + answers[x]);
            }
        }

        JOptionPane.showMessageDialog(null, "You received " + correct + " right and\n" + (questions.length - correct) + " wrong");

        if (incorrectAnswers.length() > 0) {
            JOptionPane.showMessageDialog(null, "Incorrect Answers:\n" + incorrectAnswers.toString());
        }
    }
}