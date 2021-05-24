import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class week6_3 extends Application {
    private StackPane pane = new StackPane();
    private final double width = 500;
    private final double height = 500;
    private final int numberOfPoints = 8;
    @Override
    public void start(Stage primaryStage) {
        pane.setStyle("-fx-background-color: lightgray");
        Polygon octagon = new Polygon();
        octagon.setFill(Color.RED);
        octagon.setStroke(Color.WHITE);
        octagon.setStrokeWidth(5);

        Text stop = new Text("STOP");
        stop.setFont(Font.font(100));
        stop.setFill(Color.WHITE);
        pane.getChildren().addAll(octagon, stop);
        ObservableList<Double> points = octagon.getPoints();

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        setPoints(points);
        pane.widthProperty().addListener(event -> {
            renewPoints(points);
            double radius = Math.min(pane.getWidth(), pane.getHeight()) * 0.25;
            stop.setFont(Font.font(radius));
        });
        primaryStage.setTitle("Exercise 15.23");
        primaryStage.show();
    }
    private void setPoints(ObservableList<Double> points)  {
        double radius = Math.min(pane.getWidth(), pane.getHeight()) * 0.4;
        double n = 180 - (180 * ((double)numberOfPoints - 2)) / (double)numberOfPoints;
        for (int i = 0; i < numberOfPoints; i++) {
            points.add(pane.getWidth() / 2 + radius * Math.cos(Math.toRadians(i * n + n / 2)));
            points.add(pane.getHeight() / 2 - radius * Math.sin(Math.toRadians(i * n + n / 2)));
        }
    }
    private void renewPoints(ObservableList<Double> points) {
        points.clear();
        setPoints(points);
    }
}
