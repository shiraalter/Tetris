import java.awt.*;

public class Shapes {

    private Point[][][] pointArray;

    public Shapes(){
        createShapes();
    }

    public Point[][][] getShapes(){
        return pointArray;
    }
    private void createShapes() {
        pointArray = new Point[][][]{
                {
                        //J-SHAPE
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2)},
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0)},
                },
                {
                        //LINE
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3)},
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3)},
                },
                {
                        //SQUARE
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                        {new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)},
                },
                {
                        //L-SHAPE
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 2)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2)},
                        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 0)},
                        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 0)},
                }
        };

    }

}