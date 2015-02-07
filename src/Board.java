import java.util.Iterator;

/**
 * This class encapsulates the game canvas. Since we draw the snake
 * as a collection of squares, we abstract the canvas as a 2D boolean
 * array where an occupied cell returns T, and an unoccupied cell
 * returns F.
 */
public class Board
{
    /**
     * Instantiates a Board object.
     * @param canvasSize size of a two dimensional boolean array which encapsulates
     *               the game canvas.
     * @param mrStruggle Snake
     */
    public Board(int canvasSize, Snake mrStruggle)
    {
        canvas = new boolean[canvasSize][canvasSize];
        Iterator myItr = mrStruggle.getIterator();
        while(myItr.hasNext())
        {
            Position pos = (Position) myItr.next();
            canvas[pos.getX()][pos.getY()] = true;
        }
    }

    /**
     * Updates the board whenever a position becomes free.
     * @param position
     */
    public void updateBoard(Position position)
    {
        canvas[position.getX()][position.getY()] = false;
    }

    /**
     * Returns the board.
     * @return the board
     */
    public boolean[][] getCanvas()
    {
        return canvas;
    }

    private boolean[][] canvas;
}
