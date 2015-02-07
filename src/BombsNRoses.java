import javax.swing.*;

/**
 * The game frame for BombsNRoses--a variation of the ever-so-classic
 * game of Snake. Our snake, is Mr.Struggles. The game originated from
 * a full 10 hours of struggle with first-time-Hackathon--one that has Ramen
 * but no forks.
 */
public class BombsNRoses
{
    public BombsNRoses()
    {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static final int FRAME_HEIGHT = 400;
    private static final int FRAME_WIDTH = 400;
}
