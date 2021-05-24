import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
public class MyPlayer implements Player {
    Map map; 
    Position position = new Position();
    Circle ball = new Circle();
    MyPlayer(Map mainMap) {
        map = mainMap; 
        position = map.getStart();
        ballStyle();
        map.add(ball, position.getX(), position.getY());
    }
    public void ballStyle() {
        ball.setRadius(map.getUnit()/2 - 6);
        ball.setFill(Color.BROWN); 
        ball.setStrokeWidth(6);  
        ball.setStroke(Color.AQUA);
    }
    @Override
    public void moveLeft() {
        map.getChildren().remove(ball);
        int x = position.getX() - 1;
        int y = position.getY();
        map.add(ball, x, y);
        position.setX(x);
    }
    public void moveRight() {
        map.getChildren().remove(ball);
        int x = position.getX() + 1;
        int y = position.getY();
        map.add(ball, x, y);
        position.setX(x);
    }
    public void moveDown() {
        map.getChildren().remove(ball);
        int x = position.getX();
        int y = position.getY() + 1;
        map.add(ball, x, y);
        position.setY(y);
    }
    public void moveUp() {
        map.getChildren().remove(ball);
        int x = position.getX();
        int y = position.getY() - 1;
        map.add(ball, x, y);
        position.setY(y);
    }
    public Position getPosition() {
        return position;
    }
}