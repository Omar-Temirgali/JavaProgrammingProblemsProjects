import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;

public class ex1621 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Files\\music\\CHIU PI (邱比) - Aquarius (新年).mp3");
        TextField textField = new TextField("0");
        textField.setAlignment(Pos.CENTER);
        textField.setFont(Font.font(70));
        textField.setPrefColumnCount(3);
        textField.setFocusTraversable(false);

        StackPane pane = new StackPane(textField);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
            textField.setText((Integer.parseInt(textField.getText()) - 1) + "");
        }));
        textField.setOnAction(e -> {
            if (timeline.getStatus() == Animation.Status.RUNNING) {
                timeline.stop();
            }
            timeline.setCycleCount(Integer.parseInt(textField.getText()));
            textField.setEditable(false);
            timeline.play();
        });

        MediaPlayer mediaPlayer = new MediaPlayer(new Media(file.toURI().toString()));
        timeline.setOnFinished(e -> {
            mediaPlayer.play();
        });
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("ex16.21");
        primaryStage.show();
    }
}
