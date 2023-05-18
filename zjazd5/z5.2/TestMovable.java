public class TestMovable {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(5, -12);

        System.out.println("Punkt [O1]: (" + point.getX() + ", " + point.getY() + ")");

        point.moveUp();
        point.moveLeft();
        point.moveDown();
        point.moveRight();

        System.out.println("Punkt [A]: (" + point.getX() + ", " + point.getY() + ")");

        System.out.println();
        MovablePoint point2 = new MovablePoint(0, 0);

        System.out.println("Punkt [O2]: (" + point2.getX() + ", " + point2.getY() + ")");

        point2.moveUp();
        point2.moveRight();

        System.out.println("Punkt [B]: (" + point2.getX() + ", " + point2.getY() + ")");

    }
}

interface Movable{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable{
    private int x;
    private int y;


    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void moveUp(){
        y= 5;
    }
    public void  moveDown(){
        y=-4;
    }
    public void moveLeft(){
        x=-10;
    }
    public void moveRight(){
        x=-10;
    }

}