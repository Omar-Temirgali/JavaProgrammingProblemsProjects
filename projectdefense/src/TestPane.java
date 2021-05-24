import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPane extends VBox {
    private RadioButton a, b, c, d;
    private Text clearSelection;

    TestPane(String description) {
        a = new RadioButton(null);
        b = new RadioButton(null);
        c = new RadioButton(null);
        d = new RadioButton(null);
        setSpacing(8);
        clearSelection = new Text("Clear selection");
        clearSelection.setFont(Font.font(11));
        clearSelection.setFill(Color.BLUE);
        Text questionDescription = new Text(description);
        questionDescription.setWrappingWidth(400);
        getChildren().addAll(questionDescription, a, b, c, d, clearSelection);
        ToggleGroup group = new ToggleGroup();
        a.setToggleGroup(group);
        b.setToggleGroup(group);
        c.setToggleGroup(group);
        d.setToggleGroup(group);
        clearSelection.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clearSelection.setUnderline(true);
            }
        });
        clearSelection.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                clearSelection.setUnderline(false);
            }
        });
        clearSelection.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                a.setSelected(false);
                b.setSelected(false);
                c.setSelected(false);
                d.setSelected(false);
            }
        });
    }
    public void setAnswersOnRadioButton(String[] options) {
        List<String> optionsAns = Arrays.asList(options);
        Collections.shuffle(optionsAns);
        a.setText(optionsAns.get(0));
        b.setText(optionsAns.get(1));
        c.setText(optionsAns.get(2));
        d.setText(optionsAns.get(3));

    }
}
