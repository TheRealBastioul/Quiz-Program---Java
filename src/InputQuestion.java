import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class InputQuestion extends Question{
    InputQuestion(String question, String answer){
        super(question);
        JPanel ordered = new JPanel();
        submit(ordered);
        this.question.add(ordered);
        initQuestionDialog();
        correctAnswer = answer;

    }
    void submit(JPanel ordered) {
        JPanel inputquestion = new JPanel();
        JTextField inputanswer = new JTextField(11);
        JButton submit = new JButton("SUBMIT");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.answer = inputanswer.getText();
                System.out.println(question.answer);
                question.dispose();
            }
        });
        ordered.add(inputanswer);
        ordered.add(submit);
    }
}
