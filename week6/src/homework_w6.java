import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;

public class homework_w6 extends Application {
    private TextField tfFullName = new TextField();
    private TextField tfEmailID = new TextField();
    private TextField tfEventDay = new TextField();

    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        Button btSub = new Button("Submit");
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(70,150,70,150));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(new Label("Full Name: "), 0, 0);
        pane.add(tfFullName, 1, 0);
        pane.add(new Label("Email ID: "), 0, 1);
        pane.add(tfEmailID, 1, 1);
        pane.add(new Label("Event Day: "), 0, 2);
        pane.add(tfEventDay, 1, 2);
        pane.add(btSub, 1,3);
        btSub.setOnAction(e -> {
            try {
                FileWriter fr = new FileWriter(new File("students'_list.txt"), true);
                BufferedWriter br = new BufferedWriter(fr);
                PrintWriter pr = new PrintWriter(br);
                pr.write("\n" + tfFullName.getText());
                pr.write("\n" + tfEmailID.getText());
                pr.write("\n" + tfEventDay.getText());
                pr.write("\n");
                pr.close();
                br.close();
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            tfFullName.clear();
            tfEmailID.clear();
            tfEventDay.clear();
        });

        GridPane.setHalignment(btSub, HPos.CENTER);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Registration Form JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
