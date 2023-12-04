import javax.swing.*;
import java.awt.*;

public class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    QuestionDialog question;
    String correctAnswer;
    String ask(){
        question.setVisible(true);
        return question.answer;
    }
    Question(String question){
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0, 1));
        this.question.add(new JLabel(" "+question+" ", JLabel.CENTER));
    }
    void initQuestionDialog(){
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }
    static void itsCorrect(){
        JOptionPane.showMessageDialog(null, "Correct!");
    }
    static void itsIncorrect(){
        JOptionPane.showMessageDialog(null, "Incorrect.");
    }
    void check(){
        while (true) {
            String answer = ask();
            if (answer.equals(correctAnswer)) {
                nCorrect += 1;
                nQuestions += 1;
                itsCorrect();
                break;
            } else{
                nQuestions += 1;
                itsIncorrect();
                break;
            }
        }
    }
    void showResults(){
        double finalScore = (float) (nCorrect * 100.0 / nQuestions);
        String theGrade = Double.toString(finalScore);
        String numCorrect = Integer.toString(nCorrect);
        String allQuestions = Integer.toString(nQuestions);
        String gradeMessage = "You got "  + numCorrect + " out of " + allQuestions + " questions correct.\n" + ("You scored " + theGrade + "% on this Quiz.");
        JOptionPane.showMessageDialog(null, gradeMessage);
    }
}
