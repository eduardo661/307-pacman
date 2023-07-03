import java.awt.*;

public class OrangeGhost implements Entity
{
    private short posX = (short) 200;
    private short posY = (short) 200;
    public short getX(){return posX;}
    public short getY(){return posY;}

    public void draw(Graphics g)
    {
        g.setColor(Color.ORANGE);
        g.fillOval(posX, posY, 20, 20);
        g.fillRect(posX, posY + 5, 20, 15);
        g.setColor(Color.BLACK);
        g.fillOval(posX+2, posY+5, 4, 4);
        g.fillOval(posX+10, posY+5, 4, 4);
        g.setColor(Color.WHITE);
        g.fillOval(posX+2, posY+5, 2, 2);
        g.fillOval(posX+10, posY+5, 2, 2);



        if (Math.random() > 0.5)
        {
            posX -= 20;
            posY -= 20;
        }
        else
        {
            posX += 20;
            posY += 20;
        }

        if (posX > 400) posX = 400;
        if (posY > 400) posY = 400;
        if (posX < 0) posX = 0;
        if (posY < 0) posY = 0;
    }
}
