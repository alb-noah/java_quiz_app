/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_desktop;
import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener{
    String answer;

    @Override
    public void actionPerformed(ActionEvent e) {
        answer = e.getActionCommand();
        dispose(); 

    }
 
    
     
}

