import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        final JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));

        mrStruggles = new Snake(START_LENGTH);
        canvas = new Board(CANVAS_SIZE, mrStruggles);
        mrStruggles.setBoard(canvas);
        Timer timer = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                mrStruggles.updatePosition();

                // Check collisions

                frame.repaint();
            }
        });
        timer.start();

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < canvas.getCanvas().length; i++)
        {
            for(int j = 0; j < canvas.getCanvas().length; j++)
            {
                if (canvas.getCanvas()[i][j])
                {
                    g2.setColor(Color.GREEN);
                    g2.fillRect(i * UNIT_SIZE, j * UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
                }
                else
                {
                    g2.setColor(Color.WHITE);
                    g2.fillRect(i * UNIT_SIZE, j * UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
                }
            }
        }
    }
    private Snake mrStruggles;
    private Board canvas;

    private static final int FRAME_HEIGHT = 400;
    private static final int FRAME_WIDTH = 400;
    private static final int CANVAS_SIZE = 20;
    private static final int UNIT_SIZE = 20;
    private final int DELAY = 250;
    private final int START_LENGTH = 3;
}
