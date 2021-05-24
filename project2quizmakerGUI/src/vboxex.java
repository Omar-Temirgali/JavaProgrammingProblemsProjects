import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class vboxex extends Application {
    private Quiz quiz = Quiz.loadFromFile("C:\\Users\\Lenovo\\Desktop\\Project\\JavaQuiz.txt");
    private List<Question> questions = quiz.getQuestions();
    private Pane[] vBoxes;
    private FillInPane fillInPane;
    private TestPane testPane;
    private int count = 0;

    public vboxex() throws InvalidQuizFormatException {
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        TextArea textArea = new TextArea();
        Button finish = new Button("Finish");
        textArea.setPrefSize(300,100);
        textArea.setWrapText(false);
        Collections.shuffle(questions);
        vBoxes = new VBox[questions.size()];
        for (int i = 0; i < vBoxes.length; i++) {
            vBoxes[i] = new VBox();
        }

        ListView<String> listView = new ListView<String>(FXCollections.observableArrayList(getVboxNumbers()));
        listView.setPrefSize(200,200);
        listView.getSelectionModel().selectedItemProperty().addListener(ov -> {
            for (Integer i: listView.getSelectionModel().getSelectedIndices()) {
                if (questions.get(i) instanceof FillIn) {
                    textArea.setText(questions.get(i).toString());
                    //if (getTextField(getPane(i)).getText() != null) {
//                        if (textArea.getText() == questions.get(i).getDescription()){
//                            if (getTextField(getPane(i)).getText() == questions.get(i).getAnswer()) {
//                                count.getAndIncrement();
//                            }
//                        }
                    //}
                } else {
                    textArea.setText(questions.get(i).getDescription());
                }
                borderPane.setCenter(vBoxes[i]);
                vBoxes[i].setPadding(new Insets(10));
//                vBoxes[i].setAlignment(Pos.CENTER);
            }
        });
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i) instanceof Test) {
                testPane = new TestPane();
                testPane.setAlignment(Pos.CENTER_LEFT);
//                vBoxes[i].getChildren().add(testPane);
                vBoxes[i] = testPane;
                testPane.setAnswersOnRadioButton(getOptions(i));

//                if (textArea.getText() == questions.get(i).getDescription()) {
////                    if (testPane.selectedRD() == questions.get(i).getAnswer()) count++;
////                }
            } else if (questions.get(i) instanceof FillIn) {
                fillInPane = new FillInPane();
                fillInPane.setAlignment(Pos.CENTER_LEFT);
//                vBoxes[i].getChildren().add(fillInPane);
                vBoxes[i] = fillInPane;
                if (getTextField(getPane(i)).getText() == questions.get(i).getAnswer()) {
                    count++;
                }
//                if (textArea.getText() == questions.get(i).getDescription()) {
//                    if (fillInPane.getText() == questions.get(i).getAnswer()) count++;
//                }
            }
        }
        finish.setOnAction(e -> {
            System.out.println(count);
        });
        borderPane.setTop(textArea);
        borderPane.setLeft(new ScrollPane(listView));
        borderPane.setRight(finish);
        Scene scene = new Scene(borderPane,600,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public String[] getOptions(int n) {
        String description = questions.get(n).getDescription();
        String opt1 = questions.get(n).toString().replaceAll(description, "Description");
        String opt2 = opt1.replaceAll("A\\) ", "");
        String opt3 = opt2.replaceAll("B\\) ", "");
        String opt4 = opt3.replaceAll("C\\) ", "");
        String opt5 = opt4.replaceAll("D\\) ", "");
        String[] arrau = opt5.split("\n");
        List<String> arr = new LinkedList<String>(Arrays.asList(arrau));
        arr.remove(0);
        Collections.shuffle(arr);
        String[] options = arr.toArray(new String[arr.size()]);
        return options;
    }
    public Pane getPane(int i) {
        return vBoxes[i];
    }
    public TextField getTextField(Pane vBox) {
        if (vBox instanceof FillInPane)
            return fillInPane.getTextField();
//        return fillInPane.getTextField();
        return null;
    }
    public String[] getVboxNumbers() {
        String[] vboxNumbers = new String[questions.size()];
        for (int i = 0; i < vboxNumbers.length; i++) {
            vboxNumbers[i] = "Question #" + (i + 1);
        }
        return vboxNumbers;
    }
}
