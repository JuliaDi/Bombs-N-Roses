import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class encapsulates the Snake.  The class records the snake's current
 * position and notifies the board. It also keeps track of the positions that
 * its body currently occupies to allow collisions to be checked.
 */
public class Snake
{
    /**
     * Constructs a snake object of the designated length and instantiates
     * it at index (0,0) with a velocityX of 1 and a velocityY of 0.
     * @param length length of the snake
     */
    public Snake(int length, Board canvas)
    {
        this.length = length;
        this.canvas = canvas;
        //the snake is instantiated at 0,0 with a direction to the right
        occupied = new LinkedList<Position>();
        velocityX = 1;
        velocityY = 0;
        current = new Position(START_X, START_Y);
        occupied.add(current);
    }

    /**
     * Returns the x position of the snake
     * @return x coordinate
     */
    public int getX()
    {
        return current.getX();
    }

    /**
     * Returns the y position of the snake
     * @return y coordinate
     */
    public int getY()
    {
        return current.getY();
    }

    /**
     * Returns the length of the snake.
     * @return length of the snake.
     */
    public int getLength()
    {
        return length;
    }

    /**
     * Returns the iterator of the list occupied.
     */
    public Iterator getIterator()
    {
        return occupied.listIterator();
    }
    /**
     * Updates the current position of the snake and the positions its
     * body occupies by updating the head of the LinkedList. It also
     * checks whether the length of the snake has been fulfilled. If so, as
     * the snake moves, we remove from the tail of the LinkedList.
     */
    public void updatePosition()
    {
        occupied.addFirst(new Position(current.getX()+velocityX, current.getY()+velocityY));
        if (occupied.size() == getLength())
        {
            canvas.updateBoard(occupied.getLast());
            occupied.removeLast();
        }
        current = occupied.getFirst();
    }


    private int length;
    private Board canvas;
    private LinkedList<Position> occupied;
    private Position current;
    private int velocityX;
    private int velocityY;
    private static final int START_X = 0;
    private static final int START_Y= 0;
}
