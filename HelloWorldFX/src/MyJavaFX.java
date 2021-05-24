import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    private Circle circle;
    private Arc arc;
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        createC();
        pane.getChildren().add(arc);
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    public void createC() {
        arc = new Arc();
        arc.setFill(Color.YELLOW);
        arc.setStroke(Color.YELLOWGREEN);
        //arc.setCenterX(50);
        //arc.setCenterY(50);
        arc.setRadiusX(25);
        arc.setRadiusY(25);
        arc.setStartAngle(30);
        arc.setLength(300);
        arc.setType(ArcType.ROUND);
    }
}
