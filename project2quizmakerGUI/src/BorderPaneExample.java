import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        TextArea textArea = new TextArea();
        textArea.setPrefSize(300,100);
        Button left = new Button();
        Button right = new Button();
        Pane pane = new Pane();
        Pane paneCenter = new Pane();
        paneCenter.setStyle("-fx-border-color: black");
        pane.setStyle("-fx-border-color: red");
        //top
        root.setTop(textArea);
        BorderPane.setMargin(textArea,new Insets(10,10,10,10));

        left.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(left);
        // Set margin for left area.
        BorderPane.setMargin(left, new Insets(10, 10, 10, 10));

        paneCenter.setPadding(new Insets(5, 5, 5, 5));
        root.setCenter(paneCenter);
        // Alignment.
        BorderPane.setAlignment(paneCenter, Pos.CENTER);

        right.setPadding(new Insets(5, 5, 5, 5));
        root.setRight(right);
        // Set margin for right area.
        BorderPane.setMargin(right, new Insets(10, 10, 10, 10));

        pane.setPadding(new Insets(5, 5, 5, 5));
        root.setBottom(pane);
        // Alignment.
        BorderPane.setAlignment(pane, Pos.TOP_RIGHT);

        // Set margin for bottom area.
        BorderPane.setMargin(pane, new Insets(10, 10, 10, 10));

        Scene scene = new Scene(root, 550, 250);

        primaryStage.setTitle("BorderPane Layout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
