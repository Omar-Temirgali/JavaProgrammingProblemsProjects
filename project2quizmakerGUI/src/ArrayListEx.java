import javafx.scene.layout.Pane;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) throws InvalidQuizFormatException {
//        Quiz quiz = new Quiz().loadFromFile("C:\\Users\\Lenovo\\Desktop\\Project\\onlyTest.txt");
//        List<Question> questions = quiz.getQuestions();
//        Collections.shuffle(questions);
//        String description = questions.get(0).getDescription();
//        System.out.println(description);
//        String opt1 = questions.get(0).toString().replaceAll(description, "Description");
//        String opt2 = opt1.replaceAll("A\\) ", "");
//        String opt3 = opt2.replaceAll("B\\) ", "");
//        String opt4 = opt3.replaceAll("C\\) ", "");
//        String opt5 = opt4.replaceAll("D\\) ", "");
//        String[] arrau = opt5.split("\n");
//        List<String> arr = new LinkedList<String>(Arrays.asList(arrau));
//        arr.remove(0);
////        for (String s: arr)
////            System.out.println(s);
//        String[] options = arr.toArray(new String[arr.size()]);
//        System.out.println(Arrays.toString(options));
//        String[] questionNumbers = new String[questions.size()];
//        for (int i = 0; i < questionNumbers.length; i++) {
//            questionNumbers[i] = String.valueOf(i+1);
//        }
//        System.out.println(Arrays.toString(questionNumbers));
        Pane[] panes = new Pane[5];
        for (int i = 0; i < panes.length; i++)
            panes[i] = new Pane();

        for (Pane pane: panes) {
            pane.getChildren().get(panes.hashCode());
        }
    }
}
