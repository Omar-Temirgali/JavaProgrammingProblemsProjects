import javafx.scene.layout.GridPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Map extends GridPane {
    private int[][] map;
    private int size;
    private Position start;
    private int UNIT = 0;
    private Rectangle[][] rects = new Rectangle[0][0];

    Map(String file) {
        Scanner scanner = new Scanner(System.in);
        UNIT = scanner.nextInt();
        mapToArray(file);
        mapToRectangle();
        for(int x = 0; x < getSize(); x++) {
            for(int y = 0; y < getSize(); y++) {
                if(map[x][y] == 0) add(rects[x][y], y, x);
                else if(map[x][y] == 1) add(rects[x][y], y, x);
            }
        }
        start = getStartPosition();
        setGridLinesVisible(true);
    }
    public void mapToRectangle() {
        rects = new Rectangle[getSize()][getSize()];
        for(int x = 0; x < getSize(); x++) {
            for(int y = 0; y < getSize(); y++) {
                rects[x][y] = new Rectangle();
                if(map[x][y] == 0){
                    rects[x][y].setFill(Color.WHITE);
                    rects[x][y].setWidth(getUnit());
                    rects[x][y].setHeight(getUnit());
                }
                else if(map[x][y] == 1) {
                    rects[x][y].setFill(Color.BLACK);
                    rects[x][y].setWidth(getUnit());
                    rects[x][y].setHeight(getUnit());
                }
            }
        }
    }
    public void mapToArray(String fileMap) {
        try {
            File fM = new File(fileMap);
            Scanner scanner = new Scanner(fM);
            size = scanner.nextInt();
            scanner.nextLine();
            map = new int[getSize()][getSize()];
            LinkedList<String> arrNumbers = new LinkedList<>();
            while(scanner.hasNext()) {
                String mapNumbers = scanner.next();
                arrNumbers.add(mapNumbers);
            }
            for(int x = 0; x < size; x++) {
                for(int y = 0; y < size; y++) {
                    map[x][y] = Integer.parseInt(arrNumbers.removeFirst());
                }
            }
        }
        catch(Exception e) {
        }
    }
    public Position getStartPosition() {
        Position startPosition = new Position();
        int sizeOfMap = getSize();
        int x = 0;
        int y = 0;
        while(x < sizeOfMap) {
            y = 0;
            while(y < sizeOfMap) {
                if(map[x][y] == 2) {
                    startPosition.setX(y);
                    startPosition.setY(x);
                }
                y++;
            }
            x++;
        }
        return startPosition;
    }
    public int getSize() {
        return size;
    }   
    public int getUnit() {
        return UNIT;
    }
    public int getValueAt(int a, int b) {
        return map[a][b];
    }
//    public void setStart() {
//        this.start = getStartPosition();
//    }
    public Position getStart() {
        return start;
    }
}