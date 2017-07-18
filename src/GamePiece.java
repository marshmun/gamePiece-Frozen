import java.util.Random;

/**
 * Created by marshallmunoz on 7/18/17.
 */
public class GamePiece {
   private int positionX;
   private int positionY;
   private boolean frozen;
   private String name;
   private String color;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public GamePiece() {
        frozen = false;
        positionX = 0;
        positionY = 0;

    }

    public void move(int x, int y){
        if(!frozen) {
            positionX = x;
            positionY = y;
        }

    }
    public void freeze(){
        this.frozen = true;
    }
    public void unfreeze(){
        this.frozen = false;
    }
}
