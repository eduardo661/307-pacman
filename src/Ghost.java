import java.awt.*;

public class Ghost implements Entity
{
    private short posX = 400;
    private short posY = 400;

    public void draw(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(posX, posY, 20, 20);

        if (Math.random() > 0.5)
            if (Math.random() > 0.5)
                posX -= 20;
            else
                posX += 20;
        else
            if (Math.random() > 0.5)
                posY -= 20;
            else
                posY += 20;

        if (posX > 400) posX = 400;
        if (posY > 400) posY = 400;
        if (posX < 0) posX = 0;
        if (posY < 0) posY = 0;
    }

    public short getX(){return posX;}

    public short getY(){return posY;}
}
