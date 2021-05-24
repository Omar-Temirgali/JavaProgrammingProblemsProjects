import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class javafx extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Button btOk = new Button("OK");
        //Scene scene = new Scene(btOk, 200, 250);
        /**primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();*/

        /**Pane pane1 = new Pane();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane1.widthProperty().divide(2));
        circle.centerYProperty().bind(pane1.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.GREEN);
        circle.setFill(Color.YELLOW);
        pane1.getChildren().add(circle);
        Scene scene2 = new Scene(pane1, 300,300);
        Stage stage2 = new Stage();
        stage2.setTitle("Show Circle");
        stage2.setScene(scene2);
        //stage2.setResizable(false);
        stage2.show();*/
        Stage stage = new Stage();
        StackPane pane = new StackPane();
        Button btOk = new Button("OK");
        btOk.setRotate(90);
        btOk.setStyle("-fx-border-color: green;");
        pane.getChildren().add(btOk);
        //pane.setRotate(20);
        pane.setStyle("-fx-border-color: red; -fx-background-color: red;");

        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("Node");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
