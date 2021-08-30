package quiz_desktop;
import javax.swing.*;
public class TrueFalseQuestion extends Question {
	
	
//	@Override
//	String ask() {          
//		question.setVisible(true);
//                return question.answer;
//	  } 

	
	public TrueFalseQuestion(String question, String answer) {
		
	super(question);
        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");
        this.question.add(buttons);
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
        initQuestionDialog();
        answer = answer.toUpperCase();

		if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) 
			correctAnswer = "TRUE";
		
		if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO"))
			correctAnswer = "FALSE"; 
	

        } //end of the consturcutor
	

	
        void addButton(JPanel buttons, String label){
            JButton button = new JButton(label);
            button.addActionListener(question);
            buttons.add(button);
            
        }

} // end of the class



