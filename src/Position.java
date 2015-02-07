/**
 * Encapsulates positions x, y to ease implementation and updates
 * of the position of any object in the game.
 */
public class Position
{
    /**
     * Constructs a wrapper object for the position of an object. .
     * @param x x coordinate
     * @param y y coordinate
     */
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Checks whether the two positions are equal
     * @param other the other position
     * @return true if the two are the same, false otherwise.
     */
    public boolean equals(Position other)
    {
        return
                ((getX() == other.x) && (getY() == other.y));
    }

    /**
     * Returns the x coordinate of the position
     * @return x coordinate
     */
    public int getX()
    {
        return x;
    }

    /**
     * Returns the y coordinate of the position
     * @return y coordinate
     */
    public int getY()
    {
        return y;
    }

    private int x;
    private int y;
}
