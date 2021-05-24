import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class ex1626 extends Application {
    @Override
    public void start(Stage primaryStage) {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\hymn.mp3");
        ImageView image = new ImageView(new Image("https://aboutkazakhstan.com/images/flag/kazakhstan-flag.gif"));
        MediaPlayer mediaPlayer = new MediaPlayer(new Media("https://upload.wikimedia.org/wikipedia/commons/transcoded/d/d9/Kazakhstan_%28instrumental%29.oga/Kazakhstan_%28instrumental%29.oga.mp3"));

        //MediaPlayer mediaPlayer = new MediaPlayer(new Media(file.toURI().toString()));
        mediaPlayer.play();

        Line line = new Line(350, 600, 350, -200);
        Pane pane = new Pane(image);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(96000));
        pathTransition.setPath(line);
        pathTransition.setNode(image);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.play();

        Scene scene = new Scene(pane, 700, 500);
        primaryStage.setTitle("National Anthem");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}