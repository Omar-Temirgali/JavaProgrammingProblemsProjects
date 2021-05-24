public class Position {
    int x;
    int y;
    Position() {
        x = 0;
        y = 0;
    }
    Position(int i, int j) {
        x = i;
        y = j;
    }
    public void setY(int j) {
        y = j;
    }
    public void setX(int i) {
        x = i;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean equals(Position b) {
        boolean e1 = false;
        boolean e2 = false;
        if(b.getX() == getX()) {
            e1 = true;
        }
        if(b.getY() == getY()) {
            e2 = true;
        }
        if(e1 == true && e2 == true) 
            return true;
        else if(e1 == false && e2 == true)
            return false;
        else if(e1 == true && e2 == false)
            return false;   
        else 
            return false; 
    }
}