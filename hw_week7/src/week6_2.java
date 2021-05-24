import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class week6_2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        CirclePane paneC = new CirclePane(200,200,20);
        Button left = new Button("Left");
        left.setOnAction(event -> {
            paneC.left();
        });
        Button right = new Button("Right");
        right.setOnAction(event -> {
            paneC.right();
        });
        Button up = new Button("Up");
        up.setOnAction(event -> {
            paneC.up();
        });
        Button down = new Button("Down");
        down.setOnAction(event -> {
            paneC.down();
        });
        HBox hbox = new HBox(left, right, up, down);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10,10,30,10));
        BorderPane pane = new BorderPane();
        pane.setCenter(paneC);
        pane.setBottom(hbox);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public class CirclePane extends Pane {
        private Circle circle;
        CirclePane(double X, double Y, double radius) {
            circle = new Circle(X,Y,radius);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            getChildren().add(circle);
        }
        public void left() {
            circle.setCenterX(circle.getCenterX() - 9);
        }
        public void right() {
            circle.setCenterX(circle.getCenterX() + 9);
        }
        public void up() {
            circle.setCenterY(circle.getCenterY() - 9);
        }
        public  void down() {
            circle.setCenterY(circle.getCenterY() + 9);
        }
    }
}
