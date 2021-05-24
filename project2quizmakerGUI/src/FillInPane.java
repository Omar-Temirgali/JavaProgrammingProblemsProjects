import javafx.event.EventHandler;
        import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.VBox;
        import javafx.scene.paint.Color;
        import javafx.scene.text.Text;

public class FillInPane extends VBox {
    private TextField textField;
    public FillInPane() {
        textField = new TextField();
        textField.setPromptText("Type your answer ...");
        textField.setPrefColumnCount(30);
        Text text = new Text("Clear answer");
        text.setFill(Color.BLUE);
        text.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                text.setUnderline(true);
            }
        });
        text.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                text.setUnderline(false);
            }
        });
        text.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                textField.setText(null);
            }
        });

        setAlignment(Pos.CENTER_LEFT);
        getChildren().addAll(textField, text);
    }
    public String getText(){
        return textField.getText().toLowerCase();
    }
    public TextField getTextField() {
        return textField;
    }
}
