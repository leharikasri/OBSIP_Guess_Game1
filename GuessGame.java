import javax.swing.*;

public class GuessGame {
    public static void main(String[] args) {
        int guess = (int) (Math.random() * 100 + 1);
        int ans = 0;
        int count = 1;
        try {
            while (ans != guess) {
                String response = JOptionPane.showInputDialog(null, "Guess a number between 1 and 100");
                ans = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(ans, guess, count));
                count++;
            }
        } catch (Exception e) {
            
        }
    }

    public static String determineGuess(int ans , int guess , int count)
    {
        if (ans <= 0 || ans > 100) {
            return "Your guess is invalid";
        } else if (ans == guess) {
            return "Correct! \n Total Guesses : " + count;
        } else if (ans > guess) {
            return "Your guess is too high, try again, \n Try Number : " + count;
        } else if (ans < guess) {
            return "Your guess is too low, try again, \n Try Number :  " + count;
        } else {
            return "Your guess is incorrect \n Try Number : " + count;
        }
    }
}