import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ComboBoxDemo extends Application {
    private String[] flagTitles = {"Kazakhstan", "China", "Denmark",
            "France", "Germany", "India", "Norway", "UK",
            "USA"};

    private ImageView[] flagImage = {new ImageView("file:images/kz.png"),
            new ImageView("file:images/china.gif"),
            new ImageView("file:images/denmark.gif"),
            new ImageView("file:images/fr.gif"),
            new ImageView("file:images/germany.gif"),
            new ImageView("file:images/india.gif"),
            new ImageView("file:images/norway.gif"),
            new ImageView("file:images/uk.gif"),
            new ImageView("file:images/us.gif")};

    private String[] flagDescription = new String[9];
    private DescriptionPane descriptionPane = new DescriptionPane();
    private ComboBox<String> comboBox = new ComboBox<>();

    @Override
    public void start(Stage primaryStage) {
        flagDescription[0] = "Kazakhstan national flag ...";
        flagDescription[1] = "China national flag ... ";
        flagDescription[2] = "Denmark national flag ... ";
        flagDescription[3] = "France national flag ... ";
        flagDescription[4] = "Germany national flag ... ";
        flagDescription[5] = "India national flag ... ";
        flagDescription[6] = "Norway national flag ... ";
        flagDescription[7] = "UK national flag ... ";
        flagDescription[8] = "US national flag ... ";

        setDisplay(0);

        // Add combo box and description pane to the border pane
        BorderPane pane = new BorderPane();

        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(comboBox);


        comboBox.setPrefWidth(400);
        comboBox.setValue("Kazakhstan");
        comboBox.getItems().addAll(flagTitles);

        pane.setTop(paneForComboBox);
        pane.setCenter(descriptionPane);

        // Display the selected country
        comboBox.setOnAction(e -> setDisplay(comboBox.getItems().indexOf(comboBox.getValue())));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("ComboBoxDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setDisplay(int index) {
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }
}
