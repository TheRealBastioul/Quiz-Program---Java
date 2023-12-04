import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener {
    String answer;
    public void actionPerformed(ActionEvent e){
        answer = e.getActionCommand();
        System.out.println(answer);
        dispose();
    }
}
