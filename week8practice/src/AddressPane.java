import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AddressPane extends GridPane {
    Label nameLabel;
    Label streetLabel;
    Label cityLabel;
    Label stateLabel;
    Label zipLabel;
    TextField nameTextField;
    TextField streetTextField;
    TextField cityTextField;
    TextField stateTextField;
    TextField zipTextField;
    AddressPane() {
        this.setPadding(new Insets(10));
        this.setHgap(10);
        this.setVgap(10);
        add(nameLabel, 0, 0);
        add(nameTextField, 1, 0);
        add(streetLabel, 1,0);
        add(cityLabel, 1,1);

    }
}
