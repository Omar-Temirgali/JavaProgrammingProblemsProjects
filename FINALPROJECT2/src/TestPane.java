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
    private RadioButton rdA, rdB, rdC, rdD;
    private Text text;

    TestPane() {
        rdA = new RadioButton(null);
        rdB = new RadioButton(null);
        rdC = new RadioButton(null);
        rdD = new RadioButton(null);
        setSpacing(8);
        setPrefWidth(300);
        text = new Text("Clear selection");
        text.setFont(Font.font(11));
        text.setFill(Color.BLUE);
        getChildren().addAll(rdA, rdB, rdC, rdD,text);
        ToggleGroup group = new ToggleGroup();
        rdA.setToggleGroup(group);
        rdB.setToggleGroup(group);
        rdC.setToggleGroup(group);
        rdD.setToggleGroup(group);
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
                rdA.setSelected(false);
                rdB.setSelected(false);
                rdC.setSelected(false);
                rdD.setSelected(false);
            }
        });
    }
    public void setAnswersOnRadioButton(String[] options) {
        List<String> optionsA = Arrays.asList(options);
        Collections.shuffle(optionsA);
        rdA.setText(optionsA.get(0));
        rdB.setText(optionsA.get(1));
        rdC.setText(optionsA.get(2));
        rdD.setText(optionsA.get(3));
    }
}

