import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPane extends VBox {
    private RadioButton rdA = new RadioButton(null);
    private RadioButton rdB = new RadioButton(null);
    private RadioButton rdC = new RadioButton(null);
    private RadioButton rdD = new RadioButton(null);
    private Text text = new Text("Clear selection");

    public TestPane() {
        this.setSpacing(8);
        this.setPrefWidth(300);
        text.setFont(Font.font(11));
        text.setFill(Color.BLUE);
        this.getChildren().addAll(rdA, rdB, rdC, rdD,text);
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
    public String selectedRD() {
        if (rdA.isSelected())
            return rdA.getText();
        else if (rdB.isSelected())
            return rdB.getText();
        else if (rdC.isSelected())
            return rdC.getText();
        else if (rdD.isSelected())
            return rdD.getText();
        return null;
    }
    public boolean selectedRadioButton() {
        if (rdA.isSelected())
            return true;
        else if (rdB.isSelected())
            return true;
        else if (rdC.isSelected())
            return true;
        else if (rdD.isSelected())
            return true;
        return false;
    }
}
