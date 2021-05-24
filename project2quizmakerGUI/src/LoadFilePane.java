import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class LoadFilePane extends StackPane {
//    protected Stage stage;
    public LoadFilePane() {
        Button loadFileButton = new Button("Load File");
        this.getChildren().add(loadFileButton);
        loadFileButton.setOnAction(event -> {
            try {
                FileChooser fileChooser = new FileChooser();
                File file = fileChooser.showOpenDialog(null);
                if (!file.getName().contains(".txt"))
                    throw new Exception("");
                Quiz quiz = new Quiz().loadFromFile(file.getAbsolutePath());
                if (quiz.getQuestions().size() == 0) {
                    throw new InvalidQuizFormatException("");
                } else {

                }
            } catch (InvalidQuizFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Quiz Viewer");
                alert.setHeaderText("InvalidQuizFormatException");
                alert.setContentText("The file selected does not fit the requirements for a standard Quiz text file format...");
                alert.showAndWait();
            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Quiz Viewer");
                alert.setHeaderText("QuizFormatException");
                alert.setContentText("The file is not a txt file");
                alert.showAndWait();
            }
        });
        setMinSize(250,250);
    }
}
