import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.LinkedList;

public class ex_20_2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new MainPane()));
        primaryStage.show();
    }
}

class MainPane extends BorderPane {
    private Label enter;
    private TextField textField;
    private ListView listView;
    private Button sort;
    private Button shuffle;
    private Button reverse;
    private LinkedList<String> list;

    MainPane() {
        list = new LinkedList<>();
        enter = new Label("Enter a word: ");
        textField = new TextField();
        textField.setPrefColumnCount(15);
        HBox hBox1 = new HBox(8, enter, textField);
        setTop(hBox1);
        listView = new ListView();
        listView.setPrefHeight(100);
        setCenter(listView);
        sort = new Button("Sort");
        shuffle = new Button("Shuffle");
        reverse = new Button("reverse");
        HBox hBox2 = new HBox(4, sort, shuffle, reverse);
        setBottom(hBox2);
        ObservableList<String> words = FXCollections.observableArrayList();
    }
}

