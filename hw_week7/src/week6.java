import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class week6 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(40);
        Rectangle rectangle = new Rectangle(100,60);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        Button rotate = new Button("Rotate");
        rotate.setOnAction(event -> {
                rectangle.setRotate(rectangle.getRotate() + 15);
        });
        pane.getChildren().addAll(rectangle, rotate);
        Scene scene = new Scene(pane, 300,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
