/**
 * Created by marshallmunoz on 7/18/17.
 */
public class Main {
    public static void main(String[]args){
        GamePiece gamePiece = new GamePiece();
        gamePiece.setName("Mickey mouse!");
        gamePiece.setColor("blue");

        gamePiece.getPositionX();
        gamePiece.getPositionY();
        gamePiece.isFrozen();
        gamePiece.getName();
        gamePiece.getColor();
        System.out.println(gamePiece.getColor()+ gamePiece.getName() );

        gamePiece.move(2,15);
        System.out.println(gamePiece.getPositionX());
        System.out.println(gamePiece.getPositionY());
        gamePiece.freeze();
        gamePiece.move(44,55);
        System.out.println(gamePiece.getPositionX());
        System.out.println(gamePiece.getPositionY());
        gamePiece.unfreeze();
        gamePiece.move(44,55);
        System.out.println(gamePiece.getPositionX());
        System.out.println(gamePiece.getPositionY());
    }

}
