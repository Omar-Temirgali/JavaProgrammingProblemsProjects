import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class ListViewDemo extends Application {

    private String[] flagTitles = {"Kazakhstan", "China", "Denmark",
            "France", "Germany", "India", "Norway", "UK",
            "US"};

    private ImageView[] ImageViews = {
            new ImageView("file:images/kz.png"),
            new ImageView("file:images/china.gif"),
            new ImageView("file:images/denmark.gif"),
            new ImageView("file:images/fr.gif"),
            new ImageView("file:images/germany.gif"),
            new ImageView("file:images/india.gif"),
            new ImageView("file:images/norway.gif"),
            new ImageView("file:images/uk.gif"),
            new ImageView("file:images/us.gif")
    };

    @Override
    public void start(Stage primaryStage) {
        ListView<String> lv = new ListView<>(FXCollections.observableArrayList(flagTitles));
        lv.setPrefSize(100, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // Create a pane to hold image views
        FlowPane imagePane = new FlowPane(10, 10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(imagePane);

        lv.getSelectionModel().selectedItemProperty().addListener(
                new InvalidationListener() {
                    @Override
                    public void invalidated(Observable observable) {
                        imagePane.getChildren().clear();
                        for (Integer i : lv.getSelectionModel().getSelectedIndices()) {
                            imagePane.getChildren().add(ImageViews[i]);
                        }
                    }
                });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 450, 400);
        primaryStage.setTitle("ListViewDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
