import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class FillInPane extends VBox {
    private TextField textField;
    private Text clearAnswer;

    FillInPane(String description) {
        textField = new TextField();
        textField.setPromptText("Type your answer ...");
        Text questionDescription = new Text(description);
        questionDescription.setWrappingWidth(370);
        clearAnswer = new Text("Clear answer");
        clearAnswer.setFill(Color.BLUE);
        clearAnswer.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clearAnswer.setUnderline(true);
            }
        });
        clearAnswer.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clearAnswer.setUnderline(false);
            }
        });
        clearAnswer.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textField.setText(null);
            }
        });
        setSpacing(10);
        getChildren().addAll(questionDescription,textField, clearAnswer);
    }
}
