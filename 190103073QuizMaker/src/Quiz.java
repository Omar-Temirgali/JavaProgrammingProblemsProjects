import java.util.*;
import java.io.*;

public class Quiz {
	private String name;
	private ArrayList<Question> questions;

	public Quiz() {
		questions = new ArrayList<Question>();
	}
	public void setName(String name) {
		this.name = name.replace(".txt", "");
	}
	public String getName() {
		return name;
	}
	public void addQuestion(Question question) {
		questions.add(question);
	}
	public static Quiz loadFromFile(String quizFile) throws InvalidQuizFormatException, FileNotFoundException {
		if (!quizFile.contains(".txt")) {
			throw new InvalidQuizFormatException("Not valid!");
		}

		if (!(new Scanner(new File(quizFile))).hasNext()) {
			throw new InvalidQuizFormatException("No line found");
		}

		Quiz quiz = new Quiz();
		
		Scanner sc = new Scanner(new File(quizFile));
		quiz.setName(quizFile);
		boolean checkQuest = false;
		Test test = new Test();
		ArrayList<String> options = new ArrayList<String>();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.length() == 0) {
				if (checkQuest) {
					String[] opt = new String[options.size()];
					Collections.shuffle(options);
					options.toArray(opt);
					test.setOptions(opt);
					quiz.addQuestion(test);
				}
				checkQuest = false;
				continue;
			} else if (!checkQuest) {
				if (line.indexOf("{blank}") != -1) {
					FillIn fillin = new FillIn();
					fillin.setDescription(line);
					String answer = sc.nextLine().toLowerCase();
					fillin.setAnswer(answer);
					quiz.addQuestion(fillin);
					continue;
				} else {
					checkQuest = true;
					test = new Test();
					test.setDescription(line);
					String answer = sc.nextLine();
					test.setAnswer(answer);
					options = new ArrayList<String>();
					options.add(answer); 
				}
			} else {
				options.add(line);
			}
		}
			if (checkQuest) {
				String[] optns = new String[options.size()];
				Collections.shuffle(options);
				options.toArray(optns);
				test.setOptions(optns);
				quiz.addQuestion(test);
			}
		return quiz;
	}
	public String toString() {
		String decoration = "-----------------------------------------------------------\n";
		String welcome = "\nWELCOME TO \"" + getName() + "\" QUIZ!\n";
		return decoration + welcome + decoration;
	}
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println(toString());
		int m = questions.size();
		int counter = 0;
		Collections.shuffle(questions);
		for (Question quest: questions) {
			boolean isFillIn = quest instanceof FillIn;
			if (isFillIn) {
				FillIn fillin = (FillIn) quest;
				System.out.println(fillin);
				System.out.print("Type your answer: ");
			} else {
				Test test = (Test) quest;
				System.out.println(test);
				System.out.print("Enter the correct choice: ");
			}
			while (true) {
				String input = sc.nextLine();
				if (isFillIn) {
					input = input.toLowerCase();
					if (input.equals(quest.getAnswer())) {
						counter++;
						System.out.println("Correct!");
						break;
					}
					System.out.println("Incorrect!");
					break;
				} else {
					int labelsCount = ((Test) quest).getNumOfOptions();
					int inputChoice = (int) input.charAt(0);
					if (input.length() == 1 && inputChoice >= (int)'A' && inputChoice < labelsCount + ((int)'A')) {
						if (((Test) quest).getOptionAt(inputChoice - (int)'A') == quest.getAnswer()) {
							counter++;
							System.out.println("Correct!");
							break;
						} else {
							System.out.println("Incorrect!");
							break; 
						}
					} else {
						System.out.print("Invalid choice! Try again (Ex: A, B, ...): ");
				 	}
				}
			}
			System.out.println("-----------------------------------------------------------\n");
		}
		double testGrade = ((double)counter/m) * 100;
		System.out.println("Correct Answers: " + counter + "/" + m + " (" + testGrade + "%)");
	}	
}