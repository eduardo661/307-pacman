import javax.swing.*;
import java.awt.*;

public class Maze extends JPanel{
    private Drawable[] items = new Drawable[3];

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(0,0,500,500);
        for(int x = 0; x < 500; x += 10)
        {
            g.drawLine(x, 0, x, 500);
        }
        for(int y = 0; y < 500; y += 10)
        {
            g.drawLine(0, y, 500, y);
        }
        for(int i = 0; i < items.length; i += 1)
        {
            items[i].draw(g);
        }
    }

    Maze(Pacman pacman, Ghost ghost, PowerDot power_dot)
    {
        items[0] = pacman;
        items[1] = ghost;
        items[2] = power_dot;
    }

}