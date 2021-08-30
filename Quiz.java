package quiz_desktop;
public class Quiz {

	
	public static void main(String[] args) {
		
	
		Question question = new TrueFalseQuestion("Alligators have between 74 and 80 teeth","t");
		question.check();
		
		Question question1 = new TrueFalseQuestion("java the least in-demand programming language","f");
		question1.check();
		
		Question question2 = new TrueFalseQuestion("cheetah is the fastest animal in land","t");
		question2.check();
		
		
		Question question3 = new MultipleChoiceQuestion("What is a quiz?",
				 "a test of knowledge, especially a brief informal test given to students",
				 "42",
				 "a duck",
				 "to get to the other side",
				 "To be or not to be, that is the question.",
				 "a");
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion("the square root of the number 16 is :",
				 "8",
				 "13",
				 "4",
				 "21",
				 "0ta",
				 "c");
		question4.check();
		question.showResults();
		
		
	}// end of main

} // end of class
