import java.awt.*;

public class Pacman implements Drawable
{
    private short posX;
    private short posY;

    public void draw(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillRect(posX, posY, 20, 20);

        if (posX > 400) posX = 400;
        if (posY > 400) posY = 400;
        if (posX < 0) posX = 0;
        if (posY < 0) posY = 0;
    }

    public void up() 
    {
        posY -= 20;
    }

    public void down() 
    {
        posY += 20;
    }

    public void left() 
    {
        posX -= 20;
    }

    public void right() 
    {
        posX += 20;
    }

}
