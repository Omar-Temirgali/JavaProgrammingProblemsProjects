public class QuizMaker {
	public static void main(String[] args) throws java.io.FileNotFoundException, InvalidQuizFormatException {
		try {
			java.io.File file = new java.io.File(args[0]);
			java.util.Scanner Scanner = new java.util.Scanner(file);
		} catch (java.io.FileNotFoundException ex) {
			System.out.println("Such a file does not exist!");
			System.exit(1);
		}
		Quiz quiz = Quiz.loadFromFile(args[0]);
		quiz.start();
	}
}