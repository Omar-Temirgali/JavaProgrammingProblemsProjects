import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class Game extends Application {
    private static Map map;
    private static Player player;
    private Food foods;
    public static void main(String[] args) {
        map = new Map(args[0]);
        player = new MyPlayer(map);
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        foods = new Food(map, player);
        map.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.LEFT) {
                int x = player.getPosition().getX();
                int y = player.getPosition().getY();
                if(x != 0) {
                    if(map.getValueAt(y, x - 1) != 1) player.moveLeft();
                } else System.out.println("Invalid position!");
            }
            else if(event.getCode() == KeyCode.UP) {
                int x = player.getPosition().getX();
                int y = player.getPosition().getY();
                if(y != 0) {
                    if(map.getValueAt(y - 1, x) != 1) player.moveUp();
                } else System.out.println("Invalid position!");
            }
            else if(event.getCode() == KeyCode.RIGHT) {
                int x = player.getPosition().getX();
                int y = player.getPosition().getY();
                int width = map.getSize();
                if(x != width - 1) {
                    if(map.getValueAt(y, x + 1) != 1) player.moveRight();
                } else System.out.println("Invalid position!");
            }
            else if(event.getCode() == KeyCode.DOWN) {
                int x = player.getPosition().getX();
                int y = player.getPosition().getY();
                int height = map.getSize();
                if(y != height - 1) {
                    if(map.getValueAt(y + 1, x) != 1) player.moveDown();
                } else System.out.println("Invalid position!");
            } 
            else System.out.println("Invalid key! Please use arrow keys!");
        });
        primaryStage.setScene(new Scene(map));
        primaryStage.setTitle("GAME");
        primaryStage.show();
        map.requestFocus();
    }
}