import javax.swing.*;
import java.awt.*;

public class Maze extends JPanel{
    private Drawable[] items = new Drawable[6];
    public static final Color VERY_LIGHT_GRAY = new Color(230,230,230);

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(VERY_LIGHT_GRAY);
        g.drawRect(0,0,500,500);
        for(int x = 0; x < 500; x += 20)
        {
            g.drawLine(x, 0, x, 500);
        }
        for(int y = 0; y < 500; y += 20)
        {
            g.drawLine(0, y, 500, y);
        }
        for(int i = 0; i < items.length; i += 1)
        {
            items[i].draw(g);
        }
    }

    Maze(Pacman pacman, GreenGhost green_ghost, RedGhost red_ghost, BlueGhost blue_ghost, OrangeGhost orange_ghost, PowerDot power_dot)
    {
        items[0] = pacman;
        items[1] = green_ghost;
        items[2] = red_ghost;
        items[3] = blue_ghost;
        items[4] = orange_ghost;
        items[5] = power_dot;
    }

}