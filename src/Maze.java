import javax.swing.*;
import java.awt.*;

public class Maze extends JPanel{
    private Entity[] items = new Entity[7];

    public void paintComponent(Graphics g)
    {
        detectCollision();
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

    public void detectCollision()
    {
        Pacman pac = (Pacman) items[0];

        for(int i= 1; i<items.length - 1; i++)
        {
            if (pac.getX() == items[i].getX() && pac.getY() ==  items[i].getY() )
            {
                if (items[i] instanceof RedGhost || items[i] instanceof GreenGhost || items[i] instanceof BlueGhost || items[i] instanceof OrangeGhost)
                {
                    pac.setX();
                    pac.setY();
                    ScoreBoard sb = (ScoreBoard)items[6];
                    sb.setPoints(0);
                }
                else if(items[i] instanceof PowerDot)
                {
                    ScoreBoard sb = (ScoreBoard)items[6];
                    int point = sb.getPoints();
                    point = point + 1;
                    sb.setPoints(point);

                    PowerDot pd = (PowerDot)items[i];
                    int min = 0, max = 20;                    
                    int newPosX = (int) (Math.floor(Math.random() * (max - min + 1) + min)) * 20;
                    int newPosY = (int) (Math.floor(Math.random() * (max - min + 1) + min)) * 20;

                    pd.setX((short) newPosX);
                    pd.setY((short) newPosY);
                }

            }
        }

    }

    Maze(Pacman pacman, GreenGhost greenGhost, RedGhost redGhost, BlueGhost blueGhost, OrangeGhost orangeGhost,
         PowerDot power_dot, ScoreBoard scoreBoard)
    {
        items[0] = pacman;
        items[1] = greenGhost;
        items[2] = blueGhost;
        items[3] = orangeGhost;
        items[4] = redGhost;
        items[5] = power_dot;
        items[6] = (Entity) scoreBoard;

    }

}