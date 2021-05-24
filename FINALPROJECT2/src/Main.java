import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main extends Application {
    protected Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane loadPane = new StackPane();
        Button loadFileButton = new Button("Load File");
        loadPane.setPrefSize(250,250);
        loadPane.getChildren().add(loadFileButton);
        Scene scene = new Scene(loadPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Quiz Viewer");
        primaryStage.setResizable(false);
        primaryStage.show();
        loadFileButton.setOnAction(e -> {
            try {
                FileChooser fileChooser = new FileChooser();
                fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(".txt","*txt"));
                File file = fileChooser.showOpenDialog(new Stage());
                if (file == null) return;
                Quiz quiz = new Quiz().loadFromFile(file.getAbsolutePath());
                if (quiz.getQuestions().size() == 0)
                    throw new InvalidQuizFormatException("");
                else {
                    primaryStage.setScene(new Scene(getQuestionPane(quiz)));
                    primaryStage.setTitle("Quiz Viewer");
                    primaryStage.setResizable(false);
                    primaryStage.show();
                }
            } catch (InvalidQuizFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Quiz Viewer: Error");
                alert.setHeaderText("InvalidQuizFormatException");
                alert.setContentText("The file selected does not fit the requirements for a standard Quiz text file format...");
                alert.showAndWait();
            }
        });

    }
    public BorderPane getQuestionPane(Quiz quiz) {
        List<Question> questions = quiz.getQuestions();
        BorderPane borderPane = new BorderPane();
        borderPane.setMinSize(500,300);
        TextArea textArea = new TextArea();
        String welcome = "WELCOME TO QUIZ!!!" + "\n" + "YOU CAN START FROM ANY QUESTION.";
        Text welcomeText = new Text(welcome);
        textArea.setText(welcomeText.getText());
        textArea.setFont(Font.font("Times", 20));
        textArea.setPrefSize(400,90);
        textArea.setWrapText(true);
        textArea.setEditable(false);
        borderPane.setPadding(new Insets(10));
        borderPane.setTop(textArea);

        HBox bottomPane = new HBox();
        Text buttonText = new Text("FINISH");
        Button doneButton = new Button(buttonText.getText());
        doneButton.setStyle("-fx-base: #ADFF2F");
        buttonText.setFont(Font.font(20));
        int count = 0;
        Label statusLabel = new Label("status");
        bottomPane.getChildren().addAll(statusLabel, doneButton);
        bottomPane.setSpacing(150);
        bottomPane.setAlignment(Pos.CENTER);
        borderPane.setBottom(bottomPane);
        String[] questionNumbers = new String[questions.size()];
        for (int i = 0; i < questionNumbers.length; i++) {
            questionNumbers[i] = "Question #" + (i + 1);
        }
        Collections.shuffle(questions);
        VBox[] boxes = new VBox[questions.size()];
        for (int i = 0; i < boxes.length; i++)
            boxes[i] = new VBox();
        for (int i = 0; i < boxes.length; i++) {
            if (questions.get(i) instanceof Test) {
                TestPane testPane = new TestPane();
                String description = questions.get(i).getDescription();
                String opt1 = questions.get(i).toString().replaceAll(description, "Description");
                String opt2 = opt1.replaceAll("A\\) ", "");
                String opt3 = opt2.replaceAll("B\\) ", "");
                String opt4 = opt3.replaceAll("C\\) ", "");
                String opt5 = opt4.replaceAll("D\\) ", "");
                String[] arrau = opt5.split("\n");
                List<String> arr = new LinkedList<String>(Arrays.asList(arrau));
                arr.remove(0);
                Collections.shuffle(arr);
                String[] options = arr.toArray(new String[arr.size()]);
                testPane.setAnswersOnRadioButton(options);
                boxes[i].getChildren().add(testPane);
            } else if (questions.get(i) instanceof FillIn) {
                FillInPane fillInPane = new FillInPane();
                boxes[i].getChildren().add(fillInPane);
            }
        }
        ListView<String> listView = new ListView<String>(FXCollections.observableArrayList(questionNumbers));
        listView.setPrefSize(103,160);
        borderPane.setLeft(new ScrollPane(listView));
        listView.getSelectionModel().selectedItemProperty().addListener(ov -> {
            for (Integer i: listView.getSelectionModel().getSelectedIndices()) {
                if (questions.get(i) instanceof FillIn) {
                    textArea.setText(questions.get(i).toString());
                    textArea.setFont(Font.font(14));
                } else {
                    textArea.setText(questions.get(i).getDescription());
                    textArea.setFont(Font.font(14));
                }
                borderPane.setCenter(boxes[i]);
                boxes[i].setPadding(new Insets(10));
                boxes[i].setAlignment(Pos.CENTER);
            }
        });
        return borderPane;
    }
}

